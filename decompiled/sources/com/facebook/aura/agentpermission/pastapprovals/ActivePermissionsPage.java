package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class ActivePermissionsPage extends C06G {
    public static final int $stable = 8;
    public final List<ActivePermission> items;
    public final String nextCursor;

    public ActivePermissionsPage(List<ActivePermission> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
        this.nextCursor = str;
    }

    public final ActivePermissionsPage copy(List<ActivePermission> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new ActivePermissionsPage(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionsPage) {
                ActivePermissionsPage activePermissionsPage = (ActivePermissionsPage) obj;
                if (!C7384Etj.areEqual(this.items, activePermissionsPage.items) || !C7384Etj.areEqual(this.nextCursor, activePermissionsPage.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionsPage copy$default(ActivePermissionsPage activePermissionsPage, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = activePermissionsPage.items;
        }
        if ((i & 2) != 0) {
            str = activePermissionsPage.nextCursor;
        }
        C7384Etj.A0Y(list, 0);
        return new ActivePermissionsPage(list, str);
    }

    public final List<ActivePermission> component1() {
        return this.items;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final List<ActivePermission> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }
}
