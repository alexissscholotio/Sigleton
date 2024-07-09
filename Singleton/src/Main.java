import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto del servido: " + config.getPort());
        System.out.println("IP de servidor: " + config.getIP());
        System.out.println("MAC del servidor: " + config.getMAC());
        System.out.println();

        config.setServerUrl("https://when.xd");
        config.setPort(3306);
        config.setIP("192.168.10.255");
        config.setMAC("00-1A-2B-3C-4D-5E");

        /*  O PRUEBE CON VALORES DINAMICOS
        Scanner tec = new Scanner(System.in);

        System.out.println("\n** Ingrese los datos del servidor **\n");

        System.out.print("Ingrese el link: ");
        config.setServerUrl(tec.next());
        System.out.print("Ingrese el puerto: ");
        config.setPort(tec.nextInt());
        System.out.print("Ingrese la IP: ");
        config.setIP(tec.next());
        System.out.print("Ingrese el MAC: ");
        config.setMAC(tec.next());
        */

        System.out.println("URL del Servidor: " + config.getServerUrl());
        System.out.println("Puerto del servido: " + config.getPort());
        System.out.println("IP de servidor: " + config.getIP());
        System.out.println("MAC del servidor: " + config.getMAC());
    }
}