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
public final class SetActivePermissionModeRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String actor;
    public final String kind;
    public final String mode;
    public final String permission_id;

    public final class Companion {
        public final C9hr<SetActivePermissionModeRequestJson> serializer() {
            return SetActivePermissionModeRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_agentpermission_pastapprovals_pastapprovals(SetActivePermissionModeRequestJson setActivePermissionModeRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(setActivePermissionModeRequestJson.permission_id, c9iZ, 0);
        c9j5.AAV(setActivePermissionModeRequestJson.kind, c9iZ, 1);
        c9j5.AAV(setActivePermissionModeRequestJson.mode, c9iZ, 2);
        if (c9j5.AfR() || !"ui".equals(setActivePermissionModeRequestJson.actor)) {
            c9j5.AAV(setActivePermissionModeRequestJson.actor, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SetActivePermissionModeRequestJson) {
                SetActivePermissionModeRequestJson setActivePermissionModeRequestJson = (SetActivePermissionModeRequestJson) obj;
                if (!C7384Etj.areEqual(this.permission_id, setActivePermissionModeRequestJson.permission_id) || !C7384Etj.areEqual(this.kind, setActivePermissionModeRequestJson.kind) || !C7384Etj.areEqual(this.mode, setActivePermissionModeRequestJson.mode) || !C7384Etj.areEqual(this.actor, setActivePermissionModeRequestJson.actor)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SetActivePermissionModeRequestJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(SetActivePermissionModeRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.permission_id = str;
        this.kind = str2;
        this.mode = str3;
        this.actor = (i & 8) == 0 ? "ui" : str4;
    }

    public static /* synthetic */ SetActivePermissionModeRequestJson copy$default(SetActivePermissionModeRequestJson setActivePermissionModeRequestJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setActivePermissionModeRequestJson.permission_id;
        }
        if ((i & 2) != 0) {
            str2 = setActivePermissionModeRequestJson.kind;
        }
        if ((i & 4) != 0) {
            str3 = setActivePermissionModeRequestJson.mode;
        }
        if ((i & 8) != 0) {
            str4 = setActivePermissionModeRequestJson.actor;
        }
        return setActivePermissionModeRequestJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.permission_id;
    }

    public final String component2() {
        return this.kind;
    }

    public final String component3() {
        return this.mode;
    }

    public final String component4() {
        return this.actor;
    }

    public final String getActor() {
        return this.actor;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getPermission_id() {
        return this.permission_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.actor, AnonymousClass005.A0I(this.mode, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.permission_id))));
    }

    public final SetActivePermissionModeRequestJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new SetActivePermissionModeRequestJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public SetActivePermissionModeRequestJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.permission_id = str;
        this.kind = str2;
        this.mode = str3;
        this.actor = str4;
    }

    public /* synthetic */ SetActivePermissionModeRequestJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? "ui" : str4);
    }
}
