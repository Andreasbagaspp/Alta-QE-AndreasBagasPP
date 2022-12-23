package Volume;

public class Main {

    public static void main(String[] args) {
        Kubus volumekubus = new Kubus(10);
        System.out.println("Volume Kubus "+ volumekubus.hitungVolumeKubus());

        Balok volumebalok = new Balok(3, 6, 10);
        System.out.println("Volume Balok "+ volumebalok.hitungVolumeBalok());

        Tabung volumetabung = new Tabung(7, 10);
        System.out.println("Volume Tabung "+ volumetabung.hitungVolumeTabung());
    }
}
