import java.util.*;
import java.util.stream.IntStream;

class Palindrome {
    public static void main(String args[]) {
        String original, reverse = "";
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a string to check if it's a palindrome");
            original = in.nextLine();
        }
        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " isn't a palindrome.");
    }
}

class LeapYear {

    public static void main(String[] args) {

        int yearFrom, yearTo;
        GregorianCalendar cal = new GregorianCalendar();

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("enter the start year");
            yearFrom = s.nextInt();
            System.out.println("enter the end year");
            yearTo = s.nextInt();
        }
        System.out.println("Leap years between" + yearFrom + " and " + yearTo);
        for (int year = yearFrom; year <= yearTo; year++) {
            if (cal.isLeapYear(year)) {
                System.out.println(year);
            }
        }
    }
}

class ReverseWords {
    public static void main(String[] args) {
        String originalString = "I am A Great human", result = "";
        String[] splStrings = originalString.split(" ");
        for (int x = 0; x < splStrings.length; x++) {
            String revStr = new StringBuilder(splStrings[x]).reverse().toString();
            for (int i = 0; i < revStr.length(); i++) {
                if (Character.isUpperCase(revStr.charAt(i))) {
                    char first = Character.toUpperCase(revStr.charAt(0));
                    revStr = first + revStr.substring(1).toLowerCase();
                }
            }
            result += revStr + " ";
        }
        System.out.println(result);
    }
}

class NearestFibonacci {

    public int TestFibonacci(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        int first = 0, second = 1;
        int third = first + second;

        while (third <= sum) {
            first = second;
            second = third;
            third = first + second;
        }

        if (Math.abs((float) third - (float) sum) >= Math.abs((float) second - (float) sum)) {
            return sum - second;
        }
        return third - sum;
    }

    public static void main(String args[]) {
        NearestFibonacci nearestFibonacci = new NearestFibonacci();
        int[] numbers = { 15, 1, 3, 7, 9};
        System.out.print(nearestFibonacci.TestFibonacci(numbers));

    }
}

class FizzBuzz {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        IntStream.rangeClosed(1, num)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz " : "Fizz ") : (i % 5 == 0 ? "Buzz " : i + " "))
                .forEach(System.out::print);
        sc.close();
    }
}