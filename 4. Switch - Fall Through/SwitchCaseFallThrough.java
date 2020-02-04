public class SwitchCaseFallThrough
{
    /*		SWITCH CASE FALL THROUGH
     
     When we have a common statements for multiple conditions, then we use Switch Case Fall Through
     Idea is not to break the case condition till it's common to all the matching cases.
     
     */
    public static void main(String[] args)
    {
	char []s = {'a','e','i'};
	switch(s[0])
	{
	   case 'a':
	   case 'e':
	   case 'i':
	   case 'o':
	   case 'u':
	       System.out.println("First Letter is a Vowel");
	       break;
	   default:
	       System.out.println("First Letter is a Consonant");
	       break;
	       
	}
    }
}
