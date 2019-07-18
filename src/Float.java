import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		foot=(int)1.0;
		Scanner in=new Scanner(System.in);
		
		System.out.println(1.2-1.1);
		System.out.print("«Î ‰»Îfoot:");
		foot=in.nextInt();
		System.out.print("«Î ‰»Îinch:");
		inch=in.nextDouble();
		System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");
		

	}

}
