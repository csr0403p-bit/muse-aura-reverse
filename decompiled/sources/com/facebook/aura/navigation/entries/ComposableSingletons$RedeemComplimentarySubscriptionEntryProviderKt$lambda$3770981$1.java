package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.navigation.key.RedeemComplimentarySubscriptionScreenKey;
import com.facebook.aura.subscription.view.AuraComplimentaryRedeemScreenKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$RedeemComplimentarySubscriptionEntryProviderKt$lambda$3770981$1 extends AbstractC7559F3s implements G0W<RedeemComplimentarySubscriptionScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$RedeemComplimentarySubscriptionEntryProviderKt$lambda$3770981$1 INSTANCE = new ComposableSingletons$RedeemComplimentarySubscriptionEntryProviderKt$lambda$3770981$1();

    public ComposableSingletons$RedeemComplimentarySubscriptionEntryProviderKt$lambda$3770981$1() {
        super(3);
    }

    public final void invoke(RedeemComplimentarySubscriptionScreenKey redeemComplimentarySubscriptionScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(redeemComplimentarySubscriptionScreenKey, 0);
        AuraComplimentaryRedeemScreenKt.AuraComplimentaryRedeemScreen(redeemComplimentarySubscriptionScreenKey.entryPoint, null, bfm, 0, 2);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(RedeemComplimentarySubscriptionScreenKey redeemComplimentarySubscriptionScreenKey, BFM bfm, Integer num) {
        invoke(redeemComplimentarySubscriptionScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
