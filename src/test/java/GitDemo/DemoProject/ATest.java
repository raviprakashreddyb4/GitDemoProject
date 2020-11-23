package GitDemo.DemoProject;

import org.testng.annotations.Test;

public class ATest 
{
	@Test
    public static void main(String[] args)
    {
    	A a=new A();
    	a.sumValue(20, 10, 30);
    	a.mulValue(10,20);
    	a.Subvalue(20, 15);
    	a.printName();
    	
    }
}
