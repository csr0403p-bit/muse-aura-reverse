package com.facebook.aura.status.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivityEntry extends C06G {
    public final ActivityDetails details;
    public final String hash;
    public final ActivityNote note;
    public final String status;
    public final String subject;
    public final String subtitle;
    public final String taskLabel;
    public final String timestamp;
    public final String title;
    public final Long tsMs;
    public final String turnId;
    public final String type;

    public static /* synthetic */ ActivityEntry copy$default(ActivityEntry activityEntry, String str, String str2, String str3, String str4, String str5, String str6, String str7, ActivityDetails activityDetails, String str8, ActivityNote activityNote, String str9, Long l, int i, Object obj) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        ActivityDetails activityDetails2 = activityDetails;
        String str17 = str8;
        ActivityNote activityNote2 = activityNote;
        String str18 = str9;
        Long l2 = l;
        if ((i & 1) != 0) {
            str10 = activityEntry.timestamp;
        }
        if ((i & 2) != 0) {
            str11 = activityEntry.type;
        }
        if ((i & 4) != 0) {
            str12 = activityEntry.turnId;
        }
        if ((i & 8) != 0) {
            str13 = activityEntry.title;
        }
        if ((i & 16) != 0) {
            str14 = activityEntry.subtitle;
        }
        if ((i & 32) != 0) {
            str15 = activityEntry.status;
        }
        if ((i & 64) != 0) {
            str16 = activityEntry.taskLabel;
        }
        if ((i & 128) != 0) {
            activityDetails2 = activityEntry.details;
        }
        if ((i & 256) != 0) {
            str17 = activityEntry.hash;
        }
        if ((i & 512) != 0) {
            activityNote2 = activityEntry.note;
        }
        if ((i & 1024) != 0) {
            str18 = activityEntry.subject;
        }
        if ((i & 2048) != 0) {
            l2 = activityEntry.tsMs;
        }
        return new ActivityEntry(str10, str11, str12, str13, str14, str15, str16, activityDetails2, str17, activityNote2, str18, l2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityEntry) {
                ActivityEntry activityEntry = (ActivityEntry) obj;
                if (!C7384Etj.areEqual(this.timestamp, activityEntry.timestamp) || !C7384Etj.areEqual(this.type, activityEntry.type) || !C7384Etj.areEqual(this.turnId, activityEntry.turnId) || !C7384Etj.areEqual(this.title, activityEntry.title) || !C7384Etj.areEqual(this.subtitle, activityEntry.subtitle) || !C7384Etj.areEqual(this.status, activityEntry.status) || !C7384Etj.areEqual(this.taskLabel, activityEntry.taskLabel) || !C7384Etj.areEqual(this.details, activityEntry.details) || !C7384Etj.areEqual(this.hash, activityEntry.hash) || !C7384Etj.areEqual(this.note, activityEntry.note) || !C7384Etj.areEqual(this.subject, activityEntry.subject) || !C7384Etj.areEqual(this.tsMs, activityEntry.tsMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.timestamp;
    }

    public final ActivityNote component10() {
        return this.note;
    }

    public final String component11() {
        return this.subject;
    }

    public final Long component12() {
        return this.tsMs;
    }

    public final String component2() {
        return this.type;
    }

    public final String component3() {
        return this.turnId;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.subtitle;
    }

    public final String component6() {
        return this.status;
    }

    public final String component7() {
        return this.taskLabel;
    }

    public final ActivityDetails component8() {
        return this.details;
    }

    public final String component9() {
        return this.hash;
    }

    public final ActivityEntry copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, ActivityDetails activityDetails, String str8, ActivityNote activityNote, String str9, Long l) {
        return new ActivityEntry(str, str2, str3, str4, str5, str6, str7, activityDetails, str8, activityNote, str9, l);
    }

    public final ActivityDetails getDetails() {
        return this.details;
    }

    public final String getHash() {
        return this.hash;
    }

    public final ActivityNote getNote() {
        return this.note;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTaskLabel() {
        return this.taskLabel;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getTsMs() {
        return this.tsMs;
    }

    public final String getTurnId() {
        return this.turnId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((((((((((((AnonymousClass006.A0G(this.timestamp) * 31) + AnonymousClass006.A0G(this.type)) * 31) + AnonymousClass006.A0G(this.turnId)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.status)) * 31) + AnonymousClass006.A0G(this.taskLabel)) * 31) + AnonymousClass006.A0D(this.details)) * 31) + AnonymousClass006.A0G(this.hash)) * 31) + AnonymousClass006.A0D(this.note)) * 31) + AnonymousClass006.A0G(this.subject)) * 31) + C3cH.A02(this.tsMs);
    }

    public ActivityEntry(String str, String str2, String str3, String str4, String str5, String str6, String str7, ActivityDetails activityDetails, String str8, ActivityNote activityNote, String str9, Long l) {
        this.timestamp = str;
        this.type = str2;
        this.turnId = str3;
        this.title = str4;
        this.subtitle = str5;
        this.status = str6;
        this.taskLabel = str7;
        this.details = activityDetails;
        this.hash = str8;
        this.note = activityNote;
        this.subject = str9;
        this.tsMs = l;
    }

    public String toString() {
        return super.toString();
    }
}
