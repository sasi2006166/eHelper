package me.candiesjar.ehelper.commands.sub;

import me.candiesjar.ehelper.commands.interfaces.SubCommand;
import me.candiesjar.ehelper.enums.Config;
import net.md_5.bungee.api.CommandSender;

public class DebugSubCommand implements SubCommand {

    @Override
    public String getPermission() {
        return Config.DEBUG_COMMAND_PERMISSION.getString();
    }

    @Override
    public boolean isEnabled() {
        return Config.DEBUG.getBoolean();
    }

    @Override
    public void execute(CommandSender commandSender, String[] args) {

    }
}
