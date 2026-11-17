package X;

/* loaded from: classes4.dex */
public final class AK9 extends BNt {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    @Override // X.BNt
    public final int A00() {
        int i = this.A00;
        if (i != this.A02) {
            this.A00 = this.A03 + i;
            return i;
        }
        if (!this.A01) {
            throw C8j3.A1D();
        }
        this.A01 = false;
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01;
    }

    public AK9(int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.A01 = z;
        this.A00 = z ? i : i2;
    }
}
