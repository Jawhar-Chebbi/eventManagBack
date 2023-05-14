package tn.esprit.spring.utils;

public class OSDetectorUtil {

    private OSDetectorUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static String getOS() {
        return System.getProperty("os.name").toLowerCase();
    }

    public static boolean isWindows() {
        return (getOS().contains("win"));
    }

    public static boolean isMac() {
        return (getOS().contains("mac"));
    }

    public static boolean isLinux() {
        return getOS().contains("linux");
    }

    public static boolean isUnix() {
        return (getOS().contains("nix") || getOS().contains("nux") || getOS().contains("aix"));
    }

    public static boolean isSolaris() {
        return (getOS().contains("sunos"));
    }

    public static String getRootDirectory() {
        if (isWindows()) {
            return "C:\\";
        } else {
            return "/";
        }
    }
}
