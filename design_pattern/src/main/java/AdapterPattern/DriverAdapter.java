package AdapterPattern;

public class DriverAdapter {
	public DriverAdapter() {
		System.out.println("**AdapterPattern**");
		Sparrow sparrow = new Sparrow(); 
	    ToyDuck toyDuck = new PlasticToyDuck(); 
	    ToyDuck birdAdapter = new BirdAdapter(sparrow); 
	    System.out.println("It's a Toy Duck"); 
	    toyDuck.squeak(); 
	    System.out.println("It's a BirdAdapter.."); 
	    birdAdapter.squeak(); 
	    System.out.println("It's a Sparrow..."); 
	    sparrow.fly(); 
	    sparrow.sound(); 
	}
}
