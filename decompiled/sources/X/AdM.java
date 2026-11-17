package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AdM {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public List<C1VW> A05;
    public final C1167AdO A06;
    public final ArrayList<C1190Adt> A07;
    public final List<Integer> A08;

    public static final int A00(AdM adM) {
        return ((int) Math.sqrt((adM.A06.A02.A00 * 1.0d) / adM.A04)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r0 <= 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(int r9) {
        /*
            r8 = this;
            X.AdO r1 = r8.A06
            X.AdV<X.Adc> r0 = r1.A02
            int r0 = r0.A00
            r6 = 0
            if (r0 <= 0) goto L13
            if (r9 >= r0) goto L93
            boolean r0 = r1.A00
            if (r0 != 0) goto L14
            int r0 = r8.A04
            int r6 = r9 / r0
        L13:
            return r6
        L14:
            java.util.ArrayList<X.Adt> r5 = r8.A07
            int r1 = r5.size()
            r3 = 0
            int r0 = r5.size()
            X.AbstractC0885AGm.A15(r0, r1)
        L22:
            int r2 = r1 + (-1)
        L24:
            if (r3 > r2) goto L3b
            int r0 = r3 + r2
            int r1 = r0 >>> 1
            java.lang.Object r0 = r5.get(r1)
            X.Adt r0 = (X.C1190Adt) r0
            int r0 = r0.A00
            int r0 = r0 - r9
            if (r0 >= 0) goto L38
            int r3 = r1 + 1
            goto L24
        L38:
            if (r0 <= 0) goto L3e
            goto L22
        L3b:
            int r0 = r3 + 1
            int r1 = -r0
        L3e:
            r0 = 2
            if (r1 >= 0) goto L43
            int r1 = -r1
            int r1 = r1 - r0
        L43:
            int r7 = A00(r8)
            int r7 = r7 * r1
            java.lang.Object r0 = r5.get(r1)
            X.Adt r0 = (X.C1190Adt) r0
            int r0 = r0.A00
            if (r0 > r9) goto L96
            r4 = 0
        L53:
            if (r0 >= r9) goto L87
            int r3 = r0 + 1
            int r2 = r8.A02(r0)
            int r4 = r4 + r2
            int r1 = r8.A04
            if (r4 < r1) goto L67
            int r7 = r7 + 1
            r0 = r4
            r4 = r2
            if (r0 != r1) goto L67
            r4 = 0
        L67:
            int r1 = A00(r8)
            int r0 = r7 % r1
            if (r0 != 0) goto L85
            int r1 = r7 / r1
            int r0 = r5.size()
            if (r1 < r0) goto L85
            boolean r0 = X.AnonymousClass002.A1N(r4)
            int r1 = r3 - r0
            X.Adt r0 = new X.Adt
            r0.<init>(r1, r6)
            r5.add(r0)
        L85:
            r0 = r3
            goto L53
        L87:
            int r0 = r8.A02(r9)
            int r4 = r4 + r0
            int r0 = r8.A04
            if (r4 <= r0) goto L92
            int r7 = r7 + 1
        L92:
            return r7
        L93:
            java.lang.String r0 = "ItemIndex > total count"
            goto L98
        L96:
            java.lang.String r0 = "currentItemIndex > itemIndex"
        L98:
            X.AbstractC1061ATk.A00(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AdM.A01(int):int");
    }

    public final int A02(int i) {
        C1VA c1va = C1VA.A01;
        C1VA.A00 = this.A04;
        C1181Adk<C1173Adc> c1181AdkABv = this.A06.A02.ABv(i);
        return (int) c1181AdkABv.A02.A00.invoke(c1va, Integer.valueOf(i - c1181AdkABv.A01)).A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.AbstractCollection, java.util.ArrayList, java.util.List<X.1VW>] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List<X.1VW>] */
    public final C1184Adn A03(int i) {
        int iA0H;
        boolean z;
        ?? A0h;
        String strA0y;
        int i2;
        C1167AdO c1167AdO = this.A06;
        if (c1167AdO.A00) {
            int iA00 = A00(this);
            ArrayList<C1190Adt> arrayList = this.A07;
            int iA0F = C8j3.A0F(arrayList.size(), 1, i / iA00);
            int i3 = iA00 * iA0F;
            iA0H = arrayList.get(iA0F).A00;
            int iA02 = arrayList.get(iA0F).A01;
            int i4 = this.A01;
            if (i3 <= i4 && i4 <= i) {
                iA0H = this.A02;
                iA02 = this.A03;
                i3 = i4;
            } else if (iA0F == this.A00) {
                int i5 = i - i3;
                List<Integer> list = this.A08;
                if (i5 < list.size()) {
                    iA0H = C8j4.A0H(list, i5);
                    i3 = i;
                    iA02 = 0;
                }
            }
            int iA002 = A00(this);
            if (i3 % iA002 != 0 || 2 > (i2 = i - i3) || i2 >= iA002) {
                z = false;
            } else {
                z = true;
                this.A00 = iA0F;
                this.A08.clear();
            }
            if (i3 <= i) {
                while (i3 < i) {
                    C1170AdV<C1173Adc> c1170AdV = c1167AdO.A02;
                    if (iA0H >= c1170AdV.A00) {
                        break;
                    }
                    if (z) {
                        this.A08.add(Integer.valueOf(iA0H));
                    }
                    int i6 = 0;
                    while (i6 < this.A04 && iA0H < c1170AdV.A00) {
                        if (iA02 == 0) {
                            iA02 = A02(iA0H);
                        }
                        i6 += iA02;
                        if (i6 > this.A04) {
                            break;
                        }
                        iA0H++;
                        iA02 = 0;
                    }
                    i3++;
                    int iA003 = A00(this);
                    if (i3 % iA003 == 0 && iA0H < c1170AdV.A00) {
                        if (arrayList.size() == i3 / iA003) {
                            arrayList.add(new C1190Adt(iA0H, iA02));
                        } else {
                            strA0y = "invalid starting point";
                        }
                    }
                }
                this.A01 = i;
                this.A02 = iA0H;
                this.A03 = iA02;
                A0h = C3cG.A0h();
                int i7 = iA0H;
                int i8 = 0;
                while (i8 < this.A04 && i7 < c1167AdO.A02.A00) {
                    if (iA02 == 0) {
                        iA02 = A02(i7);
                    }
                    i8 += iA02;
                    if (i8 > this.A04) {
                        break;
                    }
                    i7++;
                    if (iA02 <= 0) {
                        AbstractC1061ATk.A00("The span value should be higher than 0");
                        throw F60.createAndThrow();
                    }
                    A0h.add(new C1VW(iA02));
                    iA02 = 0;
                }
            } else {
                strA0y = C8j4.A0y("currentLine (", ") > lineIndex (", i3, i);
            }
            throw C3cG.A0Q(strA0y);
        }
        int i9 = this.A04;
        iA0H = i * i9;
        int i10 = c1167AdO.A02.A00 - iA0H;
        if (i9 <= i10) {
            i10 = i9;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 == this.A05.size()) {
            A0h = this.A05;
        } else {
            A0h = C60O.A11(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                A0h.add(new C1VW(1L));
            }
            this.A05 = A0h;
        }
        return new C1184Adn(iA0H, A0h);
    }

    public AdM(C1167AdO c1167AdO) {
        this.A06 = c1167AdO;
        ArrayList<C1190Adt> arrayListA0h = C3cG.A0h();
        arrayListA0h.add(new C1190Adt(0, 0));
        this.A07 = arrayListA0h;
        this.A00 = -1;
        this.A08 = C3cG.A0h();
        this.A05 = C0881AGi.A00;
    }
}
