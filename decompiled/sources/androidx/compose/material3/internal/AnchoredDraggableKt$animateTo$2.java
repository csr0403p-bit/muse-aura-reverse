package androidx.compose.material3.internal;

import X.AOc;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C05503bw;
import X.C1051ASv;
import X.C3Sn;
import X.C3TN;
import X.EnumC10460Hji;
import X.G2j;
import X.HtJ;
import X.Hwg;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {685}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$2<T> extends AbstractC07127nr implements G2j<C3TN, C3Sn<T>, T, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    public final /* synthetic */ float $velocity;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/material3/internal/AnchoredDraggableState<TT;>;FLX/HtJ<-Landroidx/compose/material3/internal/AnchoredDraggableKt$animateTo$2;>;)V */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, HtJ htJ, float f) {
        super(4, htJ);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(C3TN c3tn, Object obj, Object obj2, HtJ<? super Unit> htJ) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, htJ, this.$velocity);
        anchoredDraggableKt$animateTo$2.L$0 = c3tn;
        anchoredDraggableKt$animateTo$2.L$1 = obj;
        anchoredDraggableKt$animateTo$2.L$2 = obj2;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Object obj2 = this.L$0;
            float fAYD = ((C3Sn) this.L$1).AYD(this.L$2);
            if (!Float.isNaN(fAYD)) {
                C1051ASv c1051ASv = new C1051ASv();
                float fAFn = Float.isNaN(this.$this_animateTo.A05.AFn()) ? 0.0f : this.$this_animateTo.A05.AFn();
                c1051ASv.element = fAFn;
                float f = this.$velocity;
                AOc<Float> aOc = this.$this_animateTo.A00;
                C05503bw c05503bw = new C05503bw(7, c1051ASv, obj2);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (SuspendAnimationKt.A03(aOc, this, c05503bw, fAFn, fAYD, f) == enumC10460Hji) {
                    return enumC10460Hji;
                }
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
