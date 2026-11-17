package X;

import kotlin.Unit;

/* renamed from: X.1XR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XR extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ C1X9 $dateFormatter;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $headline;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $showModeToggle;
    public final /* synthetic */ C0z3 $state;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/0z3;LX/BRg;LX/1X9;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZLX/1Wz;II)V */
    public C1XR(C1Wz c1Wz, C1X9 c1x9, C0z3 c0z3, BRg bRg, G0V g0v, G0V g0v2, int i, int i2, boolean z) {
        super(2);
        this.$state = c0z3;
        this.$modifier = bRg;
        this.$dateFormatter = c1x9;
        this.$title = g0v;
        this.$headline = g0v2;
        this.$showModeToggle = z;
        this.$colors = c1Wz;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C0z3 c0z3 = this.$state;
        BRg bRg = this.$modifier;
        C1XA.A01(this.$colors, this.$dateFormatter, c0z3, bfmA0P, bRg, this.$title, this.$headline, AnonymousClass011.A00(this.$$changed), this.$$default, this.$showModeToggle);
        return Unit.INSTANCE;
    }
}
