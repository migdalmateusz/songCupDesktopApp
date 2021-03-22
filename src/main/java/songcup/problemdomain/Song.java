package songcup.problemdomain;

public class Song {

    private final String title;
    private int point;

    public Song(String title, int point) {
        this.title = title;
        this.point = point;
    }

    public String getTitle() {
        return title;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
