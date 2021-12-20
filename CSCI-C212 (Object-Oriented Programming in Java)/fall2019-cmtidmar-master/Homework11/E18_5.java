
package homework_11;
/*
 *  E18.5: Implement a generic version of the binary search algorithm
 */
public class E18_5<T extends Comparable<T>>  {
    private T[] a;
    public void BinarySearcher(T[] words) {
        a = words;
    }

    public int search(Comparable<T> v) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = a[mid];
            int result = v.compareTo(midVal);

            if (result < 0) {
                high = mid - 1;
            }

            else if (result > 0) {
                low = mid + 1;
            } 

            else {
                return mid;
            }
        }

        return -1;
    }
}