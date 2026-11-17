package X;

import com.google.common.base.Objects;
import com.google.common.collect.Multisets$ImmutableEntry;

/* loaded from: classes5.dex */
public abstract class DPD {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A00() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.DQJ
            if (r0 == 0) goto L15
            X.DQJ r5 = (X.DQJ) r5
            X.DQF r2 = r5.A00
            int r0 = r2.A01
            if (r0 != 0) goto L14
            com.google.common.collect.TreeMultiset r1 = r5.A01
            E r0 = r2.A08
            int r0 = r1.A7Q(r0)
        L14:
            return r0
        L15:
            boolean r0 = r5 instanceof X.C5030DPp
            if (r0 == 0) goto L47
            X.DPp r5 = (X.C5030DPp) r5
            int r4 = r5.A00
            r3 = -1
            if (r4 == r3) goto L32
            X.DPt r2 = r5.A02
            int r0 = r2.A02
            if (r4 >= r0) goto L32
            K r1 = r5.A01
            java.lang.Object[] r0 = r2.A07
            r0 = r0[r4]
            boolean r0 = com.google.common.base.Objects.equal(r1, r0)
            if (r0 != 0) goto L3c
        L32:
            X.DPt r2 = r5.A02
            K r0 = r5.A01
            int r0 = r2.A04(r0)
            r5.A00 = r0
        L3c:
            int r1 = r5.A00
            if (r1 != r3) goto L42
            r0 = 0
            return r0
        L42:
            int[] r0 = r2.A05
            r0 = r0[r1]
            return r0
        L47:
            com.google.common.collect.Multisets$ImmutableEntry r5 = (com.google.common.collect.Multisets$ImmutableEntry) r5
            int r0 = r5.count
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DPD.A00():int");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [E, K] */
    public final E A01() {
        return this instanceof DQJ ? ((DQJ) this).A00.A08 : this instanceof C5030DPp ? ((C5030DPp) this).A01 : ((Multisets$ImmutableEntry) this).element;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof DPD)) {
            return false;
        }
        DPD dpd = (DPD) object;
        return A00() == dpd.A00() && Objects.equal(A01(), dpd.A01());
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(A01()) ^ A00();
    }

    public final String toString() {
        String strValueOf = String.valueOf(A01());
        int iA00 = A00();
        return iA00 != 1 ? FGI.A0S(strValueOf, " x ", iA00) : strValueOf;
    }
}
