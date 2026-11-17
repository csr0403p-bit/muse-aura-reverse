package X;

/* renamed from: X.AHo, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0912AHo<E> extends AbstractC0913AHp<E> {
    public C0911AHn<E> A00;

    public static final void A01(C0912AHo c0912AHo, Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        c0912AHo.A01 = objArr2;
    }

    public final void A07(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = super.A00) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(FGI.A0Z("Start (", ") and end (", ") must be in 0..", i, i2, super.A00));
        }
        if (i2 < i) {
            throw C60O.A0i(FGI.A0Y("Start (", ") is more than end (", ")", i, i2));
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.A01;
                AbstractC0903AHf.A05(objArr, objArr, i, i2, i3);
            }
            int i4 = super.A00;
            int i5 = i4 - (i2 - i);
            AbstractC0903AHf.A04(this.A01, i5, i4);
            super.A00 = i5;
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/AHp<TE;>;)Z */
    public final void A08(AbstractC0913AHp abstractC0913AHp) {
        C7384Etj.A0Y(abstractC0913AHp, 0);
        int i = super.A00;
        int i2 = abstractC0913AHp.A00;
        if (i2 != 0) {
            int i3 = i + i2;
            Object[] objArr = this.A01;
            if (objArr.length < i3) {
                A01(this, objArr, i3);
            }
            AbstractC0903AHf.A05(abstractC0913AHp.A01, this.A01, super.A00, 0, abstractC0913AHp.A00);
            super.A00 += abstractC0913AHp.A00;
        }
    }

    public C0912AHo() {
        super(16);
    }

    public static C0912AHo A00() {
        return new C0912AHo(16);
    }

    public final E A05(int i) {
        int i2;
        if (i < 0 || i >= (i2 = super.A00)) {
            A04(i);
            throw F60.createAndThrow();
        }
        Object[] objArr = this.A01;
        E e = (E) objArr[i];
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = super.A00 - 1;
        super.A00 = i4;
        objArr[i4] = null;
        return e;
    }

    public final void A06() {
        AbstractC0903AHf.A04(this.A01, 0, super.A00);
        super.A00 = 0;
    }

    public final boolean A09(E e) {
        int i = super.A00 + 1;
        Object[] objArr = this.A01;
        if (objArr.length < i) {
            A01(this, objArr, i);
        }
        Object[] objArr2 = this.A01;
        int i2 = super.A00;
        objArr2[i2] = e;
        super.A00 = i2 + 1;
        return true;
    }

    public final boolean A0A(E e) {
        int iA02 = A02(e);
        if (iA02 < 0) {
            return false;
        }
        A05(iA02);
        return true;
    }
}
