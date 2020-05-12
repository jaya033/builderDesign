package builderDesign;
public class PhoneBuilder {
	String os,processor;
	int battery,ram,screensize;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreensize(int screensize) {
		this.screensize = screensize;
		return this;
	}
	public Phone getPhone()
	{
		return new Phone(os,processor,battery,ram,screensize);
	}
	
}
