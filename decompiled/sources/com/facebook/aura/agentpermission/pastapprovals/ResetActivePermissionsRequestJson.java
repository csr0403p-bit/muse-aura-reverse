package com.facebook.aura.agentpermission.pastapprovals;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ResetActivePermissionsRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String reason;

    public final class Companion {
        public final C9hr<ResetActivePermissionsRequestJson> serializer() {
            return ResetActivePermissionsRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(ResetActivePermissionsRequestJson resetActivePermissionsRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !"Reset permissions to defaults from Hatch settings.".equals(resetActivePermissionsRequestJson.reason)) {
            c9j5.AAV(resetActivePermissionsRequestJson.reason, c9iZ, 0);
        }
    }

    public final ResetActivePermissionsRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new ResetActivePermissionsRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ResetActivePermissionsRequestJson) && C7384Etj.areEqual(this.reason, ((ResetActivePermissionsRequestJson) obj).reason));
    }

    public static /* synthetic */ ResetActivePermissionsRequestJson copy$default(ResetActivePermissionsRequestJson resetActivePermissionsRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetActivePermissionsRequestJson.reason;
        }
        C7384Etj.A0Y(str, 0);
        return new ResetActivePermissionsRequestJson(str);
    }

    public final String component1() {
        return this.reason;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return this.reason.hashCode();
    }

    public /* synthetic */ ResetActivePermissionsRequestJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.reason = "Reset permissions to defaults from Hatch settings.";
        } else {
            this.reason = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ResetActivePermissionsRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.reason = str;
    }

    public /* synthetic */ ResetActivePermissionsRequestJson(String str, int i, C06H c06h) {
        this((i & 1) != 0 ? "Reset permissions to defaults from Hatch settings." : str);
    }

    public ResetActivePermissionsRequestJson() {
        this("Reset permissions to defaults from Hatch settings.");
    }
}
