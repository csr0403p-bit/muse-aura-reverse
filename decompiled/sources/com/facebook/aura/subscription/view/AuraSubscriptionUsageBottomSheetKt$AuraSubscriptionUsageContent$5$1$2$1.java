package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageContent$5$1$2$1 extends AbstractC7559F3s implements G0U<SubscriptionManagementCta, Unit> {
    public final /* synthetic */ MutableState<SubscriptionManagementCta> $pendingCancel$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SubscriptionManagementCta subscriptionManagementCta) {
        C7384Etj.A0Y(subscriptionManagementCta, 0);
        this.$pendingCancel$delegate.Af8(subscriptionManagementCta);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$AuraSubscriptionUsageContent$5$1$2$1(MutableState<SubscriptionManagementCta> mutableState) {
        super(1);
        this.$pendingCancel$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SubscriptionManagementCta subscriptionManagementCta) {
        invoke2(subscriptionManagementCta);
        return Unit.INSTANCE;
    }
}
