public class Pascal {
    public static void main(String[] args) {
        show(5);
    }

    public static void show(int number){
        int[] a= new int[1];
        for(int i=1;i<=number;i++){
            int[] x = new int[i];
            for(int j=0;j<i;j++){
                if(j==0 || j==(i-1)){
                    x[j]=1;
                }else{
                    x[j]=a[j]+a[j-1];
                }
                System.out.print(x[j] + " ");
            }
            a=x;
            System.out.println();
        }
    }
}
