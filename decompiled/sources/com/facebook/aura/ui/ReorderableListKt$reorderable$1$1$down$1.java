package com.facebook.aura.ui;

import X.AbstractC07117nq;
import X.AnonymousClass001;
import X.C1299Agk;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1074AXb;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$reorderable$1$1$down$1", f = "ReorderableList.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ReorderableListKt$reorderable$1$1$down$1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super C1299Agk>, Object> {
    public final /* synthetic */ StartDrag $dragStart;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableListKt$reorderable$1$1$down$1(StartDrag startDrag, HtJ<? super ReorderableListKt$reorderable$1$1$down$1> htJ) {
        super(2, htJ);
        this.$dragStart = startDrag;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ReorderableListKt$reorderable$1$1$down$1 reorderableListKt$reorderable$1$1$down$1 = new ReorderableListKt$reorderable$1$1$down$1(this.$dragStart, htJ);
        reorderableListKt$reorderable$1$1$down$1.L$0 = obj;
        return reorderableListKt$reorderable$1$1$down$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        List<C1299Agk> list = ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) interfaceC1074AXb).A04.A01.A05;
        StartDrag startDrag = this.$dragStart;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1299Agk c1299Agk = list.get(i);
            if (c1299Agk.A08 == startDrag.id) {
                return c1299Agk;
            }
        }
        return null;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super C1299Agk> htJ) {
        return ((ReorderableListKt$reorderable$1$1$down$1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
