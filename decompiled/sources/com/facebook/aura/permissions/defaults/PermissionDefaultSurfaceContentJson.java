package com.facebook.aura.permissions.defaults;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PermissionDefaultSurfaceContentJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String heading;
    public final PermissionDefaultOptionsJson options;

    public final class Companion {
        public final C9hr<PermissionDefaultSurfaceContentJson> serializer() {
            return PermissionDefaultSurfaceContentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_permissions_defaults_defaults(PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || permissionDefaultSurfaceContentJson.heading != null) {
            c9j5.AAP(permissionDefaultSurfaceContentJson.heading, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || permissionDefaultSurfaceContentJson.options != null) {
            c9j5.AAP(permissionDefaultSurfaceContentJson.options, PermissionDefaultOptionsJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionDefaultSurfaceContentJson) {
                PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson = (PermissionDefaultSurfaceContentJson) obj;
                if (!C7384Etj.areEqual(this.heading, permissionDefaultSurfaceContentJson.heading) || !C7384Etj.areEqual(this.options, permissionDefaultSurfaceContentJson.options)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionDefaultSurfaceContentJson copy$default(PermissionDefaultSurfaceContentJson permissionDefaultSurfaceContentJson, String str, PermissionDefaultOptionsJson permissionDefaultOptionsJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionDefaultSurfaceContentJson.heading;
        }
        if ((i & 2) != 0) {
            permissionDefaultOptionsJson = permissionDefaultSurfaceContentJson.options;
        }
        return new PermissionDefaultSurfaceContentJson(str, permissionDefaultOptionsJson);
    }

    public final String component1() {
        return this.heading;
    }

    public final PermissionDefaultOptionsJson component2() {
        return this.options;
    }

    public final PermissionDefaultSurfaceContentJson copy(String str, PermissionDefaultOptionsJson permissionDefaultOptionsJson) {
        return new PermissionDefaultSurfaceContentJson(str, permissionDefaultOptionsJson);
    }

    public final String getHeading() {
        return this.heading;
    }

    public final PermissionDefaultOptionsJson getOptions() {
        return this.options;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.heading) * 31) + C3cH.A02(this.options);
    }

    public final PermissionDefaultSurfaceContent toDomain() {
        PermissionDefaultOptionsJson permissionDefaultOptionsJson;
        PermissionDefaultOptionJson permissionDefaultOptionJson;
        PermissionDefaultOptionContent domain;
        PermissionDefaultOptionJson permissionDefaultOptionJson2;
        PermissionDefaultOptionContent domain2;
        String str = this.heading;
        if (str == null || C7BY.A0j(str) || (permissionDefaultOptionsJson = this.options) == null || (permissionDefaultOptionJson = permissionDefaultOptionsJson.auto_allow) == null || (domain = permissionDefaultOptionJson.toDomain()) == null || (permissionDefaultOptionJson2 = this.options.always_ask) == null || (domain2 = permissionDefaultOptionJson2.toDomain()) == null) {
            return null;
        }
        return new PermissionDefaultSurfaceContent(this.heading, domain, domain2);
    }

    public PermissionDefaultSurfaceContentJson(String str, PermissionDefaultOptionsJson permissionDefaultOptionsJson) {
        this.heading = str;
        this.options = permissionDefaultOptionsJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PermissionDefaultSurfaceContentJson(int i, String str, PermissionDefaultOptionsJson permissionDefaultOptionsJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.heading = null;
        } else {
            this.heading = str;
        }
        if ((i & 2) == 0) {
            this.options = null;
        } else {
            this.options = permissionDefaultOptionsJson;
        }
    }

    public /* synthetic */ PermissionDefaultSurfaceContentJson(String str, PermissionDefaultOptionsJson permissionDefaultOptionsJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : permissionDefaultOptionsJson);
    }

    public PermissionDefaultSurfaceContentJson() {
        this(null, null);
    }
}
