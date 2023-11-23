class Animal{
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public void printName(){
		System.out.println(this.name + "\n");
	}
}

class Dog extends Animal{}

class Cat extends Animal{}

class Mouse extends Animal{
	@Override
	public void printName(){
		System.out.println("I am too small !");
		super.printName();
	}
}

public class Inheritance{
	public static void main(String[] args){
		Dog a = new Dog();
		a.setName("Rex");
		a.printName();

		Cat b = new Cat();
		b.setName("Murzik");
		b.printName();

		Mouse c = new Mouse();
		c.setName("Jerry");
		c.printName();
	}
}
