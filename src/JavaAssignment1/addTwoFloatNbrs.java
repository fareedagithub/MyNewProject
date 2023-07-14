package JavaAssignment1;

//1 Write a java program to add two float numbers like 8.6 and 9.7

public class addTwoFloatNbrs {

    public static void main(String[] args) throws Exception {

        float f1 = 8.6f, f2 = 9.7f;

        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. Write a java program to add two float numbers like 8.6 and 9.7 ");
        System.out.println("------------------------------------------------------------------------------------------------------------------");


        System.out.print("Direct from main - Addition of two Floating numbers is : " + (f1 + f2));
        System.out.println();

        addTwoFloatNbrs obj = new addTwoFloatNbrs();
        obj.addFloat();
        System.out.println("------------------------------------------------------------------------------------------------------------------");


    }

    public float addFloat() { // This is a int type method ...
        float a = 2.5f, b = 3.5f;
        float sum = a + b;
        System.out.println("Calling from Method - Addition of two Floating numbers is : " + sum);

        return sum;

    }
}