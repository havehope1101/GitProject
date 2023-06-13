import java.util.Arrays;

public class btGopMang {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {0,0,0,0,0,0,0,0,0,0,0,0};

        for(int i=0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }

        for(int j=0;j< arr2.length;j++){
            arr3[j+arr1.length] = arr2[j];
        }

        System.out.println(Arrays.toString(arr3));
    }


}
