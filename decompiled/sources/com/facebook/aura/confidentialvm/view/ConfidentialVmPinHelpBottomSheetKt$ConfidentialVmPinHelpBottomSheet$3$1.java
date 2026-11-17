package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSheetLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<PinHelpPage> $page$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmPinHelpBottomSheetKt$ConfidentialVmPinHelpBottomSheet$3$1(MutableState<PinHelpPage> mutableState) {
        super(0);
        this.$page$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConfidentialVmSheetLogger.INSTANCE.logPinHelpSetNewPinTap();
        this.$page$delegate.Af8(PinHelpPage.CHANGE_PIN);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
