package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class ActivePermissionsGroupedPage extends C06G {
    public static final int $stable = 8;
    public final List<ActivePermissionGroup> groups;
    public final String nextCursor;

    public ActivePermissionsGroupedPage(List<ActivePermissionGroup> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.groups = list;
        this.nextCursor = str;
    }

    public final ActivePermissionsGroupedPage copy(List<ActivePermissionGroup> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new ActivePermissionsGroupedPage(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionsGroupedPage) {
                ActivePermissionsGroupedPage activePermissionsGroupedPage = (ActivePermissionsGroupedPage) obj;
                if (!C7384Etj.areEqual(this.groups, activePermissionsGroupedPage.groups) || !C7384Etj.areEqual(this.nextCursor, activePermissionsGroupedPage.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionsGroupedPage copy$default(ActivePermissionsGroupedPage activePermissionsGroupedPage, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = activePermissionsGroupedPage.groups;
        }
        if ((i & 2) != 0) {
            str = activePermissionsGroupedPage.nextCursor;
        }
        C7384Etj.A0Y(list, 0);
        return new ActivePermissionsGroupedPage(list, str);
    }

    public final List<ActivePermissionGroup> component1() {
        return this.groups;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final List<ActivePermissionGroup> getGroups() {
        return this.groups;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.groups) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }
}
