package Exam;

public class Beverage {
	
	String type;
	Beverage(String type){
		this.type= type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage tea = new Beverage("Hot");
		System.out.println("Tea is "+tea.type);

	}

}
