package X;

import android.app.ActivityThread;

/* loaded from: classes5.dex */
public abstract class BXw {
    public static ActivityThread A00;

    public static final ActivityThread A00() {
        ActivityThread activityThread = A00;
        if (activityThread != null) {
            return activityThread;
        }
        ActivityThread activityThreadCurrentActivityThread = ActivityThread.currentActivityThread();
        A00 = activityThreadCurrentActivityThread;
        return activityThreadCurrentActivityThread;
    }

    public static final void A01(ActivityThread activityThread) {
        A00 = activityThread;
    }
}
