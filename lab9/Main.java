import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Animal> animalList = new ArrayList<Animal>(); // Tum hayvanlari tutmak icin

        ArrayList<Duck> duckList = new ArrayList<>(); // Sadece Duck icin
        ArrayList<Fish> fishList = new ArrayList<>(); // Sadece Fish icin
        ArrayList<Zebra> zebraList = new ArrayList<>(); // Sadece Zebra icin


        // 2 Animal
        Animal animal1 = new Animal(5, "M", true);
        Animal animal2 = new Animal(6, "F", false);

        animalList.add(animal1);
        animalList.add(animal2);


        // 3 Duck
        Animal duck1 = new Duck(1, "M");
        Duck duck2 = new Duck(2 , "F");
        Duck duck3 = new Duck(3, "M");

        animalList.add(duck1);
        animalList.add(duck2);
        animalList.add(duck3);

        duckList.add(duck2);
        duckList.add(duck3);

        // 2 Fish
        Animal fish1 = new Fish(1, "M", 2, true);
        Fish fish2 = new Fish(2, "F", 3, false);

        animalList.add(fish1);
        animalList.add(fish2);

        fishList.add(fish2);

        // 4 Zebra
        Animal zebra1 = new Zebra(1, "M", true);
        Zebra zebra2 = new Zebra(2, "F", true);
        Zebra zebra3 = new Zebra(3, "M", true);
        Zebra zebra4 = new Zebra(4, "F", true);

        animalList.add(zebra1);
        animalList.add(zebra2);
        animalList.add(zebra3);
        animalList.add(zebra4);

        zebraList.add(zebra2);
        zebraList.add(zebra3);
        zebraList.add(zebra4);


// Tum hayvanlar icin ortak metodların cagirilmasi
        System.out.println("Ortak metodlar: ");
        System.out.println("----------------");
        for(int i=0; i<animalList.size(); i++){
            animalList.get(i).mate();
            animalList.get(i).voice();
            animalList.get(i).sleep();

            System.out.println("Is it mammal: " + animalList.get(i).isMammal());
            System.out.println();
        }
        System.out.println("------------------------------------------");

// Turlere ozel metodlarin cagirilmasi

        // Duck
        System.out.println("Duck metodlari: ");
        System.out.println("----------------");
        for(int i=0; i<duckList.size(); i++){
            duckList.get(i).quack();
            duckList.get(i).swim();
            System.out.println("As a String: " + duckList.get(i).toString());
            System.out.println();
        }
        System.out.println("------------------------------------------");

        // Fish
        System.out.println("Fish metodlari: ");
        System.out.println("----------------");
        for(int i=0; i<fishList.size(); i++){
            fishList.get(i).swim();
            System.out.println("As a String: " + fishList.get(i).toString());
            System.out.println();
        }
        System.out.println("------------------------------------------");

        // Zebra
        System.out.println("Zebra metodlari: ");
        System.out.println("----------------");
        for(int i=0; i<zebraList.size(); i++){
            zebraList.get(i).run();
            System.out.println("As a String: " + zebraList.get(i).toString());
            System.out.println();
        }

    }

}
