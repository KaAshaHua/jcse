package com.jcse.config;

import java.io.FileNotFoundException;
import java.util.Objects;
import com.jcse.exception.config.*;

public class Configuration {
    private final String idConfiguration; 

    private String path;                    // Path of file config
    private boolean isConst = false;        // Can adjust configuration
    private boolean isPassLive = false;     // Pass isProviderLive = true 
    private boolean isDirty = false;         // Check if the data was ajusted

    private ConfigProvider provider = null;

    public Configuration(String id) { this.idConfiguration = id; }

    public Configuration(String id, String path) {
        this(id);
        this.path = path;
    }

    public Configuration(String id, String path, boolean isConst) {
        this(id, path);
        this.isConst = isConst;
    }

    @Override 
    public boolean equals(Object o) {
        if (!(o instanceof Configuration)) return false;
        
        Configuration otherConfiguration = (Configuration) o;
        return this.getID().equals(otherConfiguration.getID());
    }

    @Override 
    public int hashCode() { return Objects.hash(this.getID()); }

    public String getID() { return this.idConfiguration; }

    public String getPath() { return this.path; }

    public boolean isConst() { return this.isConst; }

    public boolean isProviderLive() { return this.provider != null; }

    public boolean isPassLive() { return this.isPassLive; }

    public boolean isDirty() { return this.isDirty; }

    public ConfigProvider getProvider() { return this.provider; }

    public void setPath(String newPath) {
        if (this.isConst())
            throw new IllegalStateException("Cannot adjust the path of " + this.getClass().toString() + " because isConst = '" + this.isConst() + "'");
        this.path = newPath;
    }

    public void setConst(boolean isConst) { this.isConst = isConst; }

    public void setPassLive(boolean isPassLive) {
        if (this.isConst())
            throw new IllegalStateException("Cannot adjust the isPassLive of " + this.getClass().toString() + " because isConst = '" + this.isConst() + "'");
        this.isPassLive = isPassLive; 
    }

    private void setProvider(ConfigProvider newProvider) {
        if (this.isConst())
            throw new IllegalStateException("Cannot adjust the provider of " + this.getClass().toString() + " because isConst = '" + this.isConst() + "'");
        if (this.isProviderLive() && !this.isPassLive())
            throw new IllegalStateException("Cannot replace old provider because isProviderLive = '" + this.isProviderLive() + "'");
        this.provider = newProvider;
    }

    public <T extends ConfigProvider> void loadProvider(T provider, Class<T> type) {
        try {
            this.setProvider(provider.load(this.getPath(), type));
        } catch (FileNotFoundException cause) {
            throw new ConfigNotFoundException(
                "The file config '" + this.getPath() + "' is not existed",
                cause
            );
        }
    }

    public <T extends ConfigProvider> void saveProvider() {
        try {
            this.provider.save(this.provider, this.getPath());
        } catch (FileNotFoundException cause) {
            throw new ConfigNotFoundException(
                "The file config '" + this.getPath() + "' is not existed",
                cause
            );
        }
    }
}
