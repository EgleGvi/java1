package lt.bt.paveldimumas;

public class Assignment {

	public Assignment() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		Cat cat3 = new Cat();
		Cow cow1 = new Cow();
		Sheep sheep1 = new Sheep();
		Sheep sheep2 = new Sheep();
		Sheep sheep3 = new Sheep();
		Chicken chicken1 = new Chicken();
		Chicken chicken2 = new Chicken();
		
		Animal[] animals = {dog1, dog2, cat1, cat2, cat3, cow1, sheep1, sheep2, sheep3, chicken1, chicken2};
		
		Farm farm = new Farm(animals);
		System.out.println(farm);
	}

}
