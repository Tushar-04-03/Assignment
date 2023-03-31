package Project;
import java.util.Scanner;
class Hospital{
	String Location;
	String Doctor;
	String Specification;
	String Fees;
	String Washroom;
	String Ambulance;
	String Rooms;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Information about the Hospital");
		Location=sc.nextLine();
		System.out.println(" Location of Hospital :"+Location);
		Doctor=sc.nextLine();
		System.out.println("Number of Doctors in Hospital is :"+Doctor);
		Specification=sc.nextLine();
		System.out.println("Specification of Hospital is :"+Specification);
		Fees=sc.nextLine();
		System.out.println("Fees of the Hospital is :"+Fees);
		Washroom=sc.nextLine();
		System.out.println("Number of Wsahroom in Hospital :"+Washroom);
		Ambulance=sc.nextLine();
		System.out.println("Number of Amnulance in Hospital :"+Ambulance);
		Rooms=sc.nextLine();
		System.out.println("Number os Rooms in Hospital :"+Rooms);
	}}
	class Patient{
		String age;
		String name;
		String address;
		String PhoneNumber;
		String AadharCardNumber;
		String AyushmanCard;
		String problem;
		void patient() {
			Scanner sc=new Scanner(System.in);
			System.out.println("*************");
			System.out.println("Patient information");
			age=sc.nextLine();
			System.out.println("Age of the Patient is :"+age);
			name=sc.nextLine();
			System.out.println("Patient nam is :"+name);
			address=sc.nextLine();
			System.out.println("Address of the Patient :"+address);
			PhoneNumber=sc.nextLine();
			System.out.println("Patient PhoneNumber :"+PhoneNumber);
			AadharCardNumber=sc.nextLine();
			System.out.println("AadharCardNumber Of Patient :"+AadharCardNumber);
			AyushmanCard=sc.nextLine();
			System.out.println("Patient having AyushmanCard or not:"+AyushmanCard);
			problem=sc.nextLine();
			System.out.println("What is the Problem of the Patient :"+problem);
		
	}
	}
	

public class ProjectHospitalManagement {

	public static void main(String[] args) {
		Hospital ho=new Hospital();
		ho.input();
		Patient pa=new Patient();
		pa.patient();
	
	}

}
