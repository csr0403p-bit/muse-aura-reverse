package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C00q;
import X.C00r;
import X.C0881AGi;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReorderableColumnKt$ReorderableColumn$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $awaitingSettlement$delegate;
    public final /* synthetic */ C00r $displayedRoomSourceHeight$delegate;
    public final /* synthetic */ MutableState<Object> $displayedRoomSourceKey$delegate;
    public final /* synthetic */ C00r $displayedRoomTargetIndex$delegate;
    public final /* synthetic */ C00q $dragOffsetY$delegate;
    public final /* synthetic */ MutableState<List<Object>> $dragStartItemKeys$delegate;
    public final /* synthetic */ MutableState<Object> $draggedKey$delegate;
    public final /* synthetic */ C00r $hoveredTargetIndex$delegate;
    public final /* synthetic */ C00r $roomTargetIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableColumnKt$ReorderableColumn$7$1(MutableState<Object> mutableState, C00q c00q, C00r c00r, C00r c00r2, C00r c00r3, MutableState<Object> mutableState2, C00r c00r4, MutableState<List<Object>> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.$draggedKey$delegate = mutableState;
        this.$dragOffsetY$delegate = c00q;
        this.$hoveredTargetIndex$delegate = c00r;
        this.$roomTargetIndex$delegate = c00r2;
        this.$displayedRoomTargetIndex$delegate = c00r3;
        this.$displayedRoomSourceKey$delegate = mutableState2;
        this.$displayedRoomSourceHeight$delegate = c00r4;
        this.$dragStartItemKeys$delegate = mutableState3;
        this.$awaitingSettlement$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$draggedKey$delegate.Af8(null);
        this.$dragOffsetY$delegate.AdS(0.0f);
        this.$hoveredTargetIndex$delegate.AdX(-1);
        this.$roomTargetIndex$delegate.AdX(-1);
        this.$displayedRoomTargetIndex$delegate.AdX(-1);
        this.$displayedRoomSourceKey$delegate.Af8(null);
        this.$displayedRoomSourceHeight$delegate.AdX(0);
        this.$dragStartItemKeys$delegate.Af8(C0881AGi.A00);
        MutableState.A09(false, this.$awaitingSettlement$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
