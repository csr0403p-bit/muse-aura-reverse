package com.facebook.aura.skills.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class TaskPermissions extends C06G {
    public final AHD<TaskConnectorPermissions> connectors;
    public final String revision;
    public final AHD<TaskWebsitePermission> websites;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPermissions) {
                TaskPermissions taskPermissions = (TaskPermissions) obj;
                if (!C7384Etj.areEqual(this.revision, taskPermissions.revision) || !C7384Etj.areEqual(this.connectors, taskPermissions.connectors) || !C7384Etj.areEqual(this.websites, taskPermissions.websites)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskPermissions copy$default(TaskPermissions taskPermissions, String str, AHD ahd, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskPermissions.revision;
        }
        if ((i & 2) != 0) {
            ahd = taskPermissions.connectors;
        }
        if ((i & 4) != 0) {
            ahd2 = taskPermissions.websites;
        }
        return taskPermissions.copy(str, ahd, ahd2);
    }

    public final String component1() {
        return this.revision;
    }

    public final AHD<TaskConnectorPermissions> component2() {
        return this.connectors;
    }

    public final AHD<TaskWebsitePermission> component3() {
        return this.websites;
    }

    public final AHD<TaskConnectorPermissions> getConnectors() {
        return this.connectors;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final AHD<TaskWebsitePermission> getWebsites() {
        return this.websites;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.websites, AnonymousClass005.A0F(this.connectors, AnonymousClass001.A0G(this.revision)));
    }

    public TaskPermissions(String str, AHD<TaskConnectorPermissions> ahd, AHD<TaskWebsitePermission> ahd2) {
        AnonymousClass005.A0x(str, ahd, ahd2);
        this.revision = str;
        this.connectors = ahd;
        this.websites = ahd2;
    }

    public final TaskPermissions copy(String str, AHD<TaskConnectorPermissions> ahd, AHD<TaskWebsitePermission> ahd2) {
        AnonymousClass005.A0x(str, ahd, ahd2);
        return new TaskPermissions(str, ahd, ahd2);
    }

    public String toString() {
        return super.toString();
    }
}
