
package practical_1_6;

import java.util.Scanner;


public class main {

    public static void main(String[] args) {
       System.out.println ("Козлова Динара Артёмовна, РИБО-01-22, Вариант 2, ");
       
       Scanner scan = new Scanner(System.in);
       System.out.println ("ВВедите название телефона: ");
       String name = scan.nextLine();
       Telephone telephone = new Telephone(name);
       Seller seller = new Seller();
       seller.modify(telephone);
       System.out.println("start name: " + name);
       System.out.println("changes name: " + telephone.getName());
    }
}
