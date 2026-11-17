package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class ActivityDetailResponse extends C06G {
    public final String body;
    public final List<ActivityFile> files;
    public final String hash;
    public final ActivityDetailNote note;
    public final String subject;
    public final Long tsMs;

    public ActivityDetailResponse(String str, Long l, String str2, String str3, ActivityDetailNote activityDetailNote, List<ActivityFile> list) {
        C7384Etj.A0Y(str, 0);
        this.hash = str;
        this.tsMs = l;
        this.subject = str2;
        this.body = str3;
        this.note = activityDetailNote;
        this.files = list;
    }

    public final ActivityDetailResponse copy(String str, Long l, String str2, String str3, ActivityDetailNote activityDetailNote, List<ActivityFile> list) {
        C7384Etj.A0Y(str, 0);
        return new ActivityDetailResponse(str, l, str2, str3, activityDetailNote, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetailResponse) {
                ActivityDetailResponse activityDetailResponse = (ActivityDetailResponse) obj;
                if (!C7384Etj.areEqual(this.hash, activityDetailResponse.hash) || !C7384Etj.areEqual(this.tsMs, activityDetailResponse.tsMs) || !C7384Etj.areEqual(this.subject, activityDetailResponse.subject) || !C7384Etj.areEqual(this.body, activityDetailResponse.body) || !C7384Etj.areEqual(this.note, activityDetailResponse.note) || !C7384Etj.areEqual(this.files, activityDetailResponse.files)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityDetailResponse copy$default(ActivityDetailResponse activityDetailResponse, String str, Long l, String str2, String str3, ActivityDetailNote activityDetailNote, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailResponse.hash;
        }
        if ((i & 2) != 0) {
            l = activityDetailResponse.tsMs;
        }
        if ((i & 4) != 0) {
            str2 = activityDetailResponse.subject;
        }
        if ((i & 8) != 0) {
            str3 = activityDetailResponse.body;
        }
        if ((i & 16) != 0) {
            activityDetailNote = activityDetailResponse.note;
        }
        if ((i & 32) != 0) {
            list = activityDetailResponse.files;
        }
        return activityDetailResponse.copy(str, l, str2, str3, activityDetailNote, list);
    }

    public final String component1() {
        return this.hash;
    }

    public final Long component2() {
        return this.tsMs;
    }

    public final String component3() {
        return this.subject;
    }

    public final String component4() {
        return this.body;
    }

    public final ActivityDetailNote component5() {
        return this.note;
    }

    public final List<ActivityFile> component6() {
        return this.files;
    }

    public final String getBody() {
        return this.body;
    }

    public final List<ActivityFile> getFiles() {
        return this.files;
    }

    public final String getHash() {
        return this.hash;
    }

    public final ActivityDetailNote getNote() {
        return this.note;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final Long getTsMs() {
        return this.tsMs;
    }

    public int hashCode() {
        return ((((((((AnonymousClass001.A0G(this.hash) + AnonymousClass006.A0D(this.tsMs)) * 31) + AnonymousClass006.A0G(this.subject)) * 31) + AnonymousClass006.A0G(this.body)) * 31) + AnonymousClass006.A0D(this.note)) * 31) + C3cH.A02(this.files);
    }

    public String toString() {
        return super.toString();
    }
}
