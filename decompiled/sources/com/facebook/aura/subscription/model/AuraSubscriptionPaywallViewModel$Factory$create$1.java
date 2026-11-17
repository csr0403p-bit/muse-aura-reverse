package com.facebook.aura.subscription.model;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.subscription.model.AuraSubscriptionPaywallViewModel;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallViewModel$Factory$create$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AuraSubscriptionPaywallViewModel.Factory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallViewModel$Factory$create$1(AuraSubscriptionPaywallViewModel.Factory factory) {
        super(0);
        this.this$0 = factory;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        AuraUserData value = AuraViewerDataProvider.Companion.getInstance(this.this$0.userSession).userData.getValue();
        return Boolean.valueOf(value != null ? AnonymousClass002.A1b(value.isVmTypePlanRequired, false) : false);
    }
}
