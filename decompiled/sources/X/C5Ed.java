package X;

import android.os.Build;

/* renamed from: X.5Ed, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C5Ed {
    public static String A00(int i) {
        return i == 14 ? "freezer" : Build.VERSION.SDK_INT >= 34 ? C5Ee.A00(i) : "unexplained";
    }
}
