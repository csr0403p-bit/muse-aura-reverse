package com.facebook.aura.ui;

import X.AbstractC07127nr;
import X.C00r;
import X.C0981AMm;
import X.C1BO;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.ui.ReorderableColumnKt$ReorderableColumn$5$1", f = "ReorderableColumn.kt", l = {183, 185}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ReorderableColumnKt$ReorderableColumn$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<Integer, Boolean>> $currentCanOpenRoomAt$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnRoomOpened$delegate;
    public final /* synthetic */ C1BO<G0U<Integer, Boolean>> $currentOpenRoomAboveDecorationAt$delegate;
    public final /* synthetic */ C00r $displayedRoomSourceHeight$delegate;
    public final /* synthetic */ MutableState<Object> $displayedRoomSourceKey$delegate;
    public final /* synthetic */ C00r $displayedRoomTargetIndex$delegate;
    public final /* synthetic */ MutableState<Object> $draggedKey$delegate;
    public final /* synthetic */ C00r $hoveredTargetIndex$delegate;
    public final /* synthetic */ C0981AMm<Object, Integer> $itemHeights;
    public final /* synthetic */ List<Object> $itemKeys;
    public final /* synthetic */ boolean $makeRoomOnDwell;
    public final /* synthetic */ long $roomOpenDelayMs;
    public final /* synthetic */ C00r $roomTargetIndex$delegate;
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReorderableColumnKt$ReorderableColumn$5$1(List<? extends Object> list, boolean z, long j, C0981AMm<Object, Integer> c0981AMm, MutableState<Object> mutableState, C00r c00r, C00r c00r2, C1BO<? extends G0U<? super Integer, Boolean>> c1bo, C1BO<? extends G0U<? super Integer, Boolean>> c1bo2, C00r c00r3, MutableState<Object> mutableState2, C00r c00r4, C1BO<? extends Function0<Unit>> c1bo3, HtJ<? super ReorderableColumnKt$ReorderableColumn$5$1> htJ) {
        super(2, htJ);
        this.$itemKeys = list;
        this.$makeRoomOnDwell = z;
        this.$roomOpenDelayMs = j;
        this.$itemHeights = c0981AMm;
        this.$draggedKey$delegate = mutableState;
        this.$roomTargetIndex$delegate = c00r;
        this.$hoveredTargetIndex$delegate = c00r2;
        this.$currentOpenRoomAboveDecorationAt$delegate = c1bo;
        this.$currentCanOpenRoomAt$delegate = c1bo2;
        this.$displayedRoomTargetIndex$delegate = c00r3;
        this.$displayedRoomSourceKey$delegate = mutableState2;
        this.$displayedRoomSourceHeight$delegate = c00r4;
        this.$currentOnRoomOpened$delegate = c1bo3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        ReorderableColumnKt$ReorderableColumn$5$1 reorderableColumnKt$ReorderableColumn$5$1 = new ReorderableColumnKt$ReorderableColumn$5$1(this.$itemKeys, this.$makeRoomOnDwell, this.$roomOpenDelayMs, this.$itemHeights, this.$draggedKey$delegate, this.$roomTargetIndex$delegate, this.$hoveredTargetIndex$delegate, this.$currentOpenRoomAboveDecorationAt$delegate, this.$currentCanOpenRoomAt$delegate, this.$displayedRoomTargetIndex$delegate, this.$displayedRoomSourceKey$delegate, this.$displayedRoomSourceHeight$delegate, this.$currentOnRoomOpened$delegate, htJ);
        reorderableColumnKt$ReorderableColumn$5$1.L$0 = obj;
        return reorderableColumnKt$ReorderableColumn$5$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.ReorderableColumnKt$ReorderableColumn$5$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ReorderableColumnKt$ReorderableColumn$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
