package X;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Frm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8873Frm {
    public static final <T extends Comparable<? super T>> void A02(T t, T t2, String str) {
        C7384Etj.A0Y(t, 0);
        if (t.compareTo(t2) <= 0) {
            return;
        }
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append(" must not be more than ");
        sbA0g.append(t2);
        sbA0g.append(", currently ");
        sbA0g.append(t);
        throw C8j3.A0x(sbA0g);
    }

    public static final void A03(String str, double d) {
        if (d < 0.0d) {
            throw C60Q.A0U(str, " must not be negative");
        }
    }

    public static final boolean A04() {
        return BV5.A1P(SdkExtensions.getExtensionVersion(34), 13);
    }

    public static final boolean A05() {
        return BV5.A1P(SdkExtensions.getExtensionVersion(34), 15);
    }

    public static final boolean A06() {
        return Build.VERSION.SDK_INT >= 36 || SdkExtensions.getExtensionVersion(34) >= 16;
    }

    public static final Map<Integer, String> A00(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(setEntrySet));
        Iterator<Map.Entry<String, Integer>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            AbstractC7611F5y.A17(linkedHashMapA15, it);
        }
        return linkedHashMapA15;
    }

    public static final <T extends Comparable<? super T>> void A01(T t, T t2, String str) {
        AnonymousClass003.A0u(t, t2);
        if (t.compareTo(t2) >= 0) {
            return;
        }
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append(" must not be less than ");
        sbA0g.append(t2);
        sbA0g.append(", currently ");
        sbA0g.append(t);
        throw C8j3.A0x(sbA0g);
    }
}
