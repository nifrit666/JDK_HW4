
public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.addEmployee("Евгений", "Миронов", "8-700-759-85-10", 8);
        directory.addEmployee("Татьяна",  "Буланова", "8-701-939-12-08", 6);
        directory.addEmployee("Владимир", "Кузмин", "8-702-309-53-24",1);
        directory.addEmployee("Иосиф", "Сталин", "8-747-032-09-76", 2);
        directory.addEmployee("Григорий", "Лепс", "8-707-138-90-33", 7);
        directory.addEmployee("Мери", "Попинс", "8-708-567-45-98", 5);
        directory.addEmployee("Евгений", "Кошевой", "8-705-356-92-39", 3);
        directory.addEmployee("Александр", "Невский", "8-700-229-91-92", 4);
        directory.addEmployee("Антонио", "Бандерас", "8-701-737-67-07", 5);
        directory.addEmployee("Иван", "Иванов", "8-702-832-20-65", 1);

        System.out.println("Список сотрудников: \n" + directory.getAllEmployees());
        System.out.println("Сотрудники со стажем от 5 лет: \n" + directory.getEmployeesByExperience(5));
        System.out.println("Номер телефона Евгения: " + directory.getPhoneNumbersByFirstName("Евгений"));
        System.out.println("Номер телефона Кошевого: " + directory.getPhoneNumbersBySecondName("Кошевой"));
        System.out.println("Табельный номер Евгения: " + directory.getPersonnelNumbersByFirstName("Евгений"));
        System.out.println("Табельный номер Миронова: " + directory.getPersonnelNumbersBySecondName("Миронов"));
        System.out.println("С табельным номером 5: " + directory.getEmployeeByPersonnelNumber(5));

        directory.addEmployee("Петр", "Петров", "8-705-038-14-73", 7);
        directory.addEmployee("Сидор", "Сидоров", "8-747-164-99-16", 9);
        System.out.println("Список сотрудников: \n" + directory.getAllEmployees());
    }
}
