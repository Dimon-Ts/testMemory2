public class Main {
    public static void main(String[] args) {
        var boxerWeightOne = 82.7;
        var boxerWeightTwo = 78.2;
        var boxersWeightSum = boxerWeightOne + boxerWeightTwo;
        var boxersWeightDiff = boxerWeightTwo - boxerWeightOne;
        System.out.println("Вес первого боксёра" + " " + boxerWeightOne + " " + "кг.");
        System.out.println("Вес второго боксёра" + " " + boxerWeightTwo + " " + "кг.");
        System.out.println("Сумма весов боксёров" + " " + boxersWeightSum + " " + "кг.");
        System.out.println("Разница весов боксёров" + " " + boxersWeightDiff + " " + "кг.");
        var boxersWeightDifference = boxerWeightTwo % boxerWeightOne;
        if (boxerWeightOne < boxerWeightTwo)
        { boxersWeightDifference = boxerWeightTwo % boxerWeightOne;
            System.out.println("Разница весов боксёров" + " " + boxersWeightDifference + " " + "кг.");
        }
        if (boxerWeightOne > boxerWeightTwo)
        { boxersWeightDifference = boxerWeightOne % boxerWeightTwo;
            System.out.println("Разница весов боксёров" + " " + boxersWeightDifference + " " + "кг.");
        }
        System.out.println("======================================================================" +
                "=========");
        var employeeWorkingHours = 8;
        var allEmployeeWorkingHours = 640;
        var quantityEmployees = allEmployeeWorkingHours / employeeWorkingHours;
        System.out.println("Всего работников в компании – " + quantityEmployees + " " + "человек.");
        var quantityEmployeesEnlarged = quantityEmployees + 94;
        var employeeWorkingHoursEnlarged = allEmployeeWorkingHours / quantityEmployeesEnlarged;
        System.out.println("Если в компании будет работать " + quantityEmployeesEnlarged + " " +
                        "человек, то всего " + employeeWorkingHoursEnlarged + " " +
                "часа работы нужно будет работать каждому сотруднику.");
        System.out.println("======================================================================" +
                "==============");
        System.out.println("Hello Russia!Hello China!Hello world!");
    }
}