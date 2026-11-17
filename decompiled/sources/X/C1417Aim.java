package X;

/* renamed from: X.Aim, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1417Aim extends Ab8<C1418Ain> {
    public final float A00;
    public final float A02;
    public final float A05;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final C1DM A0B;
    public final boolean A0C;
    public final float A03 = 1.0f;
    public final float A04 = 1.0f;
    public final float A01 = 8.0f;
    public final int A06 = 3;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1417Aim) {
                C1417Aim c1417Aim = (C1417Aim) obj;
                if (Float.compare(this.A03, c1417Aim.A03) == 0 && Float.compare(this.A04, c1417Aim.A04) == 0 && Float.compare(this.A00, c1417Aim.A00) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.A05, c1417Aim.A05) == 0 && Float.compare(this.A02, c1417Aim.A02) == 0 && Float.compare(this.A01, c1417Aim.A01) == 0) {
                    long j = this.A0A;
                    long j2 = c1417Aim.A0A;
                    long j3 = C15k.A01;
                    if (j == j2 && C7384Etj.areEqual(this.A0B, c1417Aim.A0B) && this.A0C == c1417Aim.A0C) {
                        long j4 = this.A08;
                        long j5 = c1417Aim.A08;
                        long j6 = B6A.A01;
                        if (j4 != j5 || this.A09 != c1417Aim.A09 || this.A07 != c1417Aim.A07 || this.A06 != c1417Aim.A06) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C1417Aim(C1DM c1dm, float f, float f2, float f3, int i, long j, long j2, long j3, boolean z) {
        this.A00 = f;
        this.A05 = f2;
        this.A02 = f3;
        this.A0A = j;
        this.A0B = c1dm;
        this.A0C = z;
        this.A08 = j2;
        this.A09 = j3;
        this.A07 = i;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        float f = this.A03;
        float f2 = this.A04;
        float f3 = this.A00;
        float f4 = this.A05;
        float f5 = this.A02;
        float f6 = this.A01;
        long j = this.A0A;
        C1DM c1dm = this.A0B;
        boolean z = this.A0C;
        long j2 = this.A08;
        long j3 = this.A09;
        int i = this.A07;
        int i2 = this.A06;
        C1418Ain c1418Ain = new C1418Ain();
        c1418Ain.A03 = f;
        c1418Ain.A04 = f2;
        c1418Ain.A00 = f3;
        c1418Ain.A05 = f4;
        c1418Ain.A02 = f5;
        c1418Ain.A01 = f6;
        c1418Ain.A0A = j;
        c1418Ain.A0B = c1dm;
        c1418Ain.A0D = z;
        c1418Ain.A08 = j2;
        c1418Ain.A09 = j3;
        c1418Ain.A07 = i;
        c1418Ain.A06 = i2;
        c1418Ain.A0C = BUX.A00(c1418Ain, 18);
        return c1418Ain;
    }

    @Override // X.Ab8
    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A03), this.A04), this.A00);
        int iFloatToIntBits = Float.floatToIntBits(0.0f);
        int iA022 = AnonymousClass005.A02(AnonymousClass005.A02((((AnonymousClass005.A02((((iA02 + iFloatToIntBits) * 31) + iFloatToIntBits) * 31, this.A05) + iFloatToIntBits) * 31) + iFloatToIntBits) * 31, this.A02), this.A01);
        long j = this.A0A;
        long j2 = C15k.A01;
        int iA01 = C0KA.A01(AnonymousClass005.A0F(this.A0B, AnonymousClass006.A06(j, iA022)), this.A0C) * 31;
        long j3 = this.A08;
        long j4 = B6A.A01;
        return (((AnonymousClass006.A06(this.A09, AnonymousClass006.A06(j3, iA01)) + this.A07) * 31) + this.A06) * 31;
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "graphicsLayer";
        BHD bhd = asf.A02;
        bhd.A01("scaleX", Float.valueOf(this.A03));
        bhd.A01("scaleY", Float.valueOf(this.A04));
        bhd.A01("alpha", Float.valueOf(this.A00));
        Float fA0a = AnonymousClass005.A0a();
        bhd.A01("translationX", fA0a);
        bhd.A01("translationY", fA0a);
        bhd.A01("shadowElevation", Float.valueOf(this.A05));
        bhd.A01("rotationX", fA0a);
        bhd.A01("rotationY", fA0a);
        bhd.A01("rotationZ", Float.valueOf(this.A02));
        bhd.A01("cameraDistance", Float.valueOf(this.A01));
        bhd.A01("transformOrigin", new C15k(this.A0A));
        bhd.A01("shape", this.A0B);
        bhd.A01("clip", Boolean.valueOf(this.A0C));
        bhd.A01("renderEffect", null);
        bhd.A01("ambientShadowColor", C60P.A04(this.A08));
        bhd.A01("spotShadowColor", C60P.A04(this.A09));
        bhd.A01("compositingStrategy", new C1421Aiq(this.A07));
        bhd.A01("blendMode", new C1422Air(this.A06));
        bhd.A01("colorFilter", null);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("GraphicsLayerElement(scaleX=");
        sbA0x.append(this.A03);
        sbA0x.append(", scaleY=");
        sbA0x.append(this.A04);
        sbA0x.append(", alpha=");
        sbA0x.append(this.A00);
        sbA0x.append(", translationX=");
        sbA0x.append(0.0f);
        sbA0x.append(", translationY=");
        sbA0x.append(0.0f);
        sbA0x.append(", shadowElevation=");
        sbA0x.append(this.A05);
        sbA0x.append(", rotationX=");
        sbA0x.append(0.0f);
        sbA0x.append(", rotationY=");
        sbA0x.append(0.0f);
        sbA0x.append(", rotationZ=");
        sbA0x.append(this.A02);
        sbA0x.append(", cameraDistance=");
        sbA0x.append(this.A01);
        sbA0x.append(", transformOrigin=");
        long j = this.A0A;
        long j2 = C15k.A01;
        StringBuilder sb = new StringBuilder("TransformOrigin(packedValue=");
        sb.append(j);
        sbA0x.append((Object) AnonymousClass006.A0z(sb));
        sbA0x.append(", shape=");
        sbA0x.append(this.A0B);
        sbA0x.append(", clip=");
        sbA0x.append(this.A0C);
        C8j4.A1R(sbA0x, ", renderEffect=");
        sbA0x.append(", ambientShadowColor=");
        AnonymousClass005.A0m(this.A08, sbA0x);
        sbA0x.append(", spotShadowColor=");
        AnonymousClass005.A0m(this.A09, sbA0x);
        sbA0x.append(", compositingStrategy=");
        sbA0x.append((Object) FGI.A0G("CompositingStrategy(value=", ')', this.A07));
        sbA0x.append(", blendMode=");
        sbA0x.append((Object) C1422Air.A00(this.A06));
        C8j4.A1R(sbA0x, ", colorFilter=");
        return C8j3.A16(sbA0x, ')');
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1418Ain c1418Ain = (C1418Ain) abstractC1439Aj8;
        c1418Ain.A03 = this.A03;
        c1418Ain.A04 = this.A04;
        c1418Ain.A00 = this.A00;
        c1418Ain.A05 = this.A05;
        c1418Ain.A02 = this.A02;
        c1418Ain.A01 = this.A01;
        c1418Ain.A0A = this.A0A;
        c1418Ain.A0B = this.A0B;
        c1418Ain.A0D = this.A0C;
        c1418Ain.A08 = this.A08;
        c1418Ain.A09 = this.A09;
        c1418Ain.A07 = this.A07;
        c1418Ain.A06 = this.A06;
        AbstractC1339AhQ.A01(c1418Ain, c1418Ain.A0C);
    }
}
