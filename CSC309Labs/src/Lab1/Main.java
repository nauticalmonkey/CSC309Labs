package Lab1;
import java.io.*;
import java.util.*;

public class Main {
    public static String greet(String name){
        if(!isAllUpper(name)){
        return "Hello, " +name;}
        else {
            return"HELLO, "+name;
        }
    }



    public static String greet(String[] name) {
        ArrayList<String> greetingNames = new ArrayList<String>();
        ArrayList<String> shoutingNames = new ArrayList<String>();
        String greetingReturn = "";
        String ShoutingReturn = "";

        for (int i = 0; i < name.length; i++) {

            if (!isAllUpper(name[i])) {
                greetingNames.add(name[i]);
            } else {
                shoutingNames.add(name[i]);
            }
        }
        for(int i=0; i< greetingNames.size();i++){
            if(i==greetingNames.size()-1&& greetingNames.size()>1){
                greetingReturn+= " and "+greetingNames.get(i)+".";
            }else if (i==0){ greetingReturn += "Hello " + greetingNames.get(i);}
            else greetingReturn+= ", "+ greetingNames.get(i);
        }

        for(int i=0; i< shoutingNames.size();i++){
            if(i==shoutingNames.size()-1&& shoutingNames.size()>1){
                ShoutingReturn+= " AND "+shoutingNames.get(i);
            }else if( i ==0 && greetingNames.size()!= 0){
                ShoutingReturn+=" AND HELLO "+ shoutingNames.get(i);
            }else{
                ShoutingReturn+= ", " + shoutingNames.get(i);
            }


        }
        if (shoutingNames.size()!=0){
            ShoutingReturn += "!";
        }



        return greetingReturn +ShoutingReturn;



        }



    public static String greet(){
        return "Hello, my friend";}

    private static boolean isAllUpper(String name) {
        for(char c : name.toCharArray()) {
            if(Character.isLetter(c) && Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        String[] twoNames = {"Sara", "Bobby"};
        String[] fourNames = {"Sara", "Bobby", "Kyle", "Finn"};
        String[] mixedNames = {"Sara", "BOBBY", "Kyle", "Finn"};
        String[] CrayMix = {"Sara", "BOBBY", "Kyle", "Finn","SAMANTHA","PAUL"};
        System.out.println(greet("Bob"));
        System.out.println(greet());
        System.out.println(greet("JERRY"));
        System.out.println(greet(twoNames));
        System.out.println(greet(fourNames));
        System.out.println(greet(mixedNames));
        System.out.println(greet(CrayMix));


	// write your code here
    }
}
