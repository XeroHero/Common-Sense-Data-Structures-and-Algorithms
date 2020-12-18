package dev.xerohero;

import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {
        int[] numbers = {4, 64, 58, 94, 81, 79, 5, 88, 97, 28};
//        for (String variety:fruit) {
//            System.out.println(variety.toString());
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter query below: ");
        int query = sc.nextInt();

        System.out.println("Initiating Linear Search");
        linearSearch(numbers, query);

        System.out.println("Initiating Binary Search");
        int found = binarySearch(numbers, query);
        if (found == 0 && query != 0){
            System.out.println("Value not found");

        }
        else
            System.out.println(found + " has been found.");

    }

    private static int binarySearch(int[] numbers, int searchQuery) {
        int lowBound = 0;
        int highBound = numbers.length - 1;

        int foundQuery = 0;
        while (lowBound <= highBound) {

            int midPoint = (highBound - lowBound) / 2;
            int midPointValue = numbers[midPoint];

            if (searchQuery < midPointValue)
                highBound = midPoint - 1;
            else if (searchQuery > midPointValue)
                lowBound = midPoint + 1;
            else if (searchQuery == midPointValue) {
                foundQuery = midPointValue;
                break;
            }
        }

        return foundQuery;
    }

    private static void linearSearch(int[] numbers, int searchQuery) {
        int index = 0;
        boolean found = false;
        while (index < numbers.length) {
//            System.out.println(fruit[index]);
            if (numbers[index] == searchQuery) {
                found = true;
                break;
            }
            index++;
        }
        if (found) {
//            System.out.println(fruit[index].toUpperCase(Locale.ROOT));

            System.out.println(searchQuery + " found after " + (index + 1) + " hops.");
        } else
            System.out.println(searchQuery + " was not found.");
    }


}
