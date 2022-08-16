package credentials;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/browserstack.properties")
public interface LocalConfig extends Config {
    @Config.Key("platformNameEm")
    String platformNameEm();

    @Config.Key("deviceNameEm")
    String deviceNameEm();

    @Config.Key("osVersionEm")
    String osVersionEm();

    String password();
}