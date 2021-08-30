package maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give us a word: ");
        String input = sc.nextLine();
        System.out.printf("You entered %s\n", input);

        String isANumber;
        if(StringUtils.isNumeric(input)){
            isANumber = " is a number.";
        }
        else{isANumber = " is not a number";}

        System.out.printf("\"%s\"%s",input, isANumber);



    }

}