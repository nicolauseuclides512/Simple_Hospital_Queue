import java.util.Scanner;

public class HospitalMain {
    public static void main(String[] args) {
        QueueHospital qh = new QueueHospital();
        int exit = 0;
        while (exit == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ambil Antrian ?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.println("3. Keluar");
            int antri = sc.nextInt();
            if (antri == 1) {
                qh.queueAdd(true);
                qh.queuePasien();
            } else if (antri == 3) {
                System.out.println("Program berhenti Terimakasih");
                exit = 1;
            } else {
                qh.queueAdd(false);
            }
        }
    }
}
