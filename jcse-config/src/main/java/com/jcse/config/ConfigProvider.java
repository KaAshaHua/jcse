package com.jcse.config;

import java.io.IOException;

public abstract class ConfigProvider {    
    public abstract void write(String path) throws IOException;

    public abstract <T extends ConfigProvider> T load(String path, Class<T> type) throws IOException;
}
