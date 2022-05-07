import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(Arrays.asList(1));
        for (int i=1;i<n;i++){
            int previousListSize = resultList.get(i-1).size();
            List<Integer> prevList = resultList.get(i-1);
            List<Integer> tempRes = new ArrayList<>();
            tempRes.add(1);
            for (int j=0;j<previousListSize;j++){
                int getVal = prevList.get(j);
                int resultantValue = calculateValue(getVal,previousListSize,prevList,j+1);
                tempRes.add(resultantValue);
            }
            resultList.add(tempRes);
        }
        System.out.println(resultList);
    }

    private static int calculateValue(int getVal, int previousListSize, List<Integer> prevList,int j) {

        for (int k=j;k<previousListSize;k++){
            int sum = getVal + prevList.get(k);
            return sum;
        }
        return 1;
    }
}
