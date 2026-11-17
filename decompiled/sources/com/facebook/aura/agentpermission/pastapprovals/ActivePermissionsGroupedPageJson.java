package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ActivePermissionsGroupedPageJson extends C06G {
    public static final int $stable = 8;
    public final List<ActivePermissionGroupJson> groups;
    public final String next_cursor;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, ActivePermissionsGroupedPageJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ActivePermissionsGroupedPageJson> serializer() {
            return ActivePermissionsGroupedPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivePermissionsGroupedPageJson(List<ActivePermissionGroupJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.groups = list;
        this.next_cursor = str;
    }

    public final ActivePermissionsGroupedPageJson copy(List<ActivePermissionGroupJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new ActivePermissionsGroupedPageJson(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionsGroupedPageJson) {
                ActivePermissionsGroupedPageJson activePermissionsGroupedPageJson = (ActivePermissionsGroupedPageJson) obj;
                if (!C7384Etj.areEqual(this.groups, activePermissionsGroupedPageJson.groups) || !C7384Etj.areEqual(this.next_cursor, activePermissionsGroupedPageJson.next_cursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionsGroupedPageJson copy$default(ActivePermissionsGroupedPageJson activePermissionsGroupedPageJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = activePermissionsGroupedPageJson.groups;
        }
        if ((i & 2) != 0) {
            str = activePermissionsGroupedPageJson.next_cursor;
        }
        C7384Etj.A0Y(list, 0);
        return new ActivePermissionsGroupedPageJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ActivePermissionsGroupedPageJson activePermissionsGroupedPageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(activePermissionsGroupedPageJson.groups)) {
            c9j5.AAQ(activePermissionsGroupedPageJson.groups, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || activePermissionsGroupedPageJson.next_cursor != null) {
            c9j5.AAP(activePermissionsGroupedPageJson.next_cursor, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<ActivePermissionGroupJson> component1() {
        return this.groups;
    }

    public final String component2() {
        return this.next_cursor;
    }

    public final List<ActivePermissionGroupJson> getGroups() {
        return this.groups;
    }

    public final String getNext_cursor() {
        return this.next_cursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.groups) + AnonymousClass006.A0G(this.next_cursor);
    }

    public final ActivePermissionsGroupedPage toApprovalsDomain() {
        List<ActivePermissionGroupJson> list = this.groups;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ActivePermissionGroupJson> it = list.iterator();
        while (it.hasNext()) {
            ActivePermissionGroup domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        String str = this.next_cursor;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        return new ActivePermissionsGroupedPage(arrayListA0h, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivePermissionsGroupedPageJson(int i, List list, String str, C2hx c2hx) {
        this.groups = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.next_cursor = null;
        } else {
            this.next_cursor = str;
        }
    }

    public /* synthetic */ ActivePermissionsGroupedPageJson(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str));
    }

    public ActivePermissionsGroupedPageJson() {
        this(C0881AGi.A00, null);
    }
}
