import java.util.Scanner ;
public class Pattern {
    public static void negative(int number, int tempNumber) {
        if (number > 0) {
            System.out.print(number + " ");
            negative(number - 5,tempNumber); //Here we recall the negative method with number-5 .
            // whether number greater than zero.
        }
        else if (number <= 0) {
            negativeTwo(number,tempNumber); //Here we recall the negativeTwo method whether the number smaller than zero.
        }
    }
    public static void negativeTwo(int number, int tempNumber) {
        if (tempNumber >= number) { //This means that the number smaller than zero.
            System.out.print(number + " ");
            negativeTwo(number + 5, tempNumber);//So we recall the negativeTwo method with number+5 .
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int tempNumber = number ; //Here we assing the number with temp number.
        negative(number,tempNumber);
    }
}