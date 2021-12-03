import java.text.SimpleDateFormat;
import java.util.Date;

public class QueueHospital {
    private int[] queue = new int[5];
    private int counter = 0;

    private String queueDateGenerator() {
        try {
            int loopX = 0;
            String a = "";
            while (loopX == 0) {
                System.out.println("Nomor antrian :");
                loopX = 1;
            }
            queue[counter] = counter++;
            if (counter == counter - 1) {
                System.out.println("Nomor antrian telah diambil");
            } else {
                int alphaLength = Integer.toString(counter).trim().length();
                String alphaString = "";
                if (alphaLength == 1) {
                    alphaString = "00" + counter;
                } else if (alphaLength == 2) {
                    alphaString = "0" + counter;
                } else if (alphaLength == 3) {
                    alphaString = "" + counter;
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
                Date date = new Date();
                a = sdf.format(date) + alphaString;
            }
            return a;
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Antrian sedang penuh mohon menunggu nomor antrian sebelumnya dipanggil";
        }

    }

    public boolean queueAdd(boolean add_queue) {
        add_queue = true;
        add_queue = add_queue == true ? true : false;
        return add_queue;
    }

    public void queuePasien() {
        String antrian = queueDateGenerator();
        Pasien pasien1 = new Pasien();
        pasien1.setDataPasien();
        pasien1.getDataPasien();
        System.out.println(antrian);
        System.out.println(antrian.substring(antrian.length() - 3));
    }
}
