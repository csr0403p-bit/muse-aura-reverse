package com.facebook.aura.partners.wearables.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.WearablesLinkingBottomSheetKey;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.partners.wearables.entries.ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$-827504462$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$827504462$1 extends AbstractC7559F3s implements G0W<WearablesLinkingBottomSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$827504462$1 INSTANCE = new ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$827504462$1();

    public ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$827504462$1() {
        super(3);
    }

    public final void invoke(WearablesLinkingBottomSheetKey wearablesLinkingBottomSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(wearablesLinkingBottomSheetKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        WearablesLinkingOrigin wearablesLinkingOrigin = WearablesLinkingOrigin.DEEP_LINK;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$WearablesLinkingEntryProviderKt$lambda$827504462$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        WearablesLinkingBottomSheetKt.WearablesLinkingBottomSheet(wearablesLinkingOrigin, (Function0) objAaT, null, wearablesLinkingBottomSheetKey.dismissIfAlreadyLinked, wearablesLinkingBottomSheetKey.wakeWord, wearablesLinkingBottomSheetKey.utmMedium, wearablesLinkingBottomSheetKey.phoneProviderLinked, wearablesLinkingBottomSheetKey.setupSessionId, bfm, 6, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(WearablesLinkingBottomSheetKey wearablesLinkingBottomSheetKey, BFM bfm, Integer num) {
        invoke(wearablesLinkingBottomSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
