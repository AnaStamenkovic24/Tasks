 public static String console(String input) {
        char[] chars = input.toCharArray();
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        String res = "";

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'i' -> left.push(chars[i + 1]);
                case '<' -> {
                    if (!left.isEmpty())
                        right.push(left.pop());
                }
                case '>' -> {
                    if (!right.isEmpty())
                        left.push(right.pop());
                }
                case 'b' -> {
                    if (!left.isEmpty())
                        left.pop();
                }
                case 'd' -> {
                    if (!right.isEmpty())
                        right.pop();
                }
            }
            while (left.isEmpty())
                right.push(left.pop());
            while (right.isEmpty())
                res = res.concat(String.valueOf(right.pop()));

        }

        return res;

    }

  public static int[] hartije(int... hartija) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();
        int[] arr = new int[hartija.length];
        for (int i = 0; i < hartija.length; i++) {
            int x = hartija[i];
            int count = 1;
            left.push(hartija[i]);
            while (!left.isEmpty()){
                right.push(left.pop());
            if (!left.isEmpty() && left.peek() <= x)
                count++;
            else
                break;
        }
        while(!right.isEmpty())
            left.push(right.pop());
        arr[i] = count;

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
