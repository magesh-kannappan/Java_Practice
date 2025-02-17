package a1_Java_Practice_February_2025;



class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Dog {
	@Override
	void makeSound() {
		System.out.println("Cat Meows");
	}
}

public class Test {
	public static void main(String[] args) {
		//
		// Animal myAnimal = new Dog(); // Upcasting
		// myAnimal.makeSound(); // Calls Dog's makeSound() at runtime

//		Dog myDog = new Dog();
//		myDog.makeSound();
//
//		Cat myCat = new Cat();
//		myCat.makeSound();

		Animal myAnimal = new Dog();
		myAnimal.makeSound();

		Animal myAnimal2 = new Cat();
		myAnimal2.makeSound();
		
		

	}
}
