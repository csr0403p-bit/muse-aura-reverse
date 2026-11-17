package X;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: X.FWl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8147FWl extends Hx6 {
    public static final boolean A00() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
    }
}
