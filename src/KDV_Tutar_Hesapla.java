import java.util.Scanner;
public class KDV_Tutar_Hesapla {

    public static void main(String[] args) {
        double tutar, kdvtut, kdvoran, total;

        Scanner input=new Scanner(System.in);

        System.out.println("Alisveris Tutarinizi Giriniz : ");
        tutar= input.nextDouble();

        kdvoran = (tutar>0 && tutar<=1000 ? 0.18 : 0.08);

        kdvtut = tutar * kdvoran ;
        total = kdvtut + tutar;

        System.out.println("KDV Orani : " + kdvoran);
        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV Tutarı : " + kdvtut);
        System.out.println("Toplam tutar : " + total);


    }
}
