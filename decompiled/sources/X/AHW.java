package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AHW extends AHZ implements ListIterator, BOA {
    public int A00;
    public int A01;
    public AHY<? extends T> A02;
    public final AHV<T> A03;

    public static final void A00(AHW ahw) {
        if (ahw.A00 != ahw.A03.A0T()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void A01(AHW ahw) {
        AHY ahy;
        AHV<T> ahv = ahw.A03;
        Object[] objArr = ahv.A03;
        if (objArr == null) {
            ahy = null;
        } else {
            int iA0K = C8j3.A0K(ahv) & (-32);
            int i = ((AHZ) ahw).A00;
            if (i > iA0K) {
                i = iA0K;
            }
            int i2 = (ahv.A00 / 5) + 1;
            AHY<? extends T> ahy2 = ahw.A02;
            if (ahy2 != 0) {
                ((AHZ) ahy2).A00 = i;
                ((AHZ) ahy2).A01 = iA0K;
                ahy2.A00 = i2;
                Object[] objArr2 = ahy2.A02;
                if (objArr2.length < i2) {
                    objArr2 = new Object[i2];
                    ahy2.A02 = objArr2;
                }
                objArr2[0] = objArr;
                ?? r1 = i == iA0K ? 1 : 0;
                ahy2.A01 = r1;
                AHY.A00(ahy2, i - r1, 1);
                return;
            }
            ahy = new AHY(objArr, i, iA0K, i2);
        }
        ahw.A02 = ahy;
    }

    public AHW(AHV<T> ahv, int i) {
        int size = ahv.size();
        super.A00 = i;
        super.A01 = size;
        this.A03 = ahv;
        this.A00 = ahv.A0T();
        this.A01 = -1;
        A01(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Override // java.util.ListIterator
    public final T previous() {
        Object[] objArr;
        A00(this);
        if (!hasPrevious()) {
            throw C8j3.A1D();
        }
        int i = super.A00;
        int i2 = i - 1;
        this.A01 = i2;
        AHZ ahz = this.A02;
        if (ahz == null) {
            Object[] objArr2 = this.A03.A04;
            super.A00 = i2;
            objArr = objArr2;
        } else {
            int i3 = ahz.A01;
            if (i <= i3) {
                super.A00 = i2;
                return ahz.previous();
            }
            Object[] objArr3 = this.A03.A04;
            super.A00 = i2;
            i2 -= i3;
            objArr = objArr3;
        }
        return objArr[i2];
    }
}
