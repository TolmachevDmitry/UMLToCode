package classes;

import java.util.*;

public class Faculty {

	private Collection<Institute> institutes = new ArrayList<Institute>();
	private Employee dean;
	private String name;

	public Collection<Institute> getInstitutes() {
		return this.institutes;
	}

	public void setInstitutes(Collection<Institute> institutes) {
		this.institutes = institutes;
	}

	public Employee getDean() {
		return this.dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}