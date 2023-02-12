public class Guitar implements TheTool{
    int number_of_strings;

    public Guitar(int number_of_strings) {
        this.number_of_strings = number_of_strings;
    }

    public int getNumber_of_strings() {
        return number_of_strings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн" + getNumber_of_strings());
    }
}