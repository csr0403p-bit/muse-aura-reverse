package X;

import java.util.LinkedHashMap;

/* renamed from: X.DEb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4908DEb {
    public final boolean A03;
    public final C4907DEa A01 = new C4907DEa();
    public final C4907DEa A00 = new C4907DEa();
    public final LinkedHashMap<Long, C4909DEc> A02 = C3cG.A0j();

    public final synchronized void A01() {
        if (this.A03) {
            C4907DEa.A00(this.A01);
            C4907DEa.A00(this.A00);
        }
    }

    public final synchronized void A02(long j) {
        C4909DEc c4909DEc = this.A02.get(Long.valueOf(j));
        if (c4909DEc != null) {
            c4909DEc.A01 = true;
        }
    }

    public C4908DEb(boolean z) {
        this.A03 = z;
    }

    public static C4907DEa A00(C4908DEb c4908DEb, Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return c4908DEb.A01;
        }
        if (iIntValue == 1) {
            return c4908DEb.A00;
        }
        throw C60Q.A0U("Unsupported track: ", AbstractC4911DEe.A00(num));
    }
}
