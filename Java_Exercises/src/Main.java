
public class Main {
    public static void main(String[] args) {
        //TwoSum test case
        int[] integers = {1,2,4,7};
        int target = 6;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(integers,target);
        System.out.println("Indexes are: " + result[0]+ " and " + result[1]);
    }
}

