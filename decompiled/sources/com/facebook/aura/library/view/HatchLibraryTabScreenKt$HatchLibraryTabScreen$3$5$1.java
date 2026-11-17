package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $showOverflowMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$5$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$showOverflowMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<Boolean> mutableState = this.$showOverflowMenu$delegate;
        int i = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
        if (MutableState.A0A((MutableState) mutableState)) {
            HatchLibraryTabScreenKt.logLibraryOverflowMenuDismiss();
        }
        MutableState.A09(false, this.$showOverflowMenu$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
