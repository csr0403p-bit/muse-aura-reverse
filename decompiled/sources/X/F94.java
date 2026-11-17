package X;

import java.util.AbstractCollection;

/* loaded from: classes6.dex */
public interface F94 {
    Integer ARK();

    String AXk();

    Integer AXl();

    F95 AXm();

    void Afp();

    static Boolean A00(F94 f94) {
        return Boolean.valueOf(f94.AXm().A5I());
    }

    static String A01(F94 f94) {
        if (f94.AXm().AOn()) {
            return null;
        }
        return f94.AXm().AgW();
    }

    static void A02(F94 f94, AbstractCollection abstractCollection) {
        String strAgW;
        if (f94.AXm().AOn() || (strAgW = f94.AXm().AgW()) == null) {
            return;
        }
        abstractCollection.add(strAgW);
    }
}
