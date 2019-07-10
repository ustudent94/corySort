import java.util.Vector;

public class CorySortTest {
    public static void main(String[] args) {
        //The purpose of this class is to demo the Sort function.
        int[] random = new int[10000];

        //Generate array of random numbers.
        for(int i = 0; i < random.length; i++){
            random[i] = (int) (Math.random() *100000);
        }
        //Call Sort
        random = corySort(random);

        //Print Sorted Array
        for(int i = 0; i < random.length; i++){
            System.out.print(random[i] + " ");
        }
        System.out.println();
    }

    static int[] corySort(int[] Arr) {
        //Array must be positive integers.
        Vector<Integer> countArray = new Vector<>();

        //Read through unsorted array. Increment value of countArray by one at the index of the value in the unsorted Array
        for (int i = 0; i < Arr.length; i++){
            if (Arr[i] >= countArray.size()){
                //increase the size of the vector if a larger value is found
                for(int j = countArray.size(); j <= Arr[i]; j++){
                    countArray.add(0);
                }
            }
            countArray.set(Arr[i],countArray.get(Arr[i]) + 1);
        }

        //reset values of sorted array based on the countArray
        int counter = 0;
        for(int i = 0; i < countArray.size(); i++){
            for (int j = 0; j < countArray.get(i);j++){
                Arr[counter] = i;
                counter++;
            }
        }

        return Arr;
    }
}
