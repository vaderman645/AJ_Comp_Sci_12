public class ThreePointFour {
    static int binarySearchMethod(char[] arr, char key) {
        int mid = arr.length / 2;
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
            if (first > last) {
                return -1;
            }

        }
        return -1;

    }

    static char temp;
    static void sort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = {'C', 'o', 'm', 'p', 'u', 't', 'e', 'r', ' ', 'S', 'c', 'i', 'e', 'n', 'c', 'e', '!'};
        sort(arr);
        System.out.println(binarySearchMethod(arr,'o'));
    }
}
