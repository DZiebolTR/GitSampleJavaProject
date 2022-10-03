/**
 * 
 */
package com.west.git.test;

import com.west.git.test.TestCalledClass;
import com.west.git.test.TestMainClass;

/**
 * @author 0014135
 *
 */
public class TestMainClass
{

	public static void main(String[] args)
	{
		String whereAmI = TestMainClass.class.getName() + ".main()";
		System.out.println(whereAmI + " method entry");
		TestCalledClass c = new TestCalledClass();
		c.callMe();
		System.out.println(whereAmI + " done!");
	}


}
