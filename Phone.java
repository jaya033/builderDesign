package builderDesign;

public class Phone {
	String os,processor;
	int battery,ram,screensize;
	public Phone(String os, String processor, int battery, int ram, int screensize) {
		super();
		this.os = os;
		this.processor = processor;
		this.battery = battery;
		this.ram = ram;
		this.screensize = screensize;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", battery=" + battery + ", ram=" + ram
				+ ", screensize=" + screensize + "]";
	}
	
}
