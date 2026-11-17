package X;

import java.util.Map;

/* renamed from: X.FCa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7724FCa {
    public static C7747FCz A00;
    public static final Map<String, C7747FCz> A01 = C3cG.A0j();

    public static final C7747FCz A00(String str, boolean z) {
        C7747FCz c7747FCz = A00;
        if (c7747FCz == null || !str.equals(c7747FCz.A03) || (!z && c7747FCz.A08)) {
            c7747FCz = A01.get(str);
            if (c7747FCz == null) {
                return null;
            }
            if (!z) {
                if (c7747FCz.A08) {
                    return null;
                }
                return c7747FCz;
            }
        }
        return c7747FCz;
    }
}
