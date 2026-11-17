package X;

import android.os.StrictMode;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public abstract class CBP {
    public static Method A00;
    public static final boolean A01;

    static {
        boolean z;
        try {
            A00 = StrictMode.VmPolicy.Builder.class.getMethod("permitNonSdkApiUsage", null);
            z = true;
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            CFK.A05("StrictModeAllowHiddenApis", "Could not find needed StrictMode allow hidden apis");
            z = false;
        }
        A01 = z;
    }
}
