package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.SubscriptionAttribution;
import com.facebook.aura.subscription.view.AuraSubscriptionSheetKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$1269744697$1 extends AbstractC7559F3s implements G0W<AuraSubscriptionSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$1269744697$1 INSTANCE = new ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$1269744697$1();

    public ComposableSingletons$AuraSubscriptionSheetEntryProviderKt$lambda$1269744697$1() {
        super(3);
    }

    public final void invoke(AuraSubscriptionSheetKey auraSubscriptionSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(auraSubscriptionSheetKey, 0);
        AuraSubscriptionSheetKt.AuraSubscriptionSheet(auraSubscriptionSheetKey.initialPage, new SubscriptionAttribution(auraSubscriptionSheetKey.entryPoint, auraSubscriptionSheetKey.canonicalNmeEntryPoint), null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AuraSubscriptionSheetKey auraSubscriptionSheetKey, BFM bfm, Integer num) {
        invoke(auraSubscriptionSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
