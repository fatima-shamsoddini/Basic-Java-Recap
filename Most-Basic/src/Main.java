import java.util.Scanner;
class Calculator
{
    public static int sum(int a, int b)
    {
        return a+b;
    }
    public static int mult(int a, int b)
    {
        return a*b;
    }
    public static int substract(int a, int b )
    {
        return a-b;
    }
}
public class Main {

    public static void Beginning()
    {
        System.out.println("Hello there");
    }
    public static int inputInt()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        return num;
    }
    public static String inputString()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String string=scanner.nextLine();
        return string;
    }
    public static void isOdd()
    {
        int number = inputInt();
        if(number%2==0)
            System.out.println("number is even");
        else
            System.out.println("number is odd");

    }
    public static void Reverse()
    {
        String string=inputString();
        char[] chars=string.toCharArray();
        char[] result= new char[chars.length];
        for(int i=0; i <chars.length; i++)
        {
            result[chars.length-i-1]=chars[i];
        }
        String finalResult=new String(result);
        System.out.println(finalResult);
    }
    public static void factorial()
    {
        int number=inputInt();
        int counter=1;
        for(int i=1; i<=number; i++)
        {
            counter *= i;
        }
        System.out.println(counter);
    }
    public static void sumPrime() {
        int num = inputInt();
        int sum = 0;
        boolean isPrime = true;
        for (int i = 0; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;

                }

            }
            if (isPrime)
                sum += i;
            isPrime = true;
        }
        System.out.println(sum);
    }
    public static int factorial2(int n)
    {
        if(n==1)
            return 1;
        else
        {
            return n*factorial2(n-1);
        }


    }

    public static int Fib2(int number)
    {

        if(number<=1)
        {
            return number;
        }
        else
        {
            return Fib2(number-1)+Fib2(number-2);
        }

    }
    public static void Fib(){
        int a=0;
        int b=1;
        int fib=0;
        int num=inputInt();
        System.out.println(a);
        System.out.println(b);
        while(fib<=num)
        {
            fib = a+b;
            a=b;
            b=fib;
            if(fib<=num)
                System.out.println(fib);

        }


    }
    public static int binarySearch(int[] sortedArray,int number)
    {

        int low=0;
        int high=sortedArray.length-1;
        while (low<=high)
        {
            int mid=low+(high-low)/2;
            int guess= sortedArray[mid];
            if(guess<number)
                low=mid+1;
            if(guess>number)
                high=mid-1;
            else if(guess==number)
                return mid;

        }
        return -1;
    }
    public static void isPalindrome()
    {
        String string=inputString();
        char[] chars=string.toCharArray();
        boolean isPalindrome=true;
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]==chars[chars.length-i-1])
                continue;
            else
                isPalindrome=false;
        }
        if(isPalindrome)
            System.out.println("GIVEN STRING IS PALINDROME");
        else
            System.out.println("GIVEN STRING IS NOTTTT PALINDROME");


    }

    public static void main(String[] args) {

        // Beginning();
        //isOdd();
        //factorial();
        // Reverse();
        //sumPrime();
        //Fib();
        //isPalindrome();
        //Reverse();
        Calculator cal = new Calculator();
        System.out.println(cal.sum(10,154));



    }
}