package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Registration{

	private List<Course> regCourses;
	private String RegId;
	private Student student;
	
	public Registration(String RegId) {
		// TODO Auto-generated constructor stub
		this.RegId=RegId;
		this.setRegCourse(new ArrayList<Course> ());
	}
	
	public void setStudent(Student student) {
		this.student=student;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void addRegCourse(Course course) {
		regCourses.add(course);
	}
	
	public void setRegCourse(List<Course> regCourses) {
		this.regCourses=regCourses;
	}
	
	public List<Course> getRegcourses(){
		return this.regCourses;
	}
	
	
	public void printReg() {
		System.out.println("username: "+this.student.getUsername()+"\n"+"Registered: "+this.RegId+"\n");
		Iterator<Course> iter=this.getRegcourses().iterator();
		int temp=1;
		while(iter.hasNext()) {
			Course c=iter.next();
			System.out.println(temp+". \n"+"code: "+c.getCode()+"\t"+"course: " + c.getTitle()+"\t"+
					"location: "+c.getLocation()+"\t"+"schedule: "+c.getSchedule());
			temp++;
		}
	}
}
