 
 public static List<Integer> div3plus2(List<Integer> numbers) {
        return numbers.stream().map(x -> x % 3 == 0 ? x + 2 : x).collect(Collectors.toList());
    }

public static List<Integer> removeSomeFromDoubled(List<Integer> numbers) {
       List<Integer> doubledNumbers = numbers.stream().
               map(x -> x*x).
               collect(Collectors.toList());
       doubledNumbers.removeIf(x -> x % 3 == 0);
       return doubledNumbers;
    }


public static List<Integer> oddsMultTwoDuplicatesOut(List<Integer> numbers){
        List<Integer> oddsMultTwo = numbers.stream().
                map(x -> x % 2 != 0 ? x*2 : x).
                collect(Collectors.toList());
            return new ArrayList<>(new HashSet<>(oddsMultTwo));
    }
