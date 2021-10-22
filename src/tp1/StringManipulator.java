package tp1;

public class StringManipulator {

    private String s;

    public StringManipulator(String s) {
        this.s = s;
    }

    public void reverse(String str){
        //do your stuff
        String newStr = "";
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            newStr = newStr + str.charAt(i);
        }
        System.out.println("reverse: "+newStr);
	}

    public void isPalindrome(String test){
        //do your stuff
    	int leftPos = 0;
        int rightPos = test.length() - 1;
        boolean palindrome=true;
        while ((leftPos < rightPos) && palindrome) {
            if (test.charAt(leftPos) != test.charAt(rightPos)) {
                palindrome=false;
            }
            leftPos++;
            rightPos--;
        }

        if (palindrome) {
            System.out.println("C'est un palindrôme !");
        } else {
            System.out.println("Non, ce n'est pas un palindrôme.");
        }
    }

        public void toUpperCase(String str){
        //do your stuff
                System.out.println("uppercase: " + str.toUpperCase());
    }
    public void toLowerCase(String str){
        //do your stuff
        System.out.println("uppercase: " + str.toLowerCase());
    }

    public void getVowelNumber(String str){
        int voyel = 0, cons = 0;
        //Convertir tous les caractères en minuscules
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
           char c = str.charAt(i); 
           if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { 
                voyel++;
           } else if((c >= 'a' && c <= 'z')) {
                cons++;
           }
        }
        System.out.println("Nombre de voyelles: " + voyel);
    }
        
        System.out.println("vowelNumber : ");
    }

	public static void main(String[] args) {
		String s="tene";
		StringManipulator stringManipulator = new StringManipulator(s);
		stringManipulator.reverse(s);
		stringManipulator.isPalindrome(s);
		stringManipulator.toUpperCase(s);
		stringManipulator.toLowerCase(s);
		stringManipulator.getVowelNumber(s);
	}
}
