package androidx.compose.material3;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1Pn;
import X.C1Vj;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", f = "ModalBottomSheet.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ float $it;
    public final /* synthetic */ C1Pn $sheetState;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/1Pn;FLX/HtJ<-Landroidx/compose/material3/ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1;>;)V */
    public ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(C1Pn c1Pn, HtJ htJ, float f) {
        super(2, htJ);
        this.$sheetState = c1Pn;
        this.$it = f;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(this.$sheetState, htJ, this.$it);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1Pn c1Pn = this.$sheetState;
            float f = this.$it;
            this.label = 1;
            AnchoredDraggableState<C1Vj> anchoredDraggableState = c1Pn.A00;
            Object value = anchoredDraggableState.A07.getValue();
            Object objA01 = AnchoredDraggableState.A01(anchoredDraggableState, value, anchoredDraggableState.A02(), f);
            if ((AnonymousClass003.A1X(objA01, anchoredDraggableState.A0B) ? AnchoredDraggableKt.A00(anchoredDraggableState, objA01, this, f) : AnchoredDraggableKt.A00(anchoredDraggableState, value, this, f)) == enumC10460Hji) {
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
