import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int lado;
        int area;
        int dobro;

        Scanner sc = new Scanner(System.in);
        lado = sc.nextInt();
        sc.close();

        area = lado * lado;
        dobro = area * 2;

        System.out.println("A área desse quadrado é " + area);
        System.out.println("E o dobro dela é " + dobro);
    }
}
