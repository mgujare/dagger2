package android.omg.com.dagger2.models;

import javax.inject.Inject;

/**
 * Created by mgujare on 3/31/18.
 */

public class HouseA {


    @Inject
    public HouseA() {
    }

    public void prepareForWar() {
        System.out.println("House A preparing for war");
    }

}
