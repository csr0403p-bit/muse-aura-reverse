package X;

/* renamed from: X.CeL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3778CeL extends AbstractC3777CeK {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AbstractC3777CeK zzc;

    public C3778CeL(AbstractC3777CeK abstractC3777CeK, int i, int i2) {
        this.zzc = abstractC3777CeK;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3788CeW.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
