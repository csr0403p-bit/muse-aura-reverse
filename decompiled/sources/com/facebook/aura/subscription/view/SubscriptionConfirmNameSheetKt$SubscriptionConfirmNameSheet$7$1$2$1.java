package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$7$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $firstName$delegate;
    public final /* synthetic */ MutableState<String> $lastName$delegate;
    public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;
    public final /* synthetic */ HatchSubsurface $originSubsurface;
    public final /* synthetic */ Map<String, String> $tapMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$7$1$2$1(HatchSubsurface hatchSubsurface, Map<String, String> map, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(0);
        this.$originSubsurface = hatchSubsurface;
        this.$tapMetadata = map;
        this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
        this.$firstName$delegate = mutableState;
        this.$lastName$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.MONETIZATION, this.$originSubsurface, HatchScreen.SUBSCRIPTION_CONFIRM_NAME, HatchComponent.CONFIRM_NAME_BUTTON, null, this.$tapMetadata, null);
        this.$nameGateViewModel.onNameConfirmed(AnonymousClass002.A0l(MutableState.A05(this.$firstName$delegate)), AnonymousClass002.A0l(MutableState.A05(this.$lastName$delegate)));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
