import java.util.Scanner; // ���������� ����� ������


public class Calculator {

   public static void main(String[] args) {

      double result; // ������ ���������� "���������"
      Scanner scanner = new Scanner(System.in); // ������� ������ ������ ��� ������ �� �������
      		System.out.println("������� ��� �����: ");
      double num1 = scanner.nextDouble(); // ������ ������ �����, � ����������� �������� �� �������
      double num2 = scanner.nextDouble(); // ������ ������ �����, � ����������� �������� �� �������
      		System.out.println("������� �������� (+, -, *, /): ");
      char operator = scanner.next().charAt(0); // ������ ��������, � ����������� �������� �� �������
      		switch(operator) {
         	   case '+': result = num1 + num2;
            		break;
        	   case '-': result = num1 - num2;
          		break;
        	   case '*': result = num1 * num2;
         		break;
        	   case '/': result = num1 / num2;
         		break;
       		   default:  System.out.printf("������. ������ ������������ ��������!");
       		        return;
      } // ��� ������ ��������� switch ��������� �������� ��� ���������� �������
      		System.out.println("��������� �����: " + result); // ������� �� ����� ���������� ���������

   }
}