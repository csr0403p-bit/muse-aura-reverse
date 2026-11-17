package X;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public abstract class FUM {
    public static Map<VelocityTracker, FUP> A00 = Collections.synchronizedMap(new WeakHashMap());

    public static float A00(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return FUS.A00(velocityTracker, i);
        }
        FUP fup = A00.get(velocityTracker);
        if (fup == null || i != 26) {
            return 0.0f;
        }
        return fup.A00;
    }

    public static void A01(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT >= 34 || motionEvent.getSource() != 4194304) {
            return;
        }
        Map<VelocityTracker, FUP> map = A00;
        if (!map.containsKey(velocityTracker)) {
            map.put(velocityTracker, new FUP());
        }
        FUP fup = map.get(velocityTracker);
        long eventTime = motionEvent.getEventTime();
        int i = fup.A02;
        if (i != 0 && eventTime - fup.A04[fup.A01] > 40) {
            fup.A02 = 0;
            i = 0;
            fup.A00 = 0.0f;
        }
        int i2 = (fup.A01 + 1) % 20;
        fup.A01 = i2;
        if (i != 20) {
            fup.A02 = i + 1;
        }
        fup.A03[i2] = motionEvent.getAxisValue(26);
        fup.A04[fup.A01] = eventTime;
    }
}
