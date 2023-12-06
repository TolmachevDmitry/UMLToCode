package classes;

import java.util.*;

public class University {

	private Collection<Faculty> faculties;
	private Collection<AdministrativePersonal> personals;
	private String name;

	public Collection<Faculty> getFaculties() {
		return this.faculties;
	}

	public void setFaculties(Collection<Faculty> faculties) {
		this.faculties = faculties;
	}

	public Collection<AdministrativePersonal> getPersonals() {
		return this.personals;
	}

	public void setPersonals(Collection<AdministrativePersonal> personal) {
		this.personals = personal;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}