class NewSwitchCase{
    public static void main(String args[]){
        String day = "Tuesday";
        ///Waking up time

        //A Switch case without using break.
        switch(day){
            case "Monday" -> System.out.println("6am");
            case "Tuesday" -> System.out.println("7am");
            default -> System.out.println("5am");
        }

        //Switch case if it returns a value back.
        String result = switch(day){
            case "Monday" -> ("6am");
            case "Tuesday" -> ("7am");
            default -> ("5am");
        };
        System.out.println(result);

        //Switch case if you want to use ":" insted of "->"
        String result = switch(day){
            case "Monday": yield "6am";
            case "Tuesday": yield "7am";
            default: yield "5am";
        };

        System.out.println(result);
    }
}