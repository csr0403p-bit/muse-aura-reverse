package com.facebook.aura.skills.repo;

import X.C7384Etj;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class TaskPermissionsRepositoryJsonKt {
    public static final ConnectorPermissionMode toTaskPermissionMode(String str) {
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
