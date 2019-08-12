class Animal {
  public void animalSound() {
    System.out.println("All animals make sound");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("Dog   sounds : Bow Bow");
  }
}

class Horse extends Animal {
  public void animalSound() {
    System.out.println("Horse sounds : Neigh Neigh");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("Cat   sounds : Meow Meow");
  }
}

class MyPetAnimals {
  public static void main(String[] args) {
    Animal a;
	
	a = new Dog();
	a.animalSound();
	
	a = new Horse();
	a.animalSound();
	
	a = new Cat();
	a.animalSound();	
  }
}