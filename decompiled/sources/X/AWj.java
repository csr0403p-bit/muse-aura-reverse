package X;

import android.os.Build;
import android.window.BackEvent;

/* loaded from: classes4.dex */
public abstract class AWj {
    public static final C2193B9y A00(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new C2193B9y(backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L, backEvent.getProgress(), touchX, touchY);
    }
}
