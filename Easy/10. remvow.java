import java.util.Scanner;

class remvow {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String newname = "";
        String vowels = "aeiouAEIOU";
        for (int i = 0; i <= name.length() - 1; i++) {
            char ch = name.charAt(i);
            if (vowels.indexOf(ch) == -1)
                newname = newname + ch;
        }
        System.out.println(newname);
    }
}
