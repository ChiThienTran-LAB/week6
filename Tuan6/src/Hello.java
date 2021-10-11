import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws Exception {
        Scanner scanner_a = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner_a.nextInt();
        Scanner scanner_b = new Scanner(System.in);
        System.out.println("Nhập b: ");
        int b = scanner_b.nextInt();
        scanner_a.close();
        scanner_b.close();
        if (a>b){
           System.out.println("a>b");
        }if (a==b) {
            System.out.println("a=b");
        } if(a<b) {
          System.out.println("a<b");  
        }
    }
}
