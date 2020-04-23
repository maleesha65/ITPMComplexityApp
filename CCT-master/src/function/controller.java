package function;
import java.io.BufferedReader;
import java.io.FileReader;

public class controller {

    String[] strArr;
    String[] arithmatic = {"+", "-", ".", "/","%"};
    String[] logical = {"&&", "||", "!"};
    String[] relation = {"==", "!=", ">", "<", ">=", "<="};
    String[] bitwise = {"|", "^", "~", "<<", ">>", ">>>", "<<<"};
    String[] miscellaneous = {",", "->", ".", "::"};
    String[] assignment = {"+=", "-=", "*=", "/=", "=", ">>>=", "|=", "&=", "%=", "<<=", ">>=", "^="};
    String[] keywords = {"void", "double", "int", "float", "String", "printf", "println", "cout", "cin", "if","else", "for", "while", "do", "switch", "case", "class"};
    String[] manipulators = {"endl", "\n"};
    String[] text = {"System.out.println();"};

    String[][] options = {logical, arithmatic, relation, bitwise, miscellaneous, assignment, keywords, manipulators, text};

    public controller() {
    
    }

    public void setArithmatic(String[] arithmatic) {
        this.arithmatic = arithmatic;
    }
    
    
  
    public String[] getArithmatic() {
        return arithmatic;
    }

    public String[] getLogical() {
        return logical;
    }

    public String[] getRelation() {
        return relation;
    }

    public String[] getBitwise() {
        return bitwise;
    }

    public String[] getMiscellaneous() {
        return miscellaneous;
    }

    public String[] getAssignment() {
        return assignment;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public String[] getManipulators() {
        return manipulators;
    }

    public String[] getText() {
        return text;
    }

    
    
    
    public int analyzer(FileReader reader) {
        int complexity = 0;
        try {
            BufferedReader br = new BufferedReader(reader);
            String line;

            while ((line = br.readLine()) != null) {
                if (line.length() > 0) {  //checking empty lines
                    strArr = line.split(" ");

                    for (int i = 0; i < options.length; i++) {

                        String[] array = options[i];
                        for (int j = 0; j < strArr.length; j++) {
                            for (int k = 0; k < array.length; k++) {
                                if (array[k].equals(strArr[j])  || strArr[j].contains(array[k])) {
                                    ++complexity;
                                }
                            }
                        }
                    }

                }
            }

            System.out.println("Complexity :" + complexity);

        } catch (Exception e) {

        }

        return complexity;
    }

}
