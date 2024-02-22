package me.candiesjar.ehelper.enums;

import lombok.Getter;
import me.candiesjar.ehelper.EHelper;

public enum Config {

    DEBUG("settings.debug"),
    TELEMETRY("settings.telemetry"),


    RELOAD_COMMAND_PERMISSION("commands.reload.permission"),
    DEBUG_COMMAND_PERMISSION("commands.debug.permission"),

    USE_BACKUP_COMMAND("commands.backup.enabled"),
    BACKUP_COMMAND_PERMISSION("commands.backup.permission"),

    ;


    @Getter
    private final String path;
    private final EHelper eHelper = EHelper.getInstance();

    Config(String path) {
        this.path = path;
    }

    public String getString() {
        return eHelper.getConfigFileConfig().getString(getPath());
    }

    public boolean getBoolean() {
        return eHelper.getConfigFileConfig().getBoolean(getPath());
    }

}
