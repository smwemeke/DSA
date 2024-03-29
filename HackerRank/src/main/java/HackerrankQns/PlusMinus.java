package HackerrankQns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int countPositive = 0;
        int countNegative = 0;
        int  countZero =0;

        for (int i : arr){
            if(i < 0){
                 countNegative++;
            } else if (i>0) {
                countPositive++;
            }
            else {
                countZero++;
            }
        }
        double ratioPositive =  (double) countPositive++ / arr.size();
        System.out.printf("%.6f%n", ratioPositive);
        double ratioNegative = (double)countNegative++ / arr.size();
        System.out.printf("%.6f%n", ratioNegative);
        double ratioZero =  (double) countZero++ / arr.size();
        System.out.printf("%.6f%n", ratioZero);
    }


}
