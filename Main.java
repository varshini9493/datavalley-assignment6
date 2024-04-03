import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the quantity purchased: ");
int quantity = scanner.nextInt();
System.out.print("Enter the price per item: ");
double pricePerItem = scanner.nextDouble();
double totalExpenses = quantity * pricePerItem;
if (quantity > 50)
{
totalExpenses = totalExpenses - (totalExpenses * 0.1);
}
else if (quantity >= 25)
{
totalExpenses = totalExpenses - (totalExpenses * 0.05);
}
System.out.printf("Total expenses: %.2f%n", totalExpenses);
}
}
