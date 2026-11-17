package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.file.view.ContentViewerScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ContentViewerScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ContentViewerEntryProviderKt$lambda$-992759791$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ContentViewerEntryProviderKt$lambda$992759791$1 extends AbstractC7559F3s implements G0W<ContentViewerScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ContentViewerEntryProviderKt$lambda$992759791$1 INSTANCE = new ComposableSingletons$ContentViewerEntryProviderKt$lambda$992759791$1();

    public ComposableSingletons$ContentViewerEntryProviderKt$lambda$992759791$1() {
        super(3);
    }

    public final void invoke(ContentViewerScreenKey contentViewerScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(contentViewerScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ContentViewerEntryProviderKt$lambda$992759791$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        boolean zA672 = bfm.A67(auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA672 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$ContentViewerEntryProviderKt$lambda$992759791$1$2$1(auraNavigatorA0b);
            bfm.Ai0(objAaT2);
        }
        ContentViewerScreenKt.ContentViewerScreen(contentViewerScreenKey, function0, (Function0) objAaT2, contentViewerScreenKey.forceDarkMode, contentViewerScreenKey.interactiveDismissEnabled, contentViewerScreenKey.fullscreenSingleVideo, contentViewerScreenKey.bottomActions, bfm, i & 14, 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ContentViewerScreenKey contentViewerScreenKey, BFM bfm, Integer num) {
        invoke(contentViewerScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
