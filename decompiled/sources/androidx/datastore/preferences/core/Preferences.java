package androidx.datastore.preferences.core;

import X.C6JZ;
import X.C6O2;
import X.C7384Etj;
import java.util.Collections;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class Preferences {
    public abstract <T> T A06(C6JZ<T> c6jz);

    public final C6O2 A04() {
        return new C6O2(new LinkedHashMap(Collections.unmodifiableMap(((C6O2) this).A00)), false);
    }

    public final C6O2 A05() {
        return new C6O2(new LinkedHashMap(Collections.unmodifiableMap(((C6O2) this).A00)), true);
    }

    public static boolean A03(C6JZ c6jz, Preferences preferences, Object obj) {
        return C7384Etj.areEqual(preferences.A06(c6jz), obj);
    }
}
