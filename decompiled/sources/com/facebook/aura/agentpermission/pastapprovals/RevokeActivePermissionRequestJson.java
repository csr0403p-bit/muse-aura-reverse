package com.facebook.aura.agentpermission.pastapprovals;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class RevokeActivePermissionRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String permissionId;
    public final String reason;

    public final class Companion {
        public final C9hr<RevokeActivePermissionRequestJson> serializer() {
            return RevokeActivePermissionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(RevokeActivePermissionRequestJson revokeActivePermissionRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(revokeActivePermissionRequestJson.permissionId, c9iZ, 0);
        c9j5.AAV(revokeActivePermissionRequestJson.kind, c9iZ, 1);
        if (c9j5.AfR() || !"settings_permissions_revoke".equals(revokeActivePermissionRequestJson.reason)) {
            c9j5.AAV(revokeActivePermissionRequestJson.reason, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RevokeActivePermissionRequestJson) {
                RevokeActivePermissionRequestJson revokeActivePermissionRequestJson = (RevokeActivePermissionRequestJson) obj;
                if (!C7384Etj.areEqual(this.permissionId, revokeActivePermissionRequestJson.permissionId) || !C7384Etj.areEqual(this.kind, revokeActivePermissionRequestJson.kind) || !C7384Etj.areEqual(this.reason, revokeActivePermissionRequestJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RevokeActivePermissionRequestJson copy$default(RevokeActivePermissionRequestJson revokeActivePermissionRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = revokeActivePermissionRequestJson.permissionId;
        }
        if ((i & 2) != 0) {
            str2 = revokeActivePermissionRequestJson.kind;
        }
        if ((i & 4) != 0) {
            str3 = revokeActivePermissionRequestJson.reason;
        }
        return revokeActivePermissionRequestJson.copy(str, str2, str3);
    }

    public static /* synthetic */ void getPermissionId$annotations() {
    }

    public final String component1() {
        return this.permissionId;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.reason;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getPermissionId() {
        return this.permissionId;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.reason, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.permissionId)));
    }

    public RevokeActivePermissionRequestJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.permissionId = str;
        this.kind = str2;
        this.reason = str3;
    }

    public final RevokeActivePermissionRequestJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new RevokeActivePermissionRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RevokeActivePermissionRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(RevokeActivePermissionRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.permissionId = str;
        this.kind = str2;
        this.reason = (i & 4) == 0 ? "settings_permissions_revoke" : str3;
    }

    public /* synthetic */ RevokeActivePermissionRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? "settings_permissions_revoke" : str3);
    }
}
