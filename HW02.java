import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HW02 {
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        json = json.substring(2, json.length() - 2);
        System.out.println("Исходная строка: ");
        System.out.println(json);
        String[] students = json.split("},");

        String[] text1 = students[0].split(",");
        String[] studentname = text1[0].split(":");
        String[] studentmark = text1[1].split(":");
        String[] studentsubject = text1[2].split(":");

        String[] text2 = students[1].split(",");
        String[] studentname2 = text2[0].split(":");
        String[] studentmark2 = text2[1].split(":");
        String[] studentsubject2 = text2[2].split(":");

        String[] text3 = students[2].split(",");
        String[] studentname3 = text3[0].split(":");
        String[] studentmark3 = text3[1].split(":");
        String[] studentsubject3 = text3[2].split(":");

        StringBuilder sb1 = new StringBuilder();
        sb1.append("Студент ");
        sb1.append(studentname[1]);
        sb1.append(" получил ");
        sb1.append(studentmark[1]);
        sb1.append(" по предмету ");
        sb1.append(studentsubject[1] + ".");
        String print1 = sb1.toString();

        StringBuilder sb2 = new StringBuilder();
        sb2.append("Студент ");
        sb2.append(studentname2[1]);
        sb2.append(" получилa ");
        sb2.append(studentmark2[1]);
        sb2.append(" по предмету ");
        sb2.append(studentsubject2[1] + ".");
        String print2 = sb2.toString();

        StringBuilder sb3 = new StringBuilder();
        sb3.append("Студент ");
        sb3.append(studentname3[1]);
        sb3.append(" получил ");
        sb3.append(studentmark3[1]);
        sb3.append(" по предмету ");
        sb3.append(studentsubject3[1] + ".");
        String print3 = sb3.toString();

        System.out.println("Итоговые строки: ");
        System.out.println(print1);
        System.out.println(print2);
        System.out.println(print3);

        CreateFile();
        WriteFile(print1);
        WriteFile(print2);
        WriteFile(print3);
    }

    static public void WriteFile(String s) {
        try(FileWriter writer = new FileWriter("newFile.txt", true)) {
            writer.write(s);
            writer.append('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static public String TextPrint(String s) {
        String res = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(s);
        }
        res = sb.toString();
        return res;
    }
    static public void CreateFile() {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/newFile.txt");
            File newFile = new File(pathFile);
            if (newFile.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");}
    }
}
