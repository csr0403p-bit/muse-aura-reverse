package com.facebook.aura.ui;

import X.AWx;
import X.AbstractC07117nq;
import X.AbstractC1078AXh;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1299Agk;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC1074AXb;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ui.ReorderableListKt$detectDrag$4", f = "ReorderableList.kt", l = {935}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ReorderableListKt$detectDrag$4 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $down;
    public final /* synthetic */ G0V<C1299Agk, AWx, Unit> $onDrag;
    public final /* synthetic */ Function0<Unit> $onDragCancel;
    public final /* synthetic */ Function0<Unit> $onDragEnd;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: com.facebook.aura.ui.ReorderableListKt$detectDrag$4$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C1299Agk, Unit> {
        public final /* synthetic */ G0V<C1299Agk, AWx, Unit> $onDrag;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C1299Agk c1299Agk) {
            C7384Etj.A0Y(c1299Agk, 0);
            this.$onDrag.invoke(c1299Agk, new AWx(AbstractC1078AXh.A00(c1299Agk)));
            c1299Agk.A02();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super C1299Agk, ? super AWx, Unit> g0v) {
            super(1);
            this.$onDrag = g0v;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk) {
            invoke2(c1299Agk);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableListKt$detectDrag$4(long j, Function0<Unit> function0, Function0<Unit> function02, G0V<? super C1299Agk, ? super AWx, Unit> g0v, HtJ<? super ReorderableListKt$detectDrag$4> htJ) {
        super(2, htJ);
        this.$down = j;
        this.$onDragEnd = function0;
        this.$onDragCancel = function02;
        this.$onDrag = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ReorderableListKt$detectDrag$4 reorderableListKt$detectDrag$4 = new ReorderableListKt$detectDrag$4(this.$down, this.$onDragEnd, this.$onDragCancel, this.$onDrag, htJ);
        reorderableListKt$detectDrag$4.L$0 = obj;
        return reorderableListKt$detectDrag$4;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        InterfaceC1074AXb interfaceC1074AXb = (InterfaceC1074AXb) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long j = this.$down;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDrag);
            this.L$0 = interfaceC1074AXb;
            this.label = 1;
            obj = DragGestureDetectorKt.A05(interfaceC1074AXb, this, anonymousClass1, j);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (AnonymousClass001.A1X(obj)) {
            for (C1299Agk c1299Agk : ((SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) interfaceC1074AXb).A04.A01.A05) {
                if (AbstractC1078AXh.A02(c1299Agk)) {
                    c1299Agk.A02();
                }
            }
            function0 = this.$onDragEnd;
        } else {
            function0 = this.$onDragCancel;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
        return ((ReorderableListKt$detectDrag$4) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
