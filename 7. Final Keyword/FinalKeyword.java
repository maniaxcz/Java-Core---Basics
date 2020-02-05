package static_keyword;

public class FinalKeyword
{
    final void salute() {							// Final Method - can't be overloaded or overridden
	System.out.println("Final Methods can't be overloaded and overrided");
    }
    final class f2{								// Final Class - can't be extended
	
    }
    public static void main(String[] args){
	
	final int num = 22;							// Final Variable - can't be re-initialized
    }
}
