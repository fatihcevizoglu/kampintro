
public class Instructor extends User {
	
	private int _courseId;
	private String _courseName;
	
	public int getCourseId() {
		return _courseId;
	}
	public void setCourseId(int courseId) {
		_courseId = courseId;
	}
	public String getCourseName() {
		return _courseName;
	}
	public void setCourseName(String courseName) {
		_courseName = courseName;
	}

}
