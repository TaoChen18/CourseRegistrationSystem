package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Finalcourse extends Approved{

	private String FinalId;
	private Student student;
	private List<Course> FinalCourses;
	
	public Finalcourse(String RegId, String AppId,String FinalId) {
		super(RegId, AppId);
		// TODO Auto-generated constructor stub
		this.FinalId=FinalId;
		this.setFinalCourse(new ArrayList<Course> ());
	}
	
	public void setStudent(Student student) {
		this.student=student;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void addFinal(Course course) {
		FinalCourses.add(course);
	}
	
	public void setFinalCourse(List<Course> FinalCourses) {
		this.FinalCourses=FinalCourses;
	}
	
	public List<Course> getFinal(){
		return this.FinalCourses;
	}
	
	public void printFinal() {
		System.out.println("username: "+this.student.getUsername()+"\n"+"final courses: "+FinalId+"\n");
		Iterator<Course> iter=this.getFinal().iterator();
		int temp=1;
		while(iter.hasNext()) {
			Course c=iter.next();
			System.out.println(temp+". \n"+"code: "+c.getCode()+"\t"+"course: " + c.getTitle()+"\t"+
					"location: "+c.getLocation()+"\t"+"schedule: "+c.getSchedule());
			temp++;
		}
	}
}
