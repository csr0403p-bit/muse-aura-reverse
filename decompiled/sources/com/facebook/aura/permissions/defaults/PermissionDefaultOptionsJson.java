package com.facebook.aura.permissions.defaults;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PermissionDefaultOptionsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final PermissionDefaultOptionJson always_ask;
    public final PermissionDefaultOptionJson auto_allow;

    public final class Companion {
        public final C9hr<PermissionDefaultOptionsJson> serializer() {
            return PermissionDefaultOptionsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_permissions_defaults_defaults(PermissionDefaultOptionsJson permissionDefaultOptionsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || permissionDefaultOptionsJson.auto_allow != null) {
            c9j5.AAP(permissionDefaultOptionsJson.auto_allow, PermissionDefaultOptionJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || permissionDefaultOptionsJson.always_ask != null) {
            c9j5.AAP(permissionDefaultOptionsJson.always_ask, PermissionDefaultOptionJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionDefaultOptionsJson) {
                PermissionDefaultOptionsJson permissionDefaultOptionsJson = (PermissionDefaultOptionsJson) obj;
                if (!C7384Etj.areEqual(this.auto_allow, permissionDefaultOptionsJson.auto_allow) || !C7384Etj.areEqual(this.always_ask, permissionDefaultOptionsJson.always_ask)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionDefaultOptionsJson copy$default(PermissionDefaultOptionsJson permissionDefaultOptionsJson, PermissionDefaultOptionJson permissionDefaultOptionJson, PermissionDefaultOptionJson permissionDefaultOptionJson2, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionDefaultOptionJson = permissionDefaultOptionsJson.auto_allow;
        }
        if ((i & 2) != 0) {
            permissionDefaultOptionJson2 = permissionDefaultOptionsJson.always_ask;
        }
        return new PermissionDefaultOptionsJson(permissionDefaultOptionJson, permissionDefaultOptionJson2);
    }

    public final PermissionDefaultOptionJson component1() {
        return this.auto_allow;
    }

    public final PermissionDefaultOptionJson component2() {
        return this.always_ask;
    }

    public final PermissionDefaultOptionsJson copy(PermissionDefaultOptionJson permissionDefaultOptionJson, PermissionDefaultOptionJson permissionDefaultOptionJson2) {
        return new PermissionDefaultOptionsJson(permissionDefaultOptionJson, permissionDefaultOptionJson2);
    }

    public final PermissionDefaultOptionJson getAlways_ask() {
        return this.always_ask;
    }

    public final PermissionDefaultOptionJson getAuto_allow() {
        return this.auto_allow;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.auto_allow) * 31) + C3cH.A02(this.always_ask);
    }

    public PermissionDefaultOptionsJson(PermissionDefaultOptionJson permissionDefaultOptionJson, PermissionDefaultOptionJson permissionDefaultOptionJson2) {
        this.auto_allow = permissionDefaultOptionJson;
        this.always_ask = permissionDefaultOptionJson2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PermissionDefaultOptionsJson(int i, PermissionDefaultOptionJson permissionDefaultOptionJson, PermissionDefaultOptionJson permissionDefaultOptionJson2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.auto_allow = null;
        } else {
            this.auto_allow = permissionDefaultOptionJson;
        }
        if ((i & 2) == 0) {
            this.always_ask = null;
        } else {
            this.always_ask = permissionDefaultOptionJson2;
        }
    }

    public /* synthetic */ PermissionDefaultOptionsJson(PermissionDefaultOptionJson permissionDefaultOptionJson, PermissionDefaultOptionJson permissionDefaultOptionJson2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : permissionDefaultOptionJson, (i & 2) != 0 ? null : permissionDefaultOptionJson2);
    }

    public PermissionDefaultOptionsJson() {
        this(null, null);
    }
}
