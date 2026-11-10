package com.jcse.format.json;

import com.jcse.config.ConfigProvider;
import com.jcse.exception.format.*;
import java.io.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.*;

public class JsonConfig extends ConfigProvider {
    @JsonIgnore 
    protected ObjectMapper mapper = new ObjectMapper();

    @Override 
    public <T extends ConfigProvider> void save(T provider, String path) throws FileNotFoundException {
        if (!path.endsWith(".json"))
            throw new UnsupportedFormatException("Cannot save the file '" + path + "' because it is not a file '.json'");

        try {
            mapper.writeValue(new File(path), provider);
        } catch (IOException cause) {
            throw new FormatWriteException(
                "Cannot save value to file '" + path + "'",
                cause
            );
        }
    }

    @Override 
    public <T extends ConfigProvider> T load(String path, Class<T> type) throws FileNotFoundException {
        if (!path.endsWith(".json"))
            throw new UnsupportedFormatException("Cannot load the file '" + path + "' because it is not a file '.json'");

        try {
            return mapper.readValue(new File(path), type);
        } catch (IOException cause) {
            throw new MappingException(
                "Cannot load value from file '" + path + "'",
                cause
            );
        }
    }
}
