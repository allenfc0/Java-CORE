package interfaceExample;

public interface Interface1 {
	
	// this method can be overriden in classes implementing 1 interface. 
	// If more interfaces are involved, then it will have to be overriden regardless
	default void animalSound() {
		System.out.println("animal noise");
	}
	
	// static methods can't be overriden in subclasses
	static void isAnimal() {
		System.out.println("This is an Animal Class");
	}
	
	// instantiating an abstract method when working in an interface
	void runningSpeed();

}
