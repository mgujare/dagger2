package android.omg.com.dagger2;

import android.omg.com.dagger2.models.DaggerWarComponent;
import android.omg.com.dagger2.models.War;
import android.omg.com.dagger2.models.WarComponent;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by mgujare on 3/31/18.
 */

public class WarTest {

    @Test
    public void testWarReady() {
        WarComponent warComponent = DaggerWarComponent.create();
        War war = warComponent.getWar();
        war.getReady();
        Assert.assertTrue(war.isReady());
    }
}
