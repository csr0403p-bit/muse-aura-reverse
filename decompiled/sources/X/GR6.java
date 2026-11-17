package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GR6 extends AbstractC7559F3s implements G0U<GR9, Unit> {
    public final /* synthetic */ int $endCallReason;
    public final /* synthetic */ boolean $shouldInformPeer = true;
    public final /* synthetic */ String $subReason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GR6(int i, String str) {
        super(1);
        this.$endCallReason = i;
        this.$subReason = str;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(GR9 gr9) {
        GR9 gr92 = gr9;
        C7384Etj.A0Y(gr92, 0);
        ((C9597GRd) gr92).A03.end(this.$endCallReason, this.$subReason, this.$shouldInformPeer);
        return Unit.INSTANCE;
    }
}
