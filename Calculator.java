import java.util.Scanner; // ���������� ����� ������




public class Calculator {
public static Scanner scanner = new Scanner(System.in); // ������� ������ ������ ��� ������ �� �������
public static boolean exit = false; // ������ ���������� "�����", � ����������� �������� "����"


   public static void main(String[] args) {

System.out.println("������� �����: ");
double result = scanner.nextDouble(); // ������ ���������� "���������", � ����������� �������� �� �������

System.out.println("������� �������� (+, -, *, /) ��� \"=\" ��� ��������� ����������: ");


while(!exit) {

String operator = scanner.nextLine(); // ������ ���������� "��������", � ����������� �������� �� �������

	if (operator.equals("+")) {
System.out.println("������� �����: ");
double y = scanner.nextDouble();
result = result + y;
System.out.println("������� �������� (+, -, *, /) ��� \"=\" ��� ��������� ����������: ");                  
	} else if (operator.equals("-")) {
System.out.println("������� �����: ");
double y = scanner.nextDouble();
result = result - y;
System.out.println("������� �������� (+, -, *, /) ��� \"=\" ��� ��������� ����������: ");

	} else if (operator.equals("*")) {
System.out.println("������� �����: ");
double y = scanner.nextDouble();
result = result * y;
System.out.println("������� �������� (+, -, *, /) ��� \"=\" ��� ��������� ����������: ");

	} else if (operator.equals("/")) {
System.out.println("������� �����: ");
double y = scanner.nextDouble();
result = result / y;
System.out.println("������� �������� (+, -, *, /) ��� \"=\" ��� ��������� ����������: ");

	} else if (operator.equals("=")) {
 exit = true;
}            
        } // ��� ������ ����� while ���������� �������� ��� ���������� �������

System.out.println("��������� �����: " + result); // ������� ���������� ���������

   }
}