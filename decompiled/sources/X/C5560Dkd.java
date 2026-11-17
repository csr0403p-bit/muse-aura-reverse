package X;

/* renamed from: X.Dkd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5560Dkd extends AbstractC5562Dkf {
    public final int A00;
    public final int A01;
    public final /* synthetic */ C5558Dkb A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5560Dkd(InterfaceC5563Dkg interfaceC5563Dkg, C5558Dkb c5558Dkb, int i, int i2) {
        super(interfaceC5563Dkg);
        this.A02 = c5558Dkb;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC5562Dkf, X.InterfaceC5563Dkg
    public final void A9m(long j) {
        super.A9m(j);
        this.A02.A00.onTrackDurationUs(this.A00, this.A01, j);
    }
}
