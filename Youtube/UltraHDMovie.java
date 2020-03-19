public class UltraHDMovie implements Movie {
    private String tipe = "UltraHDMovie";
    private String name;

    public UltraHDMovie(String name){
    	this.name = name;
    }

    public String getType(){
    	return tipe;
    }
    public String getName(){
    	return name;
    }
  }