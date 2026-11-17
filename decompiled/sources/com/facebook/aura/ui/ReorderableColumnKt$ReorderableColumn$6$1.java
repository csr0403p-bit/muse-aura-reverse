package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.C00r;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ReorderableColumnKt$ReorderableColumn$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C00r $displayedRoomSourceHeight$delegate;
    public final /* synthetic */ MutableState<Object> $displayedRoomSourceKey$delegate;
    public final /* synthetic */ C00r $displayedRoomTargetIndex$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableColumnKt$ReorderableColumn$6$1(C00r c00r, MutableState<Object> mutableState, C00r c00r2) {
        super(0);
        this.$displayedRoomTargetIndex$delegate = c00r;
        this.$displayedRoomSourceKey$delegate = mutableState;
        this.$displayedRoomSourceHeight$delegate = c00r2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$displayedRoomTargetIndex$delegate.AdX(-1);
        this.$displayedRoomSourceKey$delegate.Af8(null);
        this.$displayedRoomSourceHeight$delegate.AdX(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
