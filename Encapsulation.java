//Encapsulation -> Encapsulation in Java is the process by which data (variables) and the code that acts upon them (methods) are integrated as a single unit. By encapsulating a class's variables, other classes cannot access them, and only the methods of the class can access them.

class Car{
    private String brand;
    private String modelName;
    private int price;
    //Private -> It will make the variable private. Meaning, it belongs only to its respective class and we cannot access it outside the class

    //All the instance variables must be private variables and should be made accessible only by using Methods and no one outside the class can access those variables without the methods.

    public String getBrand(){
        return brand;
    }

    public void setBrand(String b){
        brand = b;
    }

    public String getModelName(){
        return modelName;
    }

    public void setModelName(String m){
        modelName = m;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int p){
        price = p;
    }
}

public class Encapsulation {
    public static void main(String a[]){
        Car obj = new Car();
        // System.out.println(obj.getBrand());
        // System.out.println(obj.getModelName());
        // System.out.println(obj.getPrice());
        // obj.brand = "Tata";
        // obj.modelName = "Altroz";
        // obj.price = 1000;
        // System.out.println(obj.brand);
        obj.setBrand("Tata");
        // System.out.println(obj.getBrand());

        obj.setModelName("Nexon");
        // System.out.println(obj.getModelName());

        obj.setPrice(10000);
        // System.out.println(obj.getPrice());
        System.out.println(obj.getBrand() + "'s" + " : " + obj.getModelName() + " : " + obj.getPrice());
    }
}
