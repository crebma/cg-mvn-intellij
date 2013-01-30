package com.example.cg_mvn_intellij;

import android.app.Activity;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {

    @Test
    public void extendsSherlockActivity() {
        assertThat(new MyActivity(), is(Activity.class));
    }

}
