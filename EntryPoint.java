import java.util.Scanner;

public class EntryPoint {
    public static void main(String arg[]){
        Scanner scan= new Scanner(System.in);
       
	System.out.print("Please input the employee's first name: ");  
		String FirstName= scan.next();  


	System.out.print("Please input the employee's last name: ");  
		String LastName= scan.next();

	System.out.print("Please input the employee's age: ");  
		int Age= scan.nextInt();

	System.out.print("Please input the employee's Monthly Salary: ");  
		double Salary= scan.nextDouble();
	System.out.println("Employee information:" + FirstName + " " + LastName + ", " + Age + ","+Salary);
        
                
                
    }
}
