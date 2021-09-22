import java.util.Date;

public interface Media {
    String getTitle();
    void setTitle(String title);
    Date getCreationDate();
    String getOwner();
    void setOwner(String owner);
}
