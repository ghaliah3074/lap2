import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

//        int[] ar = {1, 1, 1, 3, 3, 5};
//        int result = 0;
//        System.out.println(" pls enter the number: ");
//        int num = k.nextInt();
//
//         int lp= lapMethod.lp(ar,num);
//        System.out.println(lp);

       //
//
//        int [] cc={1,4,17,7,25,3,100};
//
//        System.out.println("enter ");
//        int ne=k.nextInt();
//
////        lapMethod.large(cc,ne);

        //4
//
//         int [] aa={5,4,3,2,1};
//
//        for (int i =aa.length-1; i >=0 ; i--) {
//            System.out.println(aa[i]+" ");
//
//        }


        //5


        System.out.println(" enter the size ");
        int size = k.nextInt();


        System.out.println("  Enter 1-Accept element of an array " +
                "Enter 2-Display element of an array" +
                "Enter 3- Search the element of an array " +
                "Enter 4-Sort the array  ");

        int menue = k.nextInt();
        int []array=new int[size];

        while (menue != 5){





                switch (menue) {
                    case (1):
                        System.out.println(" Accept element of an array ");
                        for (int i = 0; i < size; i++) {
                            array[i] = k.nextInt();
                        }
                        break;
                    case (2):
                        System.out.println(" the element of an array is : ");


                            System.out.println(array.toString());


                    case (3):
                        System.out.println(" the element of search an array is  ");
                        break;

                    case (4):
                        System.out.println("  the sort array is  : ");

                        break;
                    default:
                        System.out.println(" error enter agine " +menue);
                }
                menue++;}






          //q6
        Random r=new Random();


        }


        //7
         boolean lower =false, upper=false, digit= false ,ch=false;
         Arrays.asList('!','@','#','$','%','^','&','*',',','-','+');






            }


    