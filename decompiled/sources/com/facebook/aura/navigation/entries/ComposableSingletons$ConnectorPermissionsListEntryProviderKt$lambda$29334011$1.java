package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectorPermissionsListScreenKey;
import com.facebook.aura.skills.view.HatchConnectorPermissionsListScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ConnectorPermissionsListEntryProviderKt$lambda$-29334011$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ConnectorPermissionsListEntryProviderKt$lambda$29334011$1 extends AbstractC7559F3s implements G0W<ConnectorPermissionsListScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$ConnectorPermissionsListEntryProviderKt$lambda$29334011$1 INSTANCE = new ComposableSingletons$ConnectorPermissionsListEntryProviderKt$lambda$29334011$1();

    public ComposableSingletons$ConnectorPermissionsListEntryProviderKt$lambda$29334011$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(ConnectorPermissionsListScreenKey connectorPermissionsListScreenKey, BFM bfm, Integer num) {
        invoke(connectorPermissionsListScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(ConnectorPermissionsListScreenKey connectorPermissionsListScreenKey, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$ConnectorPermissionsListEntryProviderKt$lambda$29334011$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchConnectorPermissionsListScreenKt.HatchConnectorPermissionsListScreen((Function0) objAaT, null, null, bfm, 0, 6);
            return;
        }
        bfm.Afo();
    }
}
