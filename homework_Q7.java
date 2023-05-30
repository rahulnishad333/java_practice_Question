import java.util.Scanner;
public class homework_Q7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value");
		int num=sc.nextInt();
		
		if(num%7==0){
			System.out.println("The number is divisible ");
		}else{
			System.out.println("The numbet is non-divisible ");
		}
		
	}

}
