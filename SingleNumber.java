
class SingleNumber{
    public static void main(String[] args) {
        int[] arr = {5,1,1};
        int a = 0;
        for(int i:arr){
            a ^= i;
        }
        System.out.println("Single number in the array is:"+a);
    }
}