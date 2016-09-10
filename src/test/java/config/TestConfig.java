package config;

import com.github.yuriy27.config.Config;

/**
 * Created by Юра on 05.09.2016.
 */
public class TestConfig {

    public static void main(String[] args) {
        Config.load();
        System.out.println(Config.MAIL);
        System.out.println(Config.PASSWORD);
    }

}
