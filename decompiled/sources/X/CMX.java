package X;

/* loaded from: classes5.dex */
public final class CMX<T> {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public final T[] A03;

    /* JADX WARN: Incorrect return type in method signature: (TT;)TT; */
    public final synchronized void A00(Object obj) {
        Object[] objArr = (T[]) this.A03;
        int length = objArr.length;
        try {
            int i = this.A00;
            if (i == length) {
                int i2 = this.A01;
                objArr[i2] = null;
                this.A01 = (i2 + 1) % length;
                i--;
                this.A00 = i;
            }
            if (i >= length) {
                throw C3cG.A0Q("Overflow");
            }
            int i3 = this.A02;
            objArr[i3] = obj;
            this.A02 = (i3 + 1) % length;
            this.A00 = i + 1;
        } catch (Throwable th) {
        }
    }

    public CMX(int i) {
        this.A03 = (T[]) new Object[i];
    }
}
