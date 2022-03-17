package problem_statement_3_2;

public class Medicine {
	public void displayLabel(){
		System.out.println("Company : Paracetamol");
	System.out.println("Address : Banglore");
	}}
	class Tablet extends Medicine{
		 
		public void displayLabel(){
			System.out.println("store in a cool dry place");
			}}
	class Syrup extends Medicine{
		public void displayLabel(){
			System.out.println("Consumption as directed by the Chemist");
			}}
	class Ointment extends Medicine{
		public void displayLabel(){
			System.out.println("for external use only");}}
