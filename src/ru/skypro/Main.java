package ru.skypro;

public class Main {

        public static void main(String[] args) {


//        Первое задание
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;

            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);
//        Второе задание
            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;

            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);

//        Третье задание
            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;

            System.out.println(dog);
            System.out.println(cat);
            System.out.println(paper);


//   Четвертое задание
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);

//        Пятое задание
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);

//Шесое задание
            var firstBoxerWeight = 78.2;
            var secondBoxerWeight = 82.7;
            var totalWeight = firstBoxerWeight + secondBoxerWeight;
            var weightDifference = secondBoxerWeight % firstBoxerWeight;

            System.out.println("Общий вес боксеров равен " + totalWeight + " кг.");
            System.out.println("Разница в весе составляет " + weightDifference + " кг.");

//    Седьмое задание
            weightDifference = secondBoxerWeight - firstBoxerWeight;
            System.out.println("Разница в весе (первый способ) - " + weightDifference);
            weightDifference = secondBoxerWeight % firstBoxerWeight;
            System.out.println("Разница в весе (второй способ) - " + weightDifference);

//        Восьмое задание
            var totalWorkHours = 640;
            var oneWorkerHoues = 8;
            var totalWorkers = totalWorkHours / oneWorkerHoues;
            System.out.println("Всего работников в компании - " + totalWorkers + " человек.");

            totalWorkers = totalWorkers + 94;
            totalWorkHours = totalWorkers * oneWorkerHoues;
            System.out.println("Если в компани работает " + totalWorkers + " человек, то всего " + totalWorkHours + " часов работы может быть поделено между сотрудниками");

        }
    }


