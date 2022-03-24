import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Fiyat Giriniz : ");
        double fiyat = in.nextDouble();

        if(fiyat<40000)
        {
            System.out.println("Tofaş Gurubu Alabilirsiniz!");
        } else if (fiyat>=40000 && fiyat<=140000)
        {
            if (fiyat<=100000)
            {
                System.out.println("Opel Gurubu Alabilirsiniz!");
            }
            if (fiyat>=90000)
            {
                System.out.println("Volkswagen Gurubu Alabilirsiniz!");
            }
        }else
        {
            System.out.println("Honda Gurubu Alabilirsiniz");
        }

    }
}





