package X;

/* renamed from: X.Cej, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3800Cej extends AbstractC3798Ceh {
    public static final AbstractC3798Ceh A02 = new C3800Cej(0, new Object[0]);
    public final transient int A00;
    public final transient Object[] A01;

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3789CeY.A01(i, this.A00);
        return BV6.A0n(this.A01, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00;
    }

    public C3800Cej(int i, Object[] objArr) {
        this.A01 = objArr;
        this.A00 = i;
    }
}
