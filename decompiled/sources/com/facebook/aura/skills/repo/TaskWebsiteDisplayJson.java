package com.facebook.aura.skills.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class TaskWebsiteDisplayJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String icon_url;
    public final String permission_caption;
    public final String summary_title;

    public final class Companion {
        public final C9hr<TaskWebsiteDisplayJson> serializer() {
            return TaskWebsiteDisplayJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TaskWebsiteDisplayJson(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.summary_title = str;
        this.permission_caption = str2;
        this.icon_url = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(TaskWebsiteDisplayJson taskWebsiteDisplayJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(taskWebsiteDisplayJson.summary_title, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || taskWebsiteDisplayJson.permission_caption != null) {
            c9j5.AAP(taskWebsiteDisplayJson.permission_caption, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || taskWebsiteDisplayJson.icon_url != null) {
            c9j5.AAP(taskWebsiteDisplayJson.icon_url, C07779iq.A01, c9iZ, 2);
        }
    }

    public final TaskWebsiteDisplayJson copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new TaskWebsiteDisplayJson(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskWebsiteDisplayJson) {
                TaskWebsiteDisplayJson taskWebsiteDisplayJson = (TaskWebsiteDisplayJson) obj;
                if (!C7384Etj.areEqual(this.summary_title, taskWebsiteDisplayJson.summary_title) || !C7384Etj.areEqual(this.permission_caption, taskWebsiteDisplayJson.permission_caption) || !C7384Etj.areEqual(this.icon_url, taskWebsiteDisplayJson.icon_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TaskWebsiteDisplayJson copy$default(TaskWebsiteDisplayJson taskWebsiteDisplayJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskWebsiteDisplayJson.summary_title;
        }
        if ((i & 2) != 0) {
            str2 = taskWebsiteDisplayJson.permission_caption;
        }
        if ((i & 4) != 0) {
            str3 = taskWebsiteDisplayJson.icon_url;
        }
        return taskWebsiteDisplayJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.summary_title;
    }

    public final String component2() {
        return this.permission_caption;
    }

    public final String component3() {
        return this.icon_url;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getPermission_caption() {
        return this.permission_caption;
    }

    public final String getSummary_title() {
        return this.summary_title;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.summary_title) + AnonymousClass006.A0G(this.permission_caption)) * 31) + AnonymousClass005.A0H(this.icon_url);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskWebsiteDisplayJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(TaskWebsiteDisplayJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.summary_title = str;
        if ((i & 2) == 0) {
            this.permission_caption = null;
        } else {
            this.permission_caption = str2;
        }
        if ((i & 4) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str3;
        }
    }

    public /* synthetic */ TaskWebsiteDisplayJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
