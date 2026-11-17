package X;

import java.util.List;

/* loaded from: classes6.dex */
public abstract class FA6 {
    public static final FDW A01(FDW fdw, List<?> list, int i, boolean z) {
        FDW fdwA00;
        if (list != null) {
            if (i < list.size() && (fdwA00 = FA7.A00(list, i, z)) != null && fdwA00.A04 == fdw.A04) {
                return fdwA00;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                FDW fdwA002 = FA7.A00(list, i2, z);
                if (fdwA002 != null && fdwA002.A04 == fdw.A04) {
                    return fdwA002;
                }
            }
        }
        return null;
    }

    public static final FDW A00(FDW fdw, FDW fdw2, Object obj, int i) {
        if (fdw != fdw2 || !F8G.A00(FDW.A01(fdw2, i), obj)) {
            if (fdw == fdw2) {
                fdw = new FDW(fdw2, fdw2, fdw2.A09, fdw2.A04);
            }
            AbstractC7607F5u.A1M(fdw, obj, i);
        }
        return fdw;
    }
}
