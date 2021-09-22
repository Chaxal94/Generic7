import java.util.Date;

public class Video implements Media {
    private double duration;
    private String title;
    private String owner;

    public Video(double duration, String title, String owner) {
        this.duration = duration;
        this.title = title;
        this.owner = owner;
    }

    public double getDuration() {
        return duration;
    }



    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Date getCreationDate() {
        return new Date();
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public void setOwner(String owner) {
       this.owner = owner;
    }
}
