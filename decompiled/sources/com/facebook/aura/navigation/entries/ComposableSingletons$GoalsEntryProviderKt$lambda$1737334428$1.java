package com.facebook.aura.navigation.entries;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C3cH;
import X.F60;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.view.HatchGoalsTabScreenKt;
import com.facebook.aura.navigation.key.HatchGoalsModalScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$GoalsEntryProviderKt$lambda$1737334428$1 extends AbstractC7559F3s implements G0W<HatchGoalsModalScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$GoalsEntryProviderKt$lambda$1737334428$1 INSTANCE = new ComposableSingletons$GoalsEntryProviderKt$lambda$1737334428$1();

    public ComposableSingletons$GoalsEntryProviderKt$lambda$1737334428$1() {
        super(3);
    }

    public final void invoke(HatchGoalsModalScreenKey hatchGoalsModalScreenKey, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        BRg bRgA00 = AbstractC07539Wl.A00(C10G.A01, "hatch-goals-view");
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
        HatchGoalsTabViewModel.Factory factory = new HatchGoalsTabViewModel.Factory(abstractC3358CGzA0h);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        HatchGoalsTabScreenKt.HatchGoalsTabScreen((HatchGoalsTabViewModel) C3cH.A0G(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), HatchGoalsTabViewModel.class), null, bfm, HatchGoalsTabViewModel.$stable, 2);
        BBI.A0R(bbi, true);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HatchGoalsModalScreenKey hatchGoalsModalScreenKey, BFM bfm, Integer num) {
        invoke(hatchGoalsModalScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
