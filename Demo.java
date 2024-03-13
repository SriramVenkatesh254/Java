class Cricket{
    private String name;
    private int intlRuns;
    private String role;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIntlRuns() {
        return intlRuns;
    }
    public void setIntlRuns(int runs) {
        intlRuns = runs;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String r) {
        role = r;
    }

    
}

public class Demo{
    public static void main(String args[]){
        Cricket obj = new Cricket();
        obj.setName("Virat Kohli");
        System.out.println(obj.getName());

        // obj.setIntlRuns(10_000);
        // System.out.println(obj.getIntlRuns());

        // obj.setRole("Batsman");
        // System.out.println(obj.getRole());
    }
}