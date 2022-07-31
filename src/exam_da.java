import java.text.SimpleDateFormat;
import java.util.Date;

public class exam_da {
    public static void main(String[] args) {
		System.out.println("Hello, guys!")
		System.out.println("Dzisiaj:")
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyyy");
        System.out.println(formatter.format(new Date()));
    }
}
