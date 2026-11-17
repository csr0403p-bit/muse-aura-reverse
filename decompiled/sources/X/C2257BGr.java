package X;

import kotlin.Unit;

/* renamed from: X.BGr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2257BGr {
    public static final C2257BGr A04 = new C2257BGr(null, null, null, null);
    public final G0U<C0Ou, Unit> A00;
    public final G0U<C0Ou, Unit> A01;
    public final G0U<C0Ou, Unit> A02;
    public final G0U<C0Ou, Unit> A03;

    public C2257BGr() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2257BGr) {
                C2257BGr c2257BGr = (C2257BGr) obj;
                if (this.A00 != c2257BGr.A00 || this.A01 != c2257BGr.A01 || this.A02 != c2257BGr.A02 || this.A03 != c2257BGr.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((C60R.A01(this.A00) * 31) + C60R.A01(this.A01)) * 31) + C60R.A01(this.A02)) * 31 * 31) + C60R.A01(this.A03)) * 31;
    }

    public C2257BGr(G0U g0u, G0U g0u2, G0U g0u3, G0U g0u4) {
        this.A00 = g0u;
        this.A01 = g0u2;
        this.A02 = g0u3;
        this.A03 = g0u4;
    }
}
