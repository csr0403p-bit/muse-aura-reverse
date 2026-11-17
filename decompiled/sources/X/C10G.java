package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.10G, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C10G {
    public static final C1062ATq A02 = new C1062ATq(C79.A01, "fillMaxWidth", 1.0f);
    public static final C1062ATq A00 = new C1062ATq(C79.A00, "fillMaxHeight", 1.0f);
    public static final C1062ATq A01 = new C1062ATq(C79.A0C, "fillMaxSize", 1.0f);
    public static final ATo A07 = ATo.A00(C2VU.A00, false);
    public static final ATo A08 = ATo.A00(C2VU.A02, false);
    public static final ATo A03 = ATo.A01(C2VU.A04, false);
    public static final ATo A04 = ATo.A01(C2VU.A05, false);
    public static final ATo A05 = ATo.A02(C2VU.A09, false);
    public static final ATo A06 = ATo.A02(C2VU.A0E, false);

    public static final BRg A00(C3TH c3th, BRg bRg, boolean z) {
        return bRg.then((!C7384Etj.areEqual(c3th, C2VU.A00) || z) ? (!C7384Etj.areEqual(c3th, C2VU.A02) || z) ? ATo.A00(c3th, z) : A08 : A07);
    }

    public static final BRg A01(C1AC c1ac, BRg bRg, boolean z) {
        return bRg.then((!c1ac.equals(C2VU.A04) || z) ? (!c1ac.equals(C2VU.A05) || z) ? ATo.A01(c1ac, z) : A04 : A03);
    }

    public static final BRg A02(Alignment alignment, BRg bRg, boolean z) {
        return bRg.then((!alignment.equals(C2VU.A09) || z) ? (!alignment.equals(C2VU.A0E) || z) ? ATo.A02(alignment, z) : A06 : A05);
    }

    public static final BRg A03(BRg bRg, float f) {
        return bRg.then(f == 1.0f ? A02 : new C1062ATq(C79.A01, "fillMaxWidth", f));
    }

    public static final BRg A04(BRg bRg, float f) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, Float.NaN, f, Float.NaN, f, true));
    }

    public static final BRg A05(BRg bRg, float f) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, Float.NaN, f, Float.NaN, f, false));
    }

    public static final BRg A06(BRg bRg, float f) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, f, f, f, f, false));
    }

    public static final BRg A07(BRg bRg, float f) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, f, f, f, f, true));
    }

    public static final BRg A08(BRg bRg, float f) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, f, Float.NaN, f, Float.NaN, true));
    }

    public static final BRg A09(BRg bRg, final float f, final float f2) {
        return bRg.then(new Ab8<C3UA>(f, f2) { // from class: X.3U9
            public final float A00;
            public final float A01;

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                float f3 = this.A01;
                float f4 = this.A00;
                C3UA c3ua = new C3UA();
                c3ua.A01 = f3;
                c3ua.A00 = f4;
                return c3ua;
            }

            @Override // X.Ab8
            public final boolean equals(Object obj) {
                if (!(obj instanceof C3U9)) {
                    return false;
                }
                C3U9 c3u9 = (C3U9) obj;
                return C1DG.A08(this.A01, c3u9.A01) && C1DG.A08(this.A00, c3u9.A00);
            }

            @Override // X.Ab8
            public final int hashCode() {
                return (Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A00);
            }

            @Override // X.Ab8
            public final void inspectableProperties(ASF asf) {
                asf.A01 = "defaultMinSize";
                BHD bhd = asf.A02;
                bhd.A01("minWidth", new C1DG(this.A01));
                bhd.A01("minHeight", new C1DG(this.A00));
            }

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                C3UA c3ua = (C3UA) abstractC1439Aj8;
                c3ua.A01 = this.A01;
                c3ua.A00 = this.A00;
            }

            {
                this.A01 = f;
                this.A00 = f2;
            }
        });
    }

    public static final BRg A0A(BRg bRg, float f, float f2) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, Float.NaN, f, Float.NaN, f2, true));
    }

    public static final BRg A0B(BRg bRg, float f, float f2) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, f, f2, f, f2, false));
    }

    public static final BRg A0C(BRg bRg, float f, float f2) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, f, f2, f, f2, true));
    }

    public static final BRg A0D(BRg bRg, float f, float f2) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, f, Float.NaN, f2, Float.NaN, true));
    }

    public static final BRg A0E(BRg bRg, float f, float f2, float f3, float f4) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, f, f2, f3, f4, false));
    }

    public static final BRg A0F(BRg bRg, float f, float f2, float f3, float f4) {
        return bRg.then(new C3UM(AbstractC2139Az7.A00, f, f2, f3, f4, true));
    }
}
