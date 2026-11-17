package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.AgeVerificationWhyConfirmSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AgeMethodListScreenKt$AgeMethodListScreen$onWhyConfirm$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgeMethodListScreenKt$AgeMethodListScreen$onWhyConfirm$1$1(AuraNavigator auraNavigator) {
        super(0);
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SelfieAgeStepAnalytics.INSTANCE.logClick(HatchComponent.AGE_CHECK_HELP_BUTTON, AgeMethodListScreenKt.AGE_METHODS_SCREEN);
        this.$navigator.navigate((AuraNavKey) AgeVerificationWhyConfirmSheetKey.INSTANCE, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
