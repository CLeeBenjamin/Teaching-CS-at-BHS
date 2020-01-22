import java.util.*;


// Take items from the array and put them in the arraylist 
public class Main {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        String[] friends = {"Sam", "Jessica", "Mark", "Alexis"};
        for (int i = 0; i < friends.length-1; i++){
            names.add(friends[i]);
        }
        System.out.println(names);
    }
}
