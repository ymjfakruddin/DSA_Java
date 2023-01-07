import java.util.Arrays;

public class Scaler_Arrays {
    public static void main(String[] args) {

        int []ar = {2,5,1,4,8,0,8,1,3,8};
int N = 5;
      int i =  facts(N);
        System.out.println(i);
prints(N);
      int max =  maxElement(ar); int ans = counts(max,ar);
       // System.out.println(ans);
      boolean answer =  possiblePairs();
     // int i =0

        System.out.println(answer);
       // reverseArray();
     //   reverseArrayStartAndEnd();
       // rotationGame();
       // bits1(); This is A IBM !st round interview Question

    }

    private static void prints(int n) {


    }

    private static int facts(int N ) {
if( N ==1)
{
    return 1;
}


        return facts(N-1)*N;
    }

    private static void rotationGame() {
        int [] ar = {1,2,3,4,5};
        int temp = ar[ar.length-1];
        int j = ar.length-1;
        int i = ar.length-2;
        while(j>=0)
        {
            ar[j] = ar[i];
            j--;
            if(j == 0)
            {
                ar[j] =temp;
                break;
            }
            i--;
           // System.out.println(Arrays.toString(ar));

        }
         System.out.println(Arrays.toString(ar));


    }
    //Given an array of size N 4 two indexes start and end
    //Reverse the elements of the array from start to end

    private static void reverseArrayStartAndEnd() {

            int [] ar = {-3,4,2,8,7,9,6,2,10};
            int len = ar.length-1;
            int j = 7;//end
            int i = 3;//start
            while(j>=0)
            {
                //if mid value is present
                if(i == j)
                {
                    break;
                }


                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;

                j = j-1;
                //if mid value is not present
                if(i == j)
                {
                    break;
                }
                i++;

            }
            System.out.println(Arrays.toString(ar));




    }

    private static void bits1() {
        int i = 100;int count = 1;int j = 0;
        System.out.println(count+"  count ");
        while(i>=0)
        {
            j = i%2;

            if(j == 1)
            {
                break;
            }
            count ++;
            i = i/2;

        }
        System.out.println(count);
    }

    private static void reverseArray() {
        int [] ar = {-3,4,2,8,7,9,6,2,10};
        int len = ar.length-1;
        int j = len;
        int i = 0;
        while(j>=0)
        {
            //if mid value is present
            if(i == j)
            {
                break;
            }


            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;

            j = j-1;
            //if mid value is not present
            if(i == j)
            {
                break;
            }
            i++;

        }
        System.out.println(Arrays.toString(ar));

    }

    private static boolean possiblePairs() {
        int [] ar = {3,-2,1,4,3,6,8};int k = 10;
        for(int i = 0;i<ar.length;i++)
        {
            for(int j = i+1;j< ar.length;j++)
            {
                if(ar[i] + ar[j] == k)
                {
                    return true;
                }
            }
        }
        return  false;
    }

    private static int counts(int max,int [] ar)
    {
        int count = 0;
        for(int i = 0;i<ar.length;i++)
        {
            if(ar[i] == max)
            {
                count ++;
            }
        }
        int count1 = ar.length - count;
        return count1;

    }

    private static int maxElement(int [] ar) {
        //int []ar = {2,5,1,4,8,0,8,1,3,8};
       int max = 0;
       for(int i = 0;i<ar.length;i++)
       {
           if(ar[i] >max)
           {
               max = ar[i];
           }
       }
       return max;

    }


}
