package Modules;

import java.util.List;

/**
 * Created by user on 14/6/2017.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
