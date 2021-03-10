package animalkingdom;

abstract class AbstractAnimal{
	private static int maxId = 0;
	protected int id;
	protected String name;
	protected int year;

	public AbstractAnimal(){
		maxId++;
		id=maxId;
		name="unknown";
		year=2021;

	}
	public AbstractAnimal(String name, int year){
		maxId++;
		id=maxId;
		this.name=name;
		this.year=year;
	}
	
	abstract String move();
	abstract String breathe();
	abstract String reproduce();
	
	public String eatFood(String food){
		return name + " ate " + food; 	
	}

	public String getName(){
		return name;
	}

	public int getYear(){
		return year;
	}






}