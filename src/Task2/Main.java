package Task2;
/**
 * Using IntelliJ IDEA, create a project. Required: Create the AbstractHandler class.
 * In the body of the class, create methods void open(), void create(), void change(), void save().
 * Create derived classes XMLHandler, TXTHandler, DOCHandler from the base class AbstractHandler.
 * Write a program that will perform document definition
 * and for each format there should be methods of opening, creating, editing, and saving a certain document format.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractHandler handler = null;
        Scanner input = new Scanner(System.in);
        System.out.println("I can open: xml, txt and docx\nEnter type of document: ");
        String document = input.nextLine();

        if (document.equals("xml")){
            handler = new XMLHandler();
        }else if(document.equals("txt")){
            handler = new TXTHandler();
        } else if (document.equals("docx")) {
            handler = new DOCHandler();
        }else System.out.println("Incorrect documents format");

        handler.open();
        handler.create();
        handler.change();
        handler.save();
    }

}