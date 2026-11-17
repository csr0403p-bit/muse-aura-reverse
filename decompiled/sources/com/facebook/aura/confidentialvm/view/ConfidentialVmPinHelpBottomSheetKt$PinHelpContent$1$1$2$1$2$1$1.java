package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSheetLogger;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ManageAccountSettingsScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmPinHelpBottomSheetKt$PinHelpContent$1$1$2$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmPinHelpBottomSheetKt$PinHelpContent$1$1$2$1$2$1$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConfidentialVmSheetLogger.INSTANCE.logPinHelpManageAccountTap();
        this.$navigator.back();
        this.$navigator.navigate((AuraNavKey) ManageAccountSettingsScreenKey.INSTANCE, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
