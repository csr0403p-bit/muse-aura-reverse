package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.maps.HatchFullscreenMapScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchFullscreenMapScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$HatchFullscreenMapEntryProviderKt$lambda$1639646185$1 extends AbstractC7559F3s implements G0W<HatchFullscreenMapScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchFullscreenMapEntryProviderKt$lambda$1639646185$1 INSTANCE = new ComposableSingletons$HatchFullscreenMapEntryProviderKt$lambda$1639646185$1();

    public ComposableSingletons$HatchFullscreenMapEntryProviderKt$lambda$1639646185$1() {
        super(3);
    }

    public final void invoke(HatchFullscreenMapScreenKey hatchFullscreenMapScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(hatchFullscreenMapScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = hatchFullscreenMapScreenKey.presentationId;
        String str2 = hatchFullscreenMapScreenKey.selectedArtifactId;
        boolean z = hatchFullscreenMapScreenKey.openPlaceDetails;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$HatchFullscreenMapEntryProviderKt$lambda$1639646185$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchFullscreenMapScreenKt.HatchFullscreenMapScreen(str, (Function0) objAaT, null, str2, z, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchFullscreenMapScreenKey hatchFullscreenMapScreenKey, BFM bfm, Integer num) {
        invoke(hatchFullscreenMapScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
