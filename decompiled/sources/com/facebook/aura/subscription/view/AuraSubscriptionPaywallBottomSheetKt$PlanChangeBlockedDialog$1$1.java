package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$PlanChangeBlockedDialog$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Map<String, String> $metadata;
    public final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$PlanChangeBlockedDialog$1$1(Map<String, String> map, Function0<Unit> function0) {
        super(0);
        this.$metadata = map;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.PLAN_CHANGE_BLOCKED_DIALOG, HatchComponent.PLAN_CHANGE_BLOCKED_DIALOG_SCREEN, null, this.$metadata);
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
