package com.facebook.aura.partners.wearables.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.WearablesLinkingFullScreenKey;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.wearables.entries.ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$-1371265886$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$1371265886$1 extends AbstractC7559F3s implements G0W<WearablesLinkingFullScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$1371265886$1 INSTANCE = new ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$1371265886$1();

    public ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$1371265886$1() {
        super(3);
    }

    public final void invoke(WearablesLinkingFullScreenKey wearablesLinkingFullScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(wearablesLinkingFullScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        WearablesLinkingOrigin wearablesLinkingOrigin = WearablesLinkingOrigin.DEEP_LINK;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$1371265886$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        WearablesLinkingFullScreenKt.WearablesLinkingFullScreen(wearablesLinkingOrigin, (Function0) objAaT, null, null, null, wearablesLinkingFullScreenKey.dismissIfAlreadyLinked, wearablesLinkingFullScreenKey.wakeWord, wearablesLinkingFullScreenKey.utmMedium, wearablesLinkingFullScreenKey.phoneProviderLinked, wearablesLinkingFullScreenKey.setupSessionId, bfm, 6, 28);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(WearablesLinkingFullScreenKey wearablesLinkingFullScreenKey, BFM bfm, Integer num) {
        invoke(wearablesLinkingFullScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
