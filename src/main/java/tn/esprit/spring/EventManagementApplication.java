package tn.esprit.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.esprit.spring.utils.AppRunUtil;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class EventManagementApplication {

    private static final Logger log = LoggerFactory.getLogger(EventManagementApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EventManagementApplication.class);
        AppRunUtil.appStartup(log, app.run(args).getEnvironment());
    }

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

}
