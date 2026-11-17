package androidx.compose.foundation.gestures;

import X.AOc;
import X.AbstractC07127nr;
import X.AcX;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G2j;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1153Acj;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: Add missing generic type declarations: [T] */
@DebugMetadata(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$4", f = "AnchoredDraggable.kt", l = {1378}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class AnchoredDraggableKt$animateTo$4<T> extends AbstractC07127nr implements G2j<AcX, InterfaceC1153Acj<T>, T, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AOc<Float> $animationSpec;
    public final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/AnchoredDraggableState<TT;>;LX/AOc<Ljava/lang/Float;>;LX/HtJ<-Landroidx/compose/foundation/gestures/AnchoredDraggableKt$animateTo$4;>;)V */
    public AnchoredDraggableKt$animateTo$4(AOc aOc, AnchoredDraggableState anchoredDraggableState, HtJ htJ) {
        super(4, htJ);
        this.$this_animateTo = anchoredDraggableState;
        this.$animationSpec = aOc;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(AcX acX, Object obj, Object obj2, HtJ<? super Unit> htJ) {
        AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.$animationSpec, anchoredDraggableState, htJ);
        anchoredDraggableKt$animateTo$4.L$0 = acX;
        anchoredDraggableKt$animateTo$4.L$1 = obj;
        anchoredDraggableKt$animateTo$4.L$2 = obj2;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AcX acX = (AcX) this.L$0;
            InterfaceC1153Acj interfaceC1153Acj = (InterfaceC1153Acj) this.L$1;
            Object obj2 = this.L$2;
            AnchoredDraggableState<T> anchoredDraggableState = this.$this_animateTo;
            float fAFn = anchoredDraggableState.A07.AFn();
            AOc<Float> aOc = this.$animationSpec;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (AnchoredDraggableKt.A01(aOc, acX, anchoredDraggableState, interfaceC1153Acj, obj2, this, fAFn) == enumC10460Hji) {
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
