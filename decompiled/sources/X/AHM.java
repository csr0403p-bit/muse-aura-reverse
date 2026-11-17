package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AHM extends AHP implements ListIterator, BOA {
    public int A00;
    public int A01;
    public AHO<? extends T> A02;
    public final AHL<T> A03;

    public static final void A00(AHM ahm) {
        if (ahm.A00 != ahm.A03.A0T()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void A01(AHM ahm) {
        AHO aho;
        AHL<T> ahl = ahm.A03;
        Object[] objArr = ahl.A03;
        if (objArr == null) {
            aho = null;
        } else {
            int iA0K = C8j3.A0K(ahl) & (-32);
            int i = ((AHP) ahm).A00;
            if (i > iA0K) {
                i = iA0K;
            }
            int i2 = (ahl.A00 / 5) + 1;
            AHO<? extends T> aho2 = ahm.A02;
            if (aho2 != 0) {
                ((AHP) aho2).A00 = i;
                ((AHP) aho2).A01 = iA0K;
                aho2.A00 = i2;
                Object[] objArr2 = aho2.A02;
                if (objArr2.length < i2) {
                    objArr2 = new Object[i2];
                    aho2.A02 = objArr2;
                }
                objArr2[0] = objArr;
                ?? r1 = i == iA0K ? 1 : 0;
                aho2.A01 = r1;
                AHO.A00(aho2, i - r1, 1);
                return;
            }
            aho = new AHO(objArr, i, iA0K, i2);
        }
        ahm.A02 = aho;
    }

    public AHM(AHL<T> ahl, int i) {
        int size = ahl.size();
        super.A00 = i;
        super.A01 = size;
        this.A03 = ahl;
        this.A00 = ahl.A0T();
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
        AHP ahp = this.A02;
        if (ahp == null) {
            Object[] objArr2 = this.A03.A04;
            super.A00 = i2;
            objArr = objArr2;
        } else {
            int i3 = ahp.A01;
            if (i <= i3) {
                super.A00 = i2;
                return ahp.previous();
            }
            Object[] objArr3 = this.A03.A04;
            super.A00 = i2;
            i2 -= i3;
            objArr = objArr3;
        }
        return objArr[i2];
    }
}
