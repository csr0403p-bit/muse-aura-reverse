package X;

/* renamed from: X.Ces, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3809Ces extends AbstractC3804Cen {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ AbstractC3804Cen zzc;

    public C3809Ces(AbstractC3804Cen abstractC3804Cen, int i, int i2) {
        this.zzc = abstractC3804Cen;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC3792Ceb.A01(i, this.A01);
        return this.zzc.get(i + this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A01;
    }
}
