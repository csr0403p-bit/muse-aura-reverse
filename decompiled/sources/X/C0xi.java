package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0xi, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0xi extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ C0xk $colors;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BRg;ZLX/0xk;LX/AWd;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    public C0xi(InterfaceC1072AWd interfaceC1072AWd, C0xk c0xk, BRg bRg, Function0 function0, G0V g0v, int i, int i2, boolean z) {
        super(2);
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$enabled = z;
        this.$colors = c0xk;
        this.$interactionSource = interfaceC1072AWd;
        this.$content = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        Function0<Unit> function0 = this.$onClick;
        BRg bRg = this.$modifier;
        boolean z = this.$enabled;
        C0xj.A00(this.$interactionSource, this.$colors, bfmA0P, bRg, function0, this.$content, AnonymousClass011.A00(this.$$changed), this.$$default, z);
        return Unit.INSTANCE;
    }
}
