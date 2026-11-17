package X;

import android.os.Build;

/* renamed from: X.5Q7, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C5Q7 {
    static {
        if (Build.VERSION.SDK_INT >= 30) {
            Hr0.A00(30);
            Hr0.A00(31);
            Hr0.A00(33);
            Hr0.A00(1000000);
        }
    }

    public static final boolean A00() {
        return Build.VERSION.SDK_INT >= 36 && C5Q6.A00() >= 3600001;
    }
}
