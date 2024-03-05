class Person{
    public void singAsong(){
        System.out.println("Singing Nenje Yezhuu");
    }

    public void dance(){
        System.out.println("Dancing for Katchi sera");
    }
}

class ClassAndObjectsNew{
    public static void main(String a[]){
        Person obj = new Person();
        obj.singAsong();
        obj.dance();

    }
}