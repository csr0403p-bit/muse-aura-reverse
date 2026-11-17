package X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes4.dex */
public abstract class AIA {
    public static final B8w A00;

    static {
        Object objA0s;
        try {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, Looper.getMainLooper());
            C7384Etj.A0Z(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            objA0s = new B8t((Handler) objInvoke, null, false);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        A00 = (B8w) (objA0s instanceof C10571Hud ? null : objA0s);
    }
}
