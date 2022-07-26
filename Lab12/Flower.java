package hometask;

public class Flower extends Plant{
  private boolean hasSmell, hasThorn;

  
  public Flower(String name,String color,boolean hasSmell,boolean hasThorn){
      super(name,color);
      this.hasSmell=hasSmell;
      this.hasThorn=hasThorn;
  }
  public void setSmell(boolean hasSmell){
      this.hasSmell=hasSmell;
  }
  public void setThorn(boolean hasThorn){
      this.hasThorn=hasThorn;
  }
  public boolean getSmell(){
      return hasSmell;
  }
  public boolean getThorn(){
      return hasThorn;
  }
  @Override
  public String toString(){
      return super.toString()+"\nHasSmell: "+hasSmell+", HasThorn: "+hasThorn;
  }
}