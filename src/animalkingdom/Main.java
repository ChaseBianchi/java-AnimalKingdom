package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main{
	private static List<AbstractAnimals> filterAnimals(List<AbstractAnimals> aList, CheckAnimal tester){
		List<AbstractAnimals> tempList = new ArrayList<>();
		for(AbstractAnimals a : aList){
			if(tester.test(a)){
				tempList.add(a);
			}
		}
		return tempList;
	}

	public static void main(String[] args){
		System.out.println("sanity test");

		System.out.println("\n***Animals***");

		Mammals panda = new Mammals("panda", 1869);
		System.out.println(panda);

		Mammals zebra = new Mammals("zebra", 1778);
		Mammals koala = new Mammals("koala", 1816);
		Mammals sloth = new Mammals("sloth", 1804);
		Mammals armadillo = new Mammals("armadillo", 1758);
		Mammals raccoon = new Mammals("raccoon", 1758);
		Mammals bigfoot = new Mammals("bigfoot", 2021);

		Birds pigeon = new Birds("pigeon", 1837);
		Birds peacock = new Birds("peacock", 1821);
		Birds toucan = new Birds("toucan", 1758);
		Birds parrot = new Birds("parrot", 1824);
		Birds swan = new Birds("swan", 1758);

		Fish salmon = new Fish("salmon", 1758);
		Fish catfish = new Fish("catfish", 1817);
		Fish perch = new Fish("perch", 1758);

		System.out.println(perch);
		System.out.println(pigeon);

		List<AbstractAnimal> animalList = new ArrayList<>();
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);

		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);

		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		System.out.println("\n\n***Animal List***");
		System.out.println(animalList);

		System.out.println("\n\n***Alphabetical***");
		animalList.sort((a1, a2)->a1.getName().compareToIgnoreCase(a2.getName()));
		// System.out.println(animalList);
		animalList.forEach((a)-> System.out.println(a));
		
		System.out.println("\n\n***Movement Sorted***");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animalList.forEach((a)-> System.out.println(a.getName() + " moves by " + a.move()));

		System.out.println("\n\n***Filtered to Lungs***");
		lungsList = filterAnimals(animalList, (a)->(a.breathe() == "lungs"));
		System.out.println(lungsList);





	}
}