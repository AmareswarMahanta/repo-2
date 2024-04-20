package my_practicals;

class animal {                                       //Super class

	public void sound() {
		int j=89;
		System.out.println("Animal makes sound");
	}
}

class dog extends animal {								//Child class dog
	
	
	@Override
	public void sound() {
		
		System.out.println("dog barks"); 
	}
}

class cat extends animal {								//Child class animal
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("cat meeowws");	
	}
}

public class Overriding {								// This class is for Main Method

	public static void main(String[] args) {

		animal obj = new animal();						//object of Parent Class
		animal obj1 = new dog();
		animal obj2 = new cat();

//		obj.sound();
//		obj1.sound();
//		obj2.sound();
		
//    	cat obj8=new cat();
//		obj8.sound();
		
		animal dd=new cat();
		dd.sound();
		
		
		

	}

}
