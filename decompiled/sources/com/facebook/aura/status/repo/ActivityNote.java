package com.facebook.aura.status.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class ActivityNote extends C06G {
    public final List<String> highlights;
    public final String summary;
    public final String tag;
    public final String title;
    public final Integer version;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityNote) {
                ActivityNote activityNote = (ActivityNote) obj;
                if (!C7384Etj.areEqual(this.highlights, activityNote.highlights) || !C7384Etj.areEqual(this.summary, activityNote.summary) || !C7384Etj.areEqual(this.tag, activityNote.tag) || !C7384Etj.areEqual(this.title, activityNote.title) || !C7384Etj.areEqual(this.version, activityNote.version)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityNote copy$default(ActivityNote activityNote, List list, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = activityNote.highlights;
        }
        if ((i & 2) != 0) {
            str = activityNote.summary;
        }
        if ((i & 4) != 0) {
            str2 = activityNote.tag;
        }
        if ((i & 8) != 0) {
            str3 = activityNote.title;
        }
        if ((i & 16) != 0) {
            num = activityNote.version;
        }
        return activityNote.copy(list, str, str2, str3, num);
    }

    public final List<String> component1() {
        return this.highlights;
    }

    public final String component2() {
        return this.summary;
    }

    public final String component3() {
        return this.tag;
    }

    public final String component4() {
        return this.title;
    }

    public final Integer component5() {
        return this.version;
    }

    public final ActivityNote copy(List<String> list, String str, String str2, String str3, Integer num) {
        return new ActivityNote(list, str, str2, str3, num);
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
        return (((((((AnonymousClass006.A0D(this.highlights) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.tag)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + C3cH.A02(this.version);
    }

    public ActivityNote(List<String> list, String str, String str2, String str3, Integer num) {
        this.highlights = list;
        this.summary = str;
        this.tag = str2;
        this.title = str3;
        this.version = num;
    }

    public String toString() {
        return super.toString();
    }
}
