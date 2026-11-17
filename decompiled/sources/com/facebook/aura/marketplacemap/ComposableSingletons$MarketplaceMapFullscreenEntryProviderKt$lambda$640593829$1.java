package com.facebook.aura.marketplacemap;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$MarketplaceMapFullscreenEntryProviderKt$lambda$640593829$1 extends AbstractC7559F3s implements G0W<MarketplaceMapFullscreenScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$MarketplaceMapFullscreenEntryProviderKt$lambda$640593829$1 INSTANCE = new ComposableSingletons$MarketplaceMapFullscreenEntryProviderKt$lambda$640593829$1();

    public ComposableSingletons$MarketplaceMapFullscreenEntryProviderKt$lambda$640593829$1() {
        super(3);
    }

    public final void invoke(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(marketplaceMapFullscreenScreenKey, 0);
        if ((i & 6) == 0) {
            i |= AnonymousClass002.A05(AnonymousClass004.A1X(marketplaceMapFullscreenScreenKey, bfm, i) ? 1 : 0);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$MarketplaceMapFullscreenEntryProviderKt$lambda$640593829$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchMarketplaceMapFullscreenScreenKt.HatchMarketplaceMapFullscreenScreen(marketplaceMapFullscreenScreenKey, (Function0) objAaT, null, bfm, MarketplaceMapFullscreenScreenKey.$stable | (i & 14), 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(MarketplaceMapFullscreenScreenKey marketplaceMapFullscreenScreenKey, BFM bfm, Integer num) {
        invoke(marketplaceMapFullscreenScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
