package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel;
import com.facebook.aura.logout.AuraLogoutHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$6$1(ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel) {
        super(0);
        this.$viewModel = confidentialVmRegisterPinViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onLookupFailureLogOutClick();
        AuraLogoutHelper.INSTANCE.performLogout();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
