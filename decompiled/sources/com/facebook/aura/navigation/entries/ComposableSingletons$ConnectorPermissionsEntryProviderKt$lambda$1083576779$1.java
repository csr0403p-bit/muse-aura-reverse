package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectorPermissionsScreenKey;
import com.facebook.aura.skills.view.HatchConnectorPermissionsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$ConnectorPermissionsEntryProviderKt$lambda$1083576779$1 extends AbstractC7559F3s implements G0W<ConnectorPermissionsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectorPermissionsEntryProviderKt$lambda$1083576779$1 INSTANCE = new ComposableSingletons$ConnectorPermissionsEntryProviderKt$lambda$1083576779$1();

    public ComposableSingletons$ConnectorPermissionsEntryProviderKt$lambda$1083576779$1() {
        super(3);
    }

    public final void invoke(ConnectorPermissionsScreenKey connectorPermissionsScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(connectorPermissionsScreenKey, 0);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        String str = connectorPermissionsScreenKey.connectorId;
        boolean zA67 = bfm.A67(auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$ConnectorPermissionsEntryProviderKt$lambda$1083576779$1$1$1(auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        HatchConnectorPermissionsScreenKt.HatchConnectorPermissionsScreen(str, (Function0) objAaT, null, bfm, 0, 4);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorPermissionsScreenKey connectorPermissionsScreenKey, BFM bfm, Integer num) {
        invoke(connectorPermissionsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
