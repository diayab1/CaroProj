import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        double Package=99;
        double discount = 0;
        double pricebfdiscount;
        double totalprice;
        int quantity;
        System.out.println("Enter number of packages");
        quantity= keyboard.nextInt();
        System.out.println("enter the price of package");
        Package= keyboard.nextDouble();
        System.out.println("enter the price before the discount");
        pricebfdiscount= keyboard.nextDouble();
        pricebfdiscount=Package*quantity;
        discount=pricebfdiscount*discount;
        totalprice= pricebfdiscount-discount;
        if(quantity>=10&&quantity<=19){
            System.out.println("the discount is: 20%");

        } else if (quantity >= 20 && quantity <= 49) {
            System.out.println("the discount is: 30%");

        }
    }
}
