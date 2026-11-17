package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
/* loaded from: classes2.dex */
public final class RevokeRecipientPermissionRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String permission_id;

    public final class Companion {
        public final C9hr<RevokeRecipientPermissionRequestJson> serializer() {
            return RevokeRecipientPermissionRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(RevokeRecipientPermissionRequestJson revokeRecipientPermissionRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(revokeRecipientPermissionRequestJson.permission_id, c9iZ, 0);
        c9j5.AAV(revokeRecipientPermissionRequestJson.kind, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RevokeRecipientPermissionRequestJson) {
                RevokeRecipientPermissionRequestJson revokeRecipientPermissionRequestJson = (RevokeRecipientPermissionRequestJson) obj;
                if (!C7384Etj.areEqual(this.permission_id, revokeRecipientPermissionRequestJson.permission_id) || !C7384Etj.areEqual(this.kind, revokeRecipientPermissionRequestJson.kind)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RevokeRecipientPermissionRequestJson copy$default(RevokeRecipientPermissionRequestJson revokeRecipientPermissionRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = revokeRecipientPermissionRequestJson.permission_id;
        }
        if ((i & 2) != 0) {
            str2 = revokeRecipientPermissionRequestJson.kind;
        }
        AnonymousClass003.A0u(str, str2);
        return new RevokeRecipientPermissionRequestJson(str, str2);
    }

    public final String component1() {
        return this.permission_id;
    }

    public final String component2() {
        return this.kind;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getPermission_id() {
        return this.permission_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.kind, AnonymousClass001.A0G(this.permission_id));
    }

    public RevokeRecipientPermissionRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.permission_id = str;
        this.kind = str2;
    }

    public final RevokeRecipientPermissionRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new RevokeRecipientPermissionRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RevokeRecipientPermissionRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(RevokeRecipientPermissionRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.permission_id = str;
        this.kind = str2;
    }
}
