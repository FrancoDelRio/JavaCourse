import java.util.Properties;

public class EjemploPropiedadesDeSistema {
    public static void main(String[] args) {

        // Get the username from system with getProperty("user.name")
        String username = System.getProperty("user.name");
        System.out.println("username: " + username);

        String home = System.getProperty("user.home");
        System.out.println("Directory: " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("Workspace: " + workspace);

        String os_arch = System.getProperty("os.arch");
        String os_name = System.getProperty("os.name");
        String os_verison = System.getProperty("os.version");

        System.out.println("OS Architecture: " + os_arch);
        System.out.println("OS Name :" + os_name);
        System.out.println("OS Version: " + os_verison);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
