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
public final class ActivePermissionsPageJson extends C06G {
    public static final int $stable = 8;
    public final List<ActivePermissionJson> items;
    public final String nextCursor;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, ActivePermissionsPageJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ActivePermissionsPageJson> serializer() {
            return ActivePermissionsPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivePermissionsPageJson(List<ActivePermissionJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.items = list;
        this.nextCursor = str;
    }

    public final ActivePermissionsPageJson copy(List<ActivePermissionJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new ActivePermissionsPageJson(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionsPageJson) {
                ActivePermissionsPageJson activePermissionsPageJson = (ActivePermissionsPageJson) obj;
                if (!C7384Etj.areEqual(this.items, activePermissionsPageJson.items) || !C7384Etj.areEqual(this.nextCursor, activePermissionsPageJson.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionsPageJson copy$default(ActivePermissionsPageJson activePermissionsPageJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = activePermissionsPageJson.items;
        }
        if ((i & 2) != 0) {
            str = activePermissionsPageJson.nextCursor;
        }
        C7384Etj.A0Y(list, 0);
        return new ActivePermissionsPageJson(list, str);
    }

    public static /* synthetic */ void getNextCursor$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ActivePermissionsPageJson activePermissionsPageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(activePermissionsPageJson.items)) {
            c9j5.AAQ(activePermissionsPageJson.items, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || activePermissionsPageJson.nextCursor != null) {
            c9j5.AAP(activePermissionsPageJson.nextCursor, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<ActivePermissionJson> component1() {
        return this.items;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final List<ActivePermissionJson> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.nextCursor);
    }

    public final ActivePermissionsPage toApprovalsDomain() {
        List<ActivePermissionJson> list = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ActivePermissionJson> it = list.iterator();
        while (it.hasNext()) {
            ActivePermission domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            if (ActivePermissionsRepositoryJsonKt.isVisibleInApprovals((ActivePermission) obj)) {
                arrayListA0h2.add(obj);
            }
        }
        String str = this.nextCursor;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        return new ActivePermissionsPage(arrayListA0h2, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivePermissionsPageJson(int i, List list, String str, C2hx c2hx) {
        this.items = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.nextCursor = null;
        } else {
            this.nextCursor = str;
        }
    }

    public /* synthetic */ ActivePermissionsPageJson(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str));
    }

    public ActivePermissionsPageJson() {
        this(C0881AGi.A00, null);
    }
}
