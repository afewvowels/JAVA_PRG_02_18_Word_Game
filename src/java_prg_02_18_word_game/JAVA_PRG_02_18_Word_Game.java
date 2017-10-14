/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_18_word_game;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * Write a program that plays a word game with the user. The program should
 * ask the user to enter the following:
 * 
 *  - His or her name
 *  - His or her age
 *  - The name of a city
 *  - The name of a college
 *  - A profession
 *  - A type of animal
 *  - A pet's name
 * 
 * After the user has entered these items, the program should display the
 * following store, inserting the user's input into the appropriate
 * locations:
 * 
 *      There once was a person named NAME who lived in CITY. At the age
 *      of AGE, NAME went to college at COLLEGE. NAME graduated and went
 *      to work as a PROFESSION. Then, NAME adopted a(n) ANIMAL named
 *      PETNAME. They both lived happily ever after!
 */
public class JAVA_PRG_02_18_Word_Game {

    /**
     * @param args the command line arguments
     * This method gets user inputs and outputs them as part of a story
     */
    public static void main(String[] args) {
        // Define string variables for story components
        String strName;
        String strAge;
        String strCity;
        String strCollege;
        String strProfession;
        String strPetType;
        String strPetName;
        
        // Create keyboard for user input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Prompt user for inputs
        System.out.print("Please enter your name: ");
        strName = scrKeyboard.nextLine();
        
        System.out.print("Please enter your age: ");
        strAge = scrKeyboard.nextLine();
        
        System.out.print("Please enter the name of a city: ");
        strCity = scrKeyboard.nextLine();
        
        System.out.print("Please enter the name of a college: ");
        strCollege = scrKeyboard.nextLine();
        
        System.out.print("Please enter a profession: ");
        strProfession = scrKeyboard.nextLine();
        
        System.out.print("Please enter a type of pet: ");
        strPetType = scrKeyboard.nextLine();
        
        System.out.print("Please enter a pet's name: ");
        strPetName = scrKeyboard.nextLine();
        
        // Output inputs to story
        System.out.print("There once was a person named " + strName +
                            "who lived in " + strCity + ".\nAt the age of " +
                            strAge + ", " + strName + " went to college at " +
                            strCollege + ".\n" + strName + " graduated and " +
                            "went to work as a " + strProfession + ".\nThen, " +
                            strName + " adopted a(n) " + strPetType + " named " +
                            strPetName + ".\nThey both lived happily ever after!");
    }
    
}
