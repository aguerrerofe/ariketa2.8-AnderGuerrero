import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("MENUA");
        System.out.println("1. Batuketa");
        System.out.println("2. Kenketa");
        System.out.println("3. Biderketa");
        System.out.println("4. Zatiketa");
        System.out.println("0. Amaiera");
        while(n!=0) {
            switch (n) {
                case 1:
                    System.out.println("Sartu zenbaki bat:");
                    int a = sc.nextInt();
                    System.out.println("Sartu beste zenbakia:");
                    int b = sc.nextInt();
                    System.out.println((a + b));
                    break;
               

            }
        }
        sc.close();
    }
}