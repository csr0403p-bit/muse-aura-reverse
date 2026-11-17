package X;

/* renamed from: X.Ceg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3797Ceg extends AbstractC3798Ceh {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AbstractC3798Ceh zzc;

    public C3797Ceg(AbstractC3798Ceh abstractC3798Ceh, int i, int i2) {
        this.zzc = abstractC3798Ceh;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3789CeY.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
