package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class AJT extends AJU implements Iterator, BOA {
    public int A00;
    public K A01;
    public boolean A02;
    public final C0958AJl<K, V> A03;

    public AJT(C0958AJl<K, V> c0958AJl, AJV<K, V, T>[] ajvArr) {
        super(c0958AJl.A01, ajvArr);
        this.A03 = c0958AJl;
        this.A00 = c0958AJl.A00;
    }

    public static final void A00(AJT ajt, C0957AJk c0957AJk, Object obj, int i, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            AJV[] ajvArr = ((AJU) ajt).A02;
            AJV ajv = ajvArr[i2];
            Object[] objArr = c0957AJk.A02;
            int length = objArr.length;
            int i4 = 0;
            ajv.A02 = objArr;
            ajv.A00 = length;
            while (true) {
                ajv.A01 = i4;
                if (C7384Etj.areEqual(ajv.A02[i4], obj)) {
                    break;
                }
                ajv = ajvArr[i2];
                i4 = ajv.A01 + 2;
            }
        } else {
            int i5 = 1 << ((i >> i3) & 31);
            int i6 = c0957AJk.A00;
            if ((i5 & i6) == 0) {
                int iA0D = c0957AJk.A0D(i5);
                C0957AJk c0957AJkA0F = c0957AJk.A0F(iA0D);
                AJV ajv2 = ((AJU) ajt).A02[i2];
                Object[] objArr2 = c0957AJk.A02;
                int iBitCount = Integer.bitCount(c0957AJk.A00) * 2;
                ajv2.A02 = objArr2;
                ajv2.A00 = iBitCount;
                ajv2.A01 = iA0D;
                A00(ajt, c0957AJkA0F, obj, i, i2 + 1);
                return;
            }
            int iA0C = c0957AJk.A0C(i5);
            AJV ajv3 = ((AJU) ajt).A02[i2];
            Object[] objArr3 = c0957AJk.A02;
            int iBitCount2 = Integer.bitCount(i6) * 2;
            ajv3.A02 = objArr3;
            ajv3.A00 = iBitCount2;
            ajv3.A01 = iA0C;
        }
        ((AJU) ajt).A00 = i2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @Override // X.AJU, java.util.Iterator
    public final T next() {
        if (this.A03.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        this.A01 = A03();
        this.A02 = true;
        return super.next();
    }
}
