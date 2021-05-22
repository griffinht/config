package net.stzups.config;

public class DefaultConfig extends Config {
    public String getString(String key) {
        return super.getString(new OptionalConfigKey<>(key, null));
    }

    public Integer getInteger(String key) {
        return super.getInteger(new OptionalConfigKey<>(key, null));
    }

    public Boolean getBoolean(String key) {
        return super.getBoolean(new OptionalConfigKey<>(key, null));
    }
}
