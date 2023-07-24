//CS-131 Module 2 Programming Project
//Testing RationalNumber modifications to include the compareTo method

public class ApplicationProgram1 {

	public static void main(String[] args) {
		
		//Rational number declarations - demonstrates tolerance value of 0.0001
		RationalNumber ratNum1 = new RationalNumber(1, 10000);
        RationalNumber ratNum2 = new RationalNumber(2, 10000);
        
        //compareTo tests
        if (ratNum1.compareTo(ratNum2) < 0) {
        	System.out.println("ratNum1 is less than ratNum2.");
        }//end if (less than)
        else if (ratNum1.compareTo(ratNum2) > 0) {
        	System.out.println("ratNum1 is greater than ratNum2.");
        }//end else if (greater than)
        else {
        	System.out.println("ratNum1 is equal to ratNum2.");
        }//end else (equal)
        
		//Rational number declarations
		RationalNumber ratNum3 = new RationalNumber(1, 1000);
        RationalNumber ratNum4 = new RationalNumber(2, 1000);
        
        //compareTo tests
        if (ratNum3.compareTo(ratNum4) < 0) {
        	System.out.println("ratNum3 is less than ratNum4.");
        }//end if (less than)
        else if (ratNum3.compareTo(ratNum4) > 0) {
        	System.out.println("ratNum3 is greater than ratNum4.");
        }//end else if (greater than)
        else {
        	System.out.println("ratNum3 is equal to ratNum4.");
        }//end else (equal)
        
        //Rational number declarations
		RationalNumber ratNum5 = new RationalNumber(2, 1000);
        RationalNumber ratNum6 = new RationalNumber(1, 1000);
        
        //compareTo tests
        if (ratNum5.compareTo(ratNum6) < 0) {
        	System.out.println("ratNum5 is less than ratNum6.");
        }//end if (less than)
        else if (ratNum5.compareTo(ratNum6) > 0) {
        	System.out.println("ratNum5 is greater than ratNum6.");
        }//end else if (greater than)
        else {
        	System.out.println("ratNum5 is equal to ratNum6.");
        }//end else (equal)
        
	}//end main

}//end class
