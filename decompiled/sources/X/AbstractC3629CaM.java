package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: X.CaM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3629CaM {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static Boolean A03;

    public static boolean A00(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (A00 == null) {
            A00 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean boolValueOf = A01;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            A01 = boolValueOf;
        }
        return boolValueOf.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }
}
