package recurssion;

import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSum {

    public static void main(String[] args) {


        // naviee approach
        char []set = {'a', 'b', 'c'};
        printPowerSet(set, 3);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        List<Integer> sumSubset = new ArrayList<Integer>();

        printPowerSetWithArray(0,0,list,list.size(),sumSubset);

        Collections.sort(sumSubset);
        System.out.println("Subset is : {} "+sumSubset);


    }

    private static void printPowerSetWithArray(int start, int sum, List<Integer> list, int N, List<Integer> sumSubset) {

        if (start == N){
            sumSubset.add(sum) ;
            return;
        }

        //pick an element
        printPowerSetWithArray(start+1,sum+list.get(start),list,N,sumSubset);

        //do-not pick the element
        printPowerSetWithArray(start+1,sum,list,N,sumSubset);

    }


    static void printPowerSet(char []set, int set_size) {

		/*set_size of power set of a set
		with set_size n is (2**n -1)*/
        long pow_set_size = (long)Math.pow(2, set_size);
        int counter, j;

		/*Run from counter 000..0 to
		111..1*/
        for(counter = 0; counter < pow_set_size; counter++) {

            for(j = 0; j < set_size; j++) {
                int bit = (1 << j);
				/* Check if jth bit in the
				counter is set If set then
				print jth element from set */
                if((counter & bit) > 0) {
                    System.out.print(set[j]);
                }
            }
            System.out.println();
        }
    }
}