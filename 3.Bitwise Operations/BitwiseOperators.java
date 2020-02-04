public class BitwiseOperators
{
    public static void main(String[] args)
    {
	/*
	 
	 &  - Both must be true
	 |  - One must be true
	 ^  - Both must be different
	  
	 */
	
	System.out.println(true & true);
	System.out.println(true | true);
	System.out.println(true ^ true);
	
	
	System.out.println("Binary of 4&5 : "+(4&5)); 		// 4 in Binary = 100 , 5 in Binary is 101 -> doing 4&5 == 4
	System.out.println("Binary of 4|5 : "+(4|5));
	System.out.println("Binary of 4^5 : "+(4^5));
    }

}
