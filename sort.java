public class sort {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 3};
        System.out.println("original array:");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");

        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nsorted array:");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}