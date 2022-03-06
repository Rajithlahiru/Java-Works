package exct;

public class Song {
    private String name;
    private String artist;
    private static int songCount =0;

    public Song(String name, String artist){
        this.name=name;
        this.artist=artist;
        songCount++;

        System.out.println("Song count: "+songCount);
    }
    public void setName(String name){
        this.name=name;
    }

    public String getNAme(){
        return name;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist(){
        return artist;
    }

    public int getSongCount(){
        return songCount;
    }
}
