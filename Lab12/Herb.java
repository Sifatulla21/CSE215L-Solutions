package hometask;

public class Herb extends Plant{
  private boolean isMedicinal;
  private String season;

  public Herb(String name,String color,boolean isMedicinal,String season){
      super(name,color);
       this.isMedicinal=isMedicinal;
      this.season=season;
  }
  public void setMedicinal(boolean isMedicinal){
      this.isMedicinal=isMedicinal;
  }
  public void setSeason(String season){
      this.season=season;
  }
  public boolean getMedicinal(){
      return isMedicinal;
  }
  public String getSeason(){
      return season;
  }
  @Override
  public String toString(){
      return super.toString()+"\nIsMedicinal: "+isMedicinal+", Season: "+season;
  }
}