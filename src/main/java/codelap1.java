
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelap1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jenis, jeniskelamin, tanggallahir;
        int umur ;

        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print(" Jenis Kelamin (P/L): ");
        jeniskelamin = input.nextLine();
        jenis = (jeniskelamin.equalsIgnoreCase("L")) ? "laki-laki" : "perempuan";
        System.out.print("Tanggal Lahir (YYYY-MM-DD): ");
        tanggallahir= input.nextLine();
        LocalDate Lahir = LocalDate.parse(tanggallahir);

        LocalDate sekarang = LocalDate.now();
        umur = Period.between(Lahir, sekarang).getYears();


        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenis);
        System.out.println("Tanggal Lahir: " + tanggallahir);
        System.out.println("Umur: " + umur);


    }
}
