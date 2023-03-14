public class Cat extends Object{
    private String name;
    private int hight;
    
    public String getName() {
        return name;
    }

    public int getHight() {
        return hight;
    }

    public Cat(String name, int hight) {
        this.name = name;
        this.hight = hight;
    }
    @Override
    public String toString() {
        
        return String.format("%s\n Кличка: %s,\n Высота: %d ", this.getClass().getSimpleName(), this.getName(), this.getHight());
    }
}