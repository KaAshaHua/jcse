package com.jcse.config;

import java.io.FileNotFoundException;

public abstract class ConfigProvider {    
    public abstract <T extends ConfigProvider> void save(T provider, String path) throws FileNotFoundException;

    public abstract <T extends ConfigProvider> T load(String path, Class<T> type) throws FileNotFoundException;
}
