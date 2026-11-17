package com.facebook.aura.skills.view;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7bA;
import X.G0U;
import X.G0V;
import X.InterfaceC7353EnQ;
import android.content.Context;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.agentpermission.LocalDeviceConnectorPermissionControllerKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.viewmodel.ConnectorScreenViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectorCatalogActionsKt {
    public static final ConnectorCatalogActions rememberConnectorCatalogActions(ConnectorScreenViewModel connectorScreenViewModel, BFM bfm, int i) {
        C7384Etj.A0Y(connectorScreenViewModel, 0);
        Context contextA0H = AnonymousClass002.A0H(bfm);
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        boolean zA67 = bfm.A67(connectorScreenViewModel);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$manageLocal$1$1(connectorScreenViewModel);
            bfm.Ai0(objAaT);
        }
        G0U<LocalDeviceConnector, Unit> g0uRememberLocalDeviceConnectorPermissionController = LocalDeviceConnectorPermissionControllerKt.rememberLocalDeviceConnectorPermissionController(contextA0H, (Function0) ((InterfaceC7353EnQ) objAaT), bfm, 0);
        Object[] objArr = {connectorScreenViewModel, auraNavigatorA0b, g0uRememberLocalDeviceConnectorPermissionController, abstractC3358CGzA0g};
        boolean zA1R = AnonymousClass001.A1R(bfm, g0uRememberLocalDeviceConnectorPermissionController, AnonymousClass005.A1S(bfm, connectorScreenViewModel, auraNavigatorA0b, abstractC3358CGzA0g));
        Object objAaT2 = bfm.AaT();
        if (zA1R || objAaT2 == C78N.A00) {
            objAaT2 = new HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$1$1(connectorScreenViewModel, auraNavigatorA0b, abstractC3358CGzA0g, g0uRememberLocalDeviceConnectorPermissionController, null);
            bfm.Ai0(objAaT2);
        }
        C78e.A08(bfm, (G0V) objAaT2, objArr);
        boolean zA672 = bfm.A67(connectorScreenViewModel);
        Object objAaT3 = bfm.AaT();
        if (zA672 || objAaT3 == C78N.A00) {
            objAaT3 = new HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$2$1(connectorScreenViewModel);
            bfm.Ai0(objAaT3);
        }
        C7bA.A05(bfm, null, connectorScreenViewModel, (G0U) objAaT3, i & 14, 2);
        boolean zA673 = bfm.A67(connectorScreenViewModel);
        Object objAaT4 = bfm.AaT();
        if (zA673 || objAaT4 == C78N.A00) {
            objAaT4 = new HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$3$1(connectorScreenViewModel);
            bfm.Ai0(objAaT4);
        }
        G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT4);
        boolean zA674 = bfm.A67(connectorScreenViewModel);
        Object objAaT5 = bfm.AaT();
        if (zA674 || objAaT5 == C78N.A00) {
            objAaT5 = new HatchConnectorCatalogActionsKt$rememberConnectorCatalogActions$4$1(connectorScreenViewModel);
            bfm.Ai0(objAaT5);
        }
        return new ConnectorCatalogActions(g0u, (Function0) ((InterfaceC7353EnQ) objAaT5));
    }
}
