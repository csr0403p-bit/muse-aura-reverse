package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SharedContentScreenKey;
import com.facebook.aura.sharedcontent.HatchSharedContentScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$SharedContentEntryProviderKt$lambda$66782682$1 extends AbstractC7559F3s implements G0W<SharedContentScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SharedContentEntryProviderKt$lambda$66782682$1 INSTANCE = new ComposableSingletons$SharedContentEntryProviderKt$lambda$66782682$1();

    public ComposableSingletons$SharedContentEntryProviderKt$lambda$66782682$1() {
        super(3);
    }

    public final void invoke(SharedContentScreenKey sharedContentScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(sharedContentScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = sharedContentScreenKey.slug;
        String str2 = sharedContentScreenKey.shareKey;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$SharedContentEntryProviderKt$lambda$66782682$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchSharedContentScreenKt.HatchSharedContentScreen(str, str2, (Function0) objAaT, null, bfm, 0, 8);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SharedContentScreenKey sharedContentScreenKey, BFM bfm, Integer num) {
        invoke(sharedContentScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
