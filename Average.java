import java.util.Scanner;
public class Average 
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
int currentNumber, count = 0;
double sum = 0, largestNumber = Integer.MIN_VALUE, smallestNumber = Integer.MAX_VALUE;
System.out.println("Enter numbers (Type '0' to stop):");
while ((currentNumber = scanner.nextInt()) != 0)
{
sum += currentNumber;
count++;
if (currentNumber > largestNumber)
{
largestNumber = currentNumber;
}
if (currentNumber < smallestNumber)
{
smallestNumber = currentNumber;
}
}
double average = sum / count;
if (count > 0)
{
System.out.printf("Largest number: %.0f%n", largestNumber);
System.out.printf("Smallest number: %.0f%n", smallestNumber);
System.out.printf("Average of the numbers: %.2f%n", average);
}
else
{
System.out.println("No numbers were entered.");
}
}
}
