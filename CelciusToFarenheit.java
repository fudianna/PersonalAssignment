import java.util.Scanner;

public class CelciusToFarenheit {
    public static void main(String[] args) {
        Scanner degree = new Scanner(System.in);
        System.out.print("Suhu dalam skala Celcius   = ");
        int TC = degree.nextInt();
        double TF = (9.0 / 5) * TC + 32;
        int valueFarenheit = (int) TF;
        System.out.print("Suhu dalam skala Farenheit = " + valueFarenheit);
    }
}
