public class Main {
    public static void main(String[] args) {
        Cinderella[] cinderellas = new Cinderella[]{
                new Cinderella("olena",40,36),
                new Cinderella("daria",12,37),
                new Cinderella("ksenia",15,38),
                new Cinderella("katya",34,39),
                new Cinderella("maria",20,40),
        };
        Prince max = new Prince("Max", 16, 37);
        System.out.println(max.find(cinderellas));
    }
}
