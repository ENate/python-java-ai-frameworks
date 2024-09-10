package com.myjavaai.tutorials.springaivectordb.config;

import org.jobrunr.configuration.JobRunr;
import org.jobrunr.storage.InMemoryStorageProvider;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JobRunrInit {

    public static void jobInit() throws Exception {
        JobRunr.configure()
                .useStorageProvider(new InMemoryStorageProvider())
                .useDashboard()
                .useBackgroundJobServer()
                .initialize();

    }

}
