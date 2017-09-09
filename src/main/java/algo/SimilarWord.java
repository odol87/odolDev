package algo;

import java.util.*;

/**
 * Created by Seokho Oh on 2017. 9. 5.
 * Github : https://github.com/odol87
 * Email : osh8777@gmail.com
 * https://www.acmicpc.net/problem/2607
 */


public class SimilarWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> wordList = new ArrayList<>();
        int resultCount = 0;
        int inputCount = scanner.nextInt();
        String baseWord = scanner.next();

        char[] baseWordArray = baseWord.toCharArray();
        for (char c : baseWordArray) {
            wordList.add(c);
        }

        for (int i = 0; i < inputCount - 1; i++) {
            String input = scanner.next();
            if (isSimilar(wordList, input.toCharArray())) {
                resultCount++;
            }
        }
        System.out.println(resultCount);


    }

    private static boolean isSimilar(List<Character> inputList, char[] array) {
        Map<Character, Integer> baseMap = new HashMap<>();
        boolean result = false;
        int diffCount = 0;

        for (char c : inputList) {
            if (baseMap.containsKey(c)) {
                baseMap.put(c, baseMap.get(c) + 1);
            } else {
                baseMap.put(c, 1);
            }
        }

        if (inputList.size() - 1 <= array.length && array.length <= inputList.size() + 1) {
            for (char c : array) {
                if(diffCount >= 2) {
                    return false;
                }

                if (!baseMap.containsKey(c)) {//O(1)
                    baseMap.get(c); // value
                    diffCount++;
                } else { // dog, doo
                    if (baseMap.get(c) > 0) {
                        baseMap.put(c, baseMap.get(c) - 1);
                    } else {
                        diffCount++;
                    }
                }
            }

            if (diffCount == 1) {
                if (array.length >= inputList.size()) {
                    result = true;
                }
            } else if (diffCount == 0) {
                result = true;
            }
        }

        return result;
    }
}
