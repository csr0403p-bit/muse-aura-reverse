package X;

import java.util.List;

/* renamed from: X.Ade, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1175Ade {
    public static final int A00(C2A9 c2a9) {
        C1161Act c1161Act = (C1161Act) c2a9;
        List<C1160Acs> list = c1161Act.A0D;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += list.get(i2).A09;
        }
        return (i / list.size()) + c1161Act.A04;
    }
}
