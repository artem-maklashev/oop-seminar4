public class GetJson<T> {
    private T obj;      

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
            str = String.format("{\"name\":%s, \"hight\": %d}", ((Cat) obj).getName(), ((Cat) obj).getHight());
        }
        return str;

    }

    public Object getObject(String str) {
        if (isDigit(str))
            return Integer.parseInt(str);
        else if(str.startsWith("\""))
            return str.replace("\"", "");
        else if (str.startsWith("{"))
            return new Cat("Маруся", 15);
        return null;
        
    }

    public boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
