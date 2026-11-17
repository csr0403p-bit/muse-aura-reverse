package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceMenuSheetKt$SpaceMenuActions$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
    public final /* synthetic */ SpaceMenuState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceMenuSheetKt$SpaceMenuActions$4$1(SpaceMenuState spaceMenuState, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$state = spaceMenuState;
        this.$renameText$delegate = mutableState;
        this.$showRenameDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$renameText$delegate.Af8(this.$state.title);
        MutableState.A09(true, this.$showRenameDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
