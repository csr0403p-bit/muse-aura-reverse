package X;

import kotlin.Unit;

/* renamed from: X.9WE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WE extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C9WB $style;
    public final /* synthetic */ InterfaceC05151eP $this_PlayBadge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9WE(InterfaceC05151eP interfaceC05151eP, C9WB c9wb, int i) {
        super(2);
        this.$this_PlayBadge = interfaceC05151eP;
        this.$style = c9wb;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        C9WA.A01(this.$this_PlayBadge, AnonymousClass005.A0P(bfm, num), this.$style, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
