import java.util.*;

class numberguess
{
	public static void main(String args[])
	{
		 Random rand = new Random();
		 Scanner sc =new Scanner(System.in);
		 int num =rand.nextInt(100);
		 int guess, n=5;5
		 while(n>0)
		 { 
			 System.out.println("Enter your guesing number:");
			 guess = sc.nextInt();
			 if(guess <= 0 || guess >= 100)
			 {
				 System.out.println("Guessing value must be 1 to 100 Only");
				 
			 }
			 if(guess < num)
			 {
				 System.out.println("Guessing values is ::: TO LOW");
			 }
			 else if(guess > num)
			 {
				 System.out.println("Guessing values is ::: TO HIGH");
			 }
			 else{
				 System.out.println("..Congratulations...You guess the values is CURRECT....");
				 break;
			 }
			 n--;
			if( n==0)
			{
					System.out.println("Sorry your attemps are completed.Your Gussing values is:"+num);
		 }
		 }
		 
			 
	}
}
