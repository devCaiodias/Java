package heranca;

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setAlimenta("Todo animal se alimenta");
        animal.setLocomove("Todo animal anda");

        Cachorro animalc = new Cachorro();
        animalc.setLocomove("4 patas para ele andar.");
        animalc.setAlimenta("Cachorro come raçao ");
        animalc.setLatido("Ele lati. diferente de outros animais.");

        Animal poodle = new Cachorro();
        poodle.setAlimenta("Poodle come raçao");
        poodle.setLocomove("4 patas");

        System.out.println(poodle.getAlimenta());
        System.out.println(animalc.getLocomove());
    }

}
