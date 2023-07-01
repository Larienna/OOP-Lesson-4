package Task3;

/**
 * Using java IntelliJ IDEA, create a project. Required: Create 2 Playable and Recordable interfaces.
 * In each of the interfaces, create 3 void play() / void pause() / void stop()
 * and void record() / void pause() / void stop() methods, respectively.
 * Create a Player class derived from the Playable and Recordable base interfaces.
 * Write a program that performs playback and recording.
 */

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.pause();
        player.stop();
        System.out.println("\t");
        player.record();
        player.pause();
        player.stop();
    }
}
