package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.ReverseNaturalOrdering;

/* renamed from: X.Dwg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6138Dwg extends AbstractC5809Dpt<C6138Dwg> implements Comparable<C6138Dwg> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.common.collect.ReverseNaturalOrdering, java.util.Comparator] */
    public static final int A00(C6138Dwg c6138Dwg, C6138Dwg c6138Dwg2) {
        AbstractC6142Dwk abstractC6142DwkA02 = AbstractC6142Dwk.A00.A02(c6138Dwg.A08, c6138Dwg2.A08);
        Integer numValueOf = Integer.valueOf(c6138Dwg.A01);
        Integer numValueOf2 = Integer.valueOf(c6138Dwg2.A01);
        NaturalOrdering naturalOrdering = NaturalOrdering.A00;
        ?? r5 = ReverseNaturalOrdering.A00;
        AbstractC6142Dwk abstractC6142DwkA01 = abstractC6142DwkA02.A01(numValueOf, numValueOf2, r5);
        int i = c6138Dwg.A02;
        AbstractC6142Dwk abstractC6142DwkA00 = abstractC6142DwkA01.A00(i, c6138Dwg2.A02);
        int i2 = c6138Dwg.A03;
        AbstractC6142Dwk abstractC6142DwkA022 = abstractC6142DwkA00.A00(i2, c6138Dwg2.A03).A02(c6138Dwg.A06, c6138Dwg2.A06);
        Boolean boolValueOf = Boolean.valueOf(c6138Dwg.A07);
        Boolean boolValueOf2 = Boolean.valueOf(c6138Dwg2.A07);
        if (i != 0) {
            naturalOrdering = r5;
        }
        AbstractC6142Dwk abstractC6142DwkA002 = abstractC6142DwkA022.A01(boolValueOf, boolValueOf2, naturalOrdering).A00(c6138Dwg.A04, c6138Dwg2.A04);
        if (i2 == 0) {
            boolean z = c6138Dwg.A05;
            boolean z2 = c6138Dwg2.A05;
            if (!(abstractC6142DwkA002 instanceof C6144Dwm)) {
                abstractC6142DwkA002 = z2 == z ? AbstractC6142Dwk.A00 : z2 ? AbstractC6142Dwk.A01 : AbstractC6142Dwk.A02;
            }
        }
        if (abstractC6142DwkA002 instanceof C6144Dwm) {
            return ((C6144Dwm) abstractC6142DwkA002).A00;
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C6138Dwg c6138Dwg) {
        return A00(this, c6138Dwg);
    }

    public C6138Dwg(C5382DhZ c5382DhZ, C6136Dwe c6136Dwe, String str, String str2, int i, int i2, int i3) {
        ImmutableList<String> immutableListOf;
        int iA02;
        super(c5382DhZ, i, i2);
        int i4 = 0;
        int i5 = i3 & 7;
        this.A08 = BV7.A1T(i5, 4);
        C6154Dwx c6154Dwx = super.A02;
        int i6 = c6154Dwx.A0M & (((C6141Dwj) c6136Dwe).A00 ^ (-1));
        this.A06 = AnonymousClass002.A1L(i6 & 1);
        this.A07 = AnonymousClass002.A1L(i6 & 2);
        if (str2 != null) {
            immutableListOf = ImmutableList.of(str2);
        } else {
            immutableListOf = c6136Dwe.A0J;
            if (immutableListOf.isEmpty()) {
                immutableListOf = ImmutableList.of("");
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= immutableListOf.size()) {
                i7 = Integer.MAX_VALUE;
                iA02 = 0;
                break;
            } else {
                iA02 = DoW.A02(c6154Dwx, C60Q.A0n(immutableListOf, i7), c6136Dwe.A0S);
                if (iA02 > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.A01 = i7;
        this.A02 = iA02;
        int i8 = str2 != null ? 1088 : ((C6141Dwj) c6136Dwe).A0C;
        int i9 = c6154Dwx.A0J;
        int iBitCount = (i9 == 0 || i9 != i8) ? Integer.bitCount(i8 & i9) : Integer.MAX_VALUE;
        this.A03 = iBitCount;
        this.A05 = AnonymousClass002.A1L(1088 & i9);
        int iA022 = DoW.A02(c6154Dwx, str, AnonymousClass002.A1Y(DoW.A04(str)));
        this.A04 = iA022;
        boolean z = iA02 > 0 || (c6136Dwe.A0J.isEmpty() && iBitCount > 0) || this.A06 || (this.A07 && iA022 > 0);
        boolean z2 = c6136Dwe.A0F;
        if ((i5 == 4 || (z2 && i5 == 3)) && z) {
            i4 = 1;
        }
        this.A00 = i4;
    }
}
