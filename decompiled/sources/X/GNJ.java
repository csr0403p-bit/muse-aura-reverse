package X;

/* loaded from: classes6.dex */
public final class GNJ extends GNE {
    public static final GNJ A02 = new GNJ(0, new Object[0]);
    public final transient int A00;
    public final transient Object[] A01;

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.A00;
        if (i < 0 || i >= i2) {
            throw BV6.A0g(AbstractC3790CeZ.A00(i, i2));
        }
        return BV6.A0n(this.A01, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    public GNJ(int i, Object[] objArr) {
        this.A01 = objArr;
        this.A00 = i;
    }
}
