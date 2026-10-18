package Week01;

public class Test {

    public static void main(String[] args) {

        float[] numbers = { 2314.5324f, 321.543f, 9156.2455f, 5237.16f };
        float sum = 0.f;
        float avarage;

        System.out.print("The numbers are : { ");
        for (float number : numbers) {
            System.out.print(number + ", ");
            sum += number;
        }
        System.out.println("}");

        avarage = sum / numbers.length;

        System.out.println("The sum is: " + sum + " .");
        System.out.println("The avarage is: " + avarage + " .");

    }

}