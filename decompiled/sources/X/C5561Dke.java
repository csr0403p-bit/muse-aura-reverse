package X;

/* renamed from: X.Dke, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5561Dke extends AbstractC5562Dkf {
    public C6154Dwx A00;
    public final int A01;
    public final int A02;
    public final InterfaceC5564Dkh A03;
    public final C5565Dkj A04;
    public final String A05;
    public final boolean A06;

    @Override // X.AbstractC5562Dkf, X.InterfaceC5563Dkg
    public final void ABq(C6154Dwx c6154Dwx) {
        String str = this.A05;
        if (str != null && !str.isEmpty()) {
            C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
            c6162Dx5A01.A0W = str;
            c6154Dwx = BV6.A0U(c6162Dx5A01);
        }
        this.A00 = c6154Dwx;
        super.ABq(c6154Dwx);
    }

    @Override // X.AbstractC5562Dkf, X.InterfaceC5563Dkg
    public final void Abz(DjB djB, int i, int i2, int i3, long j) {
        C6154Dwx c6154Dwx;
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A1x) && (c6154Dwx = this.A00) != null && C6xC.A00(c6154Dwx.A0b, "application/x-mp4-vtt")) {
            i |= 1;
        }
        boolean z = this.A06;
        if (z && this.A02 == 5) {
            long j2 = this.A04.A00;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
        }
        super.Abz(djB, i, i2, i3, j);
        if (z && this.A02 == 1) {
            this.A04.A00 = j;
        }
    }

    public C5561Dke(InterfaceC5563Dkg interfaceC5563Dkg, InterfaceC5564Dkh interfaceC5564Dkh, C5565Dkj c5565Dkj, String str, int i, int i2) {
        super(interfaceC5563Dkg);
        this.A01 = i;
        this.A02 = i2;
        this.A03 = interfaceC5564Dkh;
        this.A04 = c5565Dkj;
        this.A05 = str;
        this.A06 = AbstractC5653Dmh.A03(EnumC5618Dlz.A1U);
    }

    @Override // X.AbstractC5562Dkf, X.InterfaceC5563Dkg
    public final void A9m(long j) {
        super.A9m(j);
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A1X)) {
            this.A03.onTrackDurationUs(this.A01, this.A02, j);
        }
    }
}
