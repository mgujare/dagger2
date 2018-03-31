package android.omg.com.dagger2.models;

import javax.inject.Inject;

/**
 * Created by mgujare on 3/31/18.
 */

public class War {

    private HouseA houseA;
    private HouseB houseB;
    private boolean isReady;

    @Inject
    public War(HouseA a, HouseB b) {
        this.houseA = a;
        this.houseB = b;
    }

    public void getReady() {
        System.out.println("Houses ready for war");
        isReady = true;
    }

    public boolean isReady() {
        return this.isReady;
    }
}
