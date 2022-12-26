import java.util.Random;
import java.util.Scanner;

class Son {
    String name;
    int age;
    String toys;
    char kindergartenGroup;

    public Son(String name, int age, String toys, char kindergartenGroup) {
        this.name = name;
        this.age = age;
        this.toys = toys;
        this.kindergartenGroup = kindergartenGroup;
    }

    public void introduce() {
        System.out.println("Hello! My name is " + this.name + " !\nI am " + age + " years old. I like to play toys. My " +
                "favourite one is " + this.toys + ".");
    }

    public void playing() {
        System.out.println("I like to play! Which game do you want me to show?\nPress button for specific game:" +
                "\n= 1 = for playing with cars\n= 2 = for singing songs\n= 3 = for hide-and-seek game\n= e = for exit");
        Scanner sc = new Scanner(System.in);
        Boolean game = true;
        while (game) {
            String choise = sc.nextLine();
            switch (choise) {
                case "1":
                    System.out.println("Take a car for yourself. Beep-beeeeep!");
                    break;
                case "2":
                    System.out.println("I am singing - Happy new Yeaaaar, Happy New Yeaaar");
                    break;
                case "3":
                    System.out.println("Find me! I am in one of three rooms! Choose 1, 2 or 3");
                    int answer = sc.nextInt();
                    double myAnswer = Math.random() * (3 - 1) + 1;
                    int myAnswerInInt = (int) myAnswer;
                    if (answer == myAnswerInInt) {
                        System.out.println("You found me!");
                    } else {
                        System.out.println("Wrong! Ha-ha! I was in room number "+myAnswerInInt+"!");
                    }
                    break;
                case "e":
                    game = false;
            }
        }
    }
}