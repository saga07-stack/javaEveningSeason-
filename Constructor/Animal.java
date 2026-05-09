package Constructor;

public class Animal {
    private String animalName;
    private double weight;
    public Animal (String animalName, double weight){
        this.animalName = animalName;
        this.weight = weight;
    }
    public void setAnimalName (String animalName){
        this.animalName = animalName;
    }
    public void setWeight (double weight){
        this.weight = weight;
    }
        public String getAnimalName (){
            return animalName;
        }
        public double getWeight (){
            return weight;
        }

    public void show(){
        
        System.out.println(getAnimalName());
        System.out.println(getWeight());
    }
    public static void main(String[] args) {
        Animal src = new Animal("dog", 19.2);
        src.show();
    }
}
