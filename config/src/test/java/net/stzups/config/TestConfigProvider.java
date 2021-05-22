package net.stzups.config;

public class TestConfigProvider implements ConfigProvider {
    @Override
    public String get(String key) {
        String value;

        switch (key) {
            case "string":
                value = "string";
                break;
            case "integer":
                value = "0";
                break;
            case "boolean":
                value = "true";
                break;
            default:
                value = null;
        }

        return value;
    }
}
