public class Prince extends Human{
    private int foundfootsize;

    public Prince() {
    }

    public Prince(String name, int age, int footSize) {
        super(name, age);
        this.foundfootsize = footSize;
    }
    public String find(Cinderella[] all){
        for (Cinderella cinderella : all) {
            if (cinderella.getFootSize()== this.foundfootsize){
                return cinderella.toString();
            }
        }
        return "Not Found";
    }

    public int getFootSize() {
        return foundfootsize;
    }

    public void setFootSize(int foundfootsize) {
        this.foundfootsize = foundfootsize;
    }

    @Override
    public String toString() {
        return "Cinderella{" +
                "foundfootsize=" + foundfootsize +
                "} " + super.toString();
    }
}



