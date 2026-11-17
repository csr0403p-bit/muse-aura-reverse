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
public final class PermissionDefaultsContentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final PermissionDefaultSurfaceContentJson connector;
    public final PermissionDefaultSurfaceContentJson network;

    public final class Companion {
        public final C9hr<PermissionDefaultsContentJson> serializer() {
            return PermissionDefaultsContentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_permissions_defaults_defaults(PermissionDefaultsContentJson permissionDefaultsContentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || permissionDefaultsContentJson.connector != null) {
            c9j5.AAP(permissionDefaultsContentJson.connector, PermissionDefaultSurfaceContentJson$$serializer.INSTANCE, c9iZ, 0);
        }
        if (zAfR || permissionDefaultsContentJson.network != null) {
            c9j5.AAP(permissionDefaultsContentJson.network, PermissionDefaultSurfaceContentJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionDefaultsContentJson) {
                PermissionDefaultsContentJson permissionDefaultsContentJson = (PermissionDefaultsContentJson) obj;
                if (!C7384Etj.areEqual(this.connector, permissionDefaultsContentJson.connector) || !C7384Etj.areEqual(this.network, permissionDefaultsContentJson.network)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionDefaultsContentJson copy$default(PermissionDefaultsContentJson permissionDefaultsContentJson, PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson, PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson2, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionDefaultSurfaceContentJson = permissionDefaultsContentJson.connector;
        }
        if ((i & 2) != 0) {
            permissionDefaultSurfaceContentJson2 = permissionDefaultsContentJson.network;
        }
        return new PermissionDefaultsContentJson(permissionDefaultSurfaceContentJson, permissionDefaultSurfaceContentJson2);
    }

    public final PermissionDefaultSurfaceContentJson component1() {
        return this.connector;
    }

    public final PermissionDefaultSurfaceContentJson component2() {
        return this.network;
    }

    public final PermissionDefaultsContentJson copy(PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson, PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson2) {
        return new PermissionDefaultsContentJson(permissionDefaultSurfaceContentJson, permissionDefaultSurfaceContentJson2);
    }

    public final PermissionDefaultSurfaceContentJson getConnector() {
        return this.connector;
    }

    public final PermissionDefaultSurfaceContentJson getNetwork() {
        return this.network;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.connector) * 31) + C3cH.A02(this.network);
    }

    public PermissionDefaultsContentJson(PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson, PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson2) {
        this.connector = permissionDefaultSurfaceContentJson;
        this.network = permissionDefaultSurfaceContentJson2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PermissionDefaultsContentJson(int i, PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson, PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connector = null;
        } else {
            this.connector = permissionDefaultSurfaceContentJson;
        }
        if ((i & 2) == 0) {
            this.network = null;
        } else {
            this.network = permissionDefaultSurfaceContentJson2;
        }
    }

    public /* synthetic */ PermissionDefaultsContentJson(PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson, PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : permissionDefaultSurfaceContentJson, (i & 2) != 0 ? null : permissionDefaultSurfaceContentJson2);
    }

    public PermissionDefaultsContentJson() {
        this(null, null);
    }
}
