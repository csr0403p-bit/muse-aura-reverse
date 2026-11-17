package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.9Vv, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Vv extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $bodyHeight;
    public final /* synthetic */ C9W5 $loader;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ C07409Vs $review;
    public final /* synthetic */ C07429Vx $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/9Vs;FLX/9Vx;LX/9W5;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;I)V */
    public C9Vv(C9W5 c9w5, C07409Vs c07409Vs, C07429Vx c07429Vx, Function0 function0, float f, int i) {
        super(2);
        this.$review = c07409Vs;
        this.$bodyHeight = f;
        this.$style = c07429Vx;
        this.$loader = c9w5;
        this.$onClick = function0;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C07409Vs c07409Vs = this.$review;
        float f = this.$bodyHeight;
        C9Vw.A02(bfmA0P, this.$loader, c07409Vs, this.$style, this.$onClick, f, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
