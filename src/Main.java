public class Main {
    public static Employee[] journal;
    public static void skip() {
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        journal = new Employee[10];
        journal[0] = new Employee("Соколов Антон Владимирович", 100_000, 3);
        journal[1] = new Employee("Агапов Евгений Александрович", 75_000, 1);
        journal[2] = new Employee("Светличный Вадим Егорович", 150_000, 2);
        journal[3] = new Employee("Гафаров Аброр Рустамович ", 350_000, 4);
        journal[4] = new Employee("Даниэлян Карен Арменавич", 85_000, 3);
        journal[5] = new Employee("Гафаров Анвар Рустамович", 95_000, 1);
        employeeData();
        skip();
        System.out.println(" сумму затрат на зарплаты в месяц =" + totalSolary());
        skip();
        System.out.println("сотрудник с минимальной зарплатойт = " + minSalari());
        skip();
        System.out.println("сотрудник с максимальной зарплатойт = " + maxSalari());
        skip();
        System.out.println("средняя зарплпта = " + averegelSolary());
        skip();
        name();
    }
    public static void employeeData() {
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null) {
                System.out.println(journal[i].toString());
            }
        }
    }
    public static int totalSolary() {
        int result = 0;
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null) {
                result += journal[i].getSalary();
            }
        }
        return result ;
    }
    public static Employee minSalari() {
        Employee result = journal[0];
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null && journal[i].getSalary() < min) {
                min = journal[i].getSalary();
                result = journal[i];
            }
        }
        return result;
    }
    public static Employee maxSalari() {
        Employee result = journal[0];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null && journal[i].getSalary() > max) {
                max = journal[i].getSalary();
                result = journal[i];
            }
        }
        return result;
    }
    public static int averegelSolary() {
        int averege = 0;
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null) {
                averege++;
            }
        }
        return totalSolary() / averege;
    }
    public static void name() {
        for (int i = 0; i < journal.length; i++) {
            if (journal[i] != null) {
                System.out.println(journal[i].getFullName());
            }
        }
    }
}