
public class StudentManager extends UserManager {
	public void add(Student student) {
		
		System.out.print(student.getId());
		System.out.print(student.getName());
		System.out.print(student.getLastName());
		System.out.print(student.getEmail());
		System.out.print(student.get_lessonId());
		System.out.print(student.get_lesson());
		System.out.print(student.get_taskId());
		System.out.print(student.get_task());
		
		
		
	}


}
