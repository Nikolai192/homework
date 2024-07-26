public class Main {

    public static void main(String[] args) {
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5; //при решени третьей задачи, я так понимаю необходимо инициализировать dog в виде значения с плавающей запятой?
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        double friend = 19; // формат double для вычесления деления с остатком
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var weightFirstBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightTwoBoxer;
        System.out.println(totalWeight);
        var weightDifference = weightTwoBoxer - weightFirstBoxer;
        System.out.println(weightDifference);
        weightDifference = weightTwoBoxer % weightFirstBoxer;
        System.out.println(weightDifference);
        var allTimeJob = 640;
        var timeOnePerson = 8;
        var totalPerson = allTimeJob / timeOnePerson;
        System.out.println("Всего работников в компании - " +totalPerson + " человек");
        totalPerson = totalPerson + 94;
        timeOnePerson = allTimeJob / totalPerson;
        System.out.println("Если в компании работает " +totalPerson + " человека, то всего " +timeOnePerson + " часа работы может быть  поделено между сотрудниками" );
    }
}