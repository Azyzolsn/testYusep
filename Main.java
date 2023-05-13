class Animal {
  private String name;
  private int legs;
  private int age;

  // Default constructor
  public Animal(String name, int legs, int age) {
    this.name = name;
    this.legs = legs;
    this.age = age;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for legs
  public void setLegs(int legs) {
    this.legs = legs;
  }

  // Getter for legs
  public int getLegs() {
    return legs;
  }

  // Setter for age
  public void setAge(int age) {
    this.age = age;
  }

  // Getter for age
  public int getAge() {
    return age;
  }
}

class Chicken extends Animal {
  public Chicken(String name, int legs, int age) {
    super(name, legs, age);


  }

  public void walk() {
    System.out.println("hayam bisa jalan.");
  }

  public void eat() {
    System.out.println("Hayam bisa tuang.");
  }
}

public class Main {
public static void main(String[] args) {
Animal animal = new Animal("Chicken", 4, 10);
// Set animal second attribute from 4 to 2
Animal hewan = new Animal("Chicken", 2, 10);
// Output :  Chicken
    System.out.println(animal.getName());
// Output : 4
    System.out.println(animal.getLegs());
// Output : 10
    System.out.println(animal.getAge());
// Output : Animal : Chicken Have 2 Legs   
    System.out.println("Animal : " + animal.getName() + " Have " + hewan.getLegs() + " legs");
    
  Chicken chicken = new Chicken("Chicken", 4, 10);
    chicken.walk();
    chicken.eat();
}
}
