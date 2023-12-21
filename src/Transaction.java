import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Transaction {
    String input; // string input for filtering the jTable
    int grandTotal;
    
    public void setGrandTotal(int grandTotal){
        this.grandTotal = grandTotal;
    }
    
    public int getGrandTotal(){
        return grandTotal;
    }
    
    public void setInput(int qty, int index){
        
        File f = new File("items.txt");
        
        try {
            Scanner scan = new Scanner(f);
            ArrayList<String> items = new ArrayList<>();
            
            while(scan.hasNextLine()) {
                items.add(scan.nextLine());
            }
            
            for (int i = 0; i < items.size(); i++) {
                if (i == index) {
                    String s = items.get(i);
                    String a[] = s.split("/");
                    int temp = Integer.parseInt(a[3]);
                    int res = temp - qty;
                    a[3] = String.valueOf(res);
                    
                    String updatedItem = a[0] + "/" + a[1] + "/" + a[2] + "/" + a[3];
                    
                    items.set(index, updatedItem);
                }
            }
            
            try (FileWriter fw = new FileWriter("items.txt");PrintWriter out = new PrintWriter(fw)){
                for(int i = 0; i < items.size(); i++) {
                out.println(items.get(i));
                }
            }
        } catch(Exception ex) {
            // do nothing
        }
    }
    
    public String getInput(){
        return input;
    }

    // once add item is clicked
    // get the quantity from the selected combobox
    // get the index to be passed to the mutator of class
    // return the value using accessor to update the tables 
}
