package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0xq, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0xq extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $confirmButton;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $dismissButton;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ BA2 $properties;
    public final /* synthetic */ C1DM $shape;
    public final /* synthetic */ float $tonalElevation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/1DM;FLX/1Wz;LX/BA2;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    public C0xq(C1Wz c1Wz, BRg bRg, C1DM c1dm, BA2 ba2, Function0 function0, G0V g0v, G0V g0v2, G0W g0w, float f, int i, int i2) {
        super(2);
        this.$onDismissRequest = function0;
        this.$confirmButton = g0v;
        this.$modifier = bRg;
        this.$dismissButton = g0v2;
        this.$shape = c1dm;
        this.$tonalElevation = f;
        this.$colors = c1Wz;
        this.$properties = ba2;
        this.$content = g0w;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        Function0<Unit> function0 = this.$onDismissRequest;
        G0V<BFM, Integer, Unit> g0v = this.$confirmButton;
        BRg bRg = this.$modifier;
        G0V<BFM, Integer, Unit> g0v2 = this.$dismissButton;
        C0xo.A00(this.$colors, bfmA0P, bRg, this.$shape, this.$properties, function0, g0v, g0v2, this.$content, this.$tonalElevation, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
