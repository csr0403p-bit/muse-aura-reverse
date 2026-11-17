package X;

/* renamed from: X.FGm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7831FGm {
    public C0918AHu<FH1, Object> A00;
    public C0918AHu<FH1, Object> A01;
    public Object[] A02;

    public final void A00(FH1 fh1, Object obj, int i) {
        if (obj != null) {
            C0918AHu<FH1, Object> c0918AHu = this.A00;
            if (c0918AHu == null) {
                c0918AHu = new C0918AHu<>(i);
            }
            c0918AHu.A0E(fh1, obj);
            if (this.A00 == null) {
                this.A00 = c0918AHu;
            }
        }
    }

    public final void A01(FH1 fh1, Object obj, int i) {
        if (obj != null) {
            C0918AHu<FH1, Object> c0918AHu = this.A01;
            if (c0918AHu == null) {
                c0918AHu = new C0918AHu<>(i);
            }
            c0918AHu.A0E(fh1, obj);
            if (this.A01 == null) {
                this.A01 = c0918AHu;
            }
        }
    }

    public final void A02(Object obj, int i, int i2) {
        if (obj != null) {
            Object[] objArr = this.A02;
            Object[] objArr2 = objArr == null ? new Object[i2] : objArr;
            objArr2[i] = obj;
            if (objArr == null) {
                this.A02 = objArr2;
            }
        }
    }
}
