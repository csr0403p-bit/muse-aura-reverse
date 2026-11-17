package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSpacesModalScreenKt$SpaceOverflowMenu$8$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSpacesModalScreenKt$SpaceOverflowMenu$8$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$showRenameDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showRenameDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
