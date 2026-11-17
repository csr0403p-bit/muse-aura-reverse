package X;

/* renamed from: X.AHp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0913AHp<E> {
    public int A00;
    public Object[] A01;

    public final int A02(E e) {
        Object[] objArr = this.A01;
        int i = 0;
        int i2 = this.A00;
        if (e == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < i2) {
                if (e.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public final E A03(int i) {
        if (i >= 0 && i < this.A00) {
            return (E) this.A01[i];
        }
        A04(i);
        throw F60.createAndThrow();
    }

    public final void A04(int i) {
        throw C8j3.A0y("Index ", " must be in 0..", i, this.A00 - 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC0913AHp)) {
            return false;
        }
        AbstractC0913AHp abstractC0913AHp = (AbstractC0913AHp) obj;
        int i = abstractC0913AHp.A00;
        int i2 = this.A00;
        if (i != i2) {
            return false;
        }
        Object[] objArr = this.A01;
        Object[] objArr2 = abstractC0913AHp.A01;
        ADq aDqA0C = ATD.A0C(0, i2);
        int i3 = aDqA0C.A00;
        int i4 = aDqA0C.A01;
        if (i3 <= i4) {
            while (C8j3.A1X(objArr[i3], objArr2, i3)) {
                if (i3 != i4) {
                    i3++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.A01;
        int i = this.A00;
        int iA01 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iA01 += C60R.A01(objArr[i2]) * 31;
        }
        return iA01;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "[");
        Object[] objArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            Object obj = objArr[i2];
            if (i2 != 0) {
                sbA0w.append((CharSequence) ", ");
                if (i2 == -1) {
                    sbA0w.append((CharSequence) "...");
                    break;
                }
            }
            sbA0w.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i2++;
        }
        sbA0w.append((CharSequence) "]");
        return sbA0w.toString();
    }

    public AbstractC0913AHp(int i) {
        this.A01 = i == 0 ? AbstractC0907AHj.A01 : new Object[i];
    }
}
