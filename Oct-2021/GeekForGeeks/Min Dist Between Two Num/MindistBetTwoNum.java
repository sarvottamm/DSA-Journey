
public class MindistBetTwoNum {

    public static void main(String[] args) {

        
        int n=4;
        int x=1;
        int y=2;
        int a[]={1,2,3,2};
        System.out.println( minDist(a,n,x,y));
        
    }

    static  int minDist(int a[], int n, int x, int y) {
        int n ;
        = n;
        int a[n];
        int left = -1 , right = -1;

        int dis = -1;

         for(int i = 0 ; i < n ; i++){



            int inX = a.indexOf(x);
            // if(x == a[i]) {
            //     right = i ;
            //     if(dis != -1 ){
            //         IndexOf()
            //         dis = (left - right);
            //         }
            // }

            // if(y == a[i]) {
            //     left = i;

            //     if(dis != -1 ){
            //     dis = (left - right);
            //     }
            // }
         }

        //  System.out.println("left = " + left + " | right = " + right);
        
         if(dis < 0) dis *= -1;
         return dis;
    }
}