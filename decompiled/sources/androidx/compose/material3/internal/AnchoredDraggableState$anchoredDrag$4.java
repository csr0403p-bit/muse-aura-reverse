package androidx.compose.material3.internal;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C05393bl;
import X.C05453br;
import X.C1257Aft;
import X.C3Sn;
import X.C3TI;
import X.C3TN;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {569}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$4 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ G2j<C3TN, C3Sn<T>, T, HtJ<? super Unit>, Object> $block;
    public final /* synthetic */ T $targetValue;
    public int label;
    public final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/material3/internal/AnchoredDraggableState<TT;>;TT;LX/G2j<-LX/3TN;-LX/3Sn<TT;>;-TT;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Landroidx/compose/material3/internal/AnchoredDraggableState$anchoredDrag$4;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState anchoredDraggableState, Object obj, HtJ htJ, G2j g2j) {
        super(1, htJ);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = obj;
        this.$block = g2j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, htJ, this.$block);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super Unit> htJ) {
        return ((AnchoredDraggableState$anchoredDrag$4) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            anchoredDraggableState.A08.Af8(this.$targetValue);
            Object obj2 = this.this$0;
            C05453br c05453br = new C05453br(obj2, 11);
            C05393bl c05393bl = new C05393bl(obj2, (G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object>) null, (C3TI) this.$block, (HtJ<? super C05393bl>) 9);
            this.label = 1;
            if (AnchoredDraggableKt.A01(this, c05453br, c05393bl) == enumC10460Hji) {
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
