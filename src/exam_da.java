import java.text.SimpleDateFormat;
import java.util.Date;

public class exam_da {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy/dd");
        System.out.println(formatter.format(new Date()));
    }
}
