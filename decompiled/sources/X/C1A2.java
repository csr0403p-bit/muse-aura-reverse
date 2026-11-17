package X;

import kotlin.Unit;

/* renamed from: X.1A2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ float $animationProgress;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $container;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $label;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<AWA, Unit> $onLabelMeasured;
    public final /* synthetic */ C3TQ $paddingValues;
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $placeholder;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $prefix;
    public final /* synthetic */ boolean $singleLine;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $suffix;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $supporting;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $textField;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0W<-LX/BRg;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZFLX/G0U<-LX/AWA;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/3TQ;II)V */
    public C1A2(C3TQ c3tq, BRg bRg, G0U g0u, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, G0V g0v5, G0V g0v6, G0V g0v7, G0V g0v8, G0W g0w, float f, int i, int i2, boolean z) {
        super(2);
        this.$modifier = bRg;
        this.$textField = g0v;
        this.$placeholder = g0w;
        this.$label = g0v2;
        this.$leading = g0v3;
        this.$trailing = g0v4;
        this.$prefix = g0v5;
        this.$suffix = g0v6;
        this.$singleLine = z;
        this.$animationProgress = f;
        this.$onLabelMeasured = g0u;
        this.$container = g0v7;
        this.$supporting = g0v8;
        this.$paddingValues = c3tq;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        G0V<BFM, Integer, Unit> g0v = this.$textField;
        G0W<BRg, BFM, Integer, Unit> g0w = this.$placeholder;
        G0V<BFM, Integer, Unit> g0v2 = this.$label;
        G0V<BFM, Integer, Unit> g0v3 = this.$leading;
        G0V<BFM, Integer, Unit> g0v4 = this.$trailing;
        G0V<BFM, Integer, Unit> g0v5 = this.$prefix;
        G0V<BFM, Integer, Unit> g0v6 = this.$suffix;
        boolean z = this.$singleLine;
        float f = this.$animationProgress;
        C1A3.A02(this.$paddingValues, bfmA0P, bRg, this.$onLabelMeasured, g0v, g0v2, g0v3, g0v4, g0v5, g0v6, this.$container, this.$supporting, g0w, f, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), z);
        return Unit.INSTANCE;
    }
}
