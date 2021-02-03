package praktikum3;
import java.util.Scanner;
public class Kendaraan {
  static void data() {
      String jenis, brand;
      int cc;
      Scanner io = new Scanner (System.in);
      
      System.out.print("Masukkan jenis : ");
      jenis = io.nextLine();
      System.out.print("Masukkan brand : ");
      brand = io.nextLine();
      System.out.print("Masukkan CC    : ");
      cc = io.nextInt();
      
      
      System.out.println("--------DATA KENDARAAN--------");
      System.out.println("Jenis : "+jenis);
      System.out.println("Brand : "+brand);
      System.out.println("CC    : "+cc);
  }   
}
