package androidx.compose.foundation.text.selection;

import X.AbstractC07117nq;
import X.AbstractC0878AGe;
import X.AbstractC1078AXh;
import X.AnonymousClass001;
import X.BO7;
import X.C1299Agk;
import X.C2296BSw;
import X.C8j3;
import X.EnumC10460Hji;
import X.EnumC2008AwJ;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1074AXb;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super EnumC2008AwJ>, Object> {
    public final /* synthetic */ BO7 $overSlop;
    public final /* synthetic */ long $pointerId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (JLX/BO7;LX/HtJ<-Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;>;)V */
    public SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(HtJ htJ, BO7 bo7, long j) {
        super(2, htJ);
        this.$pointerId = j;
        this.$overSlop = bo7;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1 = new SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1(htJ, this.$overSlop, this.$pointerId);
        selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1.L$0 = obj;
        return selectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        InterfaceC1074AXb interfaceC1074AXbA0g;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            interfaceC1074AXbA0g = (InterfaceC1074AXb) this.L$0;
            long j = this.$pointerId;
            C2296BSw c2296BSw = new C2296BSw(this.$overSlop, 8);
            this.L$0 = interfaceC1074AXbA0g;
            this.label = 1;
            obj = DragGestureDetectorKt.A0B(interfaceC1074AXbA0g, this, c2296BSw, j);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            interfaceC1074AXbA0g = C8j3.A0g(this.L$0, obj);
        }
        if (obj != null && (this.$overSlop.element & 9223372034707292159L) != 9205357640488583168L) {
            return EnumC2008AwJ.A03;
        }
        C1299Agk c1299Agk = (C1299Agk) AbstractC0878AGe.A0F(((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) interfaceC1074AXbA0g).A04.A01.A05);
        if (!AbstractC1078AXh.A03(c1299Agk)) {
            return EnumC2008AwJ.A02;
        }
        c1299Agk.A02();
        return EnumC2008AwJ.A05;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super EnumC2008AwJ> htJ) {
        return ((SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1) C8j3.A1E(htJ, interfaceC1074AXb, this)).invokeSuspend(Unit.INSTANCE);
    }
}
