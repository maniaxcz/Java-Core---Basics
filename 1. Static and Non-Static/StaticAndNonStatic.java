public class StaticAndNonStatic
{
    public int number;
    static int objCounter = 0;
    StaticAndNonStatic(){
	System.out.println("Inside Default Constructor");
	++objCounter;
	System.out.println("Object Created : "+objCounter);
    }
    
    {
	System.out.println("Inside Non-Static Block\n");
    }

    public static void main(String[] args)
    {
	new StaticAndNonStatic();
	new StaticAndNonStatic();
	new StaticAndNonStatic();
    }
    
    static
    {
	System.out.println("Inside Static Block");
    }

}
