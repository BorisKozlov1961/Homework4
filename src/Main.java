public class Main {

    public static void main(String[] args) {
//Задание 1
        int age = 18;
        if (age >= 18){
            System.out.println("Поздравляю!");
        }

        if (age < 18){
            System.out.println("Подожди немного");
        }

//Задание 2
        int age1 = 25;
        if (age1 >= 7 && age1 < 18){
            System.out.println("Ребенок ходит в школу");
        } else if (age1 >= 18 && age1 < 24) {
            System.out.println("Закончил школу, можно в универ");
        } else if (age1 >= 24) {
            System.out.println("Закончил универ, пора искать работу");
        }

//Задание 3

        int passengers = 101;

        if (passengers < 60){
            System.out.println("Есть сидячее место");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("Есть стоячее место");
        } else
            System.out.println("Вагон забит");


    }
}