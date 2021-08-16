import java.util.Arrays;

public class Nedelja4zadatak {

    public static int[] zigZag(int[] zig, int[] zag) {
//Napisati funkciju koja prima dva niza i ispisuje prvo prvi element iz prvog niza,
// pa prvi element iz drugog niza, pa drugi iz prvog ....
// Nizovi ne moraju da budu iste duzine!
//Npr: [1, 2, 8, 9] [3, 4, 5, 6, 7, -7] => 1 3 2 4 8 5 9 6 7 -7
        int countZig = 0;
        for (int i = 0; i < zig.length; i++) {
            countZig++;
        }
        int countZag = 0;
        for (int i = 0; i < zag.length; i++) {
            countZag++;
        }
        int count = countZig + countZag;

        int[] array = new int[count];

        int k = 0;
        int j = 0;
        for (int i = 0; i < count; i++) {
            if (k < zig.length && j < zag.length) {
                if (i % 2 == 0) {
                    array[i] = zig[k];
                    k++;
                } else {
                    array[i] = zag[j];
                    j++;
                }
            }
                 else if (k == zig.length) {
                array[i] = zag[j];
                j++;

            } else if (j == zag.length) {
                array[i] = zig[k];
                k++;
            }
        }
        return array;
    }
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{3, 2, 9};
        //System.out.println(Arrays.toString(greaterThanMultOfPrimeNums(arr)));
        System.out.println(Arrays.toString(zigZag(arr1, arr2)));
    }

}


