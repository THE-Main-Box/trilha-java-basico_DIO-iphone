package services.browsing_service;


public class Page {
    private String url;
    private String content;
    private boolean isLoaded;

    public Page(String url) {
        this.url = url;
        this.isLoaded = false;
    }

    public void load() {
        // Simula o carregamento da página
        System.out.println("Carregando página: " + url);
        this.content = "Conteúdo simulado da URL: " + url;
        this.isLoaded = true;
    }

    public void render() {
        if (!isLoaded) {
            System.out.println("Página ainda não carregada.");
            return;
        }
        System.out.println("Renderizando conteúdo da página:");
        System.out.println(content);
    }

    public String getUrl() {
        return url;
    }

    public boolean isLoaded() {
        return isLoaded;
    }

    public void reload() {
        System.out.println("Recarregando página: " + url);
        load();
    }
}
