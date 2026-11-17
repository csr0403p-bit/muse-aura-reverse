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
public final class ActivityDetailItemJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String action;
    public final String query;
    public final String tool;

    public final class Companion {
        public final C9hr<ActivityDetailItemJson> serializer() {
            return ActivityDetailItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(ActivityDetailItemJson activityDetailItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activityDetailItemJson.tool != null) {
            c9j5.AAP(activityDetailItemJson.tool, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || activityDetailItemJson.query != null) {
            c9j5.AAP(activityDetailItemJson.query, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activityDetailItemJson.action != null) {
            c9j5.AAP(activityDetailItemJson.action, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetailItemJson) {
                ActivityDetailItemJson activityDetailItemJson = (ActivityDetailItemJson) obj;
                if (!C7384Etj.areEqual(this.tool, activityDetailItemJson.tool) || !C7384Etj.areEqual(this.query, activityDetailItemJson.query) || !C7384Etj.areEqual(this.action, activityDetailItemJson.action)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityDetailItemJson copy$default(ActivityDetailItemJson activityDetailItemJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailItemJson.tool;
        }
        if ((i & 2) != 0) {
            str2 = activityDetailItemJson.query;
        }
        if ((i & 4) != 0) {
            str3 = activityDetailItemJson.action;
        }
        return new ActivityDetailItemJson(str, str2, str3);
    }

    public final String component1() {
        return this.tool;
    }

    public final String component2() {
        return this.query;
    }

    public final String component3() {
        return this.action;
    }

    public final ActivityDetailItemJson copy(String str, String str2, String str3) {
        return new ActivityDetailItemJson(str, str2, str3);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getTool() {
        return this.tool;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.tool) * 31) + AnonymousClass006.A0G(this.query)) * 31) + AnonymousClass005.A0H(this.action);
    }

    public final ActivityDetailItem toDomain() {
        return new ActivityDetailItem(this.tool, this.query, this.action);
    }

    public ActivityDetailItemJson(String str, String str2, String str3) {
        this.tool = str;
        this.query = str2;
        this.action = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivityDetailItemJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.tool = null;
        } else {
            this.tool = str;
        }
        if ((i & 2) == 0) {
            this.query = null;
        } else {
            this.query = str2;
        }
        if ((i & 4) == 0) {
            this.action = null;
        } else {
            this.action = str3;
        }
    }

    public /* synthetic */ ActivityDetailItemJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public ActivityDetailItemJson() {
        this(null, null, null);
    }
}
