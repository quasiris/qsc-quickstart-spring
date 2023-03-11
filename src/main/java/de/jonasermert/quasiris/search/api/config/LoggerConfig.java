package de.jonasermert.quasiris.search.api.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class LoggerConfig {

    private static final Logger logger = LogManager.getLogger(LoggerConfig.class);

    @Value("${spring.application.name}")
    private String appName;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @EventListener(ApplicationReadyEvent.class)
    public void logApplicationStarted() {
        logger.info("Die Application {} wurde erfolgreich gestartet!", appName);
        logger.info("Die Applikation laeuft mit dem Profil: {}", activeProfile);
    }



}
