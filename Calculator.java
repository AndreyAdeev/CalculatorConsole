import java.util.Scanner; // ���������� ����� ������




public class Calculator {

   public static void main(String[] args) {

Scanner scanner = new Scanner(System.in); // ������� ������ ������ ��� ������ �� �������
	boolean exit = false; // ������ ���������� "�����", � ����������� �������� "����"
System.out.println("������� �����: ");
	double x = scanner.nextDouble(); // ������ ������ �����, � ����������� �������� �� �������
	double result = x; // ������ ���������� "���������", � ����������� �������� ������� �����
System.out.println("������� �������� (+, -, *, /): ");
char operator = scanner.next().charAt(0); // ������ ��������, � ����������� �������� �� �������

while(!exit) {


System.out.println("������� ����� ��� ������� \"=\" ��� ��������� ����������: ");
if (scanner.hasNextDouble()) { // ��������� �������� �� ��������� ������ ������

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
         default:  System.out.printf("������. ������ ������������ ��������!");
            return;
      }
System.out.println("������� �������� (+, -, *, /): ");
operator = scanner.next().charAt(0);

    } else if (scanner.hasNextLine()) { // ��������� �������� �� ��������� ������ ��������
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("=")) {
                    exit = true;
                }
            }
        } // ��� ������ ����� while ���������� �������� ��� ���������� �������
System.out.println("��������� �����: " + result); // ������� ���������� ��������� 
   }
}