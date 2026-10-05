package RazvStroki;

public class RazvStroki {
    public static void main(String[] args) {

        String s = "J@va the be$t!123";

        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        String reversedString = new String(chars);
        return reversedString;
    }
}
