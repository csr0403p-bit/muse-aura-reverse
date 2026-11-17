package X;

/* renamed from: X.CfC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3824CfC extends AbstractC3820Cf8 {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AbstractC3820Cf8 zzc;

    public C3824CfC(AbstractC3820Cf8 abstractC3820Cf8, int i, int i2) {
        this.zzc = abstractC3820Cf8;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3791Cea.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
