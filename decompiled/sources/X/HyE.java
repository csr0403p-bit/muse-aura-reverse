package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class HyE {
    public static final HyE A01;
    public static volatile HyE A02;
    public final Map A00;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        A01 = new HyE(true);
    }

    public static HyE A00() {
        HyE hyE;
        HyE hyE2 = A02;
        if (hyE2 != null) {
            return hyE2;
        }
        synchronized (HyE.class) {
            hyE = A02;
            if (hyE == null) {
                Class<?> cls = AbstractC10616Hyy.A00;
                if (cls != null) {
                    try {
                        hyE = (HyE) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                    A02 = hyE;
                } else {
                    hyE = A01;
                    A02 = hyE;
                }
            }
        }
        return hyE;
    }

    public HyE() {
        this.A00 = BV4.A0u();
    }

    public HyE(boolean z) {
        this.A00 = Collections.EMPTY_MAP;
    }
}
