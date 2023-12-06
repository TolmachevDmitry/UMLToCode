package classes;

import java.util.*;

public class Institute {

	private Collection<Research> researches = new ArrayList<Research>();
	private String name;
	private String address;

	public Collection<Research> getResearches() {
		return this.researches;
	}

	public void setResearches(Collection<Research> researches) {
		this.researches = researches;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}