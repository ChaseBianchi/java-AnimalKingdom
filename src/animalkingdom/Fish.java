package animalkingdom;

public class Fish extends AbstractAnimal{
	private int id;
	private String name;
	private int year;

	public Fish(String name, int year){
		// super(id);
		this.name=name;
		this.year=year;
	}


	@Override public String move(){
		return "swim";
	}

	@Override public String breathe(){
		return "gills";
	}

	@Override public String reproduce(){
		return "eggs";
	}

	@Override public String toString(){
		return "Fish: " + name + ", discovered: " + year;
	}

	public String getName(){
		return name;
	}

	public int getYear(){
		return year;
	}

}