package HackerrankQns;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int [] arr = {10,5,2,6};
        int k =100;

        System.out.println(ProductLessThanK(arr, k));

    }
    public static int ProductLessThanK(int [] nums, int k){
        if(k<=1) return 0;

        int count =0; int product =1; int left =0;

        for(int right=0; right<nums.length;right++){
            product *= nums[right];

            while(product>=k){
                product /= nums[left++];
            }
            count += right-left +1;
        }
       return count;

    }
}
