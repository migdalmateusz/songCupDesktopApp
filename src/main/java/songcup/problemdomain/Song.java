package songcup.problemdomain;

public class Song {

    private final String title;
    private int point;
    private final String video;

    public Song(String title, int point, String video) {
        this.title = title;
        this.point = point;
        this.video = video;
    }

    public String getTitle() {
        return title;
    }

    public String getVideo() {
        return video;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
