import java.io.*;
import java.util.*;

public class Edit {
    
    Edit(String tag, String itemName, String price, String quan, int sRow) {
        File f = new File("items.txt");
        
        try {
            Scanner scan = new Scanner(f);
            ArrayList<String> items = new ArrayList<>();
            
            while(scan.hasNextLine()) {
                items.add(scan.nextLine());
            }
            String updatedItem = tag + "/" + itemName + "/" + price + "/" + quan;
            
            items.set(sRow, updatedItem);
            try (FileWriter fw = new FileWriter("items.txt");PrintWriter out = new PrintWriter(fw)){
                for(int i = 0; i < items.size(); i++) {
                out.println(items.get(i));
                }
            }
        } catch(Exception ex) {
            // do nothing
        }
    }
}
