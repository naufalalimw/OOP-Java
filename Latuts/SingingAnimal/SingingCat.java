public class SingingCat extends SingingAnimal{
    String breed;
    public SingingCat(String name, String voice){
        super(4, name, voice);
        breed = "normal";
    }

    public SingingCat(String name, String voice, String breed){
        super(4, name, voice);
        this.breed = breed;
    }

    public void sing() {
        System.out.println("Meow");
        super.sing();
    }

    public void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My breed is "+ breed);
    }
}