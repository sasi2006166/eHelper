package me.candiesjar.ehelper.enums;

import lombok.Getter;

public enum Messages {

    RELOAD("messages.reload")

    ;


    @Getter
    private final String path;

    Messages(String path) {
        this.path = path;
    }



}
