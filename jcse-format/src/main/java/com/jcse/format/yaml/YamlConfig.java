package com.jcse.format.yaml;

import com.jcse.config.ConfigProvider;
import com.jcse.exception.format.*;
import java.io.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.dataformat.yaml.*;

public class YamlConfig extends ConfigProvider{
    @JsonIgnore 
    protected YAMLMapper mapper = new YAMLMapper();

    public <T extends ConfigProvider> void save(T provider, String path) throws FileNotFoundException {
        if (!path.endsWith(".yaml"))
            throw new UnsupportedFormatException("Cannot save the file '" + path + "' because it is not a file '.yaml'");

        try {
            mapper.writeValue(new File(path), provider);
        } catch (IOException cause) {
            throw new FormatWriteException(
                "Cannot save value to file '" + path + "'",
                cause
            );
        }
    }

    public <T extends ConfigProvider> T load(String path, Class<T> type) throws FileNotFoundException {
        if (!path.endsWith(".yaml"))
            throw new UnsupportedFormatException("Cannot load the file '" + path + "' because it is not a file '.yaml'");
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
