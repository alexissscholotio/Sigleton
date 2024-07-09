public class AppConfig {

    private static AppConfig instance;
    private String serverUrl;
    private int port;
    private String ip;
    private String mac;

    private AppConfig() {
        this.serverUrl = "https://kappa.lol";
        this.port = 3;
        this.ip = "192.168.0.1";
        this.mac = "00:1B:44:11:3A:B7";
    }

    public static synchronized AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }

    public String getIP() {
        return ip;
    }
    public void setIP(String ip) {
        this.ip = ip;
    }

    public String getMAC() {
        return mac;
    }
    public void setMAC(String mac) {
        this.mac = mac;
    }
}