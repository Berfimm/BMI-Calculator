package LAB4;

public class BMItest {
	public static void main (String[] args ) {
		
		BMI bmi1 = new BMI ("Sara King",215,70);
		System.out.println("The BMI for" + " " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
		
		BMI bmi2 = new BMI ("Kim Young",18,145,70);
		System.out.println("The BMI for" + " " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
		
		BMI bmi3 = new BMI ("John Black",25,100,50);
		System.out.println("The BMI for" + " " + bmi3.getName() + " is " + bmi3.getBMI() + " " + bmi3.getStatus());
	
	
	
   
	}
}
	


