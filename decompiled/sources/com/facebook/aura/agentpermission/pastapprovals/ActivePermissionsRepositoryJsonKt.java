package com.facebook.aura.agentpermission.pastapprovals;

import X.C7384Etj;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ActivePermissionsRepositoryJsonKt {
    public static final boolean isVisibleInApprovals(ActivePermission activePermission) {
        if (activePermission.kind == ActivePermissionKind.CONNECTOR_OVERRIDE) {
            return false;
        }
        ActivePermissionLifetime activePermissionLifetime = activePermission.lifetime;
        return activePermissionLifetime == ActivePermissionLifetime.DURABLE || activePermissionLifetime == ActivePermissionLifetime.TODAY;
    }

    public static final ConnectorPermissionMode toConnectorPermissionModeOrNull(String str) {
        ConnectorPermissionMode next;
        Iterator<ConnectorPermissionMode> it = ConnectorPermissionMode.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getWireValue(), str)) {
                break;
            }
        }
        return next;
    }
}
