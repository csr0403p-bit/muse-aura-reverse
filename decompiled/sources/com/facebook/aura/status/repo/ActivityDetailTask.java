package com.facebook.aura.status.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivityDetailTask extends C06G {
    public final String agentId;
    public final String label;
    public final String responsePreview;
    public final String status;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetailTask) {
                ActivityDetailTask activityDetailTask = (ActivityDetailTask) obj;
                if (!C7384Etj.areEqual(this.agentId, activityDetailTask.agentId) || !C7384Etj.areEqual(this.label, activityDetailTask.label) || !C7384Etj.areEqual(this.status, activityDetailTask.status) || !C7384Etj.areEqual(this.responsePreview, activityDetailTask.responsePreview)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ActivityDetailTask(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ ActivityDetailTask copy$default(ActivityDetailTask activityDetailTask, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailTask.agentId;
        }
        if ((i & 2) != 0) {
            str2 = activityDetailTask.label;
        }
        if ((i & 4) != 0) {
            str3 = activityDetailTask.status;
        }
        if ((i & 8) != 0) {
            str4 = activityDetailTask.responsePreview;
        }
        return new ActivityDetailTask(str, str2, str3, str4);
    }

    public final String component1() {
        return this.agentId;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.status;
    }

    public final String component4() {
        return this.responsePreview;
    }

    public final ActivityDetailTask copy(String str, String str2, String str3, String str4) {
        return new ActivityDetailTask(str, str2, str3, str4);
    }

    public final String getAgentId() {
        return this.agentId;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getResponsePreview() {
        return this.responsePreview;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.agentId) * 31) + AnonymousClass006.A0G(this.label)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass005.A0H(this.responsePreview);
    }

    public String toString() {
        return super.toString();
    }

    public ActivityDetailTask(String str, String str2, String str3, String str4) {
        this.agentId = str;
        this.label = str2;
        this.status = str3;
        this.responsePreview = str4;
    }

    public ActivityDetailTask() {
        this(null, null, null, null);
    }
}
