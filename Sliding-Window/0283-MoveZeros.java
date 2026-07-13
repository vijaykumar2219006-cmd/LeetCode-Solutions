public class 0283-MoveZeros {
    public static void main(String[] args){
        int[] arr={0,0,0,3,0,4,0};
        int l=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]!=0){
                int t=arr[l];
                arr[l]=arr[r];
                arr[r]=t;
                l++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

