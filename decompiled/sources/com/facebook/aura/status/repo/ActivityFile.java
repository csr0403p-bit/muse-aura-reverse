package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivityFile extends C06G {
    public final String path;
    public final String status;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityFile) {
                ActivityFile activityFile = (ActivityFile) obj;
                if (!C7384Etj.areEqual(this.status, activityFile.status) || !C7384Etj.areEqual(this.path, activityFile.path)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityFile copy$default(ActivityFile activityFile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityFile.status;
        }
        if ((i & 2) != 0) {
            str2 = activityFile.path;
        }
        AnonymousClass003.A0u(str, str2);
        return new ActivityFile(str, str2);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.path;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.path, AnonymousClass001.A0G(this.status));
    }

    public ActivityFile(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.status = str;
        this.path = str2;
    }

    public final ActivityFile copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ActivityFile(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
