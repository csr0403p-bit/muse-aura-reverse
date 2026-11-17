package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.DeviceDetailsScreenKey;
import com.facebook.aura.settings.HatchDeviceDetailsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1 extends AbstractC7559F3s implements G0W<DeviceDetailsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1 INSTANCE = new ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1();

    public ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(DeviceDetailsScreenKey deviceDetailsScreenKey, BFM bfm, Integer num) {
        invoke(deviceDetailsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(DeviceDetailsScreenKey deviceDetailsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(deviceDetailsScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = deviceDetailsScreenKey.nodeId;
        String str2 = deviceDetailsScreenKey.displayName;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        Function0 function0 = (Function0) objAaT;
        boolean zA672 = bfm.A67(auraNavigatorA0b);
        Object objAaT2 = bfm.AaT();
        if (zA672 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1$2$1(auraNavigatorA0b);
            bfm.Ai0(objAaT2);
        }
        G0U g0u = (G0U) objAaT2;
        boolean zA1M = AnonymousClass003.A1M(bfm, deviceDetailsScreenKey, auraNavigatorA0b);
        Object objAaT3 = bfm.AaT();
        if (zA1M || objAaT3 == C78N.A00) {
            objAaT3 = new ComposableSingletons$DeviceDetailsEntryProviderKt$lambda$12780946$1$3$1(deviceDetailsScreenKey, auraNavigatorA0b);
            bfm.Ai0(objAaT3);
        }
        HatchDeviceDetailsScreenKt.HatchDeviceDetailsScreen(str, str2, function0, g0u, (Function0) objAaT3, null, null, bfm, 0, 96);
    }
}
