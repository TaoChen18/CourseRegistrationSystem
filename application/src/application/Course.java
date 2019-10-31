package application;

public class Course {
	private String code;
	private String title;
	private String location;
	private String schedule;
	
	public Course(String code,String title,String location,String schedule) {
		this.code=code;
		this.title=title;
		this.location=location;
		this.schedule=schedule;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getSchedule() {
		return schedule;
	}
	
	public void printCourse() {
		System.out.println("code: "+this.getCode()+"\n"+"course: " + this.getTitle()+"\n"+
				"location: "+this.getLocation()+"\n"+"schedule: "+this.getSchedule());
	}

}
