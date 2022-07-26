package hometask;

public class Plant{
  private String name;
  private String color;

  public Plant(String name,String color){
      this.name=name;
      this.color=color;
  }
  public void setName(String name){
      this.name=name;
  }
  public void setColor(String color){
      this.color=color;
  }
  public String getName(){
      return name;
  }
  public String getColor(){
      return color;
  }
  @Override
  public String toString(){
      return "Name: "+name+", Color: "+color;
  }
}