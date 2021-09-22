public class Main {
    public static void main(String[] args) {
       LibraryImpl<Book> bookLibrary = new LibraryImpl<>();
      Book book = new Book(8,"aiojoij","Nalad");
      Book book1 = new Book(18,"aAS","Talad");
      Book book2 = new Book(15,"aiDF","Galad");
      Book book3 = new Book(28,"SDij","Valad");

      System.out.println(book.getTitle());
      bookLibrary.add(book, bookLibrary.size()-1);
      bookLibrary.add(book1,bookLibrary.size()/2);
      bookLibrary.add(book2, (bookLibrary.size()/2)+1);
      bookLibrary.add(book3, (bookLibrary.size()/3+1));

        bookLibrary.delete(bookLibrary.size()-1);
        bookLibrary.size();
      System.out.println(bookLibrary.get(2));



         LibraryImpl<Video> videoLibrary = new LibraryImpl<>();
        Video video = new Video(3.5,"GAG","IOJOIJ");
        Video video1 = new Video(33.15,"Spl","AJN");
        Video video2 = new Video(13.5,"KLKJ","BG");
        Video video3 = new Video(31.5,"oSIJUHh","oIAJ");
        videoLibrary.add(video1,videoLibrary.size()+1);
        videoLibrary.add(video2,videoLibrary.size()+2);
        videoLibrary.add(video3,videoLibrary.size()/2);
        videoLibrary.add(video,videoLibrary.size()/2+1);
        videoLibrary.size();
        videoLibrary.delete(videoLibrary.size()/2);

         LibraryImpl<NewsPaper> newsPaperLibrary = new LibraryImpl<>();
        NewsPaper news = new NewsPaper(191,"HAUIh","AGUYg");
        NewsPaper news1 = new NewsPaper(211,"HaIh","dGUYg");
        NewsPaper news2 = new NewsPaper(411,"cHdUIh","bWEGUYg");
        NewsPaper news3= new NewsPaper(161,"HAcsUIh","AAGUYg");
        newsPaperLibrary.add(news,newsPaperLibrary.size()+1);
        newsPaperLibrary.add(news1,newsPaperLibrary.size()+1);
        newsPaperLibrary.add(news2,newsPaperLibrary.size()+2);
        newsPaperLibrary.add(news3,newsPaperLibrary.size()+3/2);

      newsPaperLibrary.size();newsPaperLibrary.delete(newsPaperLibrary.size()-3);






    }




}
