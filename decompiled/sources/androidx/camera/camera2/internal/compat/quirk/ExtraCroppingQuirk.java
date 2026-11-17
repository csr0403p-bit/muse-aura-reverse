package androidx.camera.camera2.internal.compat.quirk;

import X.BV4;
import X.BV6;
import X.BX1;
import android.os.Build;
import android.util.Range;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class ExtraCroppingQuirk implements BX1 {
    public static final Map<String, Range<Integer>> A00;

    public static boolean A00() {
        if (!BV6.A1a("samsung")) {
            return false;
        }
        Map<String, Range<Integer>> map = A00;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range<Integer> range = map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return BV6.A1V(range, Build.VERSION.SDK_INT);
    }

    static {
        HashMap mapA0u = BV4.A0u();
        A00 = mapA0u;
        mapA0u.put("SM-T580", null);
        mapA0u.put("SM-J710MN", new Range(21, 26));
        mapA0u.put("SM-A320FL", null);
        mapA0u.put("SM-G570M", null);
        mapA0u.put("SM-G610F", null);
        mapA0u.put("SM-G610M", new Range(21, 26));
    }
}
