package androidx.compose.foundation.text.selection;

import X.ARY;
import X.AT5;
import X.AVf;
import X.AWx;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1", f = "SelectionMagnifier.kt", l = {96}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<AWx, ARY> $animatable;
    public final /* synthetic */ long $targetValue;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AT5<LX/AWx;LX/ARY;>;JLX/HtJ<-Landroidx/compose/foundation/text/selection/SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1;>;)V */
    public SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(AT5 at5, HtJ htJ, long j) {
        super(2, htJ);
        this.$animatable = at5;
        this.$targetValue = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(this.$animatable, htJ, this.$targetValue);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<AWx, ARY> at5 = this.$animatable;
            AWx aWx = new AWx(this.$targetValue);
            C1003AOr<AWx> c1003AOr = AVf.A02;
            this.label = 1;
            if (AnonymousClass002.A0i(at5, c1003AOr, aWx, this, null) == enumC10460Hji) {
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
}
