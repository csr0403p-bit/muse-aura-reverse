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
/* loaded from: classes3.dex */
public final class TaskPermissionScopeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String scope_id;
    public final String scope_type;

    public final class Companion {
        public final C9hr<TaskPermissionScopeJson> serializer() {
            return TaskPermissionScopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(TaskPermissionScopeJson taskPermissionScopeJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(taskPermissionScopeJson.scope_type, c9iZ, 0);
        c9j5.AAV(taskPermissionScopeJson.scope_id, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPermissionScopeJson) {
                TaskPermissionScopeJson taskPermissionScopeJson = (TaskPermissionScopeJson) obj;
                if (!C7384Etj.areEqual(this.scope_type, taskPermissionScopeJson.scope_type) || !C7384Etj.areEqual(this.scope_id, taskPermissionScopeJson.scope_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TaskPermissionScopeJson copy$default(TaskPermissionScopeJson taskPermissionScopeJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskPermissionScopeJson.scope_type;
        }
        if ((i & 2) != 0) {
            str2 = taskPermissionScopeJson.scope_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new TaskPermissionScopeJson(str, str2);
    }

    public final String component1() {
        return this.scope_type;
    }

    public final String component2() {
        return this.scope_id;
    }

    public final String getScope_id() {
        return this.scope_id;
    }

    public final String getScope_type() {
        return this.scope_type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.scope_id, AnonymousClass001.A0G(this.scope_type));
    }

    public TaskPermissionScopeJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.scope_type = str;
        this.scope_id = str2;
    }

    public final TaskPermissionScopeJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new TaskPermissionScopeJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskPermissionScopeJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(TaskPermissionScopeJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.scope_type = str;
        this.scope_id = str2;
    }
}
