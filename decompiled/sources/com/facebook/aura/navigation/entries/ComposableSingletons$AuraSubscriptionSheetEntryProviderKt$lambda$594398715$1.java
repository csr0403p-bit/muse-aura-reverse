package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C60O;
import X.G0W;
import com.facebook.aura.navigation.key.AuraActivationSubscriptionScreenKey;
import com.facebook.aura.settings.AuraExternalUriRegistry;
import com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$594398715$1 extends AbstractC7559F3s implements G0W<AuraActivationSubscriptionScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$594398715$1 INSTANCE = new ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$594398715$1();

    public ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$594398715$1() {
        super(3);
    }

    public final void invoke(AuraActivationSubscriptionScreenKey auraActivationSubscriptionScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraActivationSubscriptionScreenKt.AuraActivationSubscriptionScreen(C60O.A0o(AuraExternalUriRegistry.confidentialVmLearnMoreUri.uri), ComposableSingletons$AuraSubscriptionSheetEntryProviderKt.f103lambda$2015481238, null, bfm, 48, 4);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AuraActivationSubscriptionScreenKey auraActivationSubscriptionScreenKey, BFM bfm, Integer num) {
        invoke(auraActivationSubscriptionScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
