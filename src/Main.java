import java.sql.SQLOutput;
public class Main{
   public static void main(String[]args) {
           System.out.println("задача 1");
           String firstName = "Ivan";
           String middleName = "Ivanovich";
           String lastName = "Ivanov";
           String fullName = lastName + " " + firstName + " " + middleName;
           System.out.println("Ф.И.О. сотрудника - " + fullName);
           System.out.println();

           System.out.println("задача 2");
           String fullNameNew = "Ivanov Ivan Ivanovih";
           String capsLetter = fullNameNew.toUpperCase();
           System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + capsLetter);
           System.out.println();

           System.out.println("задача 3");
           String fullAppellation = "Иванов Семён Семёнович";
           String replacedFullName = fullAppellation.replace("ё","е");
           System.out.println("Данные Ф.И.О. сотрудника - " + replacedFullName);

   }

}