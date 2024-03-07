class Sum{
    public void add(int x, int y, int z){
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