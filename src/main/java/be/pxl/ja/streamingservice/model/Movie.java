package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable{
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie(String title, Rating maturityRating) {
        super(title , maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime(){
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime () {
        if (this.duration == 0){
            return "?";
        } else if (this.duration < 60){
            return Integer.toString(this.duration) + " min";
        } else if (this.duration > 60 && this.duration % 60 == 0){
            return Integer.toString((this.duration / 60)) + " h";
        } else {
            return Integer.toString((this.duration / 60)) + " h " + Integer.toString((this.duration % 60)) + " min";
        }
    }

    public void setDuration(int duration) {
        this.duration = Math.abs(duration);
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        if (this.releaseDate != null){
            return super.toString() + " (" + this.releaseDate.getYear() + ")";
        } else {
            return super.toString();
        }
    }
}
