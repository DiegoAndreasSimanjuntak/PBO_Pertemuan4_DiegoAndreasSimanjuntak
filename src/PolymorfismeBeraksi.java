class Balok {
    double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public Balok() {
        this.p = 1;
        this.l = 1;
        this.t = 1;
    }

    public double volume() {
        return p * l * t;
    }

    public double luasPermukaan() {
        return 2 * (p * l + p * t + l * t);
    }

    public void cetak() {
        System.out.println("Ini method dari kelas Balok");
    }
}

class Kubus extends Balok {
    private double sisi;

    public Kubus(double sisi) {
        super(sisi, sisi, sisi); 
        this.sisi = sisi;
    }

    public double volume() {
        return sisi * sisi * sisi;
    }


    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    public void cetak() {
        System.out.println("Ini method dari kelas Kubus");
    }
}

public class PolymorfismeBeraksi {
    public static void main(String[] args) {
        Balok b = new Balok(4, 3, 2);
        Kubus k = new Kubus(5);

        System.out.println("=== Data Balok ===");
        System.out.println("Volume Balok        : " + b.volume());
        System.out.println("Luas Permukaan Balok: " + b.luasPermukaan());
        b.cetak();

        System.out.println("\n=== Data Kubus ===");
        System.out.println("Volume Kubus        : " + k.volume());
        System.out.println("Luas Permukaan Kubus: " + k.luasPermukaan());
        k.cetak();

        Balok polymorphObj = new Kubus(7);
        System.out.println("\n=== Polymorphism (Balok = Kubus) ===");
        System.out.println("Volume: " + polymorphObj.volume());
        System.out.println("Luas Permukaan: " + polymorphObj.luasPermukaan());
        polymorphObj.cetak();
    }
}
