package X;

import android.os.Build;

/* loaded from: classes4.dex */
public abstract class AfL {
    public static final AfK A00;

    static {
        String str = Build.FINGERPRINT;
        A00 = (str == null || !AnonymousClass001.A0u(str).equals("robolectric")) ? null : new AfK();
    }
}
