import java.util.Scanner; // подключаем класс Сканер


public class Calculator {

   public static void main(String[] args) {

      double result; // задаем переменную "результат"
      Scanner scanner = new Scanner(System.in); // создаем объект сканер для чтения из консоли
      		System.out.println("Введите два числа: ");
      double num1 = scanner.nextDouble(); // задаем первое число, с присвоением значения из консоли
      double num2 = scanner.nextDouble(); // задаем второе число, с присвоением значения из консоли
      		System.out.println("Введите оператор (+, -, *, /): ");
      char operator = scanner.next().charAt(0); // задаем оператор, с присвоением значения из консоли
      		switch(operator) {
         	   case '+': result = num1 + num2;
            		break;
        	   case '-': result = num1 - num2;
          		break;
        	   case '*': result = num1 * num2;
         		break;
        	   case '/': result = num1 / num2;
         		break;
       		   default:  System.out.printf("Ошибка. Введен некорректный оператор!");
       		        return;
      } // при помощи оператора switch выполняем операции над введенными числами
      		System.out.println("Результат равен: " + result); // выводим на экран полученный результат

   }
}