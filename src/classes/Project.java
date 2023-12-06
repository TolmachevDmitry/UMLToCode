package classes;

import java.util.*;

public class Project {

	private Collection<Research> researches = new ArrayList<Research>();
	private String name;
	private String startingDate;
	private String endDate;

	public Collection<Research> getResearches() {
		return this.researches;
	}

	public void setResearches(Research researches) {
		this.researches.add(researches);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartingDate() {
		return this.startingDate;
	}

	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}