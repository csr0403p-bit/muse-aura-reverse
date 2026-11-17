package X;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* renamed from: X.Fxp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9067Fxp implements Fx5 {
    public static final C8993FwW<C9072Fxy> A04;
    public static final C8993FwW<C9072Fxy> A05;
    public static final C8993FwW<C9072Fxy> A06;
    public static final C9072Fxy A07 = AbstractC7608F5v.A0K(1000.0d);
    public final C9086FyD A00;
    public final C9072Fxy A01;
    public final Instant A02;
    public final ZoneOffset A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9067Fxp) {
                C9067Fxp c9067Fxp = (C9067Fxp) obj;
                if (!this.A01.equals(c9067Fxp.A01) || !this.A02.equals(c9067Fxp.A02) || !C7384Etj.areEqual(this.A03, c9067Fxp.A03) || !this.A00.equals(c9067Fxp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C9067Fxp(C9086FyD c9086FyD, C9072Fxy c9072Fxy, Instant instant, ZoneOffset zoneOffset) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A01 = c9072Fxy;
        this.A00 = c9086FyD;
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC9045FxR.A01(this);
            return;
        }
        AbstractC8873Frm.A01(c9072Fxy, (C9072Fxy) AbstractC7610F5x.A0s(c9072Fxy.A01, C9072Fxy.A03), "weight");
        AbstractC8873Frm.A02(c9072Fxy, A07, "weight");
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A00;
    }

    @Override // X.Fx5
    public final Instant ALd() {
        return this.A02;
    }

    @Override // X.Fx5
    public final ZoneOffset AMx() {
        return this.A03;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, (AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01)) + C60R.A01(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("WeightRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", weight=");
        AbstractC7608F5v.A1Q(sbA0x, this.A01);
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    static {
        Integer num = C79.A01;
        C9120Fyl c9120Fyl = C9072Fxy.A02;
        A04 = C8993FwW.A02(num, "Weight", "weight", new C8838Fqo(c9120Fyl, 16));
        A06 = C8993FwW.A00(C79.A0C, c9120Fyl, "Weight", "weight", 18);
        A05 = C8993FwW.A00(C79.A0K, c9120Fyl, "Weight", "weight", 17);
    }
}
