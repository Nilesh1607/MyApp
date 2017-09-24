package com.mycompany.demo.MyApp;

/**
 * Hello world!
 *
 */
public class App {
	private String greeting;
	
	public String getGreeting() {
			return this.greeting;
	}
	
	public void setGreeting(String greet) {
		if (isGreetingValid(greet)) {
			this.greeting = greet;
			}
		}
	
	public boolean isGreetingValid(String greeting) {
		if (greeting.contains("welcome")
				|| greeting.contains("thanks")
				|| greeting.contains("good afternoon")) {
			return true;
			
		}
		
		return false;
	}
	
}


/**	
*    public static void main( String[] args )
*    {
*        System.out.println( "Hello World!" );
*    }
*/
	

