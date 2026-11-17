package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class AJF extends AJG implements Iterator, BOA {
    public int A00;
    public K A01;
    public boolean A02;
    public final C0955AJi<K, V> A03;

    public AJF(C0955AJi<K, V> c0955AJi, AJH<K, V, T>[] ajhArr) {
        super(c0955AJi.A04, ajhArr);
        this.A03 = c0955AJi;
        this.A00 = c0955AJi.A00;
    }

    public static final void A00(Object obj, AJF ajf, C0956AJj c0956AJj, int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2 * 5;
        if (i5 > 30) {
            AJH[] ajhArr = ((AJG) ajf).A02;
            AJH ajh = ajhArr[i2];
            Object[] objArr = c0956AJj.A02;
            int length = objArr.length;
            int i6 = 0;
            ajh.A02 = objArr;
            ajh.A00 = length;
            ajh.A01 = 0;
            while (!C7384Etj.areEqual(ajh.A02[i6], obj)) {
                ajh = ajhArr[i2];
                i6 = ajh.A01 + 2;
                ajh.A01 = i6;
            }
        } else {
            int i7 = 1 << ((i >> i5) & 31);
            int i8 = c0956AJj.A00;
            if ((i7 & i8) == 0) {
                int iA0D = c0956AJj.A0D(i7);
                C0956AJj c0956AJjA0G = c0956AJj.A0G(iA0D);
                AJH ajh2 = ((AJG) ajf).A02[i2];
                Object[] objArr2 = c0956AJj.A02;
                int iBitCount = Integer.bitCount(c0956AJj.A00) * 2;
                ajh2.A02 = objArr2;
                ajh2.A00 = iBitCount;
                ajh2.A01 = iA0D;
                A00(obj, ajf, c0956AJjA0G, i, i2 + 1, i3, z);
                return;
            }
            int iA0C = c0956AJj.A0C(i7);
            if (i7 == (z ? 1 << ((i3 >> i5) & 31) : 0) && i2 < (i4 = ((AJG) ajf).A00)) {
                AJH ajh3 = ((AJG) ajf).A02[i4];
                Object[] objArr3 = c0956AJj.A02;
                ajh3.A02 = new Object[]{objArr3[iA0C], objArr3[iA0C + 1]};
                ajh3.A00 = 2;
                ajh3.A01 = 0;
                return;
            }
            AJH ajh4 = ((AJG) ajf).A02[i2];
            Object[] objArr4 = c0956AJj.A02;
            int iBitCount2 = Integer.bitCount(i8) * 2;
            ajh4.A02 = objArr4;
            ajh4.A00 = iBitCount2;
            ajh4.A01 = iA0C;
        }
        ((AJG) ajf).A00 = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @Override // X.AJG, java.util.Iterator
    public final T next() {
        if (this.A03.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        this.A01 = A03();
        this.A02 = true;
        return super.next();
    }
}
