package com.facebook.aura.navigation.entries;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BQN;
import X.BRg;
import X.C00x;
import X.C0861A6i;
import X.C10G;
import X.C1515AkP;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.view.HatchIdeasTabScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ExploreModalScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$ExploreEntryProviderKt$lambda$2107483903$1 extends AbstractC7559F3s implements G0W<ExploreModalScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ExploreEntryProviderKt$lambda$2107483903$1 INSTANCE = new ComposableSingletons$ExploreEntryProviderKt$lambda$2107483903$1();

    public ComposableSingletons$ExploreEntryProviderKt$lambda$2107483903$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ExploreModalScreenKey exploreModalScreenKey, BFM bfm, Integer num) {
        invoke(exploreModalScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ExploreModalScreenKey exploreModalScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A01, "hatch-explore-view");
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
            HatchExploreViewModel.Factory factory = new HatchExploreViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchExploreViewModel hatchExploreViewModel = (HatchExploreViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchExploreViewModel.class));
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$ExploreEntryProviderKt$lambda$2107483903$1$1$onCardClick$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchIdeasTabScreenKt.HatchIdeasTabScreen(hatchExploreViewModel, (G0U) objAaT, null, bfm, 0, 4);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
