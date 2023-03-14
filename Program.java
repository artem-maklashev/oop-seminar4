import java.util.ArrayList;
import java.util.List;

public class Program {
    // {"name":Барсик, "hight": 20}
    public static void main(String[] args) {
        String str = "Hello";
        int number = 3;
        Cat barsik = new Cat("Барсик", 20);        
        GetJson o1 = new GetJson<>(number);
        System.out.println(o1.getJson());

        String str2 = "{\"name\":Барсик, \"hight\": 20}";
        GetJson o2 = new GetJson<>(str2);
        System.out.println(o2.getObject(str2));
    }
    
    
}
