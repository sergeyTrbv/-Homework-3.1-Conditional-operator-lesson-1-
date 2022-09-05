public class Main {
    public static void main(String[] args) {


        //ЗАДАНИЕ 1

        //Допустим Маше 16 лет, Диме 19 лет

        int ageDima = 19;
        if (ageDima >= 18) {
            System.out.println("Уважаемый, пользователь! Поздравляем с совершеннолетием!!! Теперь вам доступен контент для взрослых на сайте www.xxx.ru");
        } else {
            System.out.println("Уважаемый пользователь! К сожалению вам нельзя смотреть на голых тётечек и дядечек ");
        }

        int ageMasha = 17;
        if (ageMasha >= 18) {
            System.out.println("Уважаемый, пользователь! Поздравляем с совершеннолетием!!! Теперь вам доступен контент для взрослых на сайте www.xxx.ru");
        } else {
            System.out.println("Уважаемый пользователь! К сожалению вам нельзя смотреть на голых тётечек и дядечек ");
        }

        //ЗАДАНИЕ 2

        int gnomGnomichAge = 7;
        if (gnomGnomichAge >= 7 && gnomGnomichAge < 18) {
            System.out.println("Уважаемые родители, вашему чуду исполнилось 7 лет, пора идти в школу!");
        } else {
            System.out.println("Уважаемые родители, вашему чуду ещё рано или поздно идти в школу");
        }

        int vladAge = 18;
        if (vladAge >= 18 && vladAge < 24) {
            System.out.println("Исполнилось 18? Закончил школу? Неплохо, Впереди еще Университет!");
        } else {
            System.out.println("Никакого универа");
        }

        int olegAge = 24;
        if (olegAge >= 24) {
            System.out.println("Тебе 24 и ты закончил университет? Родители скоро тебя выгонят из дома, пора на работу!");
        } else {
            System.out.println("Учись, пока молодой, а то дворником станешь как дядя Ваня!");
        }


        //Задание 3
        //Честно говоря, задание немного не корректное, сделал так, как понял :/

        int capacityVanAll = 102;
        int capacityVanSit = 60;
        int capacityVanStand = capacityVanAll - capacityVanSit;

        int seatsUsed = 59;
        int otherUsed = 11;

        if (seatsUsed >= capacityVanSit && otherUsed >= capacityVanStand) {
            System.out.println("В вагоне нет мест");
        }else {
            System.out.println("В вагоне есть места");
        }


        if (seatsUsed < capacityVanSit) {
            System.out.println("Сидячих мест: " + (capacityVanSit - seatsUsed));
        } else {
            System.out.println("Сидячих мест нет");
        }

        if (otherUsed < capacityVanStand) {
            System.out.println("Стоячих мест:" + (capacityVanStand - otherUsed));
        } else {
            System.out.println("Стоячих мест нет");
        }


        //3-я часть домашки

        //Задание 1

        int agePeople1 = 5;
        boolean goToKindergarten = agePeople1 >= 2 && agePeople1 <= 6;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + agePeople1 + " то ему нужно ходить в детский сад");
        } else {
            System.out.println("Не нужно в садик");
        }

        int agePeople2 = 8;
        boolean goToSchool = agePeople2 >= 7 && agePeople2 <= 18;
        if (goToSchool) {
            System.out.println("Если возраст человека равен " + agePeople2 + " то ему нужно ходить в школу");
        } else {
            System.out.println("Не нужно ходить в школу");
    }

        int agePeople3 = 24;
        boolean goToUniversity = agePeople3 >= 18 && agePeople3 <= 24;
        if (goToUniversity){
            System.out.println("Если возраст человека равен " + agePeople3 + " то ему нужно ходить в университет");
        }else {
            System.out.println("Не нужно в университет");
        }

        int agePeople4 = 27;
        boolean goToWork = agePeople4 > 24;
        if (goToWork){
            System.out.println("Если возраст человека равен " + agePeople4 + " то ему нужно ходить на работу");
        }else {
            System.out.println("Учись пока что");
        }

        //Задание 2

        //Подставим в переменную значения 3, 6, 15 и в консоли увидим ответ на разрешение

        int kid = 3 ;
        boolean youCanNotFun = kid < 5;
        boolean youCanFunWithParents = kid >= 5 && kid <14;
        if (youCanNotFun){
            System.out.println("Ты не можешь кататься если тебе " + kid + " лет");
        }else if (youCanFunWithParents){
                System.out.println("Ты сможешь кататься с родителями если тебе " + kid + " лет");
        }
        else {System.out.println("Ты можешь кататься один!");
        }

        //Задание 3

        int one = 5;
        int two = 10;
        int three = 15;

        boolean oneMore = one > two && one > three;
        boolean twoMore = two > one && two > three;
        boolean freeMore = three > one && three > two;

        if (oneMore){
            System.out.println("Самое большее число из трех это: " + one);
        }else if (twoMore){
            System.out.println("Самое большее число из трех это: " + two);
        } else {
            System.out.println("Самое большее число из трех это: " + three);
        }











    }
}