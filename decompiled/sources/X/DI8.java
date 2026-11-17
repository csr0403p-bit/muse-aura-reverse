package X;

import android.os.Trace;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class DI8 {
    public static boolean A00;

    public static final void A00() {
        if (A00 && Trace.isEnabled()) {
            Trace.endSection();
        }
    }

    public static final void A01(String str) {
        if (A00 && Trace.isEnabled()) {
            Trace.beginSection(str);
        }
    }

    public static final void A02(String str, Object obj) {
        if (A00 && Trace.isEnabled()) {
            Trace.beginSection(String.format(Locale.US, str, Arrays.copyOf(new Object[]{obj}, 1)));
        }
    }
}
