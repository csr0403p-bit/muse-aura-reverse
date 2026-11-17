package X;

import android.os.Build;

/* renamed from: X.5Q6, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class C5Q6 {
    public static /* synthetic */ int A00() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL;
    }
}
