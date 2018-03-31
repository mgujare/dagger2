package android.omg.com.dagger2.models;

import javax.inject.Inject;

/**
 * Created by mgujare on 3/31/18.
 */

public class HouseB {

    @Inject
    public HouseB() {

    }

    public void prepareForWar() {
        System.out.println("House B preparing for war");
    }

}
