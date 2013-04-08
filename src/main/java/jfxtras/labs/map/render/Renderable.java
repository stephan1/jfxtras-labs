package jfxtras.labs.map.render;

import jfxtras.labs.map.MapControlable;

/**
 * Common interface for renderable objects.
 * 
 * @author msc
 */
public interface Renderable {

    /**
     * Paints the map marker on the map. 
     *
     * @param group
     * @param mapController
     */
    void render(MapControlable mapController);
    
}
