import java.util.Scanner;
public class RunBloodData {
	String input1;
	String input2;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter bloodtype of the patient: " );
		String input1 = sc.nextLine();

		
		System.out.print("Enter rhesus factor of the patient: " );
		String input2 = sc.nextLine();
		
	
		if(input1.isEmpty()){
			if(input2.isEmpty()){
				BloodData bd = new BloodData();
				bd.display();
			}else{
				System.out.print("Invalid");
			}
		
		
		}else if(input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
			if(input2.equals("+")||input2.equals("-")){
			BloodData bd = new BloodData(input1, input2);
			bd.display();
			}else{
				System.out.print("Invalid");
			}
		}else if(input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
			if(input2.equals("+")||input2.equals("-")){
			BloodData bd = new BloodData();
			bd.display();
			}else{
				System.out.print("Invalid");
			}
		}
	
		else{
			System.out.print("Invalid");
		}
		
	
	}
}