package inheritance;

public class Association {
    static void main(String[] args) {
        Developer d = new Developer("Google","Java");
        d.getLanguage();
        d.getCompany();
        System.out.println("Company name is..."+d.getCompany());
        System.out.println("Predfered languaggeis..."+d.getLanguage());
    }
}
