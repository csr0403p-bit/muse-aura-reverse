package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageBottomSheetKt$UsageActionCard$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageBottomSheetKt$UsageActionCard$1$1(int i) {
        super(2);
        this.$it = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
            AnonymousClass007.A11(bfm, AuraCardDefaults.INSTANCE, this.$it);
        } else {
            bfm.Afo();
        }
    }
}
