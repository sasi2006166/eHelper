package me.candiesjar.ehelper;

import lombok.Getter;
import me.candiesjar.ehelper.enums.Config;
import me.candiesjar.ehelper.objects.ConfigFile;
import me.candiesjar.ehelper.telemetry.Metrics;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.config.Configuration;

public final class EHelper extends Plugin {

    @Getter
    private static EHelper instance;

    @Getter
    private ConfigFile configFile, messagesFile;

    @Override
    public void onEnable() {
        instance = this;

        getLogger().info("§6       _    _      _                 \n" +
                "      | |  | |    | |                \n" +
                "   ___| |__| | ___| |_ __   ___ _ __ \n" +
                "  / _ \\  __  |/ _ \\ | '_ \\ / _ \\ '__|\n" +
                " |  __/ |  | |  __/ | |_) |  __/ |   \n" +
                "  \\___|_|  |_|\\___|_| .__/ \\___|_|   \n" +
                "                    | |              \n" +
                "                    |_|              ");
        getLogger().info(" ");
        getLogger().info("§8§m|-----------------------|");
        getLogger().info("");


    }

    @Override
    public void onDisable() {

    }

    private void loadConfigurations() {
        configFile = new ConfigFile(this, "config.yml");
        messagesFile = new ConfigFile(this, "messages.yml");
    }

    private void loadTelemetry() {
        boolean useTelemetry = Config.TELEMETRY.getBoolean();

        if (useTelemetry) {
            // TODO: Telemetry enabled
            getLogger().info("");
            int id = 21049;
            new Metrics(this, id);
            return;
        }

        // TODO: Telemetry disabled
        getLogger().info("");

    }

    public Configuration getConfigFileConfig() {
        return configFile.getConfig();
    }

    public Configuration getMessagesFileConfig() {
        return messagesFile.getConfig();
    }

}
