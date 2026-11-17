package X;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Map;

/* renamed from: X.Frj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8870Frj implements Fx5 {
    public static final Map<Integer, String> A04;
    public static final Map<String, Integer> A05;
    public final int A00;
    public final C9086FyD A01;
    public final Instant A02;
    public final ZoneOffset A03;

    static {
        Map<String, Integer> mapA0d = AnonymousClass007.A0d("unprotected", 2, C3cG.A0r("protected", BV4.A0W()));
        A05 = mapA0d;
        A04 = AbstractC8873Frm.A00(mapA0d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8870Frj) {
                C8870Frj c8870Frj = (C8870Frj) obj;
                if (this.A00 != c8870Frj.A00 || !this.A02.equals(c8870Frj.A02) || !C7384Etj.areEqual(this.A03, c8870Frj.A03) || !this.A01.equals(c8870Frj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9011Fwo
    public final C9086FyD AHf() {
        return this.A01;
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
        return AnonymousClass005.A0G(this.A01, (AnonymousClass005.A0F(this.A02, this.A00 * 31) + C60R.A01(this.A03)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SexualActivityRecord(time=");
        AbstractC7608F5v.A1R(sbA0x, this.A02);
        sbA0x.append(this.A03);
        sbA0x.append(", protectionUsed=");
        AbstractC7608F5v.A1N(sbA0x, this.A00);
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C8870Frj(C9086FyD c9086FyD, Instant instant, ZoneOffset zoneOffset, int i) {
        this.A02 = instant;
        this.A03 = zoneOffset;
        this.A01 = c9086FyD;
        this.A00 = i;
    }
}
