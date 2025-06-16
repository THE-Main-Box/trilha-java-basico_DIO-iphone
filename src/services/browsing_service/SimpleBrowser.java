package services.browsing_service;

import java.util.ArrayList;
import java.util.List;

public class SimpleBrowser implements WebBrowser {
    private final List<Page> tabs = new ArrayList<>();
    private Page currentPage;

    @Override
    public void openURL(String url) {
        Page newPage = new Page(url);
        addTab(newPage);
        currentPage = newPage;
        // Agora o carregamento e renderização são explícitos
    }

    @Override
    public void search(String query) {
        String simulatedSearchURL = "https://www.search.com?q=" + query.replace(" ", "+");
        System.out.println("Pesquisando: " + query);
        openURL(simulatedSearchURL);
    }

    @Override
    public void addTab(Page page) {
        tabs.add(page);
        System.out.println("Nova aba adicionada: " + page.getUrl());
    }

    @Override
    public void refresh() {
        if (currentPage == null) {
            System.out.println("Nenhuma página ativa para recarregar.");
            return;
        }
        currentPage.reload();
    }

    public void loadCurrentPage() {
        if (currentPage == null) {
            System.out.println("Nenhuma página ativa para carregar.");
            return;
        }
        currentPage.load();
    }

    public void renderCurrentPage() {
        if (currentPage == null) {
            System.out.println("Nenhuma página ativa para renderizar.");
            return;
        }
        currentPage.render();
    }
}
