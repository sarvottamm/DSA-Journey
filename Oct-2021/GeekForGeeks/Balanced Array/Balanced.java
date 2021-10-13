

public class Balanced {
    
    public static void main(String[] args) {

        long a[] = { 1, 2, 1, 2, 1, 3 };
        int n =  6;
        System.out.println(minValueToBalance(a, n));
    }
    
    // ACCEPTED :) 
    static long minValueToBalance(long a[] ,int n){
        long x=0, y=0;
        for(int i = 0; i<n ; i++){
            if (i<n/2) {
                x += a[i];
            }
            else{
                y += a[i];
            }
            
        }

        long dis = x - y;
        if(dis < 0) dis *= -1;
        return dis;
    }
}
