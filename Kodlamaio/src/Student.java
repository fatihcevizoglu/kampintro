
public class Student extends User{

private int _lessonId;
private	String _lesson;
private int _taskId;
private	String _task;
	
	
    public int get_lessonId() {
      return	_lessonId;
    }
	public void set_lessonId(int lessonId) {
		_lessonId = lessonId;
	}
	public String get_lesson() {
		return _lesson;
	}
	public void set_lesson(String lesson) {
		_lesson = lesson;
	}
	public int get_taskId() {
		return _taskId;
	}
	public void set_taskId(int taskId) {
		_taskId = taskId;
	}
	public String get_task() {
		return _task;
	}
	public void set_task(String task) {
		_task = task;
	}
}
