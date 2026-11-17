package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8ng, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ng extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $accessibilityLabel;
    public final /* synthetic */ G0W<C8ni, BFM, Integer, Unit> $content;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ C8ni $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/8ni;Ljava/lang/String;LX/BRg;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0W<-LX/8ni;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;I)V */
    public C8ng(BRg bRg, C8ni c8ni, String str, Function0 function0, G0W g0w, int i) {
        super(2);
        this.$scope = c8ni;
        this.$accessibilityLabel = str;
        this.$modifier = bRg;
        this.$onClick = function0;
        this.$content = g0w;
        this.$$changed = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        C8nf.A00(AnonymousClass005.A0P(bfm, num), this.$modifier, this.$scope, this.$accessibilityLabel, this.$onClick, this.$content, AnonymousClass011.A00(this.$$changed));
        return Unit.INSTANCE;
    }
}
