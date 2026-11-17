package com.facebook.aura.skills.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TaskConnectorDisplayJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String display_name;

    public final class Companion {
        public final C9hr<TaskConnectorDisplayJson> serializer() {
            return TaskConnectorDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(TaskConnectorDisplayJson taskConnectorDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(taskConnectorDisplayJson.display_name)) {
            c9j5.AAV(taskConnectorDisplayJson.display_name, c9iZ, 0);
        }
    }

    public final TaskConnectorDisplayJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new TaskConnectorDisplayJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TaskConnectorDisplayJson) && C7384Etj.areEqual(this.display_name, ((TaskConnectorDisplayJson) obj).display_name));
    }

    public static /* synthetic */ TaskConnectorDisplayJson copy$default(TaskConnectorDisplayJson taskConnectorDisplayJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskConnectorDisplayJson.display_name;
        }
        C7384Etj.A0Y(str, 0);
        return new TaskConnectorDisplayJson(str);
    }

    public final String component1() {
        return this.display_name;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public int hashCode() {
        return this.display_name.hashCode();
    }

    public /* synthetic */ TaskConnectorDisplayJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_name = "";
        } else {
            this.display_name = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public TaskConnectorDisplayJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.display_name = str;
    }

    public /* synthetic */ TaskConnectorDisplayJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public TaskConnectorDisplayJson() {
        this("");
    }
}
