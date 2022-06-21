package Zadanie4; // Вывести цифры пользователя как показано на картинке

import java.util.*;


public class Main {
    public static String mass = "";
    public static List<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        Number();
        Perebor(nums);
        System.out.print(mass);
    }

    public static String Perebor(List<Integer> nums) {
        for (Map.Entry<Integer, String> entry : Key.getNumbers().entrySet()) {
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) == entry.getKey()) {
                    mass += entry.getValue()+"\n";
                }
            }
        }
        return mass;
    }

    public static List<Integer> Number() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число");
        int a = in.nextInt();
        in.close();

        while (a != 0) {
            nums.add(a % 10);
            a /= 10;
        }
        return nums;
    }
}


