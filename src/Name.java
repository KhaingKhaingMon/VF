public class Name {
    static void myName() {
        System.out.println("My name is VegetarianFalcon!");
    }

    static void yourName(){
        System.out.println ("What is your name?");
    }

    static void callMe(String name){
        System.out.println ("Hey " + name);
    }

    public static void main(String[] args) {
        myName();
        callMe("Friend");
        yourName();
    }
}
