 public static ArrayList<Integer> razlika(ArrayList<Integer> a, ArrayList<Integer> b) {
        TreeSet<Integer> set = new TreeSet<>(b);
        ArrayList<Integer> div = new ArrayList<>();
        for (int i : a) {
            if (set.add(i))
                div.add(i);
        }
        return div;
    }

  public static boolean anagram(String s1, String s2) {
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
        TreeSet<Character> set1 = new TreeSet<>();
        ArrayList<Character> arr1 = new ArrayList<>();
        TreeSet<Character> set2 = new TreeSet<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        for (char c : s1.toCharArray()) {
            if (!set1.add(c))
                arr1.add(c);
        }
        for (char c : s2.toCharArray()) {
            if (!set2.add(c))
                arr2.add(c);
        }
        arr1.sort(Comparator.naturalOrder());
        arr2.sort(Comparator.naturalOrder());
        return set1.equals(set2) && arr1.equals(arr2);
    }
