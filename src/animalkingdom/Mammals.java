package animalkingdom;

public class Mammals extends AbstractAnimal{
	private int id;
	private String name;
	private int year;

	public Mammals(String name, int year){
		// super(id);
		this.name=name;
		this.year=year;
	}


	@Override public String move(){
		return "walk";
	}

	@Override public String breathe(){
		return "lungs";
	}

	@Override public String reproduce(){
		return "live birth";
	}

	@Override public String toString(){
		return "Mammal: " + name + ", discovered: " + year;
	}

	public String getName(){
		return name;
	}

}