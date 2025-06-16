package components_model;

import services.media_service.model.base_model.Media;

import java.util.HashMap;
import java.util.Map;

public class MediaManagementComponent{
    /// Mapa de objetos do tipo midia, responsável por permitir um acesso fácil a qualquer arquivo dotado como 'Media'
    private final Map<String, Media> mediaMap;
    /// Arquivo 'Media' selecionado
    private Media currentMedia;

    public MediaManagementComponent() {
        mediaMap = new HashMap<>();
    }

    /// Adiciona um arquivo de midia
    public void addMedia(Media toAdd) {
        this.mediaMap.put(toAdd.getTitle(), toAdd);
    }

    /// determina a midia selecionada atualmente
    public void selectCurrentMediaByKey(String key){
        currentMedia = mediaMap.get(key);
    }

    /// Obtém o mapa de midias
    public Map<String, Media> getMediaMap() {
        return mediaMap;
    }

    /// Obtém a midia selecionada
    public Media getCurrentMedia() {
        return currentMedia;
    }

}
