package animalkingdom;

public class Birds extends AbstractAnimal{
	private int id;
	private String name;
	private int year;

	public Birds(String name, int year){
		// super(id);
		this.name=name;
		this.year=year;
	}


	@Override public String move(){
		return "fly";
	}

	@Override public String breathe(){
		return "lungs";
	}

	@Override public String reproduce(){
		return "eggs";
	}

	@Override public String toString(){
		return "Bird: " + name + ", discovered: " + year;
	}

	public String getName(){
		return name;
	}

	public int getYear(){
		return year;
	}
}