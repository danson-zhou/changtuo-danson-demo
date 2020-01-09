package app;

import app.demo.scheduler.domain.PrintJob;
import core.framework.module.Module;
import core.framework.scheduler.Job;
import core.framework.util.Randoms;

import java.time.Duration;
import java.time.LocalTime;

/**
 * @author Danson
 */
public class SchedulerModule extends Module {
    @Override
    protected void initialize() {
//        ZoneId localZoneId = ZoneId.systemDefault();
//        schedule().timeZone(localZoneId);

        Job fixedRateJob = new PrintJob("fixedRateJob per 5 seconds");
        schedule().fixedRate("fixed-rate-job", fixedRateJob, Duration.ofSeconds(5));

        PrintJob triggerJob = new PrintJob("triggerJob");
        schedule().trigger("trigger-job", triggerJob, currentTime -> {
            int interval = 10 + Randoms.nextInt(-3, 4);
            triggerJob.setMessage("triggerJob next: " + interval + " seconds");
            return currentTime.plusSeconds(interval);
        });

        Job dailyTriggerJob = new PrintJob("dailyTriggerJob");
        schedule().dailyAt("daily-trigger-job", dailyTriggerJob, LocalTime.now());
    }
}
