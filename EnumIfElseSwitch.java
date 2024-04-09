enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
};

public class EnumIfElseSwitch {
    public static void main(String args[]){

        //ENUM IF AND ELSE
        // Day day = Day.Wednesday;
        // if(day == Day.Monday){
        //     System.out.println("Monday");
        // }
        // else if(day == Day.Tuesday){
        //     System.out.println("Tuesday");
        // }
        // //Remaining code goes.
        // else{
        //     System.out.println("Sunday");
        // }

        Day day = Day.Monday;
        switch (day) {
            case Monday:
                System.out.println("Monday");
                break;
            case Tuesday:
                System.out.println("Tuesday");
                break;
            case Wednesday:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Sunday");
                break;
        }
    }
}
