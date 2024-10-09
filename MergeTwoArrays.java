public class MergeTwoArrays {
    public static void main(String[] args) {
        int [] data = {1,3,4};
        int [] data2 = {2,5,7,8};
        int [] result = join(data, data2);
        for(int number : result){
            System.out.println(number);
        }
    }

    public static int[] join(int [] data1, int [] data2){
        int n1 = data1.length;
        int n2 = data2.length;
        int data3 [] = new int[n1 + n2];
        int i ,j, k;
        i = j = k = 0;
        while (i < n1 && j < n2) {
            data3[k++] =  data1[i] < data2[j] ? data1[i++] : data2[j++];
        }
        while (i < n1) {
            data3[k++] =  data1[i++];
        }
        while (j < n2) {
            data3[k++] =  data2[j++];
        }

        return data3;
    }
}
