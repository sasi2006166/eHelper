package me.candiesjar.ehelper.enums;

import lombok.Getter;
import net.md_5.bungee.api.CommandSender;

public enum Messages {

    PREFIX("messages.prefix"),
    RELOAD("messages.reload"),
    NO_PERMISSION("messages.no_permission"),

    ;


    @Getter
    private final String path;

    Messages(String path) {
        this.path = path;
    }

    public void send(CommandSender sender) {

    }

    public void sendList(CommandSender sender) {

    }


}
