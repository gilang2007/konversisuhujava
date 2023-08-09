import java.util.Scanner;

public class javasuhu {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("masukkan celcius");
        double C = x.nextDouble();

        System.out.println("pilij opsi: ");
        System.out.println("1. farenheit");
        System.out.println("2. reamur");
        System.out.println("3. kelvin");

        int opsi = x.nextInt();

        if (opsi == 1) {
            double f = (C * 9 / 5) + 32;
            System.out.println(C + "adalah" + f);

        } else if (opsi == 2) {
            double r = (C * 4 / 5);
            System.out.println(C + "adalah" + r);

        } else if (opsi == 3) {
            double k = (C * 273);
            System.out.println(C + "adalah" + k);

        } else {
            System.out.println("opsi tidak valid");
        }

    }

}
