package com.facebook.aura.status.repo;

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
public final class ActivityDetailTaskJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String agent_id;
    public final String label;
    public final String response_preview;
    public final String status;

    public final class Companion {
        public final C9hr<ActivityDetailTaskJson> serializer() {
            return ActivityDetailTaskJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityDetailTaskJson activityDetailTaskJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityDetailTaskJson.agent_id != null) {
            c9j5.AAP(activityDetailTaskJson.agent_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activityDetailTaskJson.label != null) {
            c9j5.AAP(activityDetailTaskJson.label, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activityDetailTaskJson.status != null) {
            c9j5.AAP(activityDetailTaskJson.status, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activityDetailTaskJson.response_preview != null) {
            c9j5.AAP(activityDetailTaskJson.response_preview, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetailTaskJson) {
                ActivityDetailTaskJson activityDetailTaskJson = (ActivityDetailTaskJson) obj;
                if (!C7384Etj.areEqual(this.agent_id, activityDetailTaskJson.agent_id) || !C7384Etj.areEqual(this.label, activityDetailTaskJson.label) || !C7384Etj.areEqual(this.status, activityDetailTaskJson.status) || !C7384Etj.areEqual(this.response_preview, activityDetailTaskJson.response_preview)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityDetailTaskJson copy$default(ActivityDetailTaskJson activityDetailTaskJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailTaskJson.agent_id;
        }
        if ((i & 2) != 0) {
            str2 = activityDetailTaskJson.label;
        }
        if ((i & 4) != 0) {
            str3 = activityDetailTaskJson.status;
        }
        if ((i & 8) != 0) {
            str4 = activityDetailTaskJson.response_preview;
        }
        return new ActivityDetailTaskJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.agent_id;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.response_preview;
    }

    public final ActivityDetailTaskJson copy(String str, String str2, String str3, String str4) {
        return new ActivityDetailTaskJson(str, str2, str3, str4);
    }

    public final String getAgent_id() {
        return this.agent_id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getResponse_preview() {
        return this.response_preview;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.agent_id) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass005.A0H(this.response_preview);
    }

    public final ActivityDetailTask toDomain() {
        return new ActivityDetailTask(this.agent_id, this.label, this.status, this.response_preview);
    }

    public /* synthetic */ ActivityDetailTaskJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.agent_id = null;
        } else {
            this.agent_id = str;
        }
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.status = null;
        } else {
            this.status = str3;
        }
        if ((i & 8) == 0) {
            this.response_preview = null;
        } else {
            this.response_preview = str4;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ActivityDetailTaskJson(String str, String str2, String str3, String str4) {
        this.agent_id = str;
        this.label = str2;
        this.status = str3;
        this.response_preview = str4;
    }

    public /* synthetic */ ActivityDetailTaskJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public ActivityDetailTaskJson() {
        this(null, null, null, null);
    }
}
