public class HDMovie implements Movie {
    private String tipe = "HDMovie";
    private String name;

    public HDMovie(String name){
    	this.name = name;
    }

    public String getType(){
    	return tipe;
    }
    public String getName(){
    	return name;
    }
  }