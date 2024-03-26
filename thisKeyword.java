class Car{
    //Instance Variable
    private String brand;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;

        //the this keyword is a reference to the current instance of the class. It can be used inside any method to refer to the current object which is calling the method. Referencing instance variables: When there is a local variable with the same name as an instance variable, you can use this to refer to the instance variable. 

    }
}

public class thisKeyword{
    public static void main(String args[]){
        Car obj = new Car();
        obj.setBrand("Hyundai");
        System.out.println(obj.getBrand());
    }
}
