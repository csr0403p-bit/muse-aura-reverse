package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectedDevicesScreenKey;
import com.facebook.aura.settings.HatchConnectedDevicesScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$ConnectedDevicesEntryProviderKt$lambda$1805623074$1 extends AbstractC7559F3s implements G0W<ConnectedDevicesScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectedDevicesEntryProviderKt$lambda$1805623074$1 INSTANCE = new ComposableSingletons$ConnectedDevicesEntryProviderKt$lambda$1805623074$1();

    public ComposableSingletons$ConnectedDevicesEntryProviderKt$lambda$1805623074$1() {
        super(3);
    }

    public final void invoke(ConnectedDevicesScreenKey connectedDevicesScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(connectedDevicesScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ConnectedDevicesEntryProviderKt$lambda$1805623074$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        boolean zA672 = bfm.A67(auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA672 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$ConnectedDevicesEntryProviderKt$lambda$1805623074$1$2$1(auraNavigatorA0b);
            bfm.Ai0(objAaT2);
        }
        HatchConnectedDevicesScreenKt.HatchConnectedDevicesScreen(function0, (G0U) objAaT2, connectedDevicesScreenKey.autoStartSetup, null, null, bfm, 0, 24);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectedDevicesScreenKey connectedDevicesScreenKey, BFM bfm, Integer num) {
        invoke(connectedDevicesScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
