package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
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
public final class ActivePermissionGroupJson extends C06G {
    public static final int $stable = 8;
    public final List<ActivePermissionJson> items;
    public final ActivePermissionScopeJson scope;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, ActivePermissionGroupJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ActivePermissionGroupJson> serializer() {
            return ActivePermissionGroupJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivePermissionGroupJson(ActivePermissionScopeJson activePermissionScopeJson, List<ActivePermissionJson> list) {
        C7384Etj.A0Y(list, 1);
        this.scope = activePermissionScopeJson;
        this.items = list;
    }

    public final ActivePermissionGroupJson copy(ActivePermissionScopeJson activePermissionScopeJson, List<ActivePermissionJson> list) {
        C7384Etj.A0Y(list, 1);
        return new ActivePermissionGroupJson(activePermissionScopeJson, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionGroupJson) {
                ActivePermissionGroupJson activePermissionGroupJson = (ActivePermissionGroupJson) obj;
                if (!C7384Etj.areEqual(this.scope, activePermissionGroupJson.scope) || !C7384Etj.areEqual(this.items, activePermissionGroupJson.items)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivePermissionGroupJson copy$default(ActivePermissionGroupJson activePermissionGroupJson, ActivePermissionScopeJson activePermissionScopeJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            activePermissionScopeJson = activePermissionGroupJson.scope;
        }
        if ((i & 2) != 0) {
            list = activePermissionGroupJson.items;
        }
        C7384Etj.A0Y(list, 1);
        return new ActivePermissionGroupJson(activePermissionScopeJson, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ActivePermissionGroupJson activePermissionGroupJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || activePermissionGroupJson.scope != null) {
            c9j5.AAP(activePermissionGroupJson.scope, ActivePermissionScopeJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(activePermissionGroupJson.items)) {
            c9j5.AAQ(activePermissionGroupJson.items, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final ActivePermissionScopeJson component1() {
        return this.scope;
    }

    public final List<ActivePermissionJson> component2() {
        return this.items;
    }

    public final List<ActivePermissionJson> getItems() {
        return this.items;
    }

    public final ActivePermissionScopeJson getScope() {
        return this.scope;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.items, AnonymousClass006.A0D(this.scope) * 31);
    }

    public final ActivePermissionGroup toDomain() {
        ActivePermissionScope domain;
        ActivePermissionScopeJson activePermissionScopeJson = this.scope;
        if (activePermissionScopeJson == null || (domain = activePermissionScopeJson.toDomain()) == null) {
            return null;
        }
        List<ActivePermissionJson> list = this.items;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ActivePermissionJson> it = list.iterator();
        while (it.hasNext()) {
            ActivePermission domain2 = it.next().toDomain();
            if (domain2 != null) {
                arrayListA0h.add(domain2);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            if (ActivePermissionsRepositoryJsonKt.isVisibleInApprovals((ActivePermission) obj)) {
                arrayListA0h2.add(obj);
            }
        }
        if (arrayListA0h2.isEmpty()) {
            return null;
        }
        return new ActivePermissionGroup(domain, arrayListA0h2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivePermissionGroupJson(int i, ActivePermissionScopeJson activePermissionScopeJson, List list, C2hx c2hx) {
        this.scope = (i & 1) == 0 ? null : activePermissionScopeJson;
        if ((i & 2) == 0) {
            this.items = C0881AGi.A00;
        } else {
            this.items = list;
        }
    }

    public /* synthetic */ ActivePermissionGroupJson(ActivePermissionScopeJson activePermissionScopeJson, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : activePermissionScopeJson, C3cI.A11(list, i));
    }

    public ActivePermissionGroupJson() {
        this(null, C0881AGi.A00);
    }
}
