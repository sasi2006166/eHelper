package me.candiesjar.ehelper.commands.sub;

import me.candiesjar.ehelper.commands.interfaces.SubCommand;
import net.md_5.bungee.api.CommandSender;

public class InfoSubCommand implements SubCommand {
    @Override
    public String getPermission() {
        return null;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void execute(CommandSender commandSender, String[] args) {

    }
}
