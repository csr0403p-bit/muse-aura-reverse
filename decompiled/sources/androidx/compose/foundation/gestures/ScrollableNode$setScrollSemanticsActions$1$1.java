package androidx.compose.foundation.gestures;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C1262Ag1;
import X.C3UX;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", f = "Scrollable.kt", l = {606}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class ScrollableNode$setScrollSemanticsActions$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ float $x;
    public final /* synthetic */ float $y;
    public int label;
    public final /* synthetic */ C1262Ag1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Ag1;FFLX/HtJ<-Landroidx/compose/foundation/gestures/ScrollableNode$setScrollSemanticsActions$1$1;>;)V */
    public ScrollableNode$setScrollSemanticsActions$1$1(C1262Ag1 c1262Ag1, HtJ htJ, float f, float f2) {
        super(2, htJ);
        this.this$0 = c1262Ag1;
        this.$x = f;
        this.$y = f2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ScrollableNode$setScrollSemanticsActions$1$1(this.this$0, htJ, this.$x, this.$y);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ScrollingLogic scrollingLogic = this.this$0.A07;
            long jA0A = AnonymousClass007.A0A(this.$x, this.$y);
            this.label = 1;
            if (ScrollableKt.A00(scrollingLogic, this, jA0A) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ScrollableNode$setScrollSemanticsActions$1$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
