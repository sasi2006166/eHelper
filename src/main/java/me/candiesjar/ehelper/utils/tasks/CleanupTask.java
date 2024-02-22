package me.candiesjar.ehelper.utils.tasks;

import lombok.Getter;
import lombok.experimental.UtilityClass;
import me.candiesjar.ehelper.EHelper;
import net.md_5.bungee.api.scheduler.ScheduledTask;

@UtilityClass
public class CleanupTask {

    private final EHelper eHelper = EHelper.getInstance();

    @Getter
    private ScheduledTask scheduledTask;

    public void start() {

    }

}
