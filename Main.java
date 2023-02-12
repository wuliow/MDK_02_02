public class Main {

    public static void main(String[] args) {
        
        Guitar guitar = new Guitar(7);
        Trumpet trumpet = new Trumpet(3);
        Drum drum = new Drum(10);

        TheTool[] theTool = {guitar, trumpet, drum};

        for(TheTool s: theTool) {
            s.play();
        }
    }
}