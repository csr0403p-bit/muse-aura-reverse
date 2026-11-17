package X;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes6.dex */
public final class HsB {
    public final C8359FcY A00;

    public HsB(Activity activity) {
        this.A00 = Build.VERSION.SDK_INT >= 31 ? new C8360FcZ(activity) : new C8359FcY(activity);
    }
}
