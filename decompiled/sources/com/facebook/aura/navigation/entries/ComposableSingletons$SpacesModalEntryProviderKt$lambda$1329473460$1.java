package com.facebook.aura.navigation.entries;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.spaces.view.HatchSpacesModalScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$SpacesModalEntryProviderKt$lambda$-1329473460$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SpacesModalEntryProviderKt$lambda$1329473460$1 extends AbstractC7559F3s implements G0W<SpacesModalScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$SpacesModalEntryProviderKt$lambda$1329473460$1 INSTANCE = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$1329473460$1();

    public ComposableSingletons$SpacesModalEntryProviderKt$lambda$1329473460$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(SpacesModalScreenKey spacesModalScreenKey, BFM bfm, Integer num) {
        invoke(spacesModalScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(SpacesModalScreenKey spacesModalScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(spacesModalScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        String str = spacesModalScreenKey.slug;
        boolean zA1M = AnonymousClass003.A1M(bfm, abstractC3358CGzA0h, spacesModalScreenKey);
        Object objAaT = bfm.AaT();
        if (zA1M || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$1329473460$1$1$1(abstractC3358CGzA0h, spacesModalScreenKey, null);
            bfm.Ai0(objAaT);
        }
        AnonymousClass001.A18(bfm, objAaT, str);
        BRg bRgA00 = AbstractC07539Wl.A00(C10G.A01, "hatch-spaces-modal-view");
        InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
        BBI bbi = (BBI) bfm;
        int iA0J = AnonymousClass003.A0J(bbi);
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgA00);
        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function0);
        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
        String str2 = spacesModalScreenKey.slug;
        String string = spacesModalScreenKey.toString();
        String str3 = spacesModalScreenKey.tabId;
        boolean z = spacesModalScreenKey.fromNavigation;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$SpacesModalEntryProviderKt$lambda$1329473460$1$2$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT2);
        }
        HatchSpacesModalScreenKt.HatchSpacesModalScreen(str2, (Function0) objAaT2, null, null, str3, string, false, z, bfm, 0, 76);
        BBI.A0R(bbi, true);
    }
}
