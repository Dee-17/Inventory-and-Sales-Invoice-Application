import java.io.*;

// Add function
public class Add {
    // appends an item to the file 
    Add (String tag, String itemName, String price, String quan){
        try {
            FileWriter fw = new FileWriter("items.txt", true);
            fw.append(tag + "/" + itemName + "/" + price + "/" + quan + "\n");
            fw.close();
        } catch (Exception ex) {
            // do nothing
        }
    }
}
