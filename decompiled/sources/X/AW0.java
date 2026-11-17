package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;

/* loaded from: classes4.dex */
public final class AW0 extends Ab8<AVz> {
    public final float A00;
    public final C1EQ A01;
    public final C1DM A02;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AW0) {
                AW0 aw0 = (AW0) obj;
                if (!C1DG.A08(this.A00, aw0.A00) || !C7384Etj.areEqual(this.A01, aw0.A01) || !C7384Etj.areEqual(this.A02, aw0.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new AVz(this.A01, this.A02, this.A00);
    }

    @Override // X.Ab8
    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, AnonymousClass005.A0F(this.A01, C8j4.A04(this.A00)));
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "border";
        BHD bhd = asf.A02;
        bhd.A01(HatchWebPageParserKt.WIDTH_ATTR, C8j3.A0k(this.A00));
        C1EQ c1eq = this.A01;
        if (c1eq instanceof C1326AhD) {
            long j = ((C1326AhD) c1eq).A00;
            bhd.A01("color", C60P.A04(j));
            asf.A00 = C60P.A04(j);
        } else {
            bhd.A01("brush", c1eq);
        }
        bhd.A01("shape", this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BorderModifierNodeElement(width=");
        C1DG.A07(sbA0x, this.A00);
        sbA0x.append(", brush=");
        sbA0x.append(this.A01);
        sbA0x.append(", shape=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AVz aVz = (AVz) abstractC1439Aj8;
        float f = this.A00;
        if (!C1DG.A08(aVz.A00, f)) {
            aVz.A00 = f;
            aVz.A04.ANu();
        }
        C1EQ c1eq = this.A01;
        if (!C7384Etj.areEqual(aVz.A02, c1eq)) {
            aVz.A02 = c1eq;
            aVz.A04.ANu();
        }
        C1DM c1dm = this.A02;
        if (C7384Etj.areEqual(aVz.A03, c1dm)) {
            return;
        }
        aVz.A03 = c1dm;
        aVz.A04.ANu();
        AaW.A00(aVz);
    }

    public AW0(C1EQ c1eq, C1DM c1dm, float f) {
        this.A00 = f;
        this.A01 = c1eq;
        this.A02 = c1dm;
    }
}
