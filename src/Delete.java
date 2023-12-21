import java.io.*;
import java.util.*;

public class Delete {
    // deletes the selected row in the file
    public void deleteItem(int sRow) {
        File f = new File("items.txt");
        
        try {
            Scanner scan = new Scanner(f);
            ArrayList<String> items = new ArrayList<>();
            
            while(scan.hasNextLine()){
                items.add(scan.nextLine());
            }
            
            items.remove(sRow);
            try (FileWriter fw = new FileWriter("items.txt");PrintWriter out = new PrintWriter(fw)){
                for(int i = 0; i < items.size(); i++) {
                out.println(items.get(i));
                }
            }
        } catch (Exception ex) {
            // do nothing
        } 
    }
    
    // reads the file per line to get the number of items
    public int getItemCount() {
        int count = 0;
        
        File f = new File("items.txt");
        try {
            Scanner scan = new Scanner(f);
            
            while(scan.hasNextLine()) {
                count++;
                scan.nextLine();
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error!");
        } 
        return count;
    }
}
