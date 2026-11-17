package com.facebook.aura.skills.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class TaskConnectorPermissions extends C06G {
    public final String displayName;
    public final String id;
    public final AHD<TaskPermissionMethod> methods;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskConnectorPermissions) {
                TaskConnectorPermissions taskConnectorPermissions = (TaskConnectorPermissions) obj;
                if (!C7384Etj.areEqual(this.id, taskConnectorPermissions.id) || !C7384Etj.areEqual(this.displayName, taskConnectorPermissions.displayName) || !C7384Etj.areEqual(this.methods, taskConnectorPermissions.methods)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskConnectorPermissions copy$default(TaskConnectorPermissions taskConnectorPermissions, String str, String str2, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskConnectorPermissions.id;
        }
        if ((i & 2) != 0) {
            str2 = taskConnectorPermissions.displayName;
        }
        if ((i & 4) != 0) {
            ahd = taskConnectorPermissions.methods;
        }
        return taskConnectorPermissions.copy(str, str2, ahd);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.displayName;
    }

    public final AHD<TaskPermissionMethod> component3() {
        return this.methods;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getHasOverrides() {
        AHD<TaskPermissionMethod> ahd = this.methods;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                if (((TaskPermissionMethod) it.next()).overrideMode != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String getId() {
        return this.id;
    }

    public final AHD<TaskPermissionMethod> getMethods() {
        return this.methods;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.methods, AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.id)));
    }

    public TaskConnectorPermissions(String str, String str2, AHD<TaskPermissionMethod> ahd) {
        AnonymousClass005.A0x(str, str2, ahd);
        this.id = str;
        this.displayName = str2;
        this.methods = ahd;
    }

    public final TaskConnectorPermissions copy(String str, String str2, AHD<TaskPermissionMethod> ahd) {
        AnonymousClass005.A0x(str, str2, ahd);
        return new TaskConnectorPermissions(str, str2, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
