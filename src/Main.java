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
        System.out.println("5. Erro karratua");
        System.out.println("6. Berreketa");
        System.out.println("7. Faktoriala");
        System.out.println("8. Alderantzizkoa");
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
                case 2:
                    System.out.println("Sartu zenbaki bat:");
                    int c = sc.nextInt();
                    System.out.println("Sartu beste zenbakia:");
                    int d = sc.nextInt();
                    System.out.println((c - d));
                    break;
                case 3:
                    System.out.println("Sartu zenbaki bat:");
                    int e = sc.nextInt();
                    System.out.println("Sartu beste zenbakia:");
                    int f = sc.nextInt();
                    System.out.println((e * f));
                    break;
                case 4:
                    System.out.println("Sartu zenbaki bat:");
                    float g = sc.nextFloat();
                    System.out.println("Sartu beste zenbakia:");
                    float h = sc.nextFloat();
                    System.out.println((g / h));
                    break;
                case 5:
                    System.out.println("Sartu zenbaki bat:");
                    double i = sc.nextDouble();
                    System.out.println(Math.pow(i,0.5));
                    break;
                case 6:
                    System.out.println("Sartu zenbaki bat:");
                    double j=sc.nextDouble();
                    System.out.println("Sartu beste zenbaki:");
                    double k=sc.nextDouble();
                    System.out.println(Math.pow(j,k));
                    break;
                case 7:
                    System.out.println("Sartu zenbaki bat:");
                    double l=sc.nextDouble();
                    for (double m = l;m>0;m--){
                        l=l*m;
                    }
                    System.out.println(l);
                    break;
                case 8:
                    System.out.println("Sartu zenbaki bat:");
                    double o=sc.nextDouble();
                    System.out.println("1/"o);
                        break;
                    default:
                    System.out.println("Sartu beste zenbaki bat menuan dagoena edo 0 programa bukatzeko.");
                    n = sc.nextInt();
                    break;

            }
        }
        sc.close();
    }
}
