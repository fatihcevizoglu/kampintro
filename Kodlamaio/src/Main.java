
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setName("Ali");
		student.setLastName("Çelik");
		student.setEmail("alicelik@gmailcom");
		student.set_taskId(1);
		student.set_task("ödev1");
		student.set_lessonId(1);
		student.set_lesson("1 gün");
		student.setPaswword("1as23d5we16");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setName("Kerem");
		instructor.setLastName("Çalışkan");
		instructor.setEmail("keremcalıkan@hotmail.com");
		instructor.setCourseId(2);
		instructor.setCourseName("Programlamanın Temleri");
		instructor.setPaswword("1a32s51c32v0s");
		
		
		User [] users = {student,instructor};
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		
		userManager.adds(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
	    		
	}

}
