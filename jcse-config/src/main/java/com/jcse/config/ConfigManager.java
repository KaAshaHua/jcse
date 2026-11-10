package com.jcse.config;

import java.util.HashMap;
import com.jcse.exception.config.*;

public class ConfigManager {
    private HashMap<String, Configuration> configurations;

    public ConfigManager() {
        this.configurations = new HashMap<>();
    }

    public void register(Configuration configuration) {
        if (this.containsConfiguration(configuration.getID()))
            throw new DuplicateConfigurationException("The configuration [" + configuration.getID() + "] is existed in " + this.getClass().toString());
        this.configurations.put(configuration.getID(), configuration);
    }

    public void unregister(Configuration configuration) {
        if (!this.containsConfiguration(configuration.getID()))
            throw new ConfigNotFoundException("The configuration [" + configuration.getID() + "] is not existed in " + this.getClass().toString());
        this.configurations.remove(configuration.getID());
    }

    public void unregister(String id) {
        if (!this.containsConfiguration(id))
            throw new ConfigNotFoundException("The configuration [" + id + "] is not existed in " + this.getClass().toString());
        this.configurations.remove(id);
    }

    public Configuration get(String id) {
        if (!this.containsConfiguration(id))
            throw new ConfigNotFoundException("The configuration [" + id + "] is not existed in " + this.getClass().toString());
        return this.configurations.get(id);
    }

    public boolean containsConfiguration(String id) {
        return this.configurations.containsKey(id);
    }
}
