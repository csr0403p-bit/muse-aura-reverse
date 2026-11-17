package X;

/* renamed from: X.Ail, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1416Ail extends Ab8<C1389AiK> {
    public final float A00;
    public final long A01;
    public final long A02;
    public final C1DM A03;
    public final boolean A04;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1416Ail) {
                C1416Ail c1416Ail = (C1416Ail) obj;
                if (C1DG.A08(this.A00, c1416Ail.A00) && C7384Etj.areEqual(this.A03, c1416Ail.A03) && this.A04 == c1416Ail.A04) {
                    long j = this.A01;
                    long j2 = c1416Ail.A01;
                    long j3 = B6A.A01;
                    if (j != j2 || this.A02 != c1416Ail.A02) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        BUX buxA00 = BUX.A00(this, 17);
        C1389AiK c1389AiK = new C1389AiK();
        c1389AiK.A00 = buxA00;
        return c1389AiK;
    }

    @Override // X.Ab8
    public final int hashCode() {
        int iA01 = C0KA.A01(AnonymousClass005.A0F(this.A03, C8j4.A04(this.A00)), this.A04);
        long j = this.A01;
        long j2 = B6A.A01;
        return C8j4.A0B(this.A02, AnonymousClass006.A06(j, iA01));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "shadow";
        BHD bhd = asf.A02;
        bhd.A01("elevation", C8j3.A0k(this.A00));
        bhd.A01("shape", this.A03);
        bhd.A01("clip", Boolean.valueOf(this.A04));
        bhd.A01("ambientColor", C60P.A04(this.A01));
        bhd.A01("spotColor", C60P.A04(this.A02));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ShadowGraphicsLayerElement(elevation=");
        C1DG.A07(sbA0x, this.A00);
        sbA0x.append(", shape=");
        sbA0x.append(this.A03);
        sbA0x.append(", clip=");
        sbA0x.append(this.A04);
        sbA0x.append(", ambientColor=");
        AnonymousClass005.A0m(this.A01, sbA0x);
        sbA0x.append(", spotColor=");
        return AnonymousClass007.A0Z(B6A.A07(this.A02), sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1389AiK c1389AiK = (C1389AiK) abstractC1439Aj8;
        BUX buxA00 = BUX.A00(this, 17);
        c1389AiK.A00 = buxA00;
        AbstractC1339AhQ.A01(c1389AiK, buxA00);
    }

    public C1416Ail(C1DM c1dm, float f, long j, long j2, boolean z) {
        this.A00 = f;
        this.A03 = c1dm;
        this.A04 = z;
        this.A01 = j;
        this.A02 = j2;
    }
}
