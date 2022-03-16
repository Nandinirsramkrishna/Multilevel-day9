package day9;
class s1
{
	protected int i=10;
	int j=20;
	void display()
	{
		System.out.println("i="+i);
		System.out.println("j="+j);
		
	}
}
class s2 extends s1
{
	int calculate()
	{
		return (i+j);
	}
}
class s3 extends s2
{
	void print()
	{
		System.out.println("Addition of two num is="+calculate());
	}


	}

public class multilevel {

	public static void main(String[] args) {
		s3 s=new s3();
		s.display();
		s.print();

	}

}
