package X;

import com.google.common.collect.ReverseNaturalOrdering;

/* renamed from: X.Dwd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6135Dwd extends AbstractC5809Dpt<C6135Dwd> implements Comparable<C6135Dwd> {
    public final int A00;
    public final C6136Dwe A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6135Dwd(X.C5382DhZ r15, X.C6136Dwe r16, com.google.common.base.Predicate r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6135Dwd.<init>(X.DhZ, X.Dwe, com.google.common.base.Predicate, int, int, int, boolean):void");
    }

    public static final int A00(C6135Dwd c6135Dwd, C6135Dwd c6135Dwd2) {
        DOM<Integer> dom;
        Object objA00;
        boolean z = c6135Dwd.A02;
        if (z && c6135Dwd.A0I) {
            dom = DoW.A09;
            objA00 = dom;
        } else {
            dom = DoW.A09;
            objA00 = dom.A00();
        }
        AbstractC6142Dwk abstractC6142DwkA02 = AbstractC6142Dwk.A00.A02(c6135Dwd.A0I, c6135Dwd2.A0I);
        Integer numValueOf = Integer.valueOf(c6135Dwd.A09);
        Integer numValueOf2 = Integer.valueOf(c6135Dwd2.A09);
        ReverseNaturalOrdering reverseNaturalOrdering = ReverseNaturalOrdering.A00;
        AbstractC6142Dwk abstractC6142DwkA01 = abstractC6142DwkA02.A01(numValueOf, numValueOf2, reverseNaturalOrdering).A00(c6135Dwd.A0A, c6135Dwd2.A0A).A00(c6135Dwd.A0C, c6135Dwd2.A0C).A02(c6135Dwd.A0G, c6135Dwd2.A0G).A02(c6135Dwd.A0F, c6135Dwd2.A0F).A01(Integer.valueOf(c6135Dwd.A07), Integer.valueOf(c6135Dwd2.A07), reverseNaturalOrdering).A00(c6135Dwd.A08, c6135Dwd2.A08).A02(z, c6135Dwd2.A02).A01(Integer.valueOf(c6135Dwd.A0B), Integer.valueOf(c6135Dwd2.A0B), reverseNaturalOrdering);
        if (c6135Dwd.A01.A0P) {
            abstractC6142DwkA01 = abstractC6142DwkA01.A01(Integer.valueOf(c6135Dwd.A05), Integer.valueOf(c6135Dwd2.A05), dom.A00());
        }
        AbstractC6142Dwk abstractC6142DwkA022 = abstractC6142DwkA01.A02(c6135Dwd.A04, c6135Dwd2.A04).A02(c6135Dwd.A03, c6135Dwd2.A03);
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A1r)) {
            abstractC6142DwkA022 = abstractC6142DwkA022.A02(c6135Dwd.A0H, c6135Dwd2.A0H);
        }
        AbstractC6142Dwk abstractC6142DwkA012 = abstractC6142DwkA022.A01(Integer.valueOf(c6135Dwd.A06), Integer.valueOf(c6135Dwd2.A06), objA00).A01(Integer.valueOf(c6135Dwd.A0D), Integer.valueOf(c6135Dwd2.A0D), objA00);
        if (C6xC.A00(c6135Dwd.A0E, c6135Dwd2.A0E)) {
            abstractC6142DwkA012 = abstractC6142DwkA012.A01(Integer.valueOf(c6135Dwd.A05), Integer.valueOf(c6135Dwd2.A05), objA00);
        }
        if (abstractC6142DwkA012 instanceof C6144Dwm) {
            return ((C6144Dwm) abstractC6142DwkA012).A00;
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6135Dwd c6135Dwd) {
        return A00(this, c6135Dwd);
    }
}
