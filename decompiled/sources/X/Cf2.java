package X;

/* loaded from: classes5.dex */
public final class Cf2 extends AbstractC3815Cey {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AbstractC3815Cey zzc;

    public Cf2(AbstractC3815Cey abstractC3815Cey, int i, int i2) {
        this.zzc = abstractC3815Cey;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3793Cec.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
