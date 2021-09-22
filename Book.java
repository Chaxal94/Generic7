import java.util.Date;

public class Book implements Media  {
    private int pageCount;
    private String title;
    private String owner;

    public Book(int pageCount, String title, String owner) {
        this.pageCount = pageCount;
        this.title = title;
        this.owner = owner;
    }

    public int getPageCount() {
        return pageCount;
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



