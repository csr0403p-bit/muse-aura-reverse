package X;

import android.os.Build;

/* renamed from: X.DyI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6225DyI {
    public static boolean A00(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
