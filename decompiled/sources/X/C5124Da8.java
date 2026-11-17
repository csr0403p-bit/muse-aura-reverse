package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Da8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5124Da8 implements Da6 {
    public static final AtomicReferenceFieldUpdater<C5124Da8, Object> A0G = AtomicReferenceFieldUpdater.newUpdater(C5124Da8.class, Object.class, "childFragment");
    public String A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final DZi A04;
    public final Integer A05;
    public final List<AbstractC5134DaO> A06;
    public final C5125Da9 A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public volatile AbstractC7411Euw A0C;
    public volatile AbstractC7411Euw A0D;
    public volatile boolean A0E;
    public volatile boolean A0F;
    public volatile Object childFragment;

    public static final boolean A02(C5126DaA c5126DaA, C5125Da9 c5125Da9) {
        int iA07 = c5125Da9.A07(24);
        if (iA07 != 0) {
            int iA09 = c5125Da9.A09(iA07);
            boolean z = false;
            for (int i = 0; i < iA09; i++) {
                C5126DaA c5126DaA2 = c5126DaA;
                int iA072 = c5125Da9.A07(24);
                if (iA072 != 0) {
                    DZx.A04(c5125Da9, c5126DaA, iA072, i);
                } else {
                    c5126DaA2 = null;
                }
                int iA073 = c5126DaA2.A07(4);
                if (iA073 != 0) {
                    byte b = c5126DaA2.A04.get(iA073 + c5126DaA2.A00);
                    if (b == 4) {
                        break;
                    }
                    if (b == 5) {
                        z = true;
                    }
                }
            }
            if (!z) {
            }
        }
        int iA074 = c5125Da9.A07(16);
        return iA074 == 0 || c5125Da9.A04.get(iA074 + c5125Da9.A00) == 0;
    }

    public static final String A00(C5124Da8 c5124Da8) {
        String strA03;
        if (c5124Da8.A0E) {
            return c5124Da8.A00;
        }
        C5125Da9 c5125Da9 = c5124Da8.A07;
        int iA07 = c5125Da9.A07(8);
        if (iA07 != 0) {
            strA03 = DZx.A03(c5125Da9.A04, iA07 + c5125Da9.A00);
        } else {
            strA03 = null;
        }
        c5124Da8.A00 = strA03;
        c5124Da8.A0E = true;
        return strA03;
    }

    public static final String A01(C5124Da8 c5124Da8) {
        String strA03;
        if (c5124Da8.A0F) {
            return c5124Da8.A01;
        }
        C5125Da9 c5125Da9 = c5124Da8.A07;
        int iA07 = c5125Da9.A07(6);
        if (iA07 != 0) {
            strA03 = DZx.A03(c5125Da9.A04, iA07 + c5125Da9.A00);
        } else {
            strA03 = null;
        }
        c5124Da8.A01 = strA03;
        c5124Da8.A0F = true;
        return strA03;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // X.Da6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.DZu AZf() {
        /*
            r7 = this;
            java.lang.Object r1 = r7.childFragment
            r6 = 0
            if (r1 == 0) goto La
            boolean r0 = r1 instanceof X.DZu
            if (r0 != 0) goto L3a
            return r6
        La:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<X.Da8, java.lang.Object> r5 = X.C5124Da8.A0G
            X.DZi r4 = r7.A04
            X.Da9 r3 = r7.A07
            X.DZy r2 = new X.DZy
            r2.<init>()
            r0 = 12
            int r0 = r3.A07(r0)
            if (r0 == 0) goto L2e
            int r1 = X.DZx.A01(r3, r0)
            java.nio.ByteBuffer r0 = r3.A04
            r2.A0A(r1, r0)
            X.G0U<X.DZy, X.DZu> r0 = r4.A02
            java.lang.Object r0 = r0.invoke(r2)
            if (r0 != 0) goto L30
        L2e:
            X.DaB r0 = X.C5127DaB.A00
        L30:
            X.AbstractC5217DdT.A00(r7, r6, r0, r5)
            java.lang.Object r1 = r7.childFragment
            boolean r0 = r1 instanceof X.DZu
            if (r0 != 0) goto L3a
            return r6
        L3a:
            X.DZu r1 = (X.DZu) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5124Da8.AZf():X.DZu");
    }

    public C5124Da8(DZi dZi, Integer num, List list, C5125Da9 c5125Da9, int i, int i2, boolean z, boolean z2) {
        this.A07 = c5125Da9;
        this.A04 = dZi;
        this.A05 = num;
        this.A0A = z;
        this.A0B = z2;
        this.A02 = i;
        this.A06 = list;
        this.A03 = i2;
        boolean z3 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj : list) {
                if ((obj instanceof C5147Dad) || (obj instanceof C5145Daa) || (obj instanceof C5146Dab)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.A08 = z3;
        this.A09 = A02(new C5126DaA(), this.A07);
    }
}
