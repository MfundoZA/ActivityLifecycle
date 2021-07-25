package com.mfundoza.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /** The onCreate method is the first method called in the Activity lifecycle and should be used
     *  to run code the needs to run once in the Activity's lifecycle i.e creating View instances
     *  and essential resources that are required even if the user leaves the Activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show();
    }

    /** The onCreate method is the second method called in the Activity lifecycle and should be
     *  used to draw visual elements(?) and to run animations.
     */
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show();
    }

    /** The onResume method is the third method called in the Activity lifecycle and is an
     * indicator that the activity became active and ready to receive input. It is on top of an
     * activity stack and visible to user.
     */
    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    /** The onPause() method to pause or adjust operations that should not continue (or should
     *  continue in moderation) while the Activity is in the Paused state, and that you expect to
     *  resume shortly. Use the onPause() method to pause or adjust operations that should not
     *  continue (or should continue in moderation) while the Activity is in the Paused state,
     *  and that you expect to resume shortly.
     *
     *  this method as the first indication that the user is leaving your activity
     *  (though it does not always mean the activity is being destroyed); it indicates that the
     *  activity is no longer in the foreground (though it may still be visible if the user is in
     *  multi-window mode).
     *
     *  You can also use the onPause() method to release system resources, handles to sensors
     *  (like GPS), or any resources that may affect battery life while your activity is paused and
     *  the user does not need them. However, as mentioned above in the onResume() section, a Paused
     *  activity may still be fully visible if in multi-window mode. As such, you should consider
     *  using onStop() instead of onPause() to fully release or adjust UI-related resources and
     *  operations to better support multi-window mode.
     *
     *  onPause() execution is very brief, and does not necessarily afford enough time to perform
     *  save operations. For this reason, you should not use onPause() to save application or user
     *  data, make network calls, or execute database transactions; such work may not complete
     *  before the method completes. Instead, you should perform heavy-load shutdown operations
     *  during onStop().
     */
    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    /** When your activity is no longer visible to the user, it has entered the Stopped state, and
     * the system invokes the onStop() callback. This may occur, for example, when a newly launched
     * activity covers the entire screen. The system may also call onStop() when the activity has
     * finished running, and is about to be terminated.
     *
     * In the onStop() method, the app should release or adjust resources that are not needed while
     * the app is not visible to the user. For example, your app might pause animations or switch
     * from fine-grained to coarse-grained location updates. Using onStop() instead of onPause()
     * ensures that UI-related work continues, even when the user is viewing your activity in
     * multi-window mode.
     *
     * You should also use onStop() to perform relatively CPU-intensive shutdown operations. For
     * example, if you can't find a more opportune time to save information to a database, you might
     * do so during onStop().
     */
    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    /** onDestroy() is called before the activity is destroyed. The system invokes this callback
     *  either because:
     *      1. the activity is finishing (due to the user completely dismissing the activity or due
     *      to finish() being called on the activity), or
     *
     *      2. the system is temporarily destroying the activity due to a configuration change
     *      (such as device rotation or multi-window mode)
     *
     *  Instead of putting logic in your Activity to determine why it is being destroyed you should
     *  use a ViewModel object to contain the relevant view data for your Activity. If the Activity
     *  is going to be recreated due to a configuration change the ViewModel does not have to do
     *  anything since it will be preserved and given to the next Activity instance. If the Activity
     *  is not going to be recreated then the ViewModel will have the onCleared() method called
     *  where it can clean up any data it needs to before being destroyed.
     *
     *  You can distinguish between these two scenarios with the isFinishing() method.
     *
     *  If the activity is finishing, onDestroy() is the final lifecycle callback the activity
     *  receives. If onDestroy() is called as the result of a configuration change, the system
     *  immediately creates a new activity instance and then calls onCreate() on that new instance
     *  in the new configuration.
     *
     *  The onDestroy() callback should release all resources that have not yet been released by
     *  earlier callbacks such as onStop().
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}