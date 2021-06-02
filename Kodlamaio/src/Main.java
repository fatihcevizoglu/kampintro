
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setName("Ali");
		student.setLastName("�elik");
		student.setEmail("alicelik@gmailcom");
		student.set_taskId(1);
		student.set_task("�dev1");
		student.set_lessonId(1);
		student.set_lesson("1 g�n");
		student.setPaswword("1as23d5we16");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setName("Kerem");
		instructor.setLastName("�al��kan");
		instructor.setEmail("keremcal�kan@hotmail.com");
		instructor.setCourseId(2);
		instructor.setCourseName("Programlaman�n Temleri");
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
