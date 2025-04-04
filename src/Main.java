
public class Main {
    public static void main(String[] args) {
        int tab[] = {10, 2, 3, 6, 9, 32, 12, 0, -2};
        tab = sort(tab);

        for(int tabs : tab ){
            System.out.print(tabs + ", ");
        }

        System.out.println(" ");
        System.out.println( binSerch(tab, tab.length, 6));
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int binSerch(int[] S, int len, int key){
        int l = 0;
        int r = len - 1;
        while (l <= r) {
            int m = (1+r) / 2;
            if (S[m] == key) {
                return m;
            }
            if (S[m] > key) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;

    }
}