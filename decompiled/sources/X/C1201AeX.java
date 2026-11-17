package X;

/* renamed from: X.AeX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1201AeX {
    public int A00;
    public int[] A01 = new int[16];
    public final AIG A02 = new AIG();

    public static final void A00(C1201AeX c1201AeX, int i, int i2) {
        if (i > 131072) {
            AbstractC1061ATk.A00(FGI.A0I("Requested item capacity ", i, " is larger than max supported: 131072!"));
            throw F60.createAndThrow();
        }
        int[] iArr = c1201AeX.A01;
        int length = iArr.length;
        if (length < i) {
            int i3 = length;
            while (i3 < i) {
                i3 *= 2;
            }
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, 0, iArr2, i2, length);
            c1201AeX.A01 = iArr2;
        }
    }
}
