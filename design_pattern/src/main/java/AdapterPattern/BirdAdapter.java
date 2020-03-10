package AdapterPattern;

class BirdAdapter implements ToyDuck { 
    Bird bird; 
    public void squeak(){ 
        bird.sound(); 
    } 
    public BirdAdapter(Bird bird){ 
        this.bird = bird; 
    } 
  
}
