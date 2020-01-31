public class WrapperClasses
{
    /*                 
       			WRAPPER CLASSES
      
     Boxing : Wrapping Up Primitive Data to an Object Type
     UnBoxing : Unwrapping data to Primitive Type
     
     
     TYPES : POS (Primitive, Object and String)
     
     1.a - Primitive to Object
       b - Object to Primitive
     
     2.a - String to Primitive
       b - Primitive to String
     
     3.a - String to Object
       b - Object to String
     */
    public static void main(String[] args)
    {
	int x = 10;		        	// Primitive to Object(Boxing)
	Integer y = Integer.valueOf(x);		
	System.out.println("Primitive to Object : "+y);
	int z = y.intValue();			// Object to Primitive(Unboxing)
	
	int n = 15;
	String s = Integer.toString(n);		// String to Primitive
	System.out.println("String to Primitive : "+s);
	int m = Integer.parseInt(s);	        // Primitive to String
	
	long l = 50000;
	Long lg = Long.valueOf(l);
	String slong = Long.toString(lg);	// Object to String
	System.out.println("Object to String : "+slong);
	long fetch = Long.parseLong(slong);
	
	System.out.println("_________________________\n");
	
	
	/*		WRAPPER CLASS CONSTRUCTORS 		*/
	
	Long ll = new Long(40000);
	System.out.println("Long Wrapper Class : "+ll);
	
	String str = new String("Java Is as Awesome as C++");
	System.out.println("String Wrapper Class : "+str);
	
	
    }
}
