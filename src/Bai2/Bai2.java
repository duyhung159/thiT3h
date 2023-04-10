
package Bai2;

public class Bai2 {
    public static void main(String[] args) {
        String input = "java developer";
        String reversed = reverseString(input);
        String result = capitalizeVowels(reversed);
        System.out.println("Chuoi dau vao: " + input);
        System.out.println("Chuoi dao nguoc va viet hoa nguyen am: " + result);
    }

    // Phương thức đảo ngược chuỗi
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Phương thức viết hoa chữ nguyên âm
    public static String capitalizeVowels(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (isVowel(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    // Phương thức kiểm tra chữ cái có phải là nguyên âm
    public static boolean isVowel(char c) {
        String vowels = "ueoai";
        return vowels.contains(String.valueOf(Character.toLowerCase(c)));
    }
}

