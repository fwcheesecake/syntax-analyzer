import java_cup.runtime.Symbol;
import model.Compiler;
import model.Lexer;
import model.Parser;
import model.sym;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Vector;

import components.TextLineNumber;

public class MainForm {
    private JTextPane codeTextArea;
    private JTable tokensTable;
    private JButton analyzeButton;
    private JButton eraseButton;
    private JButton loadFileButton;
    private JTextArea outputTextArea;
    private JPanel mainPanel;
    private JScrollPane codeScrollPane;

    private JFrame mainFrame;

    private File file;

    public MainForm() {
        // MEMBERS
        mainFrame = new JFrame("Syntax Analyzer");
        mainFrame.setContentPane(mainPanel);
        TextLineNumber tln = new TextLineNumber(codeTextArea);
        codeScrollPane.setRowHeaderView(tln);

        // LISTENERS
        loadFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Pick a file");
                String userHome = System.getProperty("user.home") + "/IdeaProjects/Analizador-Sintactico/src/tests";
                fileChooser.setCurrentDirectory(new File(userHome));
                int result = fileChooser.showOpenDialog(mainFrame);
                if (result != JFileChooser.CANCEL_OPTION) {
                    file = fileChooser.getSelectedFile();
                    if (!((file == null) || (file.getName().equals("")))) {
                        codeTextArea.setText("");
                        try {
                            Files.lines(file.toPath(), StandardCharsets.UTF_8)
                                    .forEach(line -> codeTextArea.setText(codeTextArea.getText() + line.concat("\n")));
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });
        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                codeTextArea.setText("");
                outputTextArea.setText("");
                Compiler.getInstance().clearTokens();
                Compiler.getInstance().clearParserOutput();
                tokensTable.setModel(new DefaultTableModel());
            }
        });
        analyzeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(file != null) {
                    try {
                        // Read
                        String code = codeTextArea.getText();

                        // Writing the file
                        FileWriter fw = new FileWriter(file);
                        for (int i = 0; i < code.length(); i++)
                            fw.write(code.charAt(i));
                        fw.close();

                        // Creating a String reader
                        StringReader sr = new StringReader(code);

                        // Creating the Scanner
                        Lexer lexer = new Lexer(sr);

                        // Craeting the parser with the Scanner
                        Parser parser = new Parser(lexer);

                        // Parsing
                        Compiler.getInstance().clearParserOutput();
                        parser.parse();

                        // Filling the table with the Scanner output
                        showData();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // DRAW FRAME
        try {
            UIManager.LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();
            for(UIManager.LookAndFeelInfo i : info) {
                System.out.println(i.getName() + ": " + i.getClassName());
            }
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch(Exception e){
            e.printStackTrace();
        }

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(1440, 850);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
    public static void main(String[] args) {
        MainForm form = new MainForm();
    }

    public void showData() {
        DefaultTableModel model = (DefaultTableModel) tokensTable.getModel();
        Vector<String> columns = new Vector<>();
        columns.add("Line");
        columns.add("Column");
        columns.add("Token");
        columns.add("Value");

        model.setColumnIdentifiers(columns);

        for (Symbol s:
             Compiler.getInstance().getTokens()) {
            model.addRow(new String[]{
                    String.valueOf(s.left),
                    String.valueOf(s.right),
                    String.valueOf(sym.terminalNames[s.sym]),
                    String.valueOf(s.value)
            });
        }

        String output = Compiler.getInstance().getParserOutput();
        outputTextArea.setText(output.length() == 0 ? "Compilacion terminada exitosamente" : output + "\nHubo errores en la compilacion");
    }

    private void createUIComponents() {
    }
}