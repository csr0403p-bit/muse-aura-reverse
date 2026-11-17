package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0xm, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0xm extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    public C0xm(Function0 function0, BRg bRg, boolean z, G0V g0v, int i, int i2) {
        super(2);
        this.$onClick = function0;
        this.$expanded = z;
        this.$modifier = bRg;
        this.$content = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        C1XA.A0C(this.$onClick, this.$modifier, this.$expanded, this.$content, bfmA0P, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
