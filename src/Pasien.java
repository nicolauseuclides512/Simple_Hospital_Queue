import java.util.Scanner;

public class Pasien {
    private String nama, jenis_kelamin;
    private int umur;

    public String getNama() {return nama;}

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setDataPasien() {
        Scanner sc = new Scanner(System.in);
        int jk;
        System.out.println("Masukkan Data Pasien");
        System.out.print("Nama : ");
        setNama(sc.next());
        System.out.print("Umur : ");
        setUmur(sc.nextInt());
        System.out.println("Jenis kelamin : ");
        System.out.println("1. Laki-laki");
        System.out.println("2. Perempuan");
        jk = sc.nextInt();
        if (jk == 1) {
            setJenis_kelamin("Laki-laki");
        } else {
            setJenis_kelamin("Perempuan");
        }
    }

    public void getDataPasien() {
        System.out.println("Data pasien");
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + getUmur());
        System.out.println("Jenis Kelamin : " + getJenis_kelamin());
    }
}
