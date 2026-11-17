package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.11K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11K extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C0jF $colors;
    public final /* synthetic */ C3TQ $contentPadding;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingIcon;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $text;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZLX/0jF;LX/3TQ;LX/AWd;I)V */
    public C11K(InterfaceC1072AWd interfaceC1072AWd, C3TQ c3tq, C0jF c0jF, BRg bRg, Function0 function0, G0V g0v, G0V g0v2, G0V g0v3, int i, boolean z) {
        super(2);
        this.$text = g0v;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$leadingIcon = g0v2;
        this.$trailingIcon = g0v3;
        this.$enabled = z;
        this.$colors = c0jF;
        this.$contentPadding = c3tq;
        this.$interactionSource = interfaceC1072AWd;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        G0V<BFM, Integer, Unit> g0v = this.$text;
        Function0<Unit> function0 = this.$onClick;
        BRg bRg = this.$modifier;
        G0V<BFM, Integer, Unit> g0v2 = this.$leadingIcon;
        G0V<BFM, Integer, Unit> g0v3 = this.$trailingIcon;
        boolean z = this.$enabled;
        C0jF c0jF = this.$colors;
        C11P.A01(this.$interactionSource, this.$contentPadding, c0jF, bfmA0P, bRg, function0, g0v, g0v2, g0v3, AnonymousClass011.A00(this.$$changed), z);
        return Unit.INSTANCE;
    }
}
