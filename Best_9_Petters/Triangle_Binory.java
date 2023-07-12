package Best_9_Petters;
import java.util.*;

public class Triangle_Binory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the row value:");
   int n = sc.nextInt();
   System.out.println("Your dizired  0 - 1 pettern is following");
   
//   outer for loop -->
		for(int i= 1; i<=n; i++) {
			//inner for loop -->
			for(int j=1; j<=i; j++) {
				int sum = i+j;
				if(sum % 2 == 0) {
					System.out.print("1" +" ");
				}else {
					System.out.print("0"+ " ");
				}
			}
			System.out.println(" ");
		}
		
	}

}
