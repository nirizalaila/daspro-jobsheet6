import java.util.Scanner;
public class Modif2Pemilihan2Percobaan124 {
    public static void main(String[] args) {
    Scanner input24 = new Scanner(System.in);
    int tahun;
        System.out.print("Masukkan Tahun: ");
        tahun = input24.nextInt();
        if ((tahun % 4) == 0){
            if ((tahun % 100) !=0)
            System.out.println("Tahun Kabisat");
            else if ((tahun % 400) ==0)
            System.out.println("Tahun Kabisat");
            else 
            System.out.println("Tahun " + tahun + " bukan tahun kabisat");
        } else
        System.out.println("Bukan tahun kabisat");
    }    
}
