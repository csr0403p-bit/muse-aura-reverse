package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraActivationSubscriptionScreenKt$ConfidentialVmToggleRow$onToggle$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraActivationSubscriptionScreenKt$ConfidentialVmToggleRow$onToggle$1$1(G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$onCheckedChange = g0u;
    }

    public final void invoke(boolean z) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.MONETIZATION, HatchSubsurface.SUBSCRIPTION, HatchScreen.SUBSCRIPTION_PAYWALL, HatchComponent.CVM_TOGGLE, null, AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), SubscriptionPaywallEntryPoint.ACTIVATION.getValue()));
        AnonymousClass001.A1K(z, this.$onCheckedChange);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
