class HappyNumber{
    
        public boolean isHappy(int n) {
           while (true) {
               if(n == 1 || n == 7)
                   return true;
               if(n<10)
                   return false;
               n = sumOfSquaresOfDigits(n);
           }
        }
         
       private int sumOfSquaresOfDigits(int n){
           int sum = 0;
           while(n!=0){
               int digit = n%10;
               sum += digit * digit;
               n = n/10;
           }
           return sum;
       }
   
    public static void main(String[] args) {
        HappyNumber obj = new HappyNumber();
        boolean b = obj.isHappy(64);
        System.out.println(b);
    }
}
        