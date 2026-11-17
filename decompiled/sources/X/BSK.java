package X;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BSK implements PointerInputEventHandler {
    public final int $t;
    public final Object A00;
    public final Object A01;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
        Object objA00;
        EnumC10460Hji enumC10460Hji;
        switch (this.$t) {
            case 0:
                objA00 = bRr.A50(new C2323BTx(this.A00, htJ.getContext(), ((C1322Ah9) this.A01).A07, null, 0), htJ);
                enumC10460Hji = EnumC10460Hji.A02;
                if (objA00 != enumC10460Hji) {
                    objA00 = Unit.INSTANCE;
                    break;
                }
                break;
            case 1:
                objA00 = TapGestureDetectorKt.A06(bRr, htJ, null, null, BTA.A01(this.A01, this.A00, 41), TapGestureDetectorKt.A00);
                enumC10460Hji = EnumC10460Hji.A02;
                break;
            case 2:
                objA00 = Hxb.A00(new BUF(bRr, this.A01, this.A00, (HtJ) null, (HtJ<? super BUF>) 5), htJ);
                enumC10460Hji = EnumC10460Hji.A02;
                break;
            case 3:
                objA00 = SelectionGesturesKt.A00((Av5) this.A00, (Av6) this.A01, bRr, htJ);
                enumC10460Hji = EnumC10460Hji.A02;
                break;
            default:
                objA00 = ForEachGestureKt.A01(bRr, htJ, new C2322BTw(this.A01, this.A00, null, 5, 42));
                enumC10460Hji = EnumC10460Hji.A02;
                break;
        }
        return objA00 != enumC10460Hji ? Unit.INSTANCE : objA00;
    }

    public BSK(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}
