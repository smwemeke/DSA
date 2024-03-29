package HackerrankQns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Solution.miniMaxSum(arr);

        bufferedReader.close();
    }
}
class  Solution{

public static void miniMaxSum(List<Integer> arr) {
    Integer [] num = arr.toArray(new Integer[0]);

    Arrays.sort(num);

    long minSum = 0;
    long maxSum = 0;
    int n = num.length;

    for(int i=0; i<n-1;i++){
        minSum += num[i];

    }
    for (int i=1; i<=n-1;i++){
        maxSum += num[i];

    }
    System.out.println(minSum  + " " +   maxSum);
}
}