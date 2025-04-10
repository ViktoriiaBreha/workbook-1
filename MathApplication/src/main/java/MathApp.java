public class MathApp {
    public static void main(String[] args) {
        // Question 1:
// declare variables here
       int bobSalary = 100000;
       int garySalary = 75000;
       int highestSalary = Math.max(bobSalary, garySalary);
// then code solution
       System.out.println("The highest salary is " + highestSalary);

// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE
        int carPrice = 56000;
        int truckPrice = 84000;
        int smallestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The smallest price is " + smallestPrice);

        float areaRadius = 7.25f;
        double circleArea = (areaRadius * areaRadius * Math.PI);

        System.out.println("The area of the circle is " + circleArea);

        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("The square root of number " + number + " is " + squareRoot);

        int x1 = 5;
        int y1 = 10;

        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));

        System.out.println("The distance is " + distance);

        float negativeValue = -3.8f;
        float positiveValue = (float) Math.abs(negativeValue);

        System.out.println("The absolute (positive) value is " + positiveValue);

        double randomNumber = Math.random();

        System.out.println("A random number is " + randomNumber);


    }
}

/*5. Find and display the distance between the points (5, 10) and (85, 50)
6. Find and display the absolute (positive) value of a variable after it is set to -3.8
7. Find and display a random number between 0 and 1 */