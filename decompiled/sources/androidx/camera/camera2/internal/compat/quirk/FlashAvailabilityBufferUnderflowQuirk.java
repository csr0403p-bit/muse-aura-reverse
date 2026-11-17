package androidx.camera.camera2.internal.compat.quirk;

import X.BV4;
import X.BX1;
import X.C60O;
import android.util.Pair;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes5.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements BX1 {
    public static final Set<Pair<String, String>> A00;

    static {
        HashSet hashSetA13 = C60O.A13();
        A00 = hashSetA13;
        Locale locale = Locale.US;
        hashSetA13.add(BV4.A0A("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        A00.add(BV4.A0A("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
