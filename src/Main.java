public class Main {
    public static void main(String[] args) {
     task1();
     task2();
     task3();
    }
    private static void task1(){
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника — "+fullName);
    }
    private static void task2(){
        System.out.println("Задача №2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }
    private static void task3(){
        System.out.println("Задача №3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("Данные ФИО сотрудника — "+fullName.replace("ё" ,"е"));
    }
}