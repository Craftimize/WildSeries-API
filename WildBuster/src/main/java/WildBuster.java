package xyz.wildseries.wildbuster.api;

import xyz.wildseries.wildbuster.api.handlers.BustersManager;

public interface WildBuster {

    /**
     * Get the busters manager class.
     *
     * @return {@link BustersManager} object
     */
    BustersManager getBustersManager();

}
