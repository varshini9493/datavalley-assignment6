import java.util.Scanner;
public class Divisible
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number to check if it is divisible by 7 and 13 simultaneously: ");
int number = scanner.nextInt();
if (number % 7 == 0 && number % 13 == 0) {
System.out.println("The number is divisible by both 7 and 13.");
int quotientBy7 = number / 7;
int remainderBy7 = number % 7;
int quotientBy13 = number / 13;
int remainderBy13 = number % 13;
System.out.printf("Quotient and remainder when divided by 7: %d, %d%n", quotientBy7, remainderBy7);
System.out.printf("Quotient and remainder when divided by 13: %d, %d%n", quotientBy13, remainderBy13);
}
else
{
System.out.println("The number is not divisible by both 7 and 13 simultaneously.");
}
}
}
