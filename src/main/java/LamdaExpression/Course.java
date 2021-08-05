package LamdaExpression;

public class Course {
	private int courseId;
	private String courseName;
	private String duration;
	private String trainer;
	
	
	public Course() {
		System.out.println("Course -0 arg Con");
	}
	
	public Course(int courseId, String courseName, String duration, String trainer) {
		System.out.println("Course - 4 arg Con");
		this.courseId = courseId;
		this.duration = duration;
		this.courseName = courseName;
		this.trainer = trainer;
	}
	
	
	
}
