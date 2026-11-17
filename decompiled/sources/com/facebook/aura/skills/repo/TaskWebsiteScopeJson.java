package com.facebook.aura.skills.repo;

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
public final class TaskWebsiteScopeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String schedule_id;
    public final String scope_type;

    public final class Companion {
        public final C9hr<TaskWebsiteScopeJson> serializer() {
            return TaskWebsiteScopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(TaskWebsiteScopeJson taskWebsiteScopeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || taskWebsiteScopeJson.scope_type != null) {
            c9j5.AAP(taskWebsiteScopeJson.scope_type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || taskWebsiteScopeJson.schedule_id != null) {
            c9j5.AAP(taskWebsiteScopeJson.schedule_id, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskWebsiteScopeJson) {
                TaskWebsiteScopeJson taskWebsiteScopeJson = (TaskWebsiteScopeJson) obj;
                if (!C7384Etj.areEqual(this.scope_type, taskWebsiteScopeJson.scope_type) || !C7384Etj.areEqual(this.schedule_id, taskWebsiteScopeJson.schedule_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TaskWebsiteScopeJson copy$default(TaskWebsiteScopeJson taskWebsiteScopeJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskWebsiteScopeJson.scope_type;
        }
        if ((i & 2) != 0) {
            str2 = taskWebsiteScopeJson.schedule_id;
        }
        return new TaskWebsiteScopeJson(str, str2);
    }

    public final String component1() {
        return this.scope_type;
    }

    public final String component2() {
        return this.schedule_id;
    }

    public final TaskWebsiteScopeJson copy(String str, String str2) {
        return new TaskWebsiteScopeJson(str, str2);
    }

    public final String getSchedule_id() {
        return this.schedule_id;
    }

    public final String getScope_type() {
        return this.scope_type;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.scope_type) * 31) + AnonymousClass005.A0H(this.schedule_id);
    }

    public TaskWebsiteScopeJson(String str, String str2) {
        this.scope_type = str;
        this.schedule_id = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskWebsiteScopeJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.scope_type = null;
        } else {
            this.scope_type = str;
        }
        if ((i & 2) == 0) {
            this.schedule_id = null;
        } else {
            this.schedule_id = str2;
        }
    }

    public /* synthetic */ TaskWebsiteScopeJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public TaskWebsiteScopeJson() {
        this(null, null);
    }
}
