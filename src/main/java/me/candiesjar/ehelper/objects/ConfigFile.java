package me.candiesjar.ehelper.objects;

import lombok.Getter;
import lombok.SneakyThrows;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.nio.file.Files;

public class ConfigFile {

    private final File file;

    @Getter
    private Configuration config;

    @SneakyThrows
    public ConfigFile(Plugin plugin, String path) {
        if (!plugin.getDataFolder().exists()) {
            plugin.getDataFolder().mkdir();
        }

        file = new File(plugin.getDataFolder(), path);

        if (!file.exists()) {
            Files.copy(plugin.getResourceAsStream(path), file.toPath());
        }

        config = YamlConfiguration.getProvider(YamlConfiguration.class).load(file);
    }

    @SneakyThrows
    public void reload() {
        config = YamlConfiguration.getProvider(YamlConfiguration.class).load(file);
    }
}
