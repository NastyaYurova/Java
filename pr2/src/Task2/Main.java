package Task2;

public class Main {
    public static void main(String[] args) {
        User user_1 = new User("woman");
        User user_2 = new User("man");

        if(user_1.getHuman()=="woman"){
            user_1.WearWoman();

        }
        else if (user_2.getHuman()=="man"){
            user_2.WearMen();
        }

        else {
            System.out.println("Ви вказали не вірну стать.");
        }
    }
}

