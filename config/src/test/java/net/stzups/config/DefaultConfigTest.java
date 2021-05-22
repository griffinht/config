package net.stzups.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DefaultConfigTest {
    private DefaultConfig defaultConfig;

    @BeforeEach
    public void init() {
        defaultConfig = new DefaultConfig();
        defaultConfig.addConfigProvider(new TestConfigProvider());
    }

    @Test
    public void test() {
        Assertions.assertNull(defaultConfig.getString(""));
        Assertions.assertEquals(defaultConfig.getString("string"), "string");

        Assertions.assertNull(defaultConfig.getInteger(""));
        Assertions.assertEquals(defaultConfig.getInteger("integer"), 0);

        Assertions.assertNull(defaultConfig.getBoolean(""));
        Assertions.assertEquals(defaultConfig.getBoolean("boolean"), true);
    }
}
