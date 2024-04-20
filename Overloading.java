package my_practicals;

public class Overloading {
	
	void m1(int a) {
		System.out.println(a);
	}
	
	void m1(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	int z1(int z,int zz)
	{
		int zzz=z+zz;
		return zzz;
	}
	
	double z1(double z,double zz)
	{
		double zzz=z+zz;
		return zzz;
		
	}

	public static void main(String[] args) {
		
		Overloading obj=new Overloading();
		System.out.println("method OverLoading");
		obj.m1(100);
		obj.m1(200,300);
		double d=obj.z1(12.12, 45.34);
		System.out.println(obj.z1(12,23));
		System.out.println(d);
		

	}

}
