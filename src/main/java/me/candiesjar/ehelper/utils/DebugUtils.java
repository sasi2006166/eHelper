package me.candiesjar.ehelper.utils;

import com.google.common.collect.Lists;
import lombok.experimental.UtilityClass;
import me.candiesjar.ehelper.EHelper;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.List;

@UtilityClass
public class DebugUtils {

    private final EHelper eHelper = EHelper.getInstance();

    public void debug(String message) {
        eHelper.getLogger().info("[DEBUG] " + message);
    }

    public void printServerInfos() {
        String pluginName = eHelper.getDescription().getName();
        String pluginVersion = eHelper.getDescription().getVersion();
        String bungeeVersion = eHelper.getProxy().getVersion();
        String bungeeName = eHelper.getProxy().getName();
        List<String> plugins = Lists.newArrayList();

        for (Plugin plugin : eHelper.getProxy().getPluginManager().getPlugins()) {
            if (plugin.getDescription().getName().equals(pluginName)) continue;
            plugins.add(plugin.getDescription().getName());
        }


    }

}
