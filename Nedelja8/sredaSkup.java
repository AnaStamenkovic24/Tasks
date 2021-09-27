 public static ArrayList<Integer> razlika(ArrayList<Integer> a, ArrayList<Integer> b) {
        TreeSet<Integer> set = new TreeSet<>(b);
        ArrayList<Integer> div = new ArrayList<>();
        for (int i : a) {
            if (set.add(i))
                div.add(i);
        }
        return div;
    }
