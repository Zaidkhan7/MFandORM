package FortuneAndWorkout;

public class RugbyCoach implements Coach {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "name=" + name;
	}

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getdailyfortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
