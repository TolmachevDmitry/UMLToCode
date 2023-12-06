package classes;

import java.util.*;

public class Lecturer extends Research {

	private Collection<Course> courses = new ArrayList<Course>();

	public Collection<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}

}