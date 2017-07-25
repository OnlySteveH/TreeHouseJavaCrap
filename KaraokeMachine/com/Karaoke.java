import teamtreehouse.model.Song;
import teamtreehouse.model.SongBook;

public class Karaoke {

  public static void main(String[] args) {
    Song song = new Song("Michael Jackson", "Beat It", "https://www.youtube.com/watch?v=T2PAkPp0_bY");
    SongBook songBook = new SongBook();
    System.out.printf("Adding %s %n", song);
    songBook.addSong(song);
    System.out.printf("There are %d songs. %n", songBook.getSongCount());
  }
}
