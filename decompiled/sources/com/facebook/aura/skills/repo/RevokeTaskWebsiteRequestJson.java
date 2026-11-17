package com.facebook.aura.skills.repo;

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
public final class RevokeTaskWebsiteRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String permission_id;
    public final String reason;

    public final class Companion {
        public final C9hr<RevokeTaskWebsiteRequestJson> serializer() {
            return RevokeTaskWebsiteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(RevokeTaskWebsiteRequestJson revokeTaskWebsiteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(revokeTaskWebsiteRequestJson.permission_id, c9iZ, 0);
        c9j5.AAV(revokeTaskWebsiteRequestJson.kind, c9iZ, 1);
        if (c9j5.AfR() || !"task_permissions_revoke".equals(revokeTaskWebsiteRequestJson.reason)) {
            c9j5.AAV(revokeTaskWebsiteRequestJson.reason, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RevokeTaskWebsiteRequestJson) {
                RevokeTaskWebsiteRequestJson revokeTaskWebsiteRequestJson = (RevokeTaskWebsiteRequestJson) obj;
                if (!C7384Etj.areEqual(this.permission_id, revokeTaskWebsiteRequestJson.permission_id) || !C7384Etj.areEqual(this.kind, revokeTaskWebsiteRequestJson.kind) || !C7384Etj.areEqual(this.reason, revokeTaskWebsiteRequestJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RevokeTaskWebsiteRequestJson copy$default(RevokeTaskWebsiteRequestJson revokeTaskWebsiteRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = revokeTaskWebsiteRequestJson.permission_id;
        }
        if ((i & 2) != 0) {
            str2 = revokeTaskWebsiteRequestJson.kind;
        }
        if ((i & 4) != 0) {
            str3 = revokeTaskWebsiteRequestJson.reason;
        }
        return revokeTaskWebsiteRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.permission_id;
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

    public final String getPermission_id() {
        return this.permission_id;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.reason, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.permission_id)));
    }

    public RevokeTaskWebsiteRequestJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.permission_id = str;
        this.kind = str2;
        this.reason = str3;
    }

    public final RevokeTaskWebsiteRequestJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new RevokeTaskWebsiteRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RevokeTaskWebsiteRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(RevokeTaskWebsiteRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.permission_id = str;
        this.kind = str2;
        this.reason = (i & 4) == 0 ? "task_permissions_revoke" : str3;
    }

    public /* synthetic */ RevokeTaskWebsiteRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? "task_permissions_revoke" : str3);
    }
}
