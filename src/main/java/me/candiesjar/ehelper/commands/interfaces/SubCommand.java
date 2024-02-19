package me.candiesjar.ehelper.commands.interfaces;

import net.md_5.bungee.api.CommandSender;

public interface SubCommand {

    String getPermission();
    boolean isEnabled();
    void execute(CommandSender commandSender, String[] args);

}
