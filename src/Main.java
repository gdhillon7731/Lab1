import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double roomLength = 0;
        double roomWidth = 0;
        double roomPerimeter;
        double roomArea;
        double roomVolume;
        double roomHeight;
        char input ='\0';
        int can = 0;
        String answer = "yes";

        do {
            //input
            System.out.println("Enter length:");
            roomLength = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter width:");
            roomWidth = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter height");
            roomHeight = sc.nextDouble();
            sc.nextLine();

            //processing
            roomArea = (roomLength * roomWidth);
            System.out.println("Area: " + roomArea);

            roomPerimeter = ((roomLength * 2) + (roomWidth * 2));
            System.out.println("Perimeter: " + roomPerimeter);

            roomVolume = (roomHeight * roomWidth * roomLength);
            System.out.println("Volume: " + roomVolume);


            System.out.println("Continue? (y/n)");
            answer = sc.nextLine();



        } while (answer.equals("yes"));

    }

}
