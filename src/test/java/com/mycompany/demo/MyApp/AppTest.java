package com.mycompany.demo.MyApp;

/**import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
*/
import org.junit.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest {
	App app = new App();
	
	@Test
	public void validateSetAndGet() {
		app.setGreeting("good afternoon");
		Assert.assertEquals("good afternoon", app.getGreeting());
		}
	
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     
    *public AppTest( String testName )
    *{
    *    super(testName);
    *}

    **
     * @return the suite of tests being tested
     
    *public static Test suite()
    *{
    *    return new TestSuite( AppTest.class );
    *}

    *
     * Rigourous Test :-)
    
    *public void testApp()
    *{
    *    assertTrue( true );
    */
}
