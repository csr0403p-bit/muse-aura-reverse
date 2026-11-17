package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Cp, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Cp extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ AT5<Float, AOW> $predictiveBackProgress;
    public final /* synthetic */ BA3 $properties;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BA3;LX/AT5<Ljava/lang/Float;LX/AOW;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;I)V */
    public C1Cp(AT5 at5, BA3 ba3, Function0 function0, G0V g0v, int i) {
        super(2);
        this.$onDismissRequest = function0;
        this.$properties = ba3;
        this.$predictiveBackProgress = at5;
        this.$content = g0v;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        Function0<Unit> function0 = this.$onDismissRequest;
        C1Cq.A00(this.$predictiveBackProgress, this.$properties, bfmA0P, function0, this.$content, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
