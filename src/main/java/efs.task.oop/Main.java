public class Main {
    public static void main(String[] args) {
//        Zadanie 1
        System.out.println("\n-----------------------------\n");

        Villager kashya = new Villager("Kashya", 30);
        Villager akara = new Villager("Akara", 40);
        Villager gheed = new Villager("Gheed", 50);
        Villager deckardCain = new Villager("Deckard Cain", 85);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();

        System.out.println("\n-----------------------------\n");

//        Zadanie 2
        ExtraordinaryVillager deckardCain2 = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        ExtraordinaryVillager akara2 = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);

        deckardCain2.sayHello();
        akara2.sayHello();

        System.out.println("\n-----------------------------\n");

//        Zadanie 3
        System.out.println("Initial monsters health: " + Monsters.monstersHealth);

        Monsters.andariel.attack(Monsters.blacksmith);
        System.out.println("Blacksmith's health after Andariel's attack: " + Monsters.blacksmith.getHealth());
        System.out.println("Monster's health after Andariel's attack: " + Monsters.monstersHealth);

        Monsters.blacksmith.attack(Monsters.andariel);
        System.out.println("Andariel's health after Blacksmith's attack: " + Monsters.andariel.getHealth());
        System.out.println("Monster's health after Blacksmith's attack: " + Monsters.monstersHealth);

        System.out.println("\n-----------------------------\n");

//        Zadanie 4
        Villager deckardCain3 = new Villager("Deckard Cain", 85);
        ExtraordinaryVillager akara3 = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);

        deckardCain3.attack(akara3);
        System.out.println("Akara's health after Deckard Cain's attack: " + akara3.getHealth());

        Object objectDeckardCain = deckardCain3;
        Object objectAkara = akara3;

        // Nie można wywołać metod klasy ExtraordinaryVillager na obiektach objectDeckardCain i objectAkara,
        // ponieważ są traktowane jako obiekty typu Object, które nie mają dostępu do metod specyficznych dla ExtraordinaryVillager.
        // Jeśli chcielibyśmy wywołać metody klasy ExtraordinaryVillager, musielibyśmy dokonać rzutowania na odpowiedni typ.
        // Na przykład:
        // ((ExtraordinaryVillager) objectDeckardCain).sayHello();
        // ((ExtraordinaryVillager) objectAkara).sayHello();

        System.out.println("\n-----------------------------\n");

//        Zadanie 5
        System.out.println("The battle is start!");
        while (Monsters.monstersHealth > 0 && akara3.getHealth() > 0){
            akara3.attack((Fighter2) Monsters.andariel);
            Monsters.andariel.attack((Fighter) akara3);
            System.out.println("Akara's health: " + akara3.getHealth());
            System.out.println("Andariell's health: " + Monsters.andariel.getHealth());
            System.out.println("Monster's health: " + Monsters.monstersHealth);
            System.out.println("-------------------------------");
        }

        System.out.println("The battle is over!");
        System.out.println("Akara's health: " + akara3.getHealth());
        System.out.println("Andariel's health: " + Monsters.andariel.getHealth());
        System.out.println("Monster's health: " + Monsters.monstersHealth);
    }
}