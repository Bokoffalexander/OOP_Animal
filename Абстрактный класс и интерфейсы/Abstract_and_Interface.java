abstract class Animal{
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public void printName(){
		System.out.println(this.name + "\n");
	}
}

interface Runnable {
	void run();
}


class Dog extends Animal implements Runnable{
	@Override
	public void run(){
		System.out.println("I am running fast, because I am Dog !");
	}
}

class Cat extends Animal{}

class Mouse extends Animal{
	@Override
	public void printName(){
		System.out.println("I am too small !");
		super.printName();
	}
}

public class Abstract_and_Interface{
	public static void main(String[] args){
		Dog a = new Dog();
		a.setName("Rex");
		a.run();
		a.printName();


		Cat b = new Cat();
		b.setName("Murzik");
		b.printName();

		Mouse c = new Mouse();
		c.setName("Jerrry");
		c.printName();
	}
}