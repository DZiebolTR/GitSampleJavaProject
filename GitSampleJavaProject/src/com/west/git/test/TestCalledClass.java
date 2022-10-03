/**
 * 
 */
package com.west.git.test;

/**
 * @author 0014135
 *
 */
public class TestCalledClass
{

	public void callMe()
	{
		System.out.println(this.getClass().getName() + ".callMe() has been called");
	}

}
