package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSheetLogger;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmOffWaitlistSheetKt$ConfidentialVmOffWaitlistSheet$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmOffWaitlistSheetKt$ConfidentialVmOffWaitlistSheet$2$1$2$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConfidentialVmSheetLogger.INSTANCE.logOffWaitlistNotNowTap();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
