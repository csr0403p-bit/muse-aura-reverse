package com.facebook.aura.permissions.defaults;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SetPermissionSettingsRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String connector_default;
    public final String network_default;
    public final String reason;

    public final class Companion {
        public final C9hr<SetPermissionSettingsRequestJson> serializer() {
            return SetPermissionSettingsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SetPermissionSettingsRequestJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str3, 2);
        this.connector_default = str;
        this.network_default = str2;
        this.reason = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_permissions_defaults_defaults(SetPermissionSettingsRequestJson setPermissionSettingsRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || setPermissionSettingsRequestJson.connector_default != null) {
            c9j5.AAP(setPermissionSettingsRequestJson.connector_default, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || setPermissionSettingsRequestJson.network_default != null) {
            c9j5.AAP(setPermissionSettingsRequestJson.network_default, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !"settings_permission_defaults_update".equals(setPermissionSettingsRequestJson.reason)) {
            c9j5.AAV(setPermissionSettingsRequestJson.reason, c9iZ, 2);
        }
    }

    public final SetPermissionSettingsRequestJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str3, 2);
        return new SetPermissionSettingsRequestJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SetPermissionSettingsRequestJson) {
                SetPermissionSettingsRequestJson setPermissionSettingsRequestJson = (SetPermissionSettingsRequestJson) obj;
                if (!C7384Etj.areEqual(this.connector_default, setPermissionSettingsRequestJson.connector_default) || !C7384Etj.areEqual(this.network_default, setPermissionSettingsRequestJson.network_default) || !C7384Etj.areEqual(this.reason, setPermissionSettingsRequestJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SetPermissionSettingsRequestJson copy$default(SetPermissionSettingsRequestJson setPermissionSettingsRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setPermissionSettingsRequestJson.connector_default;
        }
        if ((i & 2) != 0) {
            str2 = setPermissionSettingsRequestJson.network_default;
        }
        if ((i & 4) != 0) {
            str3 = setPermissionSettingsRequestJson.reason;
        }
        return setPermissionSettingsRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.connector_default;
    }

    public final String component2() {
        return this.network_default;
    }

    public final String component3() {
        return this.reason;
    }

    public final String getConnector_default() {
        return this.connector_default;
    }

    public final String getNetwork_default() {
        return this.network_default;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.reason, ((AnonymousClass006.A0G(this.connector_default) * 31) + AnonymousClass005.A0H(this.network_default)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SetPermissionSettingsRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connector_default = null;
        } else {
            this.connector_default = str;
        }
        if ((i & 2) == 0) {
            this.network_default = null;
        } else {
            this.network_default = str2;
        }
        if ((i & 4) == 0) {
            this.reason = "settings_permission_defaults_update";
        } else {
            this.reason = str3;
        }
    }

    public /* synthetic */ SetPermissionSettingsRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "settings_permission_defaults_update" : str3);
    }

    public SetPermissionSettingsRequestJson() {
        this(null, null, "settings_permission_defaults_update");
    }
}
