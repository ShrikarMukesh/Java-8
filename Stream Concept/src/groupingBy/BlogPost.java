package groupingBy;

class BlogPost {
    String title;
    String author;
    BlogPostType type;
    int likes;
    
    public BlogPost(){
    	
    }
	public BlogPost(String title, String author, BlogPostType type, int likes) {
		super();
		this.title = title;
		this.author = author;
		this.type = type;
		this.likes = likes;
	}
    
}
enum BlogPostType {
    NEWS,
    REVIEW,
    GUIDE
}