package Language;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionSpoken;
    protected String wordOrder;
  
    Language(String inputName, int inputNumSpeakers, String inputRegionSpoken, String inputWordOrder){
      this.name = inputName;
      this.numSpeakers = inputNumSpeakers;
      this.regionSpoken = inputRegionSpoken;
      this.wordOrder = inputWordOrder;
    }
  
    public String getInfo(){
      return this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + "." + " The language follows the word order: " + this.wordOrder + ".";
    }
  
    public static void main(String[] args){
      //Language spanish = new Language("Spanish", 100, "Spain", "order");
      //spanish.getInfo();
      //Mayan kiche = new Mayan("Ki'che'", 2330000);
      //SinoTibetan chinese = new SinoTibetan("chinese", 5330000);
      SinoTibetan other = new SinoTibetan("other", 55);
      //System.out.println(kiche.getInfo());
      //System.out.println(chinese.getInfo());
      System.out.println(other.getInfo());
      
    }
  }