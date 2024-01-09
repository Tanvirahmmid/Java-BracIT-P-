public class exm38 {

    public static void main(String[] args) {
        String txt = "Aa kiu, I swd skieo 236587.Gh kiu: sieo??  25.33";
        int letter=0;
        int space=0;
        int number=0;
        int other=-0;

        for (int i = 0; i <txt.length(); i++) {
            char ch = txt.charAt(i);
            if (Character.isLetter(ch)) {
                letter++;
            } else if (Character.isDigit(ch)) {
                number++;
            } else if (Character.isWhitespace(ch)) {
                space++;
            } else {
                other++;
                
            }
            

            System.out.println("Letter: " + letter);
            System.out.println("Space: " + space);
            System.out.println("Number: " + number);
            System.out.println("Other: " + other);

        }

    }

}
