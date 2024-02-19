package me.candiesjar.ehelper.commands;

import com.google.common.collect.Maps;
import me.candiesjar.ehelper.EHelper;
import me.candiesjar.ehelper.commands.interfaces.SubCommand;
import me.candiesjar.ehelper.commands.sub.DebugSubCommand;
import me.candiesjar.ehelper.commands.sub.InfoSubCommand;
import me.candiesjar.ehelper.commands.sub.ReloadSubCommand;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.TabExecutor;

import java.util.Collections;
import java.util.HashMap;

public class eHelperCommand extends Command implements TabExecutor {

    private final EHelper plugin;
    private final HashMap<String, SubCommand> subCommands = Maps.newHashMap();

    public eHelperCommand(EHelper plugin) {
        super("ehelper", null, "ehelp", "eh");
        this.plugin = plugin;
        subCommands.put("info", new InfoSubCommand());
        subCommands.put("debug", new DebugSubCommand());
        subCommands.put("reload", new ReloadSubCommand(plugin));
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {

    }

    @Override
    public Iterable<String> onTabComplete(CommandSender commandSender, String[] strings) {
        return Collections.emptyList();
    }
}
