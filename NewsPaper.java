import java.util.Date;

public class NewsPaper implements Media{
    private int paragraph;
    private String title;
    private String owner;

    public NewsPaper(int paragraph, String title, String owner) {
        this.paragraph = paragraph;
        this.title = title;
        this.owner = owner;
    }

    public int getParagraph() {
        return paragraph;
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
