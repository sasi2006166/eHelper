package me.candiesjar.ehelper.utils;

import com.google.common.collect.Lists;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import me.candiesjar.ehelper.EHelper;
import net.md_5.bungee.api.plugin.Plugin;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

@UtilityClass
public class DebugUtils {

    private final EHelper eHelper = EHelper.getInstance();

    public void debug(String message) {
        eHelper.getLogger().severe("[DEBUG] " + message);
    }

    @SneakyThrows
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

        String fileName = "debug " + System.currentTimeMillis() + ".txt";
        String folderName = "debugs";
        debug("Saving server infos to " + fileName);

        File debugFolder = new File(eHelper.getDataFolder().getParentFile(), folderName);

        if (!debugFolder.exists()) {
            debugFolder.mkdirs();
        }

        File debugFile = new File(debugFolder, fileName);
        debugFile.createNewFile();
        debugFile.setWritable(true);

        FileOutputStream fileOutputStream = new FileOutputStream(debugFile);

        fileOutputStream.write(("Server infos for " + pluginName + " v" + pluginVersion + "\n").getBytes());
        fileOutputStream.write(("BungeeCord version: " + bungeeVersion + "\n").getBytes());
        fileOutputStream.write(("BungeeCord name: " + bungeeName + "\n").getBytes());
        fileOutputStream.write(("Plugins: " + plugins + "\n").getBytes());
        fileOutputStream.close();

        debug("Server infos saved to " + fileName);
        debug("Please provide this file to the developer if you are experiencing issues.");
    }

}
