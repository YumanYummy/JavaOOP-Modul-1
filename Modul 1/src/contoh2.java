import java.util.Scanner;

public class contoh2 {
    Scanner in = new Scanner(System.in);
    /*
       Direktur Utama       = DRU
       Wakil Direktur       = WDR
       Direktur Keuangan    = DRK
       Direktur Personalia  = DRP
     */

    private String NamaKaryawan;
    private String KodeJabatan;
    public String getNamaKaryawan() {
        return NamaKaryawan;
    }

    public String getKodeJabatan() {
        return KodeJabatan;
    }

    public void setKodeJabatan(String KodeJabatan) {
        if (getKodeJabatan().length()!=3) {
            System.out.println("Kode jabatan harus berjumlah 3");
        } else {
            this.KodeJabatan = KodeJabatan;
        }
    }
    public void info() {

        System.out.println("=== Identitas Diri ===");
        System.out.print("NamaKaryawan :");
        NamaKaryawan=in.next();
        do {
            System.out.print("kode Jabatan :");
            KodeJabatan = in.next();
            setKodeJabatan(KodeJabatan);
        } while (getKodeJabatan().length() != 3);

        System.out.println("===================================");
        System.out.println("\nSelamat datang " + getNamaKaryawan());
        System.out.println("kode Jabatan :" + getKodeJabatan());
    }
    public static void main(String[] args) {
        contoh2 c = new contoh2();
        c.info();
    }
}
