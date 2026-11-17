package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.permissions.defaults.ConfidentialVmSettingsJsonKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TaskWebsitePermissionJson extends C06G {
    public static final Companion Companion = new Companion();
    public final TaskWebsiteDisplayJson display;
    public final String kind;
    public final String mode;
    public final String permission_id;
    public final boolean revocable;
    public final TaskWebsiteScopeJson scope;

    public final class Companion {
        public final C9hr<TaskWebsitePermissionJson> serializer() {
            return TaskWebsitePermissionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ TaskWebsitePermissionJson copy$default(TaskWebsitePermissionJson taskWebsitePermissionJson, String str, String str2, String str3, boolean z, TaskWebsiteDisplayJson taskWebsiteDisplayJson, TaskWebsiteScopeJson taskWebsiteScopeJson, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        boolean z2 = z;
        TaskWebsiteDisplayJson taskWebsiteDisplayJson2 = taskWebsiteDisplayJson;
        TaskWebsiteScopeJson taskWebsiteScopeJson2 = taskWebsiteScopeJson;
        if ((i & 1) != 0) {
            str4 = taskWebsitePermissionJson.permission_id;
        }
        if ((i & 2) != 0) {
            str5 = taskWebsitePermissionJson.kind;
        }
        if ((i & 4) != 0) {
            str6 = taskWebsitePermissionJson.mode;
        }
        if ((i & 8) != 0) {
            z2 = taskWebsitePermissionJson.revocable;
        }
        if ((i & 16) != 0) {
            taskWebsiteDisplayJson2 = taskWebsitePermissionJson.display;
        }
        if ((i & 32) != 0) {
            taskWebsiteScopeJson2 = taskWebsitePermissionJson.scope;
        }
        AnonymousClass003.A0u(str4, str5);
        return new TaskWebsitePermissionJson(str4, str5, str6, z2, taskWebsiteDisplayJson2, taskWebsiteScopeJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(TaskWebsitePermissionJson taskWebsitePermissionJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(taskWebsitePermissionJson.permission_id, c9iZ, 0);
        c9j5.AAV(taskWebsitePermissionJson.kind, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || taskWebsitePermissionJson.mode != null) {
            c9j5.AAP(taskWebsitePermissionJson.mode, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || taskWebsitePermissionJson.revocable) {
            c9j5.AA7(c9iZ, 3, taskWebsitePermissionJson.revocable);
        }
        if (zAfR || taskWebsitePermissionJson.display != null) {
            c9j5.AAP(taskWebsitePermissionJson.display, TaskWebsiteDisplayJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || taskWebsitePermissionJson.scope != null) {
            c9j5.AAP(taskWebsitePermissionJson.scope, TaskWebsiteScopeJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskWebsitePermissionJson) {
                TaskWebsitePermissionJson taskWebsitePermissionJson = (TaskWebsitePermissionJson) obj;
                if (!C7384Etj.areEqual(this.permission_id, taskWebsitePermissionJson.permission_id) || !C7384Etj.areEqual(this.kind, taskWebsitePermissionJson.kind) || !C7384Etj.areEqual(this.mode, taskWebsitePermissionJson.mode) || this.revocable != taskWebsitePermissionJson.revocable || !C7384Etj.areEqual(this.display, taskWebsitePermissionJson.display) || !C7384Etj.areEqual(this.scope, taskWebsitePermissionJson.scope)) {
                }
            }
            return false;
        }
        return true;
    }

    public final TaskWebsitePermission toDomain(String str) {
        String str2;
        C7384Etj.A0Y(str, 0);
        TaskWebsiteDisplayJson taskWebsiteDisplayJson = this.display;
        if (taskWebsiteDisplayJson == null || (str2 = taskWebsiteDisplayJson.summary_title) == null || C7BY.A0j(str2) || C7BY.A0j(this.permission_id) || !ConfidentialVmSettingsJsonKt.MODE_ALLOW.equals(this.mode) || !C60O.A19("network_rule", "transient_network_grant").contains(this.kind)) {
            return null;
        }
        TaskWebsiteScopeJson taskWebsiteScopeJson = this.scope;
        if (!"schedule".equals(taskWebsiteScopeJson != null ? taskWebsiteScopeJson.scope_type : null) || !str.equals(taskWebsiteScopeJson.schedule_id)) {
            return null;
        }
        String str3 = this.permission_id;
        String str4 = this.kind;
        TaskWebsiteDisplayJson taskWebsiteDisplayJson2 = this.display;
        return new TaskWebsitePermission(str3, str4, str2, taskWebsiteDisplayJson2.permission_caption, taskWebsiteDisplayJson2.icon_url, this.revocable);
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

    public final boolean component4() {
        return this.revocable;
    }

    public final TaskWebsiteDisplayJson component5() {
        return this.display;
    }

    public final TaskWebsiteScopeJson component6() {
        return this.scope;
    }

    public final TaskWebsiteDisplayJson getDisplay() {
        return this.display;
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

    public final boolean getRevocable() {
        return this.revocable;
    }

    public final TaskWebsiteScopeJson getScope() {
        return this.scope;
    }

    public int hashCode() {
        return ((C0KA.A01((AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.permission_id)) + AnonymousClass006.A0G(this.mode)) * 31, this.revocable) + AnonymousClass006.A0D(this.display)) * 31) + C3cH.A02(this.scope);
    }

    public TaskWebsitePermissionJson(String str, String str2, String str3, boolean z, TaskWebsiteDisplayJson taskWebsiteDisplayJson, TaskWebsiteScopeJson taskWebsiteScopeJson) {
        AnonymousClass003.A0u(str, str2);
        this.permission_id = str;
        this.kind = str2;
        this.mode = str3;
        this.revocable = z;
        this.display = taskWebsiteDisplayJson;
        this.scope = taskWebsiteScopeJson;
    }

    public final TaskWebsitePermissionJson copy(String str, String str2, String str3, boolean z, TaskWebsiteDisplayJson taskWebsiteDisplayJson, TaskWebsiteScopeJson taskWebsiteScopeJson) {
        AnonymousClass003.A0u(str, str2);
        return new TaskWebsitePermissionJson(str, str2, str3, z, taskWebsiteDisplayJson, taskWebsiteScopeJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskWebsitePermissionJson(String str, String str2, String str3, boolean z, TaskWebsiteDisplayJson taskWebsiteDisplayJson, TaskWebsiteScopeJson taskWebsiteScopeJson, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? null : taskWebsiteDisplayJson, (i & 32) != 0 ? null : taskWebsiteScopeJson);
    }

    public /* synthetic */ TaskWebsitePermissionJson(int i, String str, String str2, String str3, boolean z, TaskWebsiteDisplayJson taskWebsiteDisplayJson, TaskWebsiteScopeJson taskWebsiteScopeJson, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(TaskWebsitePermissionJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.permission_id = str;
        this.kind = str2;
        if ((i & 4) == 0) {
            this.mode = null;
        } else {
            this.mode = str3;
        }
        if ((i & 8) == 0) {
            this.revocable = false;
        } else {
            this.revocable = z;
        }
        if ((i & 16) == 0) {
            this.display = null;
        } else {
            this.display = taskWebsiteDisplayJson;
        }
        if ((i & 32) == 0) {
            this.scope = null;
        } else {
            this.scope = taskWebsiteScopeJson;
        }
    }
}
