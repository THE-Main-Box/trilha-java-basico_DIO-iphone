package services.browsing_service;

public interface WebBrowser {
    void openURL(String url);
    void search(String query);
    void addTab(Page page);
    void refresh();
}
