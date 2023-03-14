import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    // {"name":Барсик, "hight": 20}
    public static void main(String[] args) {
        List<GetJson> li = new ArrayList<>();
        li.add(new GetJson<String>("Hello"));
        li.add(new GetJson<Integer>(3));
        li.add(new GetJson<Cat>(new Cat("Барсик", 20)));          
        

        for (GetJson getJson : li) {
            System.out.println(getJson.getJson());
        }

        String str2 = "{\"name\":Барсик, \"hight\": 20}";
        GetJson o2 = new GetJson<>(str2);
        System.out.println(o2.getObject(str2));
    }
    
    
}
