package RazvStroki;

public class RazvStroki {
    public static void main(String[] args) {

        String s = "J@va the be$t!123";
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                char tmp = chars[left];     // меняем местами края
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;                     // сдвигаем указатели навстречу
                right--;
            }
        }
        System.out.println(new String(chars));
    }
}
