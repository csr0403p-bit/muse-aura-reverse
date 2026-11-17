package X;

import java.util.List;

/* renamed from: X.AtA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1891AtA implements Appendable {
    public long A00;
    public C0910AHm<C1733ApU<C1OS>> A01;
    public Au3 A02;
    public HxE<C1867Ash, Au3> A03;
    public C1927Ato A04;
    public final C1919Atg A05;
    public final At0 A06;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ X.At0 A00(X.C1891AtA r7, X.Au3 r8, int r9) {
        /*
            r1 = r8
            long r5 = r7.A00
            r0 = r9 & 2
            if (r0 == 0) goto L9
            X.Au3 r1 = r7.A02
        L9:
            r4 = 0
            X.AHm<X.ApU<X.1OS>> r0 = r7.A01
            if (r0 == 0) goto L18
            java.util.List r3 = r0.A08()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L19
        L18:
            r3 = r4
        L19:
            X.Atg r0 = r7.A05
            java.lang.String r2 = r0.toString()
            X.At0 r0 = new X.At0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891AtA.A00(X.AtA, X.Au3, int):X.At0");
    }

    public final void A03() {
        this.A02 = null;
        C0910AHm<C1733ApU<C1OS>> c0910AHm = this.A01;
        if (c0910AHm != null) {
            c0910AHm.A09();
        }
    }

    public final void A05(CharSequence charSequence, int i, int i2) {
        StringBuilder sbA0y;
        int length = charSequence.length();
        if (i > i2) {
            sbA0y = C60O.A0y("Expected start=", i);
            sbA0y.append(" <= end=");
            sbA0y.append(i2);
        } else {
            if (0 <= length) {
                C1919Atg c1919Atg = this.A05;
                int iA04 = ATD.A04(i, 0, c1919Atg.length());
                int iA042 = ATD.A04(i2, 0, c1919Atg.length());
                int iA043 = ATD.A04(0, 0, charSequence.length());
                int iA044 = ATD.A04(length, 0, charSequence.length());
                A01(iA04, iA042, iA044 - iA043);
                c1919Atg.A01(charSequence, iA04, iA042, iA043, iA044);
                this.A02 = null;
                C0910AHm<C1733ApU<C1OS>> c0910AHm = this.A01;
                if (c0910AHm != null) {
                    c0910AHm.A09();
                }
                this.A03 = null;
                return;
            }
            sbA0y = C60O.A0y("Expected textStart=", 0);
            sbA0y.append(" <= textEnd=");
            sbA0y.append(length);
        }
        AbstractC1061ATk.A00(sbA0y.toString());
        throw F60.createAndThrow();
    }

    public final C1927Ato A02() {
        C1927Ato c1927Ato = this.A04;
        if (c1927Ato != null) {
            return c1927Ato;
        }
        C1927Ato c1927Ato2 = new C1927Ato(null);
        this.A04 = c1927Ato2;
        return c1927Ato2;
    }

    public final void A04(long j) {
        long jA00 = AbstractC1815ArZ.A00(0, this.A05.length());
        if (Au3.A06(jA00, j)) {
            this.A00 = j;
            this.A03 = null;
        } else {
            StringBuilder sbA0x = C60O.A0x("Expected ");
            sbA0x.append((Object) Au3.A03(j));
            sbA0x.append(" to be in ");
            AbstractC1061ATk.A00(C8j3.A14(Au3.A03(jA00), sbA0x));
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/List<LX/ApU<LX/1OS;>;>;)V */
    public final void A06(List list, int i, int i2) {
        if (i >= 0) {
            C1919Atg c1919Atg = this.A05;
            if (i <= c1919Atg.length()) {
                if (i2 < 0 || i2 > c1919Atg.length()) {
                    throw C8j3.A0y("end (", ") offset is outside of text region ", i2, c1919Atg.length());
                }
                if (i >= i2) {
                    throw C8j3.A0v("Do not set reversed or empty range: ", " > ", i, i2);
                }
                Au3 au3A0j = C8j3.A0j(C8j3.A0T(i, i2));
                if (Au3.A04(au3A0j.A00)) {
                    this.A02 = null;
                    C0910AHm<C1733ApU<C1OS>> c0910AHm = this.A01;
                    if (c0910AHm != null) {
                        c0910AHm.A09();
                    }
                } else {
                    this.A02 = au3A0j;
                }
                C0910AHm<C1733ApU<C1OS>> c0910AHm2 = this.A01;
                if (c0910AHm2 != null) {
                    c0910AHm2.A09();
                }
                if (list == null || list.isEmpty()) {
                    return;
                }
                if (this.A01 == null) {
                    this.A01 = C0910AHm.A02(new C1733ApU[16], 0);
                }
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C1733ApU c1733ApU = (C1733ApU) list.get(i3);
                    C0910AHm<C1733ApU<C1OS>> c0910AHm3 = this.A01;
                    if (c0910AHm3 != null) {
                        c0910AHm3.A0G(new C1733ApU<>(c1733ApU.A02, c1733ApU.A03, c1733ApU.A01 + i, c1733ApU.A00 + i));
                    }
                }
                return;
            }
        }
        throw C8j3.A0y("start (", ") offset is outside of text region ", i, this.A05.length());
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            C1919Atg c1919Atg = this.A05;
            A01(c1919Atg.length(), c1919Atg.length(), i2 - i);
            int length = c1919Atg.length();
            int length2 = c1919Atg.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
            c1919Atg.A01(charSequenceSubSequence, length, length2, 0, charSequenceSubSequence.length());
        }
        return this;
    }

    public final String toString() {
        return this.A05.toString();
    }

    public C1891AtA(At0 at0, At0 at02, C1927Ato c1927Ato) {
        this.A06 = at02;
        C1919Atg c1919Atg = new C1919Atg();
        c1919Atg.A03 = at0;
        c1919Atg.A01 = -1;
        c1919Atg.A00 = -1;
        this.A05 = c1919Atg;
        C0910AHm<C1733ApU<C1OS>> c0910AHmA02 = null;
        this.A04 = c1927Ato != null ? new C1927Ato(c1927Ato) : null;
        this.A00 = at0.A00;
        this.A02 = at0.A01;
        List<C1733ApU<C1OS>> list = at0.A03;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            C1733ApU[] c1733ApUArr = new C1733ApU[size];
            for (int i = 0; i < size; i++) {
                c1733ApUArr[i] = list.get(Integer.valueOf(i).intValue());
            }
            c0910AHmA02 = C0910AHm.A02(c1733ApUArr, size);
        }
        this.A01 = c0910AHmA02;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(int r11, int r12, int r13) {
        /*
            r10 = this;
            X.Ato r5 = r10.A02()
            if (r11 != r12) goto L11
            if (r13 != 0) goto L11
        L8:
            long r0 = r10.A00
            long r0 = X.AuC.A00(r11, r12, r13, r0)
            r10.A00 = r0
            return
        L11:
            int r7 = java.lang.Math.min(r11, r12)
            int r6 = java.lang.Math.max(r11, r12)
            int r0 = r6 - r7
            int r4 = r13 - r0
            r3 = 0
            r2 = 0
            r9 = 0
        L20:
            X.AHm<X.AwP> r1 = r5.A00
            int r0 = r1.A00
            if (r3 >= r0) goto L77
            T[] r0 = r1.A01
            r1 = r0[r3]
            X.AwP r1 = (X.C2012AwP) r1
            int r0 = r1.A03
            if (r7 > r0) goto L41
            if (r0 > r6) goto L41
        L32:
            if (r2 != 0) goto L38
            r2 = r1
        L35:
            int r3 = r3 + 1
            goto L20
        L38:
            int r0 = r1.A02
            r2.A02 = r0
            int r0 = r1.A00
            r2.A00 = r0
            goto L35
        L41:
            int r0 = r1.A02
            if (r7 > r0) goto L48
            if (r0 > r6) goto L48
            goto L32
        L48:
            int r8 = r1.A03
            int r0 = r1.A02
            if (r7 > r0) goto L51
            if (r8 > r7) goto L51
            goto L32
        L51:
            int r8 = r1.A03
            int r0 = r1.A02
            if (r6 > r0) goto L5a
            if (r8 > r6) goto L5a
            goto L32
        L5a:
            int r0 = r1.A03
            if (r0 <= r6) goto L74
            if (r9 != 0) goto L64
            X.C1927Ato.A00(r2, r5, r7, r6, r4)
            r9 = 1
        L64:
            int r0 = r1.A03
            int r0 = r0 + r4
            r1.A03 = r0
            int r0 = r1.A02
            int r0 = r0 + r4
            r1.A02 = r0
        L6e:
            X.AHm<X.AwP> r0 = r5.A01
            r0.A0G(r1)
            goto L35
        L74:
            if (r9 == 0) goto L6e
            goto L64
        L77:
            if (r9 != 0) goto L7c
            X.C1927Ato.A00(r2, r5, r7, r6, r4)
        L7c:
            X.AHm<X.AwP> r1 = r5.A00
            X.AHm<X.AwP> r0 = r5.A01
            r5.A00 = r0
            r5.A01 = r1
            r1.A09()
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891AtA.A01(int, int, int):void");
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            C1919Atg c1919Atg = this.A05;
            A01(c1919Atg.length(), c1919Atg.length(), charSequence.length());
            c1919Atg.A01(charSequence, c1919Atg.length(), c1919Atg.length(), 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        C1919Atg c1919Atg = this.A05;
        A01(c1919Atg.length(), c1919Atg.length(), 1);
        int length = c1919Atg.length();
        int length2 = c1919Atg.length();
        String strValueOf = String.valueOf(c);
        c1919Atg.A01(strValueOf, length, length2, 0, strValueOf.length());
        return this;
    }
}
