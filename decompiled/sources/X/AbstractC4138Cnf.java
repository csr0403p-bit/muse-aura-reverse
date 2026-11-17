package X;

import android.os.Build;

/* renamed from: X.Cnf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4138Cnf {
    public static final int A00;

    static {
        A00 = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
