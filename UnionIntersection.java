import java.util.HashSet;
import java.util.Set;

public class UnionIntersection {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};

        // Compute union
        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }

        // Compute intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr1) {
            for (int num2 : arr2) {
                if (num == num2) {
                    intersectionSet.add(num);
                }
            }
        }

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}
