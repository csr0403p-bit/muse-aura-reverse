package X;

/* renamed from: X.Ati, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1921Ati {
    public static final void A00(C1891AtA c1891AtA, int i, int i2) {
        Au3 au3 = c1891AtA.A02;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        c1891AtA.A05("", iMin, iMax);
        if (au3 != null) {
            long jA00 = AuC.A00(iMin, iMax, 0, au3.A00);
            if (Au3.A04(jA00)) {
                c1891AtA.A03();
            } else {
                c1891AtA.A06(null, Au3.A02(jA00), Au3.A01(jA00));
            }
        }
    }

    public static final void A01(C1891AtA c1891AtA, CharSequence charSequence, int i, int i2) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == c1891AtA.A05.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (iMax > i4 && length > i3 && charSequence.charAt(length - 1) == c1891AtA.A05.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i4 == iMax && i3 == length) {
            c1891AtA.A03();
            c1891AtA.A03 = null;
        } else {
            c1891AtA.A05(charSequence.subSequence(i3, length), i4, iMax);
        }
        int length2 = iMin + charSequence.length();
        c1891AtA.A04(AbstractC1815ArZ.A00(length2, length2));
    }
}
