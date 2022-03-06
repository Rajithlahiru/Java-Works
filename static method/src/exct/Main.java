package exct;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("Prathihari","Supun perera");
        Song song2 = new Song("Viramaye","Ridma weerawardhana");

        System.out.println(song1.getSongCount());
        System.out.println(song2.getSongCount());
    }
}
