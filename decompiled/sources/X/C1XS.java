package X;

import kotlin.Unit;

/* renamed from: X.1XS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XS extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ float $headerMinHeight;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $headline;
    public final /* synthetic */ C1822Arm $headlineTextStyle;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $modeToggleButton;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1Wz;LX/Arm;FLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;I)V */
    public C1XS(C1Wz c1Wz, BRg bRg, C1822Arm c1822Arm, G0V g0v, G0V g0v2, G0V g0v3, G0V g0v4, float f, int i) {
        super(2);
        this.$modifier = bRg;
        this.$title = g0v;
        this.$headline = g0v2;
        this.$modeToggleButton = g0v3;
        this.$colors = c1Wz;
        this.$headlineTextStyle = c1822Arm;
        this.$headerMinHeight = f;
        this.$content = g0v4;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        G0V<BFM, Integer, Unit> g0v = this.$title;
        G0V<BFM, Integer, Unit> g0v2 = this.$headline;
        G0V<BFM, Integer, Unit> g0v3 = this.$modeToggleButton;
        C1XA.A07(this.$colors, bfmA0P, bRg, this.$headlineTextStyle, g0v, g0v2, g0v3, this.$content, this.$headerMinHeight, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
