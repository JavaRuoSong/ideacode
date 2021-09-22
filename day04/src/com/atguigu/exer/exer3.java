import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shkstart
 * @create 2021-08-24 10:00
 */
public class exer3 {
    public static void main(String[] args) throws ParseException {
        String s1 = "1990-01-01";
        String s2 = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse1 = sdf.parse(s1);
        Date parse2 = sdf.parse(s2);
        long l = (parse2.getTime() - parse1.getTime()) / (1000 * 60 * 60 * 24) + 1;
        if((l%5)<=3){
            System.out.println("打渔");
        }else{
            System.out.println("晒网");
        }

    }
}
