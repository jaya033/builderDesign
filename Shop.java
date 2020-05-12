/*Builder pattern builds a complex object using simple objects and using a step by step approach.
This type of design pattern comes under creational pattern as this pattern provides one of the
best ways to create an object.

A Builder class builds the final object step by step. This builder is independent of other objects.
 */
package builderDesign;

public class Shop {
	public static void main(String a[])
	{
		//Phone p=new PhoneBuilder().setBattery(1000).setOs("android").setProcessor("mediatek").setRam(2).setScreensize(5);
		Phone p=new PhoneBuilder().setOs("android").getPhone();

		System.out.println(p);
	}
}
