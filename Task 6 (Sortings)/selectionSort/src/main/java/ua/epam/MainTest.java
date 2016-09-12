package ua.epam;

import java.util.Arrays;
import org.junit.Test;
/**
 * Created by Mykyta_Dechev on 9/12/2016.
 */

    public class MainTest {
    @Test
    public static void main(String[] args) {
    int[][] data = {{},{5},{6,8,2,9},{5,3,2,1,0}, {7,12,3,50,98,4,13,2,0,9,71}};
    for (int[] arr : data)
    {System.out.print(Arrays.toString(arr) + " переходит в ");
    Main.selectionSort(arr);
    System.out.println(Arrays.toString(arr));
            }
        }
    }
