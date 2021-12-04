package package01.javaonline.introduction;

public class A9_CondictionIFCompoud {
    public static void main(String[] args) {
        byte age = 40;
        String person;

        if(age < 12){
            person = "Child";
        }else if(age >= 12 && age < 18){
            person = "Tennager";
        }else{
            person = "Adult";
        }
        System.out.println(person);

        String msg = (age > 80) ? "Elderly" : "No elderly";
        System.out.print(msg);
    }
}
