
public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();

        for (Animal a: animal) {
            System.out.println(a.makeSound());

            if (a instanceof Tiger){
                Edible edible = (Tiger) a;
                System.out.println(edible.howToEat());
            }
        }
    }
}
