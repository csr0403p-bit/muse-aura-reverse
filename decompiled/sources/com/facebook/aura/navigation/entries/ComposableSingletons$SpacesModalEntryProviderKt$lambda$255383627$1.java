package com.facebook.aura.navigation.entries;

import X.AbstractC07539Wl;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.spaces.view.HatchSpacesModalScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1 extends AbstractC7559F3s implements G0W<SpaceTabScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1 INSTANCE = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1();

    public ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SpaceTabScreenKey spaceTabScreenKey, BFM bfm, Integer num) {
        invoke(spaceTabScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SpaceTabScreenKey spaceTabScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(spaceTabScreenKey, 0);
        HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) bfm.A6v(SidePanelLocalsKt.LocalSidePanelController);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        String str = spaceTabScreenKey.slug;
        boolean zA1M = AnonymousClass003.A1M(bfm, abstractC3358CGzA0h, spaceTabScreenKey);
        Object objAaT = bfm.AaT();
        if (zA1M || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$1$1(abstractC3358CGzA0h, spaceTabScreenKey, null);
            bfm.Ai0(objAaT);
        }
        AnonymousClass001.A18(bfm, objAaT, str);
        String str2 = spaceTabScreenKey.slug;
        String string = spaceTabScreenKey.toString();
        BRg bRgA00 = AbstractC07539Wl.A00(C10G.A01, "hatch-space-tab-view");
        boolean zA67 = bfm.A67(hatchSidePanelController);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$2$1(hatchSidePanelController);
            bfm.Ai0(objAaT2);
        }
        Function0 function0 = (Function0) objAaT2;
        boolean zA1M2 = AnonymousClass003.A1M(bfm, auraNavigatorA0b, spaceTabScreenKey);
        Object objAaT3 = bfm.AaT();
        if (zA1M2 || objAaT3 == C78N.A00) {
            objAaT3 = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$255383627$1$3$1(auraNavigatorA0b, spaceTabScreenKey);
            bfm.Ai0(objAaT3);
        }
        HatchSpacesModalScreenKt.HatchSpacesModalScreen(str2, function0, bRgA00, (Function0) objAaT3, null, string, true, true, bfm, 14156160, 16);
    }
}
