package X;

/* renamed from: X.DqA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5821DqA extends AbstractC5809Dpt<C5821DqA> implements Comparable<C5821DqA> {
    public final int A00;
    public final int A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C5821DqA c5821DqA) {
        return AbstractC7532Ezu.A00(this.A00, c5821DqA.A00);
    }

    public C5821DqA(C5382DhZ c5382DhZ, C6136Dwe c6136Dwe, int i, int i2, int i3) {
        int i4;
        super(c5382DhZ, i, i2);
        int i5 = i3 & 7;
        this.A01 = (i5 == 4 || (c6136Dwe.A0F && i5 == 3)) ? 1 : 0;
        C6154Dwx c6154Dwx = this.A02;
        int i6 = c6154Dwx.A0Q;
        int i7 = -1;
        if (i6 != -1 && (i4 = c6154Dwx.A0D) != -1) {
            i7 = i6 * i4;
        }
        this.A00 = i7;
    }
}
