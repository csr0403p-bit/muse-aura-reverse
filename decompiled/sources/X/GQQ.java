package X;

import kotlin.Unit;

/* loaded from: classes6.dex */
public final class GQQ extends AbstractC7559F3s implements G0U<GR9, Unit> {
    public final /* synthetic */ boolean $micEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQQ(boolean z) {
        super(1);
        this.$micEnabled = z;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(GR9 gr9) {
        GR9 gr92 = gr9;
        C7384Etj.A0Y(gr92, 0);
        ((GXO) ((C9597GRd) gr92).A02).A0B.A01.A0P(!this.$micEnabled);
        return Unit.INSTANCE;
    }
}
