class Person{

    //Functions in java are called as Methods because, That function is defined inside a class. And, Java by itself is a OOP language, we call functions, as Methods. 

    //First Method
    public void dance(){
        System.out.println("Dancing...");
    }

    //Second Method
    public void sing(){
        System.out.println("Singing...");
    }
}

class Methods{
    public static void main(String a[]){
        Person obj = new Person();
        obj.dance();
        obj.sing();
    }
}