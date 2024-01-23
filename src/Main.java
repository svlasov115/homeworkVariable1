public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        // Задача 2 (Здесь тип переменной "var" уже не нужно использовать, потому что переменные уже объявлены в первой задаче)
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        //Задача 3 (Это задание выполняю также, как и предыдущее)
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов равна " + totalBoxersWeight + " кг!");

        //Задача 7
        System.out.println("Задача 7");
        var differencesBoxersWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница масс спортсменов равна " + differencesBoxersWeight + " кг!");
        differencesBoxersWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница масс спортсменов равна " + differencesBoxersWeight + " кг!");

        //Задача 8
        System.out.println("Задача 8");
        var totalWorkingHours = 640;
        var workingDayOfWorker = 8;
        var quantityOfWorkers = 640 / workingDayOfWorker;
        System.out.println("Всего работников в компании — " + quantityOfWorkers + " человек");
        quantityOfWorkers = quantityOfWorkers + 94; // 94 работника добавилось в компанию
        totalWorkingHours = quantityOfWorkers * workingDayOfWorker;
        System.out.println("Если в компании работает " + quantityOfWorkers + " человек, то всего " +  totalWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}