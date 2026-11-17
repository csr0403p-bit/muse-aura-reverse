package X;

/* loaded from: classes6.dex */
public final class GNI extends GNE {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ GNE e;

    public GNI(GNE gne, int i, int i2) {
        this.e = gne;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.A01;
        if (i < 0 || i >= i2) {
            throw BV6.A0g(AbstractC3790CeZ.A00(i, i2));
        }
        return this.e.get(i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
