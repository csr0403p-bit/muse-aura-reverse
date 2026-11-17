package X;

/* loaded from: classes5.dex */
public final class COM extends COO {
    public static final COO A02 = new COM(0, new Object[0]);
    public final transient int A00;
    public final transient Object[] A01;

    @Override // java.util.List
    public final Object get(int i) {
        CeX.A01(i, this.A00);
        return BV6.A0n(this.A01, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    public COM(int i, Object[] objArr) {
        this.A01 = objArr;
        this.A00 = i;
    }
}
