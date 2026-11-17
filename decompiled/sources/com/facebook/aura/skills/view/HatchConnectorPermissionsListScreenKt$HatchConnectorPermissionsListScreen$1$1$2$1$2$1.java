package com.facebook.aura.skills.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0W;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$2$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ LocalDeviceConnector $connector;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$2$1(LocalDeviceConnector localDeviceConnector, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
        super(3);
        this.$connector = localDeviceConnector;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
            LocalDeviceConnector localDeviceConnector = this.$connector;
            String str = localDeviceConnector.connectorId;
            String str2 = localDeviceConnector.displayTitle;
            Integer numValueOf = Integer.valueOf(localDeviceConnector.iconRes);
            String str3 = localDeviceConnector.subtitle;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$connector, AnonymousClass001.A1T(bfm, this.$userSession, bfm.A67(this.$navigator)));
            AuraNavigator auraNavigator = this.$navigator;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            LocalDeviceConnector localDeviceConnector2 = this.$connector;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$2$1$1$1(auraNavigator, abstractC3358CGz, localDeviceConnector2);
                bfm.Ai0(objAaT);
            }
            ConnectorRowKt.ConnectorRow(str, str2, null, "hatch-connected-skill-row", null, numValueOf, str3, false, false, (Function0) objAaT, ComposableSingletons$HatchConnectorPermissionsListScreenKt.lambda$1717315610, bfm, 3456, 6, 400);
            return;
        }
        bfm.Afo();
    }
}
