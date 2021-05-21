package net.stzups.config.configs;

import net.stzups.config.ConfigProvider;

public class EnvironmentVariableConfig implements ConfigProvider {
    private final String prefix;

    public EnvironmentVariableConfig() {
        this("");
    }

    public EnvironmentVariableConfig(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String get(String key) {
        return System.getenv(prefix + key);
    }
}
