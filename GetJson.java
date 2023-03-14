import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetJson<T> {
    private T obj;         

    

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public GetJson(T obj) {
        this.obj = obj;
    }

    public String getJson() {
        String str = "";

        if (obj instanceof Integer) {
            str = String.format("%d", obj);
        } else if (obj instanceof String) {
            str = String.format("\"%s\"", obj);

        } else if (obj instanceof Cat) {
            str = String.format("{\"name\":%s, \"hight\":%d}", ((Cat) obj).getName(), ((Cat) obj).getHight());
        }
        return str;

    }

    public T getObject(String str){
        if (isDigit(str))
            return (T) Integer.valueOf(str);
        else if(str.startsWith("\""))
            return (T)str.replace("\"", "");
        else if (((String)str).startsWith("{"))
            return (T) parseJson(str);
        return null;
        
    }

    public boolean isDigit(String o) throws NumberFormatException {
        try {
            Integer.parseInt((String) o);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    // "{\"name\":Барсик, \"hight\": 20}" парсим подобную строку
    public Cat parseJson(String str) {
        str = str.replace("{", "")
                .replace("}", "")
                .replaceAll("\"","");
        
        String[] pair = str.split(",");
        Map<String, String> fieldsValues = new HashMap<>();
        for (String string : pair) {
            String[] fv = string.split(":");           
            fieldsValues.put(fv[0].trim(), fv[1].trim());
        }        
        String name = fieldsValues.get("name");
        int hight = Integer.parseInt(fieldsValues.get("hight"));
        Cat cat = new Cat(name, hight);
        return cat;

        
    }

}
