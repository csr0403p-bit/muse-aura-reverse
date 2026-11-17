package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmCancelSheetKt$ConfidentialVmCancelSheet$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Map<String, String> $subscriptionMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmCancelSheetKt$ConfidentialVmCancelSheet$1$1(Map<String, String> map, Function0<Unit> function0) {
        super(0);
        this.$subscriptionMetadata = map;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ConfidentialVmCancelSheetKt.logCancelSheetDismiss(HatchComponent.CANCEL_SUBSCRIPTION_DIALOG_SCREEN, this.$subscriptionMetadata);
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
