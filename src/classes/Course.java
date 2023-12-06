package classes;

public class Course {

	private int uniqueNumber;
	private String name;
	private int weeklyDuration;

	public int getUniqueNumber() {
		return this.uniqueNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeeklyDuration() {
		return this.weeklyDuration;
	}

	public void setWeeklyDuration(int weeklyDuration) {
		this.weeklyDuration = weeklyDuration;
	}

}