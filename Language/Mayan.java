package Language;

class Mayan extends Language
{
    Mayan(String languageName, int speakers) 
    {
      super(languageName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public String getInfo() {
      return "Ki'che' is spoken by 2330000 people mainly in Central America. The language follows the word order: verb-object-subject. Fun fact: Ki'che' is an ergative language.";
      }
}