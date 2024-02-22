package me.candiesjar.ehelper.commands.sub;

import me.candiesjar.ehelper.commands.interfaces.SubCommand;
import me.candiesjar.ehelper.enums.Config;
import net.md_5.bungee.api.CommandSender;

public class BackupSubCommand implements SubCommand {

    @Override
    public String getPermission() {
        return Config.BACKUP_COMMAND_PERMISSION.getString();
    }

    @Override
    public boolean isEnabled() {
        return Config.USE_BACKUP_COMMAND.getBoolean();
    }

    @Override
    public void execute(CommandSender commandSender, String[] args) {

    }
}
