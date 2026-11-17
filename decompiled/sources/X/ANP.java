package X;

import androidx.compose.ui.Alignment;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ANP extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G2j<C06c, S, BFM, Integer, Unit> $content;
    public final /* synthetic */ Alignment $contentAlignment;
    public final /* synthetic */ G0U<S, Object> $contentKey;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ S $targetState;
    public final /* synthetic */ G0U<ANi<S>, ANU> $transitionSpec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TS;LX/BRg;LX/G0U<-LX/ANi<TS;>;LX/ANU;>;Landroidx/compose/ui/Alignment;Ljava/lang/String;LX/G0U<-TS;+Ljava/lang/Object;>;LX/G2j<-LX/06c;-TS;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;II)V */
    /* JADX WARN: Multi-variable type inference failed */
    public ANP(Alignment alignment, BRg bRg, Object obj, String str, G0U g0u, G0U g0u2, G2j g2j, int i, int i2) {
        super(2);
        this.$targetState = obj;
        this.$modifier = bRg;
        this.$transitionSpec = g0u;
        this.$contentAlignment = alignment;
        this.$label = str;
        this.$contentKey = g0u2;
        this.$content = g2j;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        BFM bfmA0P = AnonymousClass005.A0P(bfm, num);
        S s = this.$targetState;
        ANR.A02(bfmA0P, this.$contentAlignment, this.$modifier, s, this.$label, this.$transitionSpec, this.$contentKey, this.$content, AnonymousClass011.A00(this.$$changed), this.$$default);
        return Unit.INSTANCE;
    }
}
