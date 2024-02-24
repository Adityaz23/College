public class Main {

    public void eachNumberOccurrence(int[] arr){
        boolean[] flag = new boolean[arr.length];
        for (int i=0; i< arr.length; i++){

            if (!flag[i]){
                int count = 1;
                for (int j = i+1; j < arr.length ; j++) {
                    if (arr[i] == arr[j]) {
                        flag[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + "-" + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {11,21,32,11,21,434,343,567,76,567};
        Main obj = new Main();
        obj.eachNumberOccurrence(arr);
    }
}
