package homework_21.transport;

/**
 * @author Sergey Bugaenko
 * {@code @date} 21.11.2024
 */

public class Autopilot {

    private String softwareVersion;
    // Двунаправленная связь
    private Autobus autobus;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        return "Autopilot: {" +
                "SV: '" + softwareVersion + '\'' +
                '}';
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
