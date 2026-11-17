package com.facebook.aura.permissions.defaults;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PermissionDefaultOptionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String description;
    public final String title;

    public final class Companion {
        public final C9hr<PermissionDefaultOptionJson> serializer() {
            return PermissionDefaultOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_permissions_defaults_defaults(PermissionDefaultOptionJson permissionDefaultOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || permissionDefaultOptionJson.title != null) {
            c9j5.AAP(permissionDefaultOptionJson.title, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || permissionDefaultOptionJson.description != null) {
            c9j5.AAP(permissionDefaultOptionJson.description, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionDefaultOptionJson) {
                PermissionDefaultOptionJson permissionDefaultOptionJson = (PermissionDefaultOptionJson) obj;
                if (!C7384Etj.areEqual(this.title, permissionDefaultOptionJson.title) || !C7384Etj.areEqual(this.description, permissionDefaultOptionJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionDefaultOptionJson copy$default(PermissionDefaultOptionJson permissionDefaultOptionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = permissionDefaultOptionJson.title;
        }
        if ((i & 2) != 0) {
            str2 = permissionDefaultOptionJson.description;
        }
        return new PermissionDefaultOptionJson(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final PermissionDefaultOptionJson copy(String str, String str2) {
        return new PermissionDefaultOptionJson(str, str2);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.title) * 31) + AnonymousClass005.A0H(this.description);
    }

    public final PermissionDefaultOptionContent toDomain() {
        String str;
        String str2 = this.title;
        if (str2 == null || C7BY.A0j(str2) || (str = this.description) == null || C7BY.A0j(str)) {
            return null;
        }
        return new PermissionDefaultOptionContent(this.title, this.description);
    }

    public PermissionDefaultOptionJson(String str, String str2) {
        this.title = str;
        this.description = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PermissionDefaultOptionJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
    }

    public /* synthetic */ PermissionDefaultOptionJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public PermissionDefaultOptionJson() {
        this(null, null);
    }
}
