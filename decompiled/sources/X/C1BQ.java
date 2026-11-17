package X;

import kotlin.Unit;

/* renamed from: X.1BQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BQ extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<C1Cd, BFM, Integer, Unit> $content;
    public final /* synthetic */ APu $enter;
    public final /* synthetic */ APt $exit;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AOP<T> $this_AnimatedVisibility;
    public final /* synthetic */ G0U<T, Boolean> $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AOP<TT;>;LX/G0U<-TT;Ljava/lang/Boolean;>;LX/BRg;LX/APu;LX/APt;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    public C1BQ(APu aPu, APt aPt, AOP aop, BRg bRg, G0U g0u, G0W g0w, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = aop;
        this.$visible = g0u;
        this.$modifier = bRg;
        this.$enter = aPu;
        this.$exit = aPt;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        AOP<T> aop = this.$this_AnimatedVisibility;
        G0U<T, Boolean> g0u = this.$visible;
        AbstractC04661Bq.A05(this.$enter, this.$exit, aop, bfmA0P, this.$modifier, g0u, this.$content, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
