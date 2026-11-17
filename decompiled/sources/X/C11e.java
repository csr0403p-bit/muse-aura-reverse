package X;

import kotlin.Unit;

/* renamed from: X.11e, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11e extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0W<C1Cd, BFM, Integer, Unit> $content;
    public final /* synthetic */ APu $enter;
    public final /* synthetic */ APt $exit;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C07C $this_AnimatedVisibility;
    public final /* synthetic */ AOI<Boolean> $visibleState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/07C;LX/AOI<Ljava/lang/Boolean;>;LX/BRg;LX/APu;LX/APt;Ljava/lang/String;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    public C11e(APu aPu, APt aPt, AOI aoi, C07C c07c, BRg bRg, String str, G0W g0w, int i, int i2) {
        super(2);
        this.$this_AnimatedVisibility = c07c;
        this.$visibleState = aoi;
        this.$modifier = bRg;
        this.$enter = aPu;
        this.$exit = aPt;
        this.$label = str;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C07C c07c = this.$this_AnimatedVisibility;
        AbstractC04661Bq.A01(this.$enter, this.$exit, this.$visibleState, c07c, bfmA0P, this.$modifier, this.$label, this.$content, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
