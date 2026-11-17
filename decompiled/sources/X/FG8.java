package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FG8<R> implements InterfaceC7812FFt {
    public final /* synthetic */ FET A00;
    public final /* synthetic */ InterfaceC7992FOj A01;

    public FG8(FET fet, InterfaceC7992FOj interfaceC7992FOj) {
        this.A01 = interfaceC7992FOj;
        this.A00 = fet;
    }

    @Override // X.FE2
    public final /* bridge */ /* synthetic */ void ANz(InterfaceC7762FDp interfaceC7762FDp) {
        View viewAGB = this.A01.AGB();
        C7384Etj.A0Z(viewAGB, "null cannot be cast to non-null type com.facebook.rendercore.RenderTreeHostView");
        ((FGR) viewAGB).setMountInput(this.A00);
    }
}
