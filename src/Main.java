public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat =3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
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

        var massFirstBoxer = 78.2;
        var massSecondBoxer = 82.7;
        var totalWeightWrestles = massFirstBoxer + massSecondBoxer;
        System.out.println("Общая масса бойцов " + totalWeightWrestles + "кг. ");
        var differenceMassFighters = massSecondBoxer - massFirstBoxer;
        System.out.println("Разница масс бойцов " + differenceMassFighters + "кг. ");

        var remainderDivisionWeights = massSecondBoxer % massFirstBoxer;
        System.out.println("Остаток от делиния " + remainderDivisionWeights + "кг. ");

        var totalHours = 640;
        var workingHours = 8;
        var totalEmployeesCompany = totalHours / workingHours;
        System.out.println("«Всего работников в компании - " + totalEmployeesCompany + " человек» ");

        var therMoreEmployees = totalEmployeesCompany + 94;
        System.out.println(therMoreEmployees);
        var distributionWorkingHours = totalHours / therMoreEmployees;
        System.out.println("«Если в компании работает " + therMoreEmployees + " человек, то всего " + distributionWorkingHours + " часов работы может быть поделено между сотрудниками» ");

    }

}