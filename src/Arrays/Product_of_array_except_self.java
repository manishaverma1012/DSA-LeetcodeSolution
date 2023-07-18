package Arrays;

public class Product_of_array_except_self {
    public int[] productArray(int[] arr)
    {
        //if element of an array is not zero.
//        int[] answer=new int[arr.length];
//        int product=1;
//        for(int i=0;i<arr.length;i++)
//        {
//            product=product*arr[i];
//        }
//        for(int i=0;i<answer.length;i++)
//        {
//            answer[i]=product/arr[i];
//        }
//
//        return answer;
        int[] answer=new int[arr.length];
        answer[0]=1;
        for(int i=1;i<arr.length;i++)
        {
            answer[i]=answer[i-1]*arr[i-1];
        }
        int product=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            answer[i]*=product;
            product=product*arr[i];

        }
        return answer;
    }

}
