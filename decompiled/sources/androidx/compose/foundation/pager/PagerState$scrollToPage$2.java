package androidx.compose.foundation.pager;

import X.AbstractC07127nr;
import X.AbstractC1061ATk;
import X.AnonymousClass001;
import X.C3Q0;
import X.C8j3;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {551}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class PagerState$scrollToPage$2 extends AbstractC07127nr implements G0V<C3Q0, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $page;
    public final /* synthetic */ float $pageOffsetFraction;
    public int label;
    public final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/pager/PagerState;FILX/HtJ<-Landroidx/compose/foundation/pager/PagerState$scrollToPage$2;>;)V */
    public PagerState$scrollToPage$2(PagerState pagerState, HtJ htJ, float f, int i) {
        super(2, htJ);
        this.this$0 = pagerState;
        this.$pageOffsetFraction = f;
        this.$page = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PagerState$scrollToPage$2(this.this$0, htJ, this.$pageOffsetFraction, this.$page);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PagerState pagerState = this.this$0;
            this.label = 1;
            if (PagerState.A02(pagerState, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        float f = this.$pageOffsetFraction;
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            AbstractC1061ATk.A00(FGI.A0R("pageOffsetFraction ", " is not within the range -0.5 to 0.5", f));
            throw F60.createAndThrow();
        }
        this.this$0.A0A(PagerState.A00(this.this$0, this.$page), this.$pageOffsetFraction, true);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3Q0 c3q0, HtJ<? super Unit> htJ) {
        return ((PagerState$scrollToPage$2) C8j3.A1E(htJ, c3q0, this)).invokeSuspend(Unit.INSTANCE);
    }
}
