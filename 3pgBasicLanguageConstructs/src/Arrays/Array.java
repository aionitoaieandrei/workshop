package Arrays;

public class Array {
    public static void noArray () {
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int x4 = 4;
        System.out.println("No array\n ---------");
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
    }

    public static void withArray() {
        System.out.println("\nWith array\n ---------");

        int array[] = new int[4];
        for (int count=0; count<4; count++){
            array[count]=count+1;
        }
        for (int count=0; count<4; count++){
            System.out.println("array["+count+"] = "+array[count]);
        }

        System.out.println("Length of Array  =  "+array.length);
//        array[5] =10;

        System.out.println("\nArray with values defined\n ---------");

        String arrayWithValues[] = {"Ana", " ", "are", " ", "mere"};
        for (int count=0; count<arrayWithValues.length; count++) {
            System.out.println("arrayWithValues["+count+"] = "+arrayWithValues[count]);
        }
        System.out.println("\nExercise: Print the phrase above!!");
    }

    public static void main(String args[]){
        noArray();
        withArray();
    }
}
