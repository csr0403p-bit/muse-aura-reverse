package X;

import kotlin.Unit;

/* renamed from: X.1Xd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04751Xd extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $displayMode;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1XI $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04751Xd(C1XI c1xi, BRg bRg, int i, int i2, int i3) {
        super(2);
        this.$tmp0_rcvr = c1xi;
        this.$displayMode = i;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        this.$tmp0_rcvr.A01(this.$displayMode, this.$modifier, AnonymousClass005.A0P(bfm, num), AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
