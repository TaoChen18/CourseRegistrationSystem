package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Approved extends Registration{

	private String AppId;
	private Student student;
	private List<Course> approvedCourses;
	
	public Approved(String RegId,String AppId) {
		super(RegId);
		// TODO Auto-generated constructor stub
		this.AppId=AppId;
		this.setApprovedCourse(new ArrayList<Course> ());
	}
	
	public void setStudent(Student student) {
		this.student=student;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public void addApproved(Course course) {
		approvedCourses.add(course);
	}
	
	public void setApprovedCourse(List<Course> approvedCourses) {
		this.approvedCourses=approvedCourses;
	}
	
	public List<Course> getApproved(){
		return this.approvedCourses;
	}
	
	public void printApproved() {
		System.out.println("username: "+this.student.getUsername()+"\n"+"approved: "+AppId+"\n");
		Iterator<Course> iter=this.getApproved().iterator();
		int temp=1;
		while(iter.hasNext()) {
			Course c=iter.next();
			System.out.println(temp+". \n"+"code: "+c.getCode()+"\t"+"course: " + c.getTitle()+"\t"+
					"location: "+c.getLocation()+"\t"+"schedule: "+c.getSchedule());
			temp++;
		}
	}
}
