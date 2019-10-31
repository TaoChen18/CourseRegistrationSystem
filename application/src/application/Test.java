package application;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student("chent16","Tao");
		st.setAddress("Green Island");
		st.setCollege("RPI");
		st.setDepartment("IT");
		st.setProgram("ITWS");
		st.setPhone("8888888888");
		//st.printInfo();
		
		Course c1=new Course("ITWS6600","software development","Low 2029","F");
		//c1.printCourse();
		Course c2=new Course("MGMT6560","data analytics","VCC 203","M,TH");
		//c2.printCourse();
		Course c3=new Course("ECON6200","econometrics","Sage 1019","T,F");
		//c3.printCourse();
		Course c4=new Course("ITWS6200","database system","West 2020","W");
		//c4.printCourse();
		Course c5=new Course("COMM6960","HCI foundation","Sage 1002","M,TH");
		//c5.printCourse();
		Course c6=new Course("CSCI6100","data mining","Sage 3009","T,F");
		//c6.printCourse();
		Course c7=new Course("CSCI6200","Machine Learning","Sage 2109","M,TH");
		//c7.printCourse();
		
		Registration rg=new Registration("00001");
		rg.setStudent(st);
		rg.addRegCourse(c1);
		rg.addRegCourse(c2);
		rg.addRegCourse(c3);
		rg.addRegCourse(c4);
		rg.addRegCourse(c5);
		rg.addRegCourse(c6);
		rg.addRegCourse(c7);
		//rg.printReg();
		
		Approved ap=new Approved("00001","00002");
		ap.setStudent(st);
		ap.addApproved(c1);
		ap.addApproved(c2);
		ap.addApproved(c3);
		ap.addApproved(c4);
		ap.addApproved(c5);
		ap.printApproved();
		
		Finalcourse fn=new Finalcourse("00001","00002","00003");
		fn.setStudent(st);
		fn.addFinal(c1);
		fn.addFinal(c2);
		fn.addFinal(c3);
		fn.addFinal(c4);
		fn.printFinal();
		
		
	}

}
