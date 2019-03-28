/**
 * 二分法查找
 */
public class BinarySearch{
    public int binarySearch(int[] arr, int n , int target){
        //再arr[r,...,l]找target
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        BinarySearch bs=new BinarySearch();
        int [] arr=new int[10];
        for(int i=0;i<9;i++){
            arr[i]=i;
        }
        int res=bs.binarySearch(arr,10,5);
        System.out.println(res);

    }
}
