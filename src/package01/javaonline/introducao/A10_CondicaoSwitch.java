package package01.javaonline.introducao;

public class A10_CondicaoSwitch {
    public static void main(String[] args) {

        byte day = 4;
        String msg;
        //byte, short, int, char, String and enum
        switch(day){
            case 1:
                msg = "Sunday";
                break;
            case 2:
                msg = "MOnday";
                break;
            case 3:
                msg = "Tuesday";
                break;
            case 4:
                msg = "Wednesday";
                break;
            case 5:
                msg = "Thursday";
                break;
            case 6:
                msg = "Friday";
                break;
            case 7:
                msg = "Sunturday";
                break;
            default:
                msg = "Day doesn´t exist";
                break;
        }
        System.out.println(msg);
    }
}
