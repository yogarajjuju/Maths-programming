public class Setbits {
    public static void main(String[] args) {
        int n =10;
        System.out.println(Integer.toBinaryString(n));// to find the binary number of n
        System.out.println(set(n));
    }

     static int  set(int n) {
        int count =0;
        while(n>0){
            count++;
            n=n&(n-1);
//            n-=n&-n; can also use this
        }
         return count;

    }

}
