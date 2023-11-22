public class bubblesort {
    public static void main (String[] args){

        int[] numbers =new int[10];
        for (int p=0; p<numbers.length;p++)
            numbers[p] = (int)(Math.random()*100);
        boolean swap;
        for (int i=0; i<numbers.length -1; i++){
            swap=false;
            for (int j = 0; j < numbers.length - i - 1;j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swap=true;
                }
                }
                if (swap) {
                    System.out.print("Po przejściu " + (i + 1) + ": ");
                    for (int k = 0; k < numbers.length; k++) {
                        System.out.print(numbers[k] + " ");
                    }
                System.out.println();
            }
        }
    }
}
