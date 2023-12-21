import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Frame extends javax.swing.JFrame {
    
    ArrayList<String> prices = new ArrayList<>();
    ArrayList<Double> subtotals = new ArrayList<>();
    ArrayList<Integer> qtyCount = new ArrayList<>();
    Transaction total = new Transaction();
    DecimalFormat df = new DecimalFormat("0.00");
    int itemsCount = 0;
    
    public Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    
    // method to get the data from the file and transfer it to the combobox
    public final void fillComboBox(){
        
        String filePath = "items.txt";
        File file = new File(filePath);
        
        // removes all the items from the combobox first so that values will not be duplicated
        if (itemsCount >= 0){
            for (int i = 0; i < itemsCount; i++){
                selectComboBox.remove(i);
            }  
        }
        
        try {
          BufferedReader br = new BufferedReader(new FileReader(file));
          Object[] lines = br.lines().toArray();
          
            for (int i = 0; i < lines.length; i++) {
                String in = lines[i].toString().trim(); // gets the data from the files and converts them to string
                String a[] = in.split("/"); // splits the data to get each of the values
                selectComboBox.addItem(a[1]); // adds the chosen data in the combobox (name)
                
                prices.add(a[2]); // stores the prices in another array
                
                itemsCount++;
            }
            
        } catch(FileNotFoundException ex){ 
        }
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        transactionButton = new javax.swing.JButton();
        displayItemsButton = new javax.swing.JButton();
        addMenuButton = new javax.swing.JButton();
        editItemButton = new javax.swing.JButton();
        deleteItemButton = new javax.swing.JButton();
        tabPanel = new javax.swing.JTabbedPane();
        transactionTabPanel = new javax.swing.JPanel();
        transactionBgPanel = new javax.swing.JPanel();
        receiptPanel = new javax.swing.JPanel();
        receiptLabel = new javax.swing.JLabel();
        receiptContentPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        cashField = new javax.swing.JTextField();
        changeField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        changeField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiptProduct = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        receiptQty = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptSubtotal = new javax.swing.JTextArea();
        transacEditBgPanel = new javax.swing.JPanel();
        selectLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        selectComboBox = new javax.swing.JComboBox<>();
        quantityField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        paymentLabel = new javax.swing.JLabel();
        paymentField = new javax.swing.JTextField();
        paymentButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        checkoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();
        displayBgPanel = new javax.swing.JPanel();
        displayItemPanel = new javax.swing.JPanel();
        displayLabel = new java.awt.Label();
        jScrollPane8 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        searchItemField = new javax.swing.JTextField();
        searchItemLabel = new java.awt.Label();
        displayBgLabel = new javax.swing.JLabel();
        addPanel = new javax.swing.JPanel();
        addBgPanel = new javax.swing.JPanel();
        addItemPanel = new javax.swing.JPanel();
        addLabel3 = new java.awt.Label();
        jScrollPane7 = new javax.swing.JScrollPane();
        displayAddTable = new javax.swing.JTable();
        editAddBgPanel = new javax.swing.JPanel();
        tagAddLabel = new java.awt.Label();
        tagAddField = new java.awt.TextField();
        nameAddLabel = new java.awt.Label();
        nameAddField = new java.awt.TextField();
        priceAddLabel = new java.awt.Label();
        priceAddField = new java.awt.TextField();
        qtyAddLabel = new java.awt.Label();
        qtyAddField = new java.awt.TextField();
        editAddButton = new javax.swing.JButton();
        editPanel = new javax.swing.JPanel();
        editBgPanel = new javax.swing.JPanel();
        editItemPanel = new javax.swing.JPanel();
        addLabel5 = new java.awt.Label();
        jScrollPane9 = new javax.swing.JScrollPane();
        displayEditTable = new javax.swing.JTable();
        editEditBgPanel = new javax.swing.JPanel();
        tagEditLabel = new java.awt.Label();
        tagEditField = new java.awt.TextField();
        nameEditLabel = new java.awt.Label();
        nameEditField = new java.awt.TextField();
        priceEditLabel = new java.awt.Label();
        priceEditField = new java.awt.TextField();
        qtyEditLabel = new java.awt.Label();
        qtyEditField = new java.awt.TextField();
        editEditButton = new javax.swing.JButton();
        deletePanel = new javax.swing.JPanel();
        deleteBgPanel = new javax.swing.JPanel();
        deleteItemPanel = new javax.swing.JPanel();
        addLabel6 = new java.awt.Label();
        jScrollPane10 = new javax.swing.JScrollPane();
        displayDeleteTable = new javax.swing.JTable();
        editDeleteBgPanel = new javax.swing.JPanel();
        tagDeleteLabel = new java.awt.Label();
        tagDeleteField = new java.awt.TextField();
        nameDeleteLabel = new java.awt.Label();
        nameDeleteField = new java.awt.TextField();
        priceDeleteLabel = new java.awt.Label();
        priceDeleteField = new java.awt.TextField();
        qtyDeleteLabel = new java.awt.Label();
        qtyDeleteField = new java.awt.TextField();
        editDeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHEIN ");
        setMinimumSize(new java.awt.Dimension(1030, 710));
        setName("Inventory"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundPanel.setBackground(new java.awt.Color(0, 0, 0));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(1040, 680));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonsPanel.setBackground(new java.awt.Color(218, 209, 198));
        buttonsPanel.setForeground(new java.awt.Color(218, 209, 198));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(160, 720));

        transactionButton.setBackground(new java.awt.Color(255, 255, 255));
        transactionButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        transactionButton.setForeground(new java.awt.Color(0, 0, 0));
        transactionButton.setText("TRANSACTION");
        transactionButton.setBorder(null);
        transactionButton.setBorderPainted(false);
        transactionButton.setFocusable(false);
        transactionButton.setMinimumSize(new java.awt.Dimension(75, 30));
        transactionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactionButtonMouseClicked(evt);
            }
        });
        transactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionButtonActionPerformed(evt);
            }
        });

        displayItemsButton.setBackground(new java.awt.Color(255, 255, 255));
        displayItemsButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        displayItemsButton.setForeground(new java.awt.Color(0, 0, 0));
        displayItemsButton.setText("DISPLAY ITEMS");
        displayItemsButton.setBorder(null);
        displayItemsButton.setBorderPainted(false);
        displayItemsButton.setFocusable(false);
        displayItemsButton.setMinimumSize(new java.awt.Dimension(75, 30));
        displayItemsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayItemsButtonMouseClicked(evt);
            }
        });
        displayItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayItemsButtonActionPerformed(evt);
            }
        });

        addMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        addMenuButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addMenuButton.setForeground(new java.awt.Color(0, 0, 0));
        addMenuButton.setText("ADD ITEM");
        addMenuButton.setBorder(null);
        addMenuButton.setBorderPainted(false);
        addMenuButton.setFocusable(false);
        addMenuButton.setMinimumSize(new java.awt.Dimension(75, 30));
        addMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMenuButtonMouseClicked(evt);
            }
        });
        addMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuButtonActionPerformed(evt);
            }
        });

        editItemButton.setBackground(new java.awt.Color(255, 255, 255));
        editItemButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editItemButton.setForeground(new java.awt.Color(0, 0, 0));
        editItemButton.setText("EDIT ITEM");
        editItemButton.setBorder(null);
        editItemButton.setBorderPainted(false);
        editItemButton.setFocusable(false);
        editItemButton.setMinimumSize(new java.awt.Dimension(75, 30));
        editItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editItemButtonMouseClicked(evt);
            }
        });
        editItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemButtonActionPerformed(evt);
            }
        });

        deleteItemButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteItemButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteItemButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteItemButton.setText("REMOVE ITEM");
        deleteItemButton.setBorder(null);
        deleteItemButton.setBorderPainted(false);
        deleteItemButton.setFocusable(false);
        deleteItemButton.setMinimumSize(new java.awt.Dimension(75, 30));
        deleteItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteItemButtonMouseClicked(evt);
            }
        });
        deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(446, Short.MAX_VALUE)
                .addComponent(transactionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayItemsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        backgroundPanel.add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 160, 680));

        tabPanel.setBackground(new java.awt.Color(0, 0, 0));
        tabPanel.setMaximumSize(new java.awt.Dimension(860, 680));
        tabPanel.setMinimumSize(new java.awt.Dimension(860, 680));
        tabPanel.setPreferredSize(new java.awt.Dimension(860, 680));

        transactionTabPanel.setBackground(new java.awt.Color(102, 153, 255));
        transactionTabPanel.setPreferredSize(new java.awt.Dimension(860, 720));
        transactionTabPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transactionBgPanel.setBackground(new java.awt.Color(255, 153, 153));
        transactionBgPanel.setMaximumSize(new java.awt.Dimension(860, 680));
        transactionBgPanel.setMinimumSize(new java.awt.Dimension(860, 680));
        transactionBgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        transactionTabPanel.add(transactionBgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, -1, -1));

        receiptPanel.setBackground(new java.awt.Color(204, 204, 204));
        receiptPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        receiptLabel.setBackground(new java.awt.Color(0, 0, 0));
        receiptLabel.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        receiptLabel.setForeground(new java.awt.Color(0, 0, 0));
        receiptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receiptLabel.setText("SHEIN");
        receiptPanel.add(receiptLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 263, 83));

        receiptContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        receiptContentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("==================================");
        receiptContentPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 251, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SHEIN");
        receiptContentPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, 251, 23));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("shein.com ");
        receiptContentPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 55, 251, -1));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("---------------------------------");
        receiptContentPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 87, 251, -1));

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TEL NO. O2323422");
        receiptContentPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, 251, -1));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PRODUCT NAME");
        receiptContentPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 104, 90, 20));

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("QTY");
        receiptContentPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 107, 30, -1));

        jLabel11.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SUBTOTAL");
        receiptContentPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 107, -1, -1));

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("********************************");
        receiptContentPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 373, 251, -1));

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TOTAL");
        receiptContentPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 387, -1, -1));

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cash");
        receiptContentPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 404, -1, -1));

        jLabel13.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Change");
        receiptContentPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 423, -1, -1));

        totalField.setEditable(false);
        totalField.setBackground(new java.awt.Color(255, 255, 255));
        totalField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        totalField.setForeground(new java.awt.Color(0, 0, 0));
        totalField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalField.setBorder(null);
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });
        receiptContentPanel.add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 387, 80, -1));

        cashField.setEditable(false);
        cashField.setBackground(new java.awt.Color(255, 255, 255));
        cashField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cashField.setForeground(new java.awt.Color(0, 0, 0));
        cashField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cashField.setBorder(null);
        cashField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashFieldActionPerformed(evt);
            }
        });
        receiptContentPanel.add(cashField, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 404, 80, -1));

        changeField.setEditable(false);
        changeField.setBackground(new java.awt.Color(255, 255, 255));
        changeField.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        changeField.setForeground(new java.awt.Color(0, 0, 0));
        changeField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        changeField.setBorder(null);
        changeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFieldActionPerformed(evt);
            }
        });
        receiptContentPanel.add(changeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 423, 80, -1));

        jLabel14.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("********************************");
        receiptContentPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 442, 251, -1));

        jLabel15.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Items: ");
        receiptContentPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 462, -1, -1));

        changeField1.setEditable(false);
        changeField1.setBackground(new java.awt.Color(255, 255, 255));
        changeField1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        changeField1.setForeground(new java.awt.Color(0, 0, 0));
        changeField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        changeField1.setBorder(null);
        changeField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeField1ActionPerformed(evt);
            }
        });
        receiptContentPanel.add(changeField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 462, 80, -1));

        jScrollPane2.setBorder(null);

        receiptProduct.setEditable(false);
        receiptProduct.setBackground(new java.awt.Color(255, 255, 255));
        receiptProduct.setColumns(20);
        receiptProduct.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        receiptProduct.setLineWrap(true);
        receiptProduct.setRows(5);
        receiptProduct.setWrapStyleWord(true);
        receiptProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(receiptProduct);

        receiptContentPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 90, 240));

        jScrollPane3.setBorder(null);

        receiptQty.setEditable(false);
        receiptQty.setBackground(new java.awt.Color(255, 255, 255));
        receiptQty.setColumns(20);
        receiptQty.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        receiptQty.setLineWrap(true);
        receiptQty.setRows(5);
        receiptQty.setWrapStyleWord(true);
        receiptQty.setBorder(null);
        jScrollPane3.setViewportView(receiptQty);

        receiptContentPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 40, 240));

        jScrollPane1.setBorder(null);

        receiptSubtotal.setEditable(false);
        receiptSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        receiptSubtotal.setColumns(20);
        receiptSubtotal.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        receiptSubtotal.setLineWrap(true);
        receiptSubtotal.setRows(5);
        receiptSubtotal.setWrapStyleWord(true);
        receiptSubtotal.setBorder(null);
        jScrollPane1.setViewportView(receiptSubtotal);

        receiptContentPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 50, 240));

        receiptPanel.add(receiptContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 493));

        transacEditBgPanel.setBackground(new java.awt.Color(255, 252, 237));

        selectLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        selectLabel.setForeground(new java.awt.Color(0, 0, 0));
        selectLabel.setText("SELECT ITEM");

        quantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(0, 0, 0));
        quantityLabel.setText("QUANTITY");

        selectComboBox.setBackground(new java.awt.Color(255, 255, 255));
        selectComboBox.setForeground(new java.awt.Color(51, 51, 51));
        selectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectComboBoxActionPerformed(evt);
            }
        });

        quantityField.setBackground(new java.awt.Color(243, 244, 249));
        quantityField.setForeground(new java.awt.Color(51, 51, 51));
        quantityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityField.setBorder(null);

        addButton.setBackground(new java.awt.Color(153, 204, 255));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(51, 51, 51));
        addButton.setText("Add Item");
        addButton.setBorder(null);
        addButton.setPreferredSize(new java.awt.Dimension(75, 30));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        paymentLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(0, 0, 0));
        paymentLabel.setText("CASH PAYMENT");

        paymentField.setEditable(false);
        paymentField.setBackground(new java.awt.Color(204, 204, 204));
        paymentField.setForeground(new java.awt.Color(51, 51, 51));
        paymentField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paymentField.setBorder(null);
        paymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentFieldActionPerformed(evt);
            }
        });

        paymentButton.setBackground(new java.awt.Color(153, 204, 255));
        paymentButton.setText("✓");
        paymentButton.setBorder(null);
        paymentButton.setBorderPainted(false);
        paymentButton.setEnabled(false);
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(255, 204, 153));
        nextButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextButton.setForeground(new java.awt.Color(51, 51, 51));
        nextButton.setText("Next Customer");
        nextButton.setBorder(null);
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        checkoutButton.setBackground(new java.awt.Color(153, 204, 255));
        checkoutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkoutButton.setForeground(new java.awt.Color(51, 51, 51));
        checkoutButton.setText("Checkout");
        checkoutButton.setBorder(null);
        checkoutButton.setPreferredSize(new java.awt.Dimension(75, 30));
        checkoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout transacEditBgPanelLayout = new javax.swing.GroupLayout(transacEditBgPanel);
        transacEditBgPanel.setLayout(transacEditBgPanelLayout);
        transacEditBgPanelLayout.setHorizontalGroup(
            transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transacEditBgPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transacEditBgPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(transacEditBgPanelLayout.createSequentialGroup()
                                .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(transacEditBgPanelLayout.createSequentialGroup()
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, transacEditBgPanelLayout.createSequentialGroup()
                            .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selectLabel)
                                .addComponent(selectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantityLabel)
                                .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );
        transacEditBgPanelLayout.setVerticalGroup(
            transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transacEditBgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectLabel)
                    .addComponent(quantityLabel))
                .addGap(2, 2, 2)
                .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(transacEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(transacEditBgPanelLayout.createSequentialGroup()
                        .addComponent(paymentLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paymentField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        receiptPanel.add(transacEditBgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 480, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t1.png"))); // NOI18N
        receiptPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 560, 680));

        transactionTabPanel.add(receiptPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tabPanel.addTab("tab1", transactionTabPanel);

        displayPanel.setBackground(new java.awt.Color(255, 252, 237));
        displayPanel.setMaximumSize(new java.awt.Dimension(860, 680));
        displayPanel.setMinimumSize(new java.awt.Dimension(860, 680));
        displayPanel.setPreferredSize(new java.awt.Dimension(860, 680));
        displayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        displayBgPanel.setBackground(new java.awt.Color(255, 252, 237));
        displayBgPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        displayItemPanel.setBackground(new java.awt.Color(255, 252, 237));

        displayLabel.setAlignment(java.awt.Label.CENTER);
        displayLabel.setBackground(new java.awt.Color(255, 252, 237));
        displayLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        displayLabel.setForeground(new java.awt.Color(117, 106, 94));
        displayLabel.setText("INVENTORY - DISPLAY ALL ITEMS");

        javax.swing.GroupLayout displayItemPanelLayout = new javax.swing.GroupLayout(displayItemPanel);
        displayItemPanel.setLayout(displayItemPanelLayout);
        displayItemPanelLayout.setHorizontalGroup(
            displayItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayItemPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        displayItemPanelLayout.setVerticalGroup(
            displayItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayItemPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane8.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane8.setBorder(null);
        jScrollPane8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane8.setHorizontalScrollBar(null);

        displayTable.setBackground(new java.awt.Color(255, 255, 255));
        displayTable.setForeground(new java.awt.Color(51, 51, 51));
        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag#", "Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        displayTable.setRequestFocusEnabled(false);
        displayTable.setRowHeight(30);
        displayTable.setRowMargin(10);
        displayTable.setSelectionBackground(new java.awt.Color(218, 209, 198));
        displayTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        displayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(displayTable);
        if (displayTable.getColumnModel().getColumnCount() > 0) {
            displayTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            displayTable.getColumnModel().getColumn(1).setPreferredWidth(400);
            displayTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            displayTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        searchItemField.setPreferredSize(new java.awt.Dimension(70, 22));
        searchItemField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemFieldActionPerformed(evt);
            }
        });
        searchItemField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchItemFieldKeyReleased(evt);
            }
        });

        searchItemLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        searchItemLabel.setText("Search Item:");

        javax.swing.GroupLayout displayBgPanelLayout = new javax.swing.GroupLayout(displayBgPanel);
        displayBgPanel.setLayout(displayBgPanelLayout);
        displayBgPanelLayout.setHorizontalGroup(
            displayBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayBgPanelLayout.createSequentialGroup()
                .addGroup(displayBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(displayBgPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(searchItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchItemField, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(displayBgPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        displayBgPanelLayout.setVerticalGroup(
            displayBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayBgPanelLayout.createSequentialGroup()
                .addComponent(displayItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(displayBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchItemField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchItemLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        displayPanel.add(displayBgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 30, 546, 649));

        displayBgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Page4.png"))); // NOI18N
        displayBgLabel.setPreferredSize(new java.awt.Dimension(400, 685));
        displayPanel.add(displayBgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 680));

        tabPanel.addTab("tab2", displayPanel);

        addPanel.setBackground(new java.awt.Color(255, 252, 237));
        addPanel.setMaximumSize(new java.awt.Dimension(860, 680));
        addPanel.setPreferredSize(new java.awt.Dimension(860, 680));

        addBgPanel.setBackground(new java.awt.Color(255, 252, 237));
        addBgPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        addItemPanel.setBackground(new java.awt.Color(255, 252, 237));

        addLabel3.setBackground(new java.awt.Color(255, 252, 237));
        addLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addLabel3.setForeground(new java.awt.Color(0, 51, 51));
        addLabel3.setText("INVENTORY - ADD ITEM");

        javax.swing.GroupLayout addItemPanelLayout = new javax.swing.GroupLayout(addItemPanel);
        addItemPanel.setLayout(addItemPanelLayout);
        addItemPanelLayout.setHorizontalGroup(
            addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addItemPanelLayout.createSequentialGroup()
                .addComponent(addLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        addItemPanelLayout.setVerticalGroup(
            addItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setBorder(null);
        jScrollPane7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane7.setHorizontalScrollBar(null);

        displayAddTable.setBackground(new java.awt.Color(255, 255, 255));
        displayAddTable.setForeground(new java.awt.Color(51, 51, 51));
        displayAddTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag#", "Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayAddTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        displayAddTable.setRequestFocusEnabled(false);
        displayAddTable.setRowHeight(30);
        displayAddTable.setRowMargin(10);
        displayAddTable.setSelectionBackground(new java.awt.Color(218, 209, 198));
        displayAddTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        displayAddTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayAddTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(displayAddTable);

        editAddBgPanel.setBackground(new java.awt.Color(236, 213, 186));

        tagAddLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tagAddLabel.setText("ENTER ITEM TAG");

        tagAddField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tagAddField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagAddField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagAddFieldActionPerformed(evt);
            }
        });

        nameAddLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        nameAddLabel.setText("ENTER ITEM NAME");

        nameAddField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        priceAddLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        priceAddLabel.setText("PRICE");

        priceAddField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        priceAddField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        priceAddField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceAddFieldActionPerformed(evt);
            }
        });

        qtyAddLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        qtyAddLabel.setText("QUANTITY");

        qtyAddField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        qtyAddField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        editAddButton.setBackground(new java.awt.Color(255, 255, 255));
        editAddButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editAddButton.setForeground(new java.awt.Color(0, 0, 0));
        editAddButton.setText("ADD ITEM");
        editAddButton.setBorder(null);
        editAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editAddBgPanelLayout = new javax.swing.GroupLayout(editAddBgPanel);
        editAddBgPanel.setLayout(editAddBgPanelLayout);
        editAddBgPanelLayout.setHorizontalGroup(
            editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editAddBgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tagAddField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameAddField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceAddField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtyAddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyAddField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(editAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        editAddBgPanelLayout.setVerticalGroup(
            editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editAddBgPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editAddBgPanelLayout.createSequentialGroup()
                        .addComponent(editAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editAddBgPanelLayout.createSequentialGroup()
                        .addGroup(editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tagAddLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameAddLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceAddLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyAddLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(editAddBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qtyAddField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(priceAddField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameAddField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tagAddField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout addBgPanelLayout = new javax.swing.GroupLayout(addBgPanel);
        addBgPanel.setLayout(addBgPanelLayout);
        addBgPanelLayout.setHorizontalGroup(
            addBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editAddBgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane7)
        );
        addBgPanelLayout.setVerticalGroup(
            addBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(addItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(editAddBgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(addBgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addBgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        tabPanel.addTab("tab5", addPanel);

        editPanel.setBackground(new java.awt.Color(255, 252, 237));
        editPanel.setMaximumSize(new java.awt.Dimension(860, 680));
        editPanel.setPreferredSize(new java.awt.Dimension(860, 680));

        editBgPanel.setBackground(new java.awt.Color(255, 252, 237));
        editBgPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        editItemPanel.setBackground(new java.awt.Color(255, 252, 237));

        addLabel5.setBackground(new java.awt.Color(255, 252, 237));
        addLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addLabel5.setForeground(new java.awt.Color(0, 51, 51));
        addLabel5.setText("INVENTORY - EDIT ITEM");

        javax.swing.GroupLayout editItemPanelLayout = new javax.swing.GroupLayout(editItemPanel);
        editItemPanel.setLayout(editItemPanelLayout);
        editItemPanelLayout.setHorizontalGroup(
            editItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editItemPanelLayout.createSequentialGroup()
                .addComponent(addLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        editItemPanelLayout.setVerticalGroup(
            editItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane9.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setBorder(null);
        jScrollPane9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane9.setHorizontalScrollBar(null);

        displayEditTable.setBackground(new java.awt.Color(255, 255, 255));
        displayEditTable.setForeground(new java.awt.Color(51, 51, 51));
        displayEditTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag#", "Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayEditTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        displayEditTable.setRequestFocusEnabled(false);
        displayEditTable.setRowHeight(30);
        displayEditTable.setRowMargin(10);
        displayEditTable.setSelectionBackground(new java.awt.Color(218, 209, 198));
        displayEditTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        displayEditTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayEditTableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(displayEditTable);

        editEditBgPanel.setBackground(new java.awt.Color(236, 213, 186));

        tagEditLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tagEditLabel.setText("ENTER ITEM TAG");

        tagEditField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tagEditField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagEditFieldActionPerformed(evt);
            }
        });

        nameEditLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        nameEditLabel.setText("ENTER ITEM NAME");

        nameEditField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        priceEditLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        priceEditLabel.setText("PRICE");

        priceEditField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        priceEditField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        priceEditField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceEditFieldActionPerformed(evt);
            }
        });

        qtyEditLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        qtyEditLabel.setText("QUANTITY");

        qtyEditField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        qtyEditField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        editEditButton.setBackground(new java.awt.Color(255, 255, 255));
        editEditButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editEditButton.setForeground(new java.awt.Color(0, 0, 0));
        editEditButton.setText("EDIT ITEM");
        editEditButton.setBorder(null);
        editEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editEditBgPanelLayout = new javax.swing.GroupLayout(editEditBgPanel);
        editEditBgPanel.setLayout(editEditBgPanelLayout);
        editEditBgPanelLayout.setHorizontalGroup(
            editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEditBgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tagEditField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagEditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameEditField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameEditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceEditField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceEditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtyEditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyEditField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(editEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        editEditBgPanelLayout.setVerticalGroup(
            editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editEditBgPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editEditBgPanelLayout.createSequentialGroup()
                        .addComponent(editEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editEditBgPanelLayout.createSequentialGroup()
                        .addGroup(editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tagEditLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameEditLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceEditLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyEditLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(editEditBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qtyEditField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(priceEditField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameEditField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tagEditField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout editBgPanelLayout = new javax.swing.GroupLayout(editBgPanel);
        editBgPanel.setLayout(editBgPanelLayout);
        editBgPanelLayout.setHorizontalGroup(
            editBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editEditBgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane9)
        );
        editBgPanelLayout.setVerticalGroup(
            editBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(editItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(editEditBgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(editBgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editBgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        tabPanel.addTab("tab5", editPanel);

        deletePanel.setBackground(new java.awt.Color(255, 252, 237));
        deletePanel.setMaximumSize(new java.awt.Dimension(860, 680));
        deletePanel.setPreferredSize(new java.awt.Dimension(860, 680));

        deleteBgPanel.setBackground(new java.awt.Color(255, 252, 237));
        deleteBgPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        deleteItemPanel.setBackground(new java.awt.Color(255, 252, 237));

        addLabel6.setBackground(new java.awt.Color(255, 252, 237));
        addLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addLabel6.setForeground(new java.awt.Color(0, 51, 51));
        addLabel6.setText("INVENTORY - REMOVE ITEM");

        javax.swing.GroupLayout deleteItemPanelLayout = new javax.swing.GroupLayout(deleteItemPanel);
        deleteItemPanel.setLayout(deleteItemPanelLayout);
        deleteItemPanelLayout.setHorizontalGroup(
            deleteItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteItemPanelLayout.createSequentialGroup()
                .addComponent(addLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        deleteItemPanelLayout.setVerticalGroup(
            deleteItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane10.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setBorder(null);
        jScrollPane10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane10.setHorizontalScrollBar(null);

        displayDeleteTable.setBackground(new java.awt.Color(255, 255, 255));
        displayDeleteTable.setForeground(new java.awt.Color(51, 51, 51));
        displayDeleteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tag#", "Name", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayDeleteTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        displayDeleteTable.setRequestFocusEnabled(false);
        displayDeleteTable.setRowHeight(30);
        displayDeleteTable.setRowMargin(10);
        displayDeleteTable.setSelectionBackground(new java.awt.Color(218, 209, 198));
        displayDeleteTable.setSelectionForeground(new java.awt.Color(51, 51, 51));
        displayDeleteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayDeleteTableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(displayDeleteTable);

        editDeleteBgPanel.setBackground(new java.awt.Color(236, 213, 186));

        tagDeleteLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        tagDeleteLabel.setText("ENTER ITEM TAG");

        tagDeleteField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tagDeleteField.setEditable(false);
        tagDeleteField.setEnabled(false);
        tagDeleteField.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tagDeleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagDeleteFieldActionPerformed(evt);
            }
        });

        nameDeleteLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        nameDeleteLabel.setText("ENTER ITEM NAME");

        nameDeleteField.setEditable(false);
        nameDeleteField.setEnabled(false);
        nameDeleteField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        priceDeleteLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        priceDeleteLabel.setText("PRICE");

        priceDeleteField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        priceDeleteField.setEditable(false);
        priceDeleteField.setEnabled(false);
        priceDeleteField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        priceDeleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceDeleteFieldActionPerformed(evt);
            }
        });

        qtyDeleteLabel.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        qtyDeleteLabel.setText("QUANTITY");

        qtyDeleteField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        qtyDeleteField.setEditable(false);
        qtyDeleteField.setEnabled(false);
        qtyDeleteField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        editDeleteButton.setBackground(new java.awt.Color(255, 255, 255));
        editDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editDeleteButton.setForeground(new java.awt.Color(0, 0, 0));
        editDeleteButton.setText("REMOVE ITEM");
        editDeleteButton.setBorder(null);
        editDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editDeleteBgPanelLayout = new javax.swing.GroupLayout(editDeleteBgPanel);
        editDeleteBgPanel.setLayout(editDeleteBgPanelLayout);
        editDeleteBgPanelLayout.setHorizontalGroup(
            editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDeleteBgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tagDeleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tagDeleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameDeleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameDeleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceDeleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceDeleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(qtyDeleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyDeleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(editDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        editDeleteBgPanelLayout.setVerticalGroup(
            editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editDeleteBgPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editDeleteBgPanelLayout.createSequentialGroup()
                        .addComponent(editDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editDeleteBgPanelLayout.createSequentialGroup()
                        .addGroup(editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tagDeleteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameDeleteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceDeleteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtyDeleteLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(editDeleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qtyDeleteField, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(priceDeleteField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameDeleteField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tagDeleteField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout deleteBgPanelLayout = new javax.swing.GroupLayout(deleteBgPanel);
        deleteBgPanel.setLayout(deleteBgPanelLayout);
        deleteBgPanelLayout.setHorizontalGroup(
            deleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(editDeleteBgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane10)
        );
        deleteBgPanelLayout.setVerticalGroup(
            deleteBgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBgPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(deleteItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(editDeleteBgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(deleteBgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteBgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        tabPanel.addTab("tab5", deletePanel);

        backgroundPanel.add(tabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 860, 770));

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionButtonActionPerformed
        fillComboBox(); // fills the combobox
    }//GEN-LAST:event_transactionButtonActionPerformed

    private void addMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuButtonActionPerformed
        viewItemAdd(); // fills the table in the add tab
    }//GEN-LAST:event_addMenuButtonActionPerformed

    private void editItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemButtonActionPerformed
        viewItemEdit(); // fills the table in the edit tab
    }//GEN-LAST:event_editItemButtonActionPerformed

    private void displayItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayItemsButtonActionPerformed
        displayItems(); // fills the table in the display tab
    }//GEN-LAST:event_displayItemsButtonActionPerformed

    private void transactionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionButtonMouseClicked
        tabPanel.setSelectedIndex(0); // sets the button to redirect to the transaction tab
    }//GEN-LAST:event_transactionButtonMouseClicked

    private void displayItemsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayItemsButtonMouseClicked
        tabPanel.setSelectedIndex(1); // sets the button to redirect to the display tab
    }//GEN-LAST:event_displayItemsButtonMouseClicked

    private void addMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMenuButtonMouseClicked
        tabPanel.setSelectedIndex(2); // sets the button to redirect to the add tab
    }//GEN-LAST:event_addMenuButtonMouseClicked

    private void editItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editItemButtonMouseClicked
        tabPanel.setSelectedIndex(3); // sets the button to redirect to the edit tab
    }//GEN-LAST:event_editItemButtonMouseClicked

    private void priceAddFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceAddFieldActionPerformed

    }//GEN-LAST:event_priceAddFieldActionPerformed
    
   
    // ADD ITEM BUTTON (EDIT PANEL)
    private void editAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAddButtonActionPerformed
        String tag, name, price, quan;
        tag = tagAddField.getText();
        name = nameAddField.getText();
        price = priceAddField.getText();
        quan = qtyAddField.getText();
        
        if (tag.equals("") || name.equals("") || price.equals("") || quan.equals("")) { 
            // notifies the user whenever there's an empty textfield detected
            JOptionPane.showMessageDialog(null, "Please enter all necessary fields!");      
        } else {
            Add add = new Add(tag, name, price, quan);  // adds item to the file

            DefaultTableModel model = (DefaultTableModel)displayAddTable.getModel();
            Object a[] = {tag, name, price, quan};      // stores the values to an object array
            model.addRow(a);                            // updates the table
        }
        tagAddField.setText("");                        // sets each textfield back to blank
        nameAddField.setText("");
        priceAddField.setText("");
        qtyAddField.setText("");
    }//GEN-LAST:event_editAddButtonActionPerformed
    
    private void tagAddFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagAddFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tagAddFieldActionPerformed
    
    // new addition
    private void displayAddTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayAddTableMouseClicked

    }//GEN-LAST:event_displayAddTableMouseClicked

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // disables and enbales the buttons like this used be to get for another event to occur
        nextButton.setEnabled(false);
        paymentButton.setEnabled(false);
        paymentField.setEnabled(false);
        
        nextButton.setEnabled(true);
        addButton.setEnabled(true);
        quantityField.setEnabled(true);
        selectComboBox.setEnabled(true);
        
        // sets the textfields to be blank
        receiptProduct.setText("");
        receiptQty.setText("");
        receiptSubtotal.setText("");
        totalField.setText("");
        changeField1.setText("");
        paymentField.setText("");
        
        cashField.setText("");
        changeField.setText("");
    }//GEN-LAST:event_nextButtonActionPerformed

    private void paymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentFieldActionPerformed
    
     // ADD ITEM (TRANSACTION) 
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // adds the name, qty, and subtotals in the receipt panel
        String selected_text = selectComboBox.getItemAt(selectComboBox.getSelectedIndex());
        
        if (quantityField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter quantity!");
        } else {
            // adds the selected item in the combobox to the receipt panel
            receiptProduct.setText(receiptProduct.getText() + selected_text + "\n");
            int qty = Integer.parseInt(quantityField.getText());
            int index = selectComboBox.getSelectedIndex();
            double price = Double.parseDouble(prices.get(index));
            
            // sets the quantity to always be equal or more than 1 
            if(qty <= 0 || quantityField.getText().equals("0")){
                qty = 1;
                receiptQty.setText(receiptQty.getText() + "1\n");
            } else {
                receiptQty.setText(receiptQty.getText() + quantityField.getText()  + "\n");
            }
            
            // comptes the subtotal
            double subtotal = qty * price;
            
            // adds the subtotal to the receipt panel
            receiptSubtotal.setText(receiptSubtotal.getText() + df.format(subtotal) + "\n");
        
            // adds the qty and the subtotal to different arrays
            qtyCount.add(qty);
            subtotals.add(subtotal);
        
            Transaction transaction = new Transaction();
            // performs the calculations to remove the qty entered in the overall qty of products 
            transaction.setInput(qty, index);
            quantityField.setText("");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void selectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectComboBoxActionPerformed
      
    }//GEN-LAST:event_selectComboBoxActionPerformed

    private void displayEditTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayEditTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)displayEditTable.getModel();
        int sRow = displayEditTable.getSelectedRow();   // stores the number of selected row to variable sRow
        
        tagEditField.setText(model.getValueAt(sRow, 0).toString());     // sets the text in each of the textfields 
        nameEditField.setText(model.getValueAt(sRow, 1).toString());    // with the values from the selected row
        priceEditField.setText(model.getValueAt(sRow, 2).toString());
        qtyEditField.setText(model.getValueAt(sRow, 3).toString());
    }//GEN-LAST:event_displayEditTableMouseClicked

    private void tagEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagEditFieldActionPerformed
    }//GEN-LAST:event_tagEditFieldActionPerformed

    private void priceEditFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceEditFieldActionPerformed
    }//GEN-LAST:event_priceEditFieldActionPerformed
    
    // EDIT ITEM BUTTON (EDIT PANEL)
    private void editEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEditButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)displayEditTable.getModel();
        int sRow = displayEditTable.getSelectedRow();       // gets the index of the selected row
       
        String tag, name, price, quan;          // gets the input(s) from each of the textfields
        tag = tagEditField.getText();
        name = nameEditField.getText();
        price = priceEditField.getText();
        quan = qtyEditField.getText();
        
        if(sRow >= 0) {                         
            model.setValueAt(tag, sRow, 0);     // sets the values of the table 
            model.setValueAt(name, sRow, 1);
            model.setValueAt(price, sRow, 2);
            model.setValueAt(quan, sRow, 3);
        }
        
        Edit edit = new Edit(tag, name, price, quan, sRow);
        
        // clears the textfields
        tagEditField.setText("");
        nameEditField.setText("");
        priceEditField.setText("");
        qtyEditField.setText("");
    }//GEN-LAST:event_editEditButtonActionPerformed

    private void displayDeleteTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayDeleteTableMouseClicked
    }//GEN-LAST:event_displayDeleteTableMouseClicked

    private void tagDeleteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagDeleteFieldActionPerformed
    }//GEN-LAST:event_tagDeleteFieldActionPerformed

    private void priceDeleteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceDeleteFieldActionPerformed
    }//GEN-LAST:event_priceDeleteFieldActionPerformed

    // DELETE ITEM BUTTON (EDIT PANEL)
    private void editDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDeleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)displayDeleteTable.getModel();
        int sRow = displayDeleteTable.getSelectedRow();     // selects the row number
        model.removeRow(sRow);                              // deletes the whole row

        Delete delete = new Delete();
        delete.deleteItem(sRow);                // deletes the item in the file
        int count = delete.getItemCount();      // gets the updated number of items in the file
        model.setRowCount(count);               // sets the number of rows
    }//GEN-LAST:event_editDeleteButtonActionPerformed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        viewItemDelete(); // sets the values of the table in the delete tab
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    private void deleteItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteItemButtonMouseClicked
        tabPanel.setSelectedIndex(4); // redirects the button to the delete tab
    }//GEN-LAST:event_deleteItemButtonMouseClicked

    private void displayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableMouseClicked
    }//GEN-LAST:event_displayTableMouseClicked

    private void searchItemFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemFieldActionPerformed
    }//GEN-LAST:event_searchItemFieldActionPerformed

    private void searchItemFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchItemFieldKeyReleased
        // searching
        // sorts and filters the table with each key released on the text field
        DefaultTableModel table = (DefaultTableModel)displayTable.getModel();
        String search = searchItemField.getText();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        displayTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchItemFieldKeyReleased

    private void cashFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashFieldActionPerformed
    }//GEN-LAST:event_cashFieldActionPerformed

    private void changeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFieldActionPerformed
    }//GEN-LAST:event_changeFieldActionPerformed

    private void changeField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeField1ActionPerformed
    }//GEN-LAST:event_changeField1ActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // computes the change and prints them in the rceipt
        int cash = Integer.parseInt(paymentField.getText());
        
        cashField.setText(df.format(cash));
        
        //Transaction cash = new Transaction();
        double grandTotal = total.getGrandTotal();
        
        System.out.println("total: " + total.getGrandTotal());
        int payment = Integer.parseInt(paymentField.getText());
        

        double change = payment - grandTotal;
        // prints the change in the receipt
        changeField.setText(String.valueOf(df.format(change)));
        
        nextButton.setEnabled(true);
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void checkoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutButtonActionPerformed
        
        // gets the qty total by adding each item in the qty arraylist
        int qtyTotal = 0;
        for(int i = 0; i < qtyCount.size(); i++){
            qtyTotal += qtyCount.get(i);
        }
        
        // gets the grand total by adding each item in the subtotal arraylist
        int grandTotal = 0;
        for(int j = 0; j < subtotals.size(); j++){
            grandTotal += subtotals.get(j);
        }
        
        if (qtyTotal <= 0) {
           JOptionPane.showMessageDialog(null, "Please add at least one item!");
           return;
        }
        
        // enables and disables some of the buttons
        addButton.setEnabled(false);
        paymentLabel.setEnabled(true);
        selectComboBox.setEnabled(false);
        quantityField.setEnabled(false);
        paymentField.setEnabled(true);
        paymentButton.setEnabled(true);
        paymentField.setEditable(true);
        
        // displays the grandtotal and change fields in the receipt
        totalField.setText(String.valueOf(df.format(grandTotal)));
        changeField1.setText(String.valueOf(qtyTotal));
        
        // sets the grandtotal result
        total.setGrandTotal(grandTotal);
    }//GEN-LAST:event_checkoutButtonActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
    }//GEN-LAST:event_totalFieldActionPerformed

    
    // driver code
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });
    }
    
    public void viewItemAdd(){
      DefaultTableModel model = (DefaultTableModel)displayAddTable.getModel();
        File f = new File("items.txt");
        BufferedReader br;

        try {
            br = new BufferedReader(new FileReader(f)); 
            Object []line = br.lines().toArray();       // store each line scanned to object array
            int l = line.length;                        // get no. of lines or items stored in object array
            
            model.setRowCount(0);                       // reset table
            for(int i = 0; i < l; i++) {                
                String in = line[i].toString().trim();  // convert each object to string
                String a[] = in.split("/");             // split once a forward slash is detected
                model.addRow(a);                        // add line of item from file
            } 
            model.setRowCount(l);                       // show updated table
        } catch(Exception ex) {}
    } 
    
    public void viewItemEdit(){
        DefaultTableModel model = (DefaultTableModel)displayEditTable.getModel();
        File f = new File("items.txt");
        BufferedReader br;
        
        try {
            br = new BufferedReader(new FileReader(f));
            Object []line = br.lines().toArray();
            int l = line.length;
            
            model.setRowCount(0);
            for(int i = 0; i < l; i++) {
                String in = line[i].toString().trim();
                String a[] = in.split("/");
                model.addRow(a);    
            } 
            model.setRowCount(l);
            br.close();
        } catch(Exception ex) {}
    }    
    
    public void viewItemDelete(){
        DefaultTableModel model = (DefaultTableModel)displayDeleteTable.getModel();
        File f = new File("items.txt");
        BufferedReader br;
        
        try {
            br = new BufferedReader(new FileReader(f));
            Object []line = br.lines().toArray();
            int l = line.length;
            
            model.setRowCount(0);
            for(int i = 0; i < l; i++) {
                String in = line[i].toString().trim();
                String a[] = in.split("/");
                model.addRow(a);    
            } 
            model.setRowCount(l);   
            br.close();
        } catch(Exception ex) {}
    }
    
    public void displayItems(){ 
        DefaultTableModel model = (DefaultTableModel)displayTable.getModel();
        File f = new File("items.txt");
        BufferedReader br;
        
        try {
            br = new BufferedReader(new FileReader(f));
            Object []line = br.lines().toArray();
            int l = line.length;
            
            model.setRowCount(0);
            for(int i = 0; i < l; i++) {
                String in = line[i].toString().trim();
                String a[] = in.split("/");
                model.addRow(a);       
            } 
            model.setRowCount(l);    
            br.close();  
        } catch(Exception ex) {}
    }
        
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBgPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addItemPanel;
    private java.awt.Label addLabel3;
    private java.awt.Label addLabel5;
    private java.awt.Label addLabel6;
    private javax.swing.JButton addMenuButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JTextField cashField;
    private javax.swing.JTextField changeField;
    private javax.swing.JTextField changeField1;
    private javax.swing.JButton checkoutButton;
    private javax.swing.JPanel deleteBgPanel;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JPanel deleteItemPanel;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JTable displayAddTable;
    private javax.swing.JLabel displayBgLabel;
    private javax.swing.JPanel displayBgPanel;
    private javax.swing.JTable displayDeleteTable;
    private javax.swing.JTable displayEditTable;
    private javax.swing.JPanel displayItemPanel;
    private javax.swing.JButton displayItemsButton;
    private java.awt.Label displayLabel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JTable displayTable;
    private javax.swing.JPanel editAddBgPanel;
    private javax.swing.JButton editAddButton;
    private javax.swing.JPanel editBgPanel;
    private javax.swing.JPanel editDeleteBgPanel;
    private javax.swing.JButton editDeleteButton;
    private javax.swing.JPanel editEditBgPanel;
    private javax.swing.JButton editEditButton;
    private javax.swing.JButton editItemButton;
    private javax.swing.JPanel editItemPanel;
    private javax.swing.JPanel editPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private java.awt.TextField nameAddField;
    private java.awt.Label nameAddLabel;
    private java.awt.TextField nameDeleteField;
    private java.awt.Label nameDeleteLabel;
    private java.awt.TextField nameEditField;
    private java.awt.Label nameEditLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JTextField paymentField;
    private javax.swing.JLabel paymentLabel;
    private java.awt.TextField priceAddField;
    private java.awt.Label priceAddLabel;
    private java.awt.TextField priceDeleteField;
    private java.awt.Label priceDeleteLabel;
    private java.awt.TextField priceEditField;
    private java.awt.Label priceEditLabel;
    private java.awt.TextField qtyAddField;
    private java.awt.Label qtyAddLabel;
    private java.awt.TextField qtyDeleteField;
    private java.awt.Label qtyDeleteLabel;
    private java.awt.TextField qtyEditField;
    private java.awt.Label qtyEditLabel;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JPanel receiptContentPanel;
    private javax.swing.JLabel receiptLabel;
    private javax.swing.JPanel receiptPanel;
    private javax.swing.JTextArea receiptProduct;
    private javax.swing.JTextArea receiptQty;
    private javax.swing.JTextArea receiptSubtotal;
    private javax.swing.JTextField searchItemField;
    private java.awt.Label searchItemLabel;
    private javax.swing.JComboBox<String> selectComboBox;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JTabbedPane tabPanel;
    private java.awt.TextField tagAddField;
    private java.awt.Label tagAddLabel;
    private java.awt.TextField tagDeleteField;
    private java.awt.Label tagDeleteLabel;
    private java.awt.TextField tagEditField;
    private java.awt.Label tagEditLabel;
    private javax.swing.JTextField totalField;
    private javax.swing.JPanel transacEditBgPanel;
    private javax.swing.JPanel transactionBgPanel;
    private javax.swing.JButton transactionButton;
    private javax.swing.JPanel transactionTabPanel;
    // End of variables declaration//GEN-END:variables
}
