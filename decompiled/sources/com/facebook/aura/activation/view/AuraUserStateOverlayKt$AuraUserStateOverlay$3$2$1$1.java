package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraUserStateOverlayKt$AuraUserStateOverlay$3$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $isSettingStatus$delegate;
    public final /* synthetic */ MutableState<Boolean> $showStatusDropdown$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraUserStateOverlayKt$AuraUserStateOverlay$3$2$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$isSettingStatus$delegate = mutableState;
        this.$showStatusDropdown$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$isSettingStatus$delegate)) {
            return;
        }
        MutableState.A09(true, this.$showStatusDropdown$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
