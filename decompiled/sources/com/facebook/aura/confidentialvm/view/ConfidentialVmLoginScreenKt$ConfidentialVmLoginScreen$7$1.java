package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isMandatoryEnrollment;
    public final /* synthetic */ Function0<Unit> $logOut;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ RegisterPinEntryPoint $setupEntryPoint;
    public final /* synthetic */ ConfidentialVmLoginViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$7$1(ConfidentialVmLoginViewModel confidentialVmLoginViewModel, RegisterPinEntryPoint registerPinEntryPoint, Function0<Unit> function0, boolean z, AuraNavigator auraNavigator) {
        super(0);
        this.$viewModel = confidentialVmLoginViewModel;
        this.$setupEntryPoint = registerPinEntryPoint;
        this.$logOut = function0;
        this.$isMandatoryEnrollment = z;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onBackClick();
        if (this.$setupEntryPoint == null) {
            this.$logOut.invoke();
        } else {
            if (this.$isMandatoryEnrollment) {
                return;
            }
            this.$navigator.back();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
