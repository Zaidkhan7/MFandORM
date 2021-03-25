package FortuneAndWorkout;

public class Hockey implements Coach {
	private  String name;
	private String email;
	private String team_name;
	private Address add;
	
	Hockey(String name , String email , String team_name , Address add)
	{
		this.name=name;
		this.email=email;
		this.team_name=team_name;
		this.add=add;
	}
	
	
	public String toString()
	{
		return name+" "+email+" "+team_name+" "+add.getHouse_no()+" "+add.getState()+" "+add.getCity()+" "+add.getPincode();
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
