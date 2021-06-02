
public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
	
		System.out.print(instructor.getId());
		System.out.print(instructor.getName());
		System.out.print(instructor.getLastName());
		System.out.print(instructor.getEmail());	
		System.out.print(instructor.getCourseId());
		System.out.print(instructor.getCourseName());
		
	}

}
