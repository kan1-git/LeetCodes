public class RemoveDuplicatesInPlace {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));

        // Use a Set to track elements already seen
        Set<Integer> seen = new HashSet<>();

        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (!seen.add(value)) {
                it.remove(); // Remove if element is already in the set
            }
        }
        System.out.println(myList);
    }
}
