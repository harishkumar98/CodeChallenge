class MaximumSumArray{
    public int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return Integer.MIN_VALUE;
        
        int currentWindowSum = nums[0];
        int largestSum = nums[0];
        for(int i=1; i<nums.length ; i++){
            //start a new window , if starting is a better option than extending
            currentWindowSum = Math.max(currentWindowSum+nums[i],nums[i]);
            largestSum = Math.max(largestSum,currentWindowSum);
        }
        return largestSum;
    }
    public static void main(String[] args) {
        MaximumSumArray obj = new MaximumSumArray();
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Sum is : "+ obj.maxSubArray(arr));
    }
}
