package practice;
import java.util.Scanner;
public class Calculator {
			public static void main(String[] args) {
				int n1,n2,cal,ch;
				Scanner s=new Scanner(System.in);
				while(true)
				{
					System.out.println("Enter any two number");
					n1=s.nextInt();
					n2=s.nextInt();
					System.out.println("Which operation would you like to perform(1/2/3/4/5):");
					System.out.println("1.Addition(+)");
					System.out.println("2.subtraction(-)");
					System.out.println("3.multiplication(*)");
					System.out.println("4.Division(/)");
					System.out.println("5.Modulor(%)");
					System.out.println("Enter your choice");
					ch=s.nextInt();
					if (ch==1)
					{
						cal=n1+n2;
						System.out.println("addition of a two number: " +cal);
					}
					else if (ch==2){
						cal=n1-n2;
						System.out.println("substraction of a two number: " +cal);
					}
					else if(ch==3)
					{
						cal=n1*n2;
						System.out.println("multiplication of a two number: " +cal);
					}	
					else if(ch==4)
					{
						cal=n1/n2;
						System.out.println("division of a two number: " +cal);
					}
					else
					{
						cal=n1%n2;
						System.out.println("reminder of a two number: " +cal);
					}
					System.out.println("Would you like to continue?(1 for YES, 2 for NO): ") ;
					int cont = s.nextInt();
					if(cont == 2)
					{
						break;
					}
				}
			}
}
				
