import java.util.Scanner;

class vowcons {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String newname1 = ""; 
        String newname2 = "";
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (vowels.indexOf(ch) == -1) {
                newname1 += ch;
            } else {
                newname2 += ch;
            }
        }
        System.out.println("Consonants: " + newname1);
        System.out.println("Vowels: " + newname2);
    }
}
