package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class FG9 implements InterfaceC7833FGo<FDW, FHQ, Void> {
    public final /* synthetic */ FBB A00;
    public final /* synthetic */ InterfaceC7992FOj A01;

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        C7384Etj.A0Y(fg3, 0);
        if (obj3 != null) {
            FET fet = (FET) obj3;
            FBB fbb = this.A00;
            InterfaceC7992FOj interfaceC7992FOj = this.A01;
            if (FBA.A04(fbb).A03) {
                fg3.AiD(new FG8(fet, interfaceC7992FOj));
                return null;
            }
            FGR.A01(fet, interfaceC7992FOj.AGB());
        }
        return null;
    }

    public FG9(FBB fbb, InterfaceC7992FOj interfaceC7992FOj) {
        this.A00 = fbb;
        this.A01 = interfaceC7992FOj;
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ boolean Afc(FDW fdw, FDW fdw2, Object obj, Object obj2) {
        FDW fdw3 = fdw;
        FDW fdw4 = fdw2;
        AnonymousClass003.A0u(fdw3, fdw4);
        FBB fbb = this.A00;
        return FBA.A0A(fbb) ? FBA.A04(fbb).A03 ? !C7384Etj.areEqual(obj, obj2) : obj != null : fdw3.A0C(40) != fdw4.A0C(40);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ String getDescription() {
        return AbstractC7608F5v.A0w(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
