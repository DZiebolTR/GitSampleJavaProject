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
		String whereAmI = TestMainClass.class.getName() + ".main() ";
		System.out.println(whereAmI + " method entry");
		System.out.println(whereAmI + " added more history");
		TestCalledClass c = new TestCalledClass();
		System.out.println(whereAmI + " now call .callMe()");
		c.callMe();
		System.out.println(whereAmI + " done!");
		System.out.println(whereAmI + " another new comment out.");
		System.out.println(whereAmI + " I need another change");
		System.out.println(whereAmI + " another change to merge master and head");
	}


}
