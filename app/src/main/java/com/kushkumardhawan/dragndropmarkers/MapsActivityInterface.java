package com.kushkumardhawan.dragndropmarkers;

import java.util.List;


/**
 * Created by kuush on 11/28/2016.
 */

public interface MapsActivityInterface {

    // Clear MapsActivity interface from old routes
    void clearPrevious();

    // Change MapsActivity interface to add new routes
    void addNewRoutes(List<Route> route);
}
