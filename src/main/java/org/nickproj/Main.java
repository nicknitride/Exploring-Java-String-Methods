package org.nickproj;

public class Main {
    public static void main(String[] args) {
//        Exercise 1:
        String greeting = "Hello, Cadets!";
        int greetingLength = greeting.length();
        System.out.println("The length of the string is: "+greetingLength);

        // Prediction: 14
        // Outcome: 14

        //        Exercise 2: charAt
        String message = "Keep learning!";
        char character = message.charAt(5);
        System.out.println("The character at index 5 is: "+character);

        //Prediction: letter l
//        Outcome: The character at index 5 is: l
//        Exercise 3: substring()
        String statement = "Java is powerful!";
        String part = statement.substring(5,7);
        System.out.println("The extracted substring is: "+part);
        //Prediction: "is", since it is left-inclusive and right-exclusive [start index, end index)
        // Outcome: The extracted substring is: is

        //Exercise 4:  Upper and lower
        String mixedCase = "This is A Test";
        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();
        System.out.println("Uppercase: "+upper);
        System.out.println("Lowercase: "+lower);
        // Prediction: will convert all characters to upper and lowercase respectively
        // Outcome: as predicted

        //Exercise 5: index of
        String sentence = "The quick brown fox jumps over the lazy dog.";
        int indexFox = sentence.indexOf("fox");
        int indexZ = sentence.indexOf("z");
        int indexCat = sentence.indexOf("cat");
        System.out.println("Index of 'fox': "+indexFox);
        System.out.println("Index of 'z': "+indexZ);
        System.out.println("Index of 'cat':"+indexCat);

        // Prediction: will output the start index of the substring, cat will output null since it doesn't exist
        // Outcome: 16, 37, -1
        // Apparently it outputs -1 when the index isn't found


        // Exercise 6: Equals() vs EqualsIgnoreCase()
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);



        // Prediction: false, true, true
        // Outcome: as predicted

        //Exercise 7: Replace
        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs");
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);

        // Prediction it will match the exact case and ignore "Cats"
        // Outcome: as predicted

        // Exercise 8: Trim
        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();
        System.out.println("Padded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());
        // Prediction: it will remove the leading and trailing spaces from the string
        // Outcome: 20 pre-trim and 14 post-trim, 6 leading and trailing spaces.
    }
}