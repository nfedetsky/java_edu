import java.text.SimpleDateFormat;
import java.util.Date;

public class exam_da {
    public static void main(String[] args) {
		System.out.println("Hello, guys!")
        SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy/dd");
        System.out.println(formatter.format(new Date()));
    }
}
