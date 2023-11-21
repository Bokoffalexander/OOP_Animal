class Animal{
	String name;
	int weight;
	String voice;

	public void say(){
		System.out.println(this.voice);
	}
}

public class Test{
	public static void main(String[] args){
		Animal a = new Animal();
		a.name = "Dog";
		a.weight = 20;
		a.voice = "Bark";
		a.say();
	}
}
