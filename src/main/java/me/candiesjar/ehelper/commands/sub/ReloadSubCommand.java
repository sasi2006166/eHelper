package me.candiesjar.ehelper.commands.sub;

import me.candiesjar.ehelper.EHelper;
import me.candiesjar.ehelper.commands.interfaces.SubCommand;
import me.candiesjar.ehelper.enums.Config;
import net.md_5.bungee.api.CommandSender;

public class ReloadSubCommand implements SubCommand {

    private final EHelper plugin;

    public ReloadSubCommand(EHelper plugin) {
        this.plugin = plugin;
    }

    @Override
    public String getPermission() {
        return Config.RELOAD_COMMAND_PERMISSION.getString();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public void execute(CommandSender commandSender, String[] args) {
        plugin.reloadAll();
    }
}
