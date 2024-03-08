class Sum{
    public void add(int x, int y, int z){ //x,y,z are Local Variables
        //int num; //Instance Varibale. (Var which are defined inside a class but outside any methods.)
        int result = x + y + z;
        System.out.println(result);
    }

    public void add(int x, int y){
        int result = x + y;
        System.out.println(result);
    }
}

class Demo{
    public static void main(String a[]){
        Sum obj = new Sum();
        obj.add(1,2,3);
        obj.add(1,2);
    }
}