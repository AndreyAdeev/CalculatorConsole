import java.util.Scanner; // подключаем класс —канер




public class Calculator {
public static Scanner scanner = new Scanner(System.in); // создаем объект сканер дл€ чтени€ из консоли
public static boolean exit = false; // задаем переменную "выход", с присвоением значени€ "ложь"


   public static void main(String[] args) {

System.out.println("¬ведите число: ");
double result = scanner.nextDouble(); // задаем переменную "результат", с присвоением значени€ из консоли

System.out.println("¬ведите оператор (+, -, *, /) или \"=\" дл€ получени€ результата: ");


while(!exit) {

String operator = scanner.nextLine(); // задаем переменную "оператор", с присвоением значени€ из консоли

	if (operator.equals("+")) {
System.out.println("¬ведите число: ");
double y = scanner.nextDouble();
result = result + y;
System.out.println("¬ведите оператор (+, -, *, /) или \"=\" дл€ получени€ результата: ");                  
	} else if (operator.equals("-")) {
System.out.println("¬ведите число: ");
double y = scanner.nextDouble();
result = result - y;
System.out.println("¬ведите оператор (+, -, *, /) или \"=\" дл€ получени€ результата: ");

	} else if (operator.equals("*")) {
System.out.println("¬ведите число: ");
double y = scanner.nextDouble();
result = result * y;
System.out.println("¬ведите оператор (+, -, *, /) или \"=\" дл€ получени€ результата: ");

	} else if (operator.equals("/")) {
System.out.println("¬ведите число: ");
double y = scanner.nextDouble();
result = result / y;
System.out.println("¬ведите оператор (+, -, *, /) или \"=\" дл€ получени€ результата: ");

	} else if (operator.equals("=")) {
 exit = true;
}            
        } // при помощи цикла while производим операции над введенными числами

System.out.println("–езультат равен: " + result); // выводим полученный результат

   }
}