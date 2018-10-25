public class Mustang implements Horse{
    private String Name;
    private int Weight;

    public Mustang(String Name,int Weight){
        Name = this.getName();
        Weight = this.getWeight();
    }

    @Override
    public int getWeight() {
        return Weight;
    }
    @Override
    public String getName() {
        return Name;
    }
}
