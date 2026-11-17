package X;

/* loaded from: classes5.dex */
public final class CG0 implements DLT {
    public final DFW A00;
    public final boolean A01;

    public CG0(DFX dfx, String str) {
        C7384Etj.A0Y(dfx, 0);
        DFW dfwA01 = DFX.A01(dfx, C79.A00, null, str, true);
        C7384Etj.A0U(dfwA01);
        this.A00 = dfwA01;
        this.A01 = dfwA01.A0A();
    }

    @Override // X.DLT
    public final /* bridge */ /* synthetic */ DLT addParameter(String str, double d) {
        C7384Etj.A0Y(str, 0);
        if (this.A01) {
            this.A00.A08(str, Double.valueOf(d));
        }
        return this;
    }

    @Override // X.DLT
    public final void logAndRelease() {
        if (this.A01) {
            this.A00.A05();
        }
    }

    @Override // X.DLT
    public final /* bridge */ /* synthetic */ DLT addParameter(String str, int i) {
        C7384Etj.A0Y(str, 0);
        if (this.A01) {
            this.A00.A08(str, Integer.valueOf(i));
        }
        return this;
    }

    @Override // X.DLT
    public final /* bridge */ /* synthetic */ DLT addParameter(String str, long j) {
        C7384Etj.A0Y(str, 0);
        if (this.A01) {
            this.A00.A08(str, Long.valueOf(j));
        }
        return this;
    }

    @Override // X.DLT
    public final /* bridge */ /* synthetic */ DLT addParameter(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (this.A01) {
            this.A00.A09(str, str2);
        }
        return this;
    }

    @Override // X.DLT
    public final /* bridge */ /* synthetic */ DLT addParameter(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        if (this.A01) {
            this.A00.A07(Boolean.valueOf(z), str);
        }
        return this;
    }
}
