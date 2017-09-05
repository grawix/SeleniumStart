package page;

public class SearchResultPage extends BasePage {
    private final String title = "Search - My Store";

    public SearchResultPage(){
        super();
    }

    public boolean isCorrectPage(){
        return getTitle().equals(title);
    }
}
