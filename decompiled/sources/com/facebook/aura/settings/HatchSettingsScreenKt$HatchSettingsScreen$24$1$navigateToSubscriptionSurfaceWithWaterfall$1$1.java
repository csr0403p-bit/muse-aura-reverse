package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.key.AuraSubscriptionPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsScreen$24$1$navigateToSubscriptionSurfaceWithWaterfall$1$1 extends AbstractC7559F3s implements G0U<AuraSubscriptionPage, Unit> {
    public final /* synthetic */ Function0<Unit> $logSubscriptionEntrypointClick;
    public final /* synthetic */ G0U<AuraSubscriptionPage, Unit> $navigateToSubscriptionSurface;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraSubscriptionPage auraSubscriptionPage) {
        C7384Etj.A0Y(auraSubscriptionPage, 0);
        this.$logSubscriptionEntrypointClick.invoke();
        this.$navigateToSubscriptionSurface.invoke(auraSubscriptionPage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSettingsScreenKt$HatchSettingsScreen$24$1$navigateToSubscriptionSurfaceWithWaterfall$1$1(Function0<Unit> function0, G0U<? super AuraSubscriptionPage, Unit> g0u) {
        super(1);
        this.$logSubscriptionEntrypointClick = function0;
        this.$navigateToSubscriptionSurface = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraSubscriptionPage auraSubscriptionPage) {
        invoke2(auraSubscriptionPage);
        return Unit.INSTANCE;
    }
}
