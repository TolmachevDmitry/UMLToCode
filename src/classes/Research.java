package classes;

import java.util.*;

public class Research extends Employee {

	private Collection<Project> projects;

	public Collection<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(Collection<Project> projects) {
		this.projects = projects;
	}

}