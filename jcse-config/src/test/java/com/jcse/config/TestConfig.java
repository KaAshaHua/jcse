package com.jcse.config;

import java.io.*;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

class Provider extends ConfigProvider {
    private String name;
    private String version;

    public String getName() { return this.name; }
    public String getVersion() { return this.version; }

    public void setName(String newName) { this.name = newName; }
    public void setVersion(String newVer) { this.version = newVer; }

    @Override 
    public <T extends ConfigProvider> void save(T provider, String path) throws FileNotFoundException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(
                new File(path),
                provider
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override 
    public <T extends ConfigProvider> T load(String path, Class<T> type) throws FileNotFoundException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            T provider = objectMapper.readValue(
                new File(path),
                type
            );

            return provider;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class TestConfig {
    private String path = "resource/json-test.json";

    private Provider provider = new Provider();

    private Configuration configuration = new Configuration("test", this.path);

    @Test 
    public void printJson() {
        configuration.loadProvider(provider, Provider.class);
        Provider p = (Provider) configuration.getProvider();
        System.out.println(p.getName() + " " + p.getVersion());
        p.setName("Java");
        p.setVersion("25");
        configuration.saveProvider();
    }
}
