import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class FindDuplicates {

    public static List<Integer> findDuplicatesNestedLoops(List<Integer> l) {
        
        List<Integer> out= new ArrayList<>();
        for(int i=0;i<l.size();i++) {
            int count=0;
                for(int j=0;j<l.size();j++) {
                    if(Objects.equals(l.get(i), l.get(j))) {
                        count++;
                    }
                }
                if (count>1 && !out.contains(l.get(i))) {
                    out.add(l.get(i));
                }

        }
        return out;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findDuplicatesNestedLoops(sample1));
        System.out.println("Sample 2: " + findDuplicatesNestedLoops(sample2));
        System.out.println("Sample 3: " + findDuplicatesNestedLoops(sample3));
        System.out.println("Sample 4: " + findDuplicatesNestedLoops(sample4));
    }

}