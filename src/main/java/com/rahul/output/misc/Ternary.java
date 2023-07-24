package com.rahul.output.misc;

public class Ternary {
    public static void main(String[] args) {
        int five = 5;
        int two = 2;
        int total = five + (five > 6 ? ++two : --two);
        System.out.println(total);
        total = five + (five > 6 ? two++ : two--);
        System.out.println(total);

        class Code {
            public static void main(String[] args)
            {
                if (true){
                    //break;
                    //break can only be put inside loop and not on if condition
                }

            }
        }
    }
}
