package dto;

public class HocSinh {
	String Class;
	String Name;
	int Age;
	String Addess;
	public HocSinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HocSinh(String class1, String name, int age, String addess) {
		super();
		Class = class1;
		Name = name;
		Age = age;
		Addess = addess;
	}
	public String getClass() {
		return Class;
	}
	public void setClass(String class1) {
		Class = class1;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddess() {
		return Addess;
	}
	public void setAddess(String addess) {
		Addess = addess;
	}
	@Override
	public String toString() {
		return "HocSinh [Class=" + Class + ", Name=" + Name + ", Age=" + Age + ", Addess=" + Addess + "]";
	}
	
	
	

}
