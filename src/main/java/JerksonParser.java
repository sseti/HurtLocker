import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JerksonParser {
    private String groceryList;

    public JerksonParser() {
        this.groceryList = loadFile();
    }

    private String loadFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("RawData.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getGroceryList() {
        return groceryList;
    }

    public String replaceBread(String str) throws Exception {
        Pattern p = Pattern.compile("[Bb][Rr][Ee][Aa][Dd]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        return m.replaceAll("Bread");
    }

    public String replaceMilk(String str) {
        Pattern p = Pattern.compile("[Mm][Ii][Ll][Kk]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        return m.replaceAll("Milk");
    }

    public String replaceCookies(String str) {
        Pattern p = Pattern.compile("[Cc][Oo0][Oo0][Kk][Ii][Ee][Ss]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        return m.replaceAll("Cookies");
    }

    public String replaceApples(String str) {
        Pattern p = Pattern.compile("[Aa][Pp][Pp][Ll][Ee][Ss]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        return m.replaceAll("Apples");
    }

    public String replaceName(String str) {
        Pattern p = Pattern.compile("[Nn] [Aa] [Mm] [Ee]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        return m.replaceAll("Name");
    }

    public String replacePrice(String str) {
        Pattern p = Pattern.compile("[Pp] [Ri] [Cc] [Ee]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        return m.replaceAll("Price");
    }
}