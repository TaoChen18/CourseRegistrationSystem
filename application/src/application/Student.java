package application;

import application.Program;

public class Student implements Program {
	private String username;
	private String st_name;
	private String college;
	private String department;
	private String program;
	private String address;
	private String phone;
	
	public Student(String username,String st_name) {
		this.username=username;
		this.st_name=st_name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getStName() {
		return st_name;
	}
	
	public void setProgram(String program) {
		this.program=program;
	}
	
	public String getProgram() {
		return program;
	}

	@Override
	public void setCollege(String college) {
		// TODO Auto-generated method stub
		this.college=college;
	}

	@Override
	public String getCollege() {
		// TODO Auto-generated method stub
		return college;
	}

	@Override
	public void setDepartment(String department) {
		// TODO Auto-generated method stub
		this.department=department;
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return department;
	}

	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void printInfo() {
		System.out.println("user: "+this.getUsername()+"\n"+"name: "+this.getStName()+"\n"+
	"college: "+this.getCollege()+"\n"+"department: "+this.getDepartment()+"\n"+"program: "+this.getProgram()+
	"\n"+"address: "+this.getAddress()+"\n"+"phone:"+this.getPhone());
	}
	
}
