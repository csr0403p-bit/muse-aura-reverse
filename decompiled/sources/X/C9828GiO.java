package X;

import java.lang.reflect.Array;

/* renamed from: X.GiO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9828GiO {
    public int A00;
    public C9829GiP<Object[]> A01;
    public Object[] A02;
    public C9829GiP<Object[]> A03;

    public final Object[] A02(Object[] objArr) {
        C9829GiP c9829GiP = new C9829GiP(null, objArr);
        if (this.A01 == null) {
            this.A03 = c9829GiP;
            this.A01 = c9829GiP;
        } else {
            C9829GiP<Object[]> c9829GiP2 = this.A03;
            if (c9829GiP2.A00 != null) {
                throw new IllegalStateException();
            }
            c9829GiP2.A00 = c9829GiP;
            this.A03 = c9829GiP;
        }
        int length = objArr.length;
        this.A00 += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public static final void A00(C9828GiO c9828GiO) {
        C9829GiP<Object[]> c9829GiP = c9828GiO.A03;
        if (c9829GiP != null) {
            c9828GiO.A02 = c9829GiP.A01;
        }
        c9828GiO.A03 = null;
        c9828GiO.A01 = null;
        c9828GiO.A00 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A01(C9828GiO c9828GiO, Object obj, Object[] objArr, int i, int i2) {
        int i3 = 0;
        for (C9829GiP c9829GiP = c9828GiO.A01; c9829GiP != null; c9829GiP = c9829GiP.A00) {
            Object[] objArr2 = (Object[]) c9829GiP.A01;
            int length = objArr2.length;
            System.arraycopy(objArr2, 0, obj, i3, length);
            i3 += length;
        }
        System.arraycopy(objArr, 0, obj, i3, i2);
        int i4 = i3 + i2;
        if (i4 != i) {
            throw C3cG.A0Q(FGI.A0T("Should have gotten ", " entries, got ", i, i4));
        }
    }

    public final <T> T[] A04(Object[] objArr, int i, Class<T> cls) {
        int i2 = this.A00 + i;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i2));
        A01(this, tArr, objArr, i2, i);
        A00(this);
        return tArr;
    }

    public final Object[] A03(Object[] objArr, int i) {
        A00(this);
        Object[] objArr2 = this.A02;
        if (objArr2 == null || objArr2.length < i) {
            objArr2 = new Object[Math.max(12, i)];
            this.A02 = objArr2;
        }
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return this.A02;
    }
}
