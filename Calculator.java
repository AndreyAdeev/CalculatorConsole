import java.util.Scanner; // подключаем класс —канер




public class Calculator {

   public static void main(String[] args) {

Scanner scanner = new Scanner(System.in); // создаем объект сканер дл€ чтени€ из консоли
	boolean exit = false; // задаем переменную "выход", с присвоением значени€ "ложь"
System.out.println("¬ведите число: ");
	double x = scanner.nextDouble(); // задаем первое число, с присвоением значени€ из консоли
	double result = x; // задаем переменную "результат", с присвоением значени€ первого числа
System.out.println("¬ведите оператор (+, -, *, /): ");
char operator = scanner.next().charAt(0); // задаем оператор, с присвоением значени€ из консоли

while(!exit) {


System.out.println("¬ведите число или введите \"=\" дл€ получени€ результата: ");
if (scanner.hasNextDouble()) { // провер€ем €вл€ютс€ ли введенные данные числом

                double y = scanner.nextDouble();
                switch(operator) {
         case '+': result = result + y;
            break;
         case '-': result = result - y;
            break;
         case '*': result = result * y;
            break;
         case '/': result = result / y;
            break;
         default:  System.out.printf("ќшибка. ¬веден некорректный оператор!");
            return;
      }
System.out.println("¬ведите оператор (+, -, *, /): ");
operator = scanner.next().charAt(0);

    } else if (scanner.hasNextLine()) { // провер€ем €вл€ютс€ си введенные данные символом
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("=")) {
                    exit = true;
                }
            }
        } // при помощи цикла while производим операции над введенными числами
System.out.println("–езультат равен: " + result); // выводим полученный результат 
   }
}