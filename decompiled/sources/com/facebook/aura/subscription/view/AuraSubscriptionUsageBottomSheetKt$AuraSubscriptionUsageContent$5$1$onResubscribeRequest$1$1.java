package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.subscription.model.AuraSubscriptionUsageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageContent$5$1$onResubscribeRequest$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraSubscriptionUsageViewModel.UiState.Loaded $loadedState;
    public final /* synthetic */ Function0<Unit> $onOpenBillingPortal;
    public final /* synthetic */ MutableState<Boolean> $showCrossPlatformDialog$delegate;
    public final /* synthetic */ MutableState<Boolean> $showResubscribeDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageContent$5$1$onResubscribeRequest$1$1(AuraSubscriptionUsageViewModel.UiState.Loaded loaded, Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$loadedState = loaded;
        this.$onOpenBillingPortal = function0;
        this.$showCrossPlatformDialog$delegate = mutableState;
        this.$showResubscribeDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraSubscriptionUsageViewModel.UiState.Loaded loaded = this.$loadedState;
        if (loaded != null) {
            if (loaded.isCrossPlatform) {
                MutableState.A09(true, this.$showCrossPlatformDialog$delegate);
                return;
            } else if (loaded.isGooglePurchasePlatform) {
                this.$onOpenBillingPortal.invoke();
                return;
            }
        }
        MutableState.A09(true, this.$showResubscribeDialog$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
