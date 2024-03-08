class typeConvertion{
    public static void main(String a[]){
        byte physics = 100;
        byte chemistry = 100;
        int result = physics + chemistry;
        System.out.println(result);
        System.out.println(((Object)result).getClass().getSimpleName());
    }
}