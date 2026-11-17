package X;

/* loaded from: classes5.dex */
public final class Cf4 extends AbstractC3820Cf8 {
    public final transient int A00;
    public final transient int A01;
    public final transient Object[] A02;

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3791Cea.A01(i, this.A01);
        return BV6.A0n(this.A02, i + i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }

    public Cf4(Object[] objArr, int i, int i2) {
        this.A02 = objArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
