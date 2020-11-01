
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       int index = 0;
       int id =1;
       
       
       Article[] articles = new Article[10];
       
       
       Article a1 =new Article();
       a1.setId(id);
       a1.setTitle("제목1");
       a1.setBody("내용1");
    		  
       articles[index] = a1;
       index++;
       id++;
       
       Article a2 =new Article();
       a2.setId(id);
       a2.setTitle("제목2");
       a2.setBody("내용2");
    	
       articles[index] = a2;
       index++;
       id++;
       
       
       for(int i=0; i <index; i++) {
    	   Article a = articles[i];
    	   System.out.println(a.getId());
    	   System.out.println(a.getTitle());
    	   System.out.println(a.getBody());
    	   System.out.println("==========");
       }
	}

}




class Article{//alt+s+r 동시에 
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	private String title;
	private String body;
}