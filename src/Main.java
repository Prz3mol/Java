
public class Main {
    public static void main(String[] args) {
        int tab[] = {10, 2, 3, 6, 9, 32, 12, 0, -2};

        long startSort = System.nanoTime();
        tab = sort(tab);
        long endSort = System.nanoTime();

        System.out.println("Posortowana Tablica: ");
        System.out.println("Czas sortowania: " + (endSort - startSort));

        for(int tabs : tab ){
            System.out.print(tabs + ", ");
        }
        System.out.println(" ");

        long startBin = System.nanoTime();
        System.out.println("BinSerch: " +  binSerch(tab, tab.length, 6));
        long stopBin = System.nanoTime();
        System.out.println("Czas BinSercha: " +  (stopBin - startBin));

        long startJump = System.nanoTime();
        System.out.println("JumpSerch: " + jumpSerch(tab, 6));
        long stopJump = System.nanoTime();
        System.out.println("Czas JumpSercha: " +  (stopJump - startJump));

        //----------------------------------------------------------------
        System.out.println();

        System.out.println("generowanie tablicy 0 -> 1000");

        int ltab[] = new int[1000000000];
        for (int i = 0; i < ltab.length; i++) {
            ltab[i] += i;
        }
        System.out.println("Wygenerowano");

        long startBinl = System.nanoTime();
        System.out.println("BinSerch dla wiekszej ilosci danych: " +  binSerch(ltab, ltab.length, 4600));
        long stopBinl = System.nanoTime();
        System.out.println("Czas BinSercha: " +  (stopBinl - startBinl));

        long startJumpl = System.nanoTime();
        System.out.println("JumpSerch: " + jumpSerch(ltab, 533215));
        long stopJumpl = System.nanoTime();
        System.out.println("Czas JumpSercha dla wiekszej ilosci danych: " +  (stopJumpl - startJumpl));

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
            int m = (l + r) / 2;
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

    public static int jumpSerch(int[] S, int key){
        int n = S.length;
        int jump = 100000;
        int prev = 0;

        while (S[Math.min(jump, n) - 1] < key) {
            prev = jump;
            jump += 100000;
            if (prev >= n) {
                return -1;
            }
        }
        while (S[prev] < key) {
            prev++;
            if (prev == Math.min(jump, n)) {
                return -1;
            }
        }

        if (S[prev] == key) {
            return prev;
        }

        return -1;
    }
}