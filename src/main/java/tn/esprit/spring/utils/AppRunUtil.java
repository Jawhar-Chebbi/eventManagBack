package tn.esprit.spring.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppRunUtil {

    private static boolean appRunning = false;


    private AppRunUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static void appStartup(Logger log, Environment env) {
        String protocol = "http";
        if (env.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }
        String serverPort = env.getProperty("server.port");
        String contextPath = env.getProperty("server.servlet.context-path");
        if (StringUtils.isBlank(contextPath)) {
            contextPath = "/";
        }
        String hostAddress = "localhost";
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.warn("The host name could not be determined, using `localhost` as fallback");
        }
        log.info(
                "\n----------------------------------------------------------\n\t" + "Application '{}' is running!\n\t"
                        + "Local: \t\t{}://localhost:{}{}\n\t" + "External: \t{}://{}:{}{}\n\t"
                        + "OS: \t{}\t" + "\n----------------------------------------------------------",
                "Event Management", protocol, serverPort, contextPath, protocol, hostAddress, serverPort,
                contextPath, OSDetectorUtil.getOS());

        appRunning = true;
    }

    public static boolean isAppRunning() {
        return appRunning;
    }

}
