package X;

import java.util.List;

/* renamed from: X.Ah5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1319Ah5 {
    public boolean A00;
    public final C1685AoO<C1299Agk> A01;
    public final C1320Ah6 A02;

    public final boolean A00(long j) {
        C1313Agy c1313Agy;
        List<C1313Agy> list = this.A02.A01;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1313Agy = null;
                break;
            }
            c1313Agy = list.get(i);
            if (c1313Agy.A03 == j) {
                break;
            }
            i++;
        }
        C1313Agy c1313Agy2 = c1313Agy;
        if (c1313Agy2 != null) {
            return c1313Agy2.A0B;
        }
        return false;
    }

    public C1319Ah5(C1685AoO<C1299Agk> c1685AoO, C1320Ah6 c1320Ah6) {
        this.A01 = c1685AoO;
        this.A02 = c1320Ah6;
    }
}
