package com.jcse.format.xml;

import com.jcse.config.ConfigProvider;
import com.jcse.exception.format.*;
import com.jcse.exception.format.MappingException;
import java.io.*;
import com.fasterxml.jackson.dataformat.xml.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class XmlConfig extends ConfigProvider{
    @JsonIgnore 
    protected XmlMapper mapper = new XmlMapper();

    public <T extends ConfigProvider> void save(T provider, String path) throws FileNotFoundException {
        if (!path.endsWith(".xml"))
            throw new UnsupportedFormatException("Cannot save the file '" + path + "' because it is not a file '.xml'");

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
        if (!path.endsWith(".xml"))
            throw new UnsupportedFormatException("Cannot load the file '" + path + "' because it is not a file '.xml'");
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
