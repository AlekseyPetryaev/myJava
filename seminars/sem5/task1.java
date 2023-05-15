package seminars.sem5;

public class task1 {
    public static void main(String[] args){
        /*
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.
         */
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");

        //System.out.println(passports.getByLastName("Иванов"));
                /*
                ответ
                123456: Иванов
                234432: Иванов
                345678: Иванов
                */
        //System.out.println(passports.getAllList2());
        /*
        Ответ
        {234561=Петрова, 123456=Иванов, 654321=Петрова, 234432=Иванов, 321456=Васильев, 345678=Иванов}
        */
        System.out.println(passports.getAllList());
    }
}
