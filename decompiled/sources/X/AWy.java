package X;

import androidx.compose.foundation.gestures.PressGestureScopeImpl;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AWy implements PointerInputEventHandler {
    public final /* synthetic */ InterfaceC1072AWd A00;
    public final /* synthetic */ MutableState<AWp> A01;
    public final /* synthetic */ C1BO<G0U<AWx, Unit>> A02;
    public final /* synthetic */ C3UX A03;

    /* JADX WARN: Incorrect types in method signature: (LX/3UX;Landroidx/compose/runtime/MutableState<LX/AWp;>;LX/AWd;LX/1BO<+LX/G0U<-LX/AWx;Lkotlin/Unit;>;>;)V */
    public AWy(InterfaceC1072AWd interfaceC1072AWd, MutableState mutableState, C1BO c1bo, C3UX c3ux) {
        this.A03 = c3ux;
        this.A01 = mutableState;
        this.A00 = interfaceC1072AWd;
        this.A02 = c1bo;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
        TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1 = new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.A00, this.A01, null, this.A03);
        C2294BSu c2294BSuA00 = C2294BSu.A00(this.A02, 12);
        G0W<AWo, AWx, HtJ<? super Unit>, Object> g0w = TapGestureDetectorKt.A00;
        Object objA00 = Hxb.A00(new BUI((Object) new PressGestureScopeImpl(bRr), bRr, (G0W<? super AWo, ? super AWx, ? super HtJ<? super Unit>, ? extends Object>) null, (G0U<? super AWx, Unit>) c2294BSuA00, (PressGestureScopeImpl) textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, (HtJ<? super BUI>) 0), htJ);
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA00 != enumC10460Hji) {
            objA00 = Unit.INSTANCE;
        }
        return objA00 != enumC10460Hji ? Unit.INSTANCE : objA00;
    }
}
