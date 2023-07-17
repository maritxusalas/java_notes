package com;

class VoteException extends Exception {
	
	public VoteException(String msg) {
		super(msg); // super() is used to call parameter constructor of exception to set the message
	}
}
public class ThrowsExample {

	public static void main(String[] args){
		int age = 18;
		try {
		if (age < 21){
			//throw new Exception();  //generic exception without message
			//throw new Exception("You can't vote age must be > 21"); //generic with mesage
			//throw new ArithmeticException(); //specific exception without message
			//throw new ArithmeticException("you can't vote age must be > 21"); //specific exception with mesage 
			//throw new VoteException("you can't vote agemust be > 21"); //custom  exception
			int res =10/0; // throw new aritthmetical excepriotn
		}else {
			System.out.println("Yo can vote");
		}
		} catch (Exception e) {
			System.out.println(e); ///it will call toString()
			System.out.println(e.getMessage());
		}
		System.out.println("finish");
	}

}


