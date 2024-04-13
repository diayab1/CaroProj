import java.util.Scanner;


public class TestScores {
    public static void main(String[]args){
        double test1;
        double test2;
        double test3;
        double averagescore;
        char lettergrade;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your first test score");
        test1= sc.nextDouble();
        System.out.println("please enter your second test score");
        test2=sc.nextDouble();
        System.out.println("please enter your third test score");
        test3=sc.nextDouble();
        averagescore=(test1+test2+test3)/3;
        System.out.println("your average score is :"+ averagescore);
        if (averagescore<=100 && averagescore>=90){
            lettergrade= 'A';
            System.out.println("your letter grade is :" +lettergrade);
        }else if(averagescore<=89 && averagescore>=80){
            lettergrade='B';
            System.out.println("your letter grade is :"+ lettergrade);
        }else if(averagescore<=79 && averagescore>=70){
            lettergrade='C';
            System.out.println("your letter grade is :" +lettergrade);
        }else if(averagescore<=69 && averagescore>=60){
            lettergrade='D';
            System.out.println("your letter grade is:" +lettergrade);
        }else if(averagescore<60){
            lettergrade= 'F';
            System.out.println("your letter grade is:" +lettergrade);
            sc.close();
        }
    }
}
