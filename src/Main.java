import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);


                System.out.println("Define the n-upcount");
                //int number[]={2,3,1,-6,8,-3,-1,2};
                int nupcount = 0;
                int partialSum = 0;
                int priviousPartialSum = 0;

                System.out.println(" insert array size");
                int arraySize = sc.nextInt();
                int[] array = new int[arraySize];
                for (int i = 0; i < array.length; i++) {
                    System.out.println("write the "+(i+1)+ " element of the array");
                    array[i] = sc.nextInt();
                    //{2,3,1,-6,8,-3,-1,2}
                }
                System.out.println(Arrays.toString(array));

                System.out.println("insert the number n");
                int num= sc.nextInt();
                for (int i = 0; i < array.length; i++) {
                    priviousPartialSum = partialSum;
                    partialSum = partialSum + array[i];

                    if (priviousPartialSum <= num && partialSum > num) {
                        nupcount++;
                    }

                }
                System.out.println("The nupcount is "+ nupcount);
            }
        }


    }
}