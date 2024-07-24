import java.util.*;

public class Main {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> words = new ArrayList<>(List.of("Я", "Я", "люблю", "люблю", "люблю", "кошек", "кошек"));
    static List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("\nЗадание 1");
        printOddNumbs();
        System.out.println("\nЗадание 2");
        printEvenNumbs();
        System.out.println("\nЗадание 3");
        printWords();
        System.out.println("\nЗадание 4");
        printOne();
    }

    public static void printOddNumbs() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        } {
        }
    }

    public static void printEvenNumbs() {
        Collections.sort(nums1);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums1) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.print(num);
                prevNum = num;
            }
        }
    }
    public static void printWords() {
        Set<String> word = new HashSet<>(words);
        System.out.print(word);
        words.clear();
        words.addAll(word);
    }
    public static void printOne() {
        Set<String> unWords = new HashSet<>(strings);
        System.out.println(strings.size() - unWords.size());


        }
    }

