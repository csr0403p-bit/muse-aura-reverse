package com.facebook.aura.status.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class ActivityDetailNote extends C06G {
    public final List<String> highlights;
    public final String summary;
    public final String tag;
    public final String title;
    public final Integer version;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityDetailNote) {
                ActivityDetailNote activityDetailNote = (ActivityDetailNote) obj;
                if (!C7384Etj.areEqual(this.summary, activityDetailNote.summary) || !C7384Etj.areEqual(this.highlights, activityDetailNote.highlights) || !C7384Etj.areEqual(this.version, activityDetailNote.version) || !C7384Etj.areEqual(this.tag, activityDetailNote.tag) || !C7384Etj.areEqual(this.title, activityDetailNote.title)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityDetailNote copy$default(ActivityDetailNote activityDetailNote, String str, List list, Integer num, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailNote.summary;
        }
        if ((i & 2) != 0) {
            list = activityDetailNote.highlights;
        }
        if ((i & 4) != 0) {
            num = activityDetailNote.version;
        }
        if ((i & 8) != 0) {
            str2 = activityDetailNote.tag;
        }
        if ((i & 16) != 0) {
            str3 = activityDetailNote.title;
        }
        return activityDetailNote.copy(str, list, num, str2, str3);
    }

    public final String component1() {
        return this.summary;
    }

    public final List<String> component2() {
        return this.highlights;
    }

    public final Integer component3() {
        return this.version;
    }

    public final String component4() {
        return this.tag;
    }

    public final String component5() {
        return this.title;
    }

    public final ActivityDetailNote copy(String str, List<String> list, Integer num, String str2, String str3) {
        return new ActivityDetailNote(str, list, num, str2, str3);
    }

    public final List<String> getHighlights() {
        return this.highlights;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.summary) * 31) + AnonymousClass006.A0D(this.highlights)) * 31) + AnonymousClass006.A0D(this.version)) * 31) + AnonymousClass006.A0G(this.tag)) * 31) + AnonymousClass005.A0H(this.title);
    }

    public ActivityDetailNote(String str, List<String> list, Integer num, String str2, String str3) {
        this.summary = str;
        this.highlights = list;
        this.version = num;
        this.tag = str2;
        this.title = str3;
    }

    public String toString() {
        return super.toString();
    }
}
