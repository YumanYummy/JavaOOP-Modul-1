import java.util.Scanner;

class Input{
    Scanner in = new Scanner(System.in);
    private String mhs_name;
    private String mhs_number;
    private String mhs_password;

    public void setmhs_name(String mhs_name){
        this.mhs_name = mhs_name;
    }

    public String getMhs_name(){
        return mhs_name;
    }

    public void setmhs_number(String mhs_number){
        this.mhs_number = mhs_number;
    }

   public String getmhs_number(){
        return mhs_number;
    }


    public void setmhs_password(String mhs_password) {
        this.mhs_password = mhs_password;
    }

    public String getmhs_password(){
        return mhs_password;
    }


    public void register(){
        System.out.println("=================== Daftar ========================");
        
        System.out.print("Masukkan Nama Anda: ");
        mhs_name= in.nextLine();
        setmhs_name(mhs_name);

        System.out.print("Masukkan Nim Anda : ");
        mhs_number = in.next();
        if(getmhs_number().length() !=15 ){
            System.out.println("Nim Anda Harus 15 Angka ");
            System.out.print("Masukkan Nim Anda: ");
            mhs_number = in.next();
            setmhs_number(mhs_number);
        }else {
            setmhs_number(mhs_number);
        }

        System.out.print("Masukkan Password Anda: ");
        mhs_password= in.next();
        if(getmhs_password().length() < 8){
            System.out.println("Password Anda Minimal 8 Karakter");
            System.out.print("Masukkan Password Anda: ");
            mhs_password= in.next();
            setmhs_password(mhs_password);
        }else{
            setmhs_password(mhs_password);
        }
        System.out.println("===================================================\n");
    }

    public void Information(){
        System.out.println("\n============================================================\n");
        System.out.println("Selamat  " +getMhs_name()+ "  Anda Telah Berhasil Mendaftar\n");
        System.out.println("Berikut Username dan Password Anda:");
        System.out.println("Username Anda: " +getmhs_number());
        System.out.println("Password Anda: " +getmhs_password());
        System.out.println("\n============================================================\n");
    }
}

public class Input_Mahasiswa {
    public static void main(String[] args) {
        Input mhs = new Input();
        mhs.register();
        mhs.Information();
    }
}