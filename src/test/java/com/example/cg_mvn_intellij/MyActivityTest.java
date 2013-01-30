package com.example.cg_mvn_intellij;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Button;
import com.actionbarsherlock.app.SherlockActivity;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import com.xtremelabs.robolectric.shadows.ShadowAlertDialog;
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

    @Test
    public void getTheLastActivityBuilder() {
        MyActivity myActivity = new MyActivity();

        myActivity.onCreate(null);

        AlertDialog latestAlertDialog = ShadowAlertDialog.getLatestAlertDialog();
        Button button = latestAlertDialog.getButton(DialogInterface.BUTTON_NEUTRAL);
        assertThat(button.getText().toString(), is("foo"));
    }

}
