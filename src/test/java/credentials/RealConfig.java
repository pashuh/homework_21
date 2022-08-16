package credentials;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:realDevice.properties"
})
public interface RealConfig extends Config {

    @Config.Key("platformName")
    String platformName();

    @Config.Key("deviceName")
    String deviceName();

    @Config.Key("osVersion")
    String osVersion();

}