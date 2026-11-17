package X;

/* renamed from: X.Cwi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4466Cwi extends C4464Cwg {
    public final char[] A00;

    public C4466Cwi(C4468Cwk c4468Cwk) {
        super(c4468Cwk, null);
        char[] cArr = new char[512];
        this.A00 = cArr;
        char[] cArr2 = c4468Cwk.A07;
        int i = 0;
        if (cArr2.length != 16) {
            throw BV4.A0P();
        }
        do {
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
            i++;
        } while (i < 256);
    }
}
