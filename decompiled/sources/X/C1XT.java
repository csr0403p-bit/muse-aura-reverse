package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1XT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XT extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C1Wz $colors;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
    public final /* synthetic */ boolean $currentYear;
    public final /* synthetic */ String $description;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $selected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;ZZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLjava/lang/String;LX/1Wz;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;I)V */
    public C1XT(C1Wz c1Wz, BRg bRg, String str, Function0 function0, G0V g0v, int i, boolean z, boolean z2, boolean z3) {
        super(2);
        this.$modifier = bRg;
        this.$selected = z;
        this.$currentYear = z2;
        this.$onClick = function0;
        this.$enabled = z3;
        this.$description = str;
        this.$colors = c1Wz;
        this.$content = g0v;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        BRg bRg = this.$modifier;
        boolean z = this.$selected;
        boolean z2 = this.$currentYear;
        Function0<Unit> function0 = this.$onClick;
        boolean z3 = this.$enabled;
        C1XA.A09(this.$colors, bfmA0P, bRg, this.$description, function0, this.$content, AnonymousClass011.A00(this.$$changed), z, z2, z3);
        return Unit.INSTANCE;
    }
}
