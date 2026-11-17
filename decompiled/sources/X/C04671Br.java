package X;

import kotlin.Unit;

/* renamed from: X.1Br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04671Br extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<C1Cd, BFM, Integer, Unit> $content;
    public final /* synthetic */ APu $enter;
    public final /* synthetic */ APt $exit;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ InterfaceC04681Bs $onLookaheadMeasured = null;
    public final /* synthetic */ G0V<EnumC04711Bv, EnumC04711Bv, Boolean> $shouldDisposeBlock;
    public final /* synthetic */ AOP<T> $transition;
    public final /* synthetic */ G0U<T, Boolean> $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04671Br(APu aPu, APt aPt, AOP aop, BRg bRg, G0U g0u, G0V g0v, G0W g0w, int i, int i2) {
        super(2);
        this.$transition = aop;
        this.$visible = g0u;
        this.$modifier = bRg;
        this.$enter = aPu;
        this.$exit = aPt;
        this.$shouldDisposeBlock = g0v;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        AOP<T> aop = this.$transition;
        G0U<T, Boolean> g0u = this.$visible;
        AbstractC04661Bq.A03(this.$enter, this.$exit, aop, bfmA0P, this.$modifier, g0u, this.$shouldDisposeBlock, this.$content, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
