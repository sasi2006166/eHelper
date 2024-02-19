package me.candiesjar.ehelper.enums;

import lombok.Getter;
import me.candiesjar.ehelper.EHelper;

public enum Config {

    DEBUG("settings.debug"),
    TELEMETRY("settings.telemetry"),

    ;


    @Getter
    private final String path;
    private final EHelper eHelper = EHelper.getInstance();

    Config(String path) {
        this.path = path;
    }

    public boolean getBoolean() {
        return eHelper.getConfigFileConfig().getBoolean(getPath());
    }

}
