package opps;

public class Developer extends Employee{
    private String language;

    public Developer(String company, String language) {
        super(company);
        this.language = language;
    }
    public void setLanguage(String language){
        this.language=language;
    }
    public String getLanguage(){
        return language;
    }
}
