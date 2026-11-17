package com.facebook.aura.status.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import java.util.Date;

/* loaded from: classes3.dex */
public final class ActivityAction extends C06G {
    public final String activityVisibility;
    public final ActivityCategory category;
    public final String commitSha;
    public final ActivityDetails details;
    public final boolean hasFileChanges;
    public final AHD<String> highlights;
    public final String id;
    public final AHD<String> pathsTouched;
    public final String runId;
    public final ActivityStatus status;
    public final String subject;
    public final String summary;
    public final String tag;
    public final String taskLabel;
    public final Date timestamp;
    public final String title;
    public final String toolName;
    public final String turnId;
    public final ActivityType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ActivityCategory {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ActivityCategory[] $VALUES;
        public static final ActivityCategory HEARTBEAT;
        public static final ActivityCategory LIFECYCLE;
        public static final ActivityCategory MESSAGE;
        public static final ActivityCategory SUB_AGENT;
        public static final ActivityCategory TASK_RUN;
        public static final ActivityCategory THINKING;
        public static final ActivityCategory TOOL;
        public static final ActivityCategory UNKNOWN;

        static {
            ActivityCategory activityCategory = new ActivityCategory("THINKING", 0);
            THINKING = activityCategory;
            ActivityCategory activityCategory2 = new ActivityCategory("TOOL", 1);
            TOOL = activityCategory2;
            ActivityCategory activityCategory3 = new ActivityCategory("MESSAGE", 2);
            MESSAGE = activityCategory3;
            ActivityCategory activityCategory4 = new ActivityCategory("LIFECYCLE", 3);
            LIFECYCLE = activityCategory4;
            ActivityCategory activityCategory5 = new ActivityCategory("HEARTBEAT", 4);
            HEARTBEAT = activityCategory5;
            ActivityCategory activityCategory6 = new ActivityCategory("TASK_RUN", 5);
            TASK_RUN = activityCategory6;
            ActivityCategory activityCategory7 = new ActivityCategory("SUB_AGENT", 6);
            SUB_AGENT = activityCategory7;
            ActivityCategory activityCategory8 = new ActivityCategory("UNKNOWN", 7);
            UNKNOWN = activityCategory8;
            ActivityCategory[] activityCategoryArr = {activityCategory, activityCategory2, activityCategory3, activityCategory4, activityCategory5, activityCategory6, activityCategory7, activityCategory8};
            $VALUES = activityCategoryArr;
            $ENTRIES = C3cG.A0w(activityCategoryArr);
        }

        public static Ey9<ActivityCategory> getEntries() {
            return $ENTRIES;
        }

        public static ActivityCategory valueOf(String str) {
            return (ActivityCategory) Enum.valueOf(ActivityCategory.class, str);
        }

        public static ActivityCategory[] values() {
            return (ActivityCategory[]) $VALUES.clone();
        }

        public ActivityCategory(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ActivityStatus {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ActivityStatus[] $VALUES;
        public static final ActivityStatus ERROR;
        public static final ActivityStatus PARTIAL;
        public static final ActivityStatus PENDING;
        public static final ActivityStatus SUCCESS;

        static {
            ActivityStatus activityStatus = new ActivityStatus("SUCCESS", 0);
            SUCCESS = activityStatus;
            ActivityStatus activityStatus2 = new ActivityStatus("PARTIAL", 1);
            PARTIAL = activityStatus2;
            ActivityStatus activityStatus3 = new ActivityStatus("ERROR", 2);
            ERROR = activityStatus3;
            ActivityStatus activityStatus4 = new ActivityStatus(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 3);
            PENDING = activityStatus4;
            ActivityStatus[] activityStatusArr = {activityStatus, activityStatus2, activityStatus3, activityStatus4};
            $VALUES = activityStatusArr;
            $ENTRIES = C3cG.A0w(activityStatusArr);
        }

        public static Ey9<ActivityStatus> getEntries() {
            return $ENTRIES;
        }

        public static ActivityStatus valueOf(String str) {
            return (ActivityStatus) Enum.valueOf(ActivityStatus.class, str);
        }

        public static ActivityStatus[] values() {
            return (ActivityStatus[]) $VALUES.clone();
        }

        public ActivityStatus(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ActivityType {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ActivityType[] $VALUES;
        public static final ActivityType EMAIL_SENT;
        public static final ActivityType FILE_CREATED;
        public static final ActivityType FILE_UPDATED;
        public static final ActivityType GIT_COMMIT;
        public static final ActivityType GOAL;
        public static final ActivityType HEARTBEAT;
        public static final ActivityType MESSAGE_SENT;
        public static final ActivityType REMINDER_SET;
        public static final ActivityType RUN;
        public static final ActivityType TASK_RUNNING;
        public static final ActivityType UNKNOWN;
        public static final ActivityType WEB_SEARCH;

        static {
            ActivityType activityType = new ActivityType("EMAIL_SENT", 0);
            EMAIL_SENT = activityType;
            ActivityType activityType2 = new ActivityType("FILE_UPDATED", 1);
            FILE_UPDATED = activityType2;
            ActivityType activityType3 = new ActivityType("FILE_CREATED", 2);
            FILE_CREATED = activityType3;
            ActivityType activityType4 = new ActivityType("GIT_COMMIT", 3);
            GIT_COMMIT = activityType4;
            ActivityType activityType5 = new ActivityType("GOAL", 4);
            GOAL = activityType5;
            ActivityType activityType6 = new ActivityType("MESSAGE_SENT", 5);
            MESSAGE_SENT = activityType6;
            ActivityType activityType7 = new ActivityType("REMINDER_SET", 6);
            REMINDER_SET = activityType7;
            ActivityType activityType8 = new ActivityType("TASK_RUNNING", 7);
            TASK_RUNNING = activityType8;
            ActivityType activityType9 = new ActivityType("WEB_SEARCH", 8);
            WEB_SEARCH = activityType9;
            ActivityType activityType10 = new ActivityType("RUN", 9);
            RUN = activityType10;
            ActivityType activityType11 = new ActivityType("HEARTBEAT", 10);
            HEARTBEAT = activityType11;
            ActivityType activityType12 = new ActivityType("UNKNOWN", 11);
            UNKNOWN = activityType12;
            ActivityType[] activityTypeArr = {activityType, activityType2, activityType3, activityType4, activityType5, activityType6, activityType7, activityType8, activityType9, activityType10, activityType11, activityType12};
            $VALUES = activityTypeArr;
            $ENTRIES = C3cG.A0w(activityTypeArr);
        }

        public static Ey9<ActivityType> getEntries() {
            return $ENTRIES;
        }

        public static ActivityType valueOf(String str) {
            return (ActivityType) Enum.valueOf(ActivityType.class, str);
        }

        public static ActivityType[] values() {
            return (ActivityType[]) $VALUES.clone();
        }

        public ActivityType(String str, int i) {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityAction) {
                ActivityAction activityAction = (ActivityAction) obj;
                if (!C7384Etj.areEqual(this.id, activityAction.id) || !C7384Etj.areEqual(this.timestamp, activityAction.timestamp) || this.type != activityAction.type || !C7384Etj.areEqual(this.title, activityAction.title) || !C7384Etj.areEqual(this.summary, activityAction.summary) || !C7384Etj.areEqual(this.subject, activityAction.subject) || this.status != activityAction.status || !C7384Etj.areEqual(this.runId, activityAction.runId) || !C7384Etj.areEqual(this.commitSha, activityAction.commitSha) || this.category != activityAction.category || this.hasFileChanges != activityAction.hasFileChanges || !C7384Etj.areEqual(this.pathsTouched, activityAction.pathsTouched) || !C7384Etj.areEqual(this.toolName, activityAction.toolName) || !C7384Etj.areEqual(this.activityVisibility, activityAction.activityVisibility) || !C7384Etj.areEqual(this.tag, activityAction.tag) || !C7384Etj.areEqual(this.highlights, activityAction.highlights) || !C7384Etj.areEqual(this.turnId, activityAction.turnId) || !C7384Etj.areEqual(this.taskLabel, activityAction.taskLabel) || !C7384Etj.areEqual(this.details, activityAction.details)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final ActivityCategory component10() {
        return this.category;
    }

    public final boolean component11() {
        return this.hasFileChanges;
    }

    public final AHD<String> component12() {
        return this.pathsTouched;
    }

    public final String component13() {
        return this.toolName;
    }

    public final String component14() {
        return this.activityVisibility;
    }

    public final String component15() {
        return this.tag;
    }

    public final AHD<String> component16() {
        return this.highlights;
    }

    public final String component17() {
        return this.turnId;
    }

    public final String component18() {
        return this.taskLabel;
    }

    public final ActivityDetails component19() {
        return this.details;
    }

    public final Date component2() {
        return this.timestamp;
    }

    public final ActivityType component3() {
        return this.type;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.summary;
    }

    public final String component6() {
        return this.subject;
    }

    public final ActivityStatus component7() {
        return this.status;
    }

    public final String component8() {
        return this.runId;
    }

    public final String component9() {
        return this.commitSha;
    }

    public final String getActivityVisibility() {
        return this.activityVisibility;
    }

    public final ActivityCategory getCategory() {
        return this.category;
    }

    public final String getCommitSha() {
        return this.commitSha;
    }

    public final ActivityDetails getDetails() {
        return this.details;
    }

    public final boolean getHasFileChanges() {
        return this.hasFileChanges;
    }

    public final AHD<String> getHighlights() {
        return this.highlights;
    }

    public final String getId() {
        return this.id;
    }

    public final AHD<String> getPathsTouched() {
        return this.pathsTouched;
    }

    public final String getRunId() {
        return this.runId;
    }

    public final ActivityStatus getStatus() {
        return this.status;
    }

    public final String getSubject() {
        return this.subject;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTaskLabel() {
        return this.taskLabel;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToolName() {
        return this.toolName;
    }

    public final String getTurnId() {
        return this.turnId;
    }

    public final ActivityType getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((((((((AnonymousClass005.A0F(this.pathsTouched, C0KA.A01(AnonymousClass005.A0F(this.category, (((AnonymousClass005.A0F(this.status, (((((AnonymousClass005.A0F(this.type, AnonymousClass005.A0F(this.timestamp, AnonymousClass001.A0G(this.id))) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.subject)) * 31) + AnonymousClass006.A0G(this.runId)) * 31) + AnonymousClass006.A0G(this.commitSha)) * 31), this.hasFileChanges)) + AnonymousClass006.A0G(this.toolName)) * 31) + AnonymousClass006.A0G(this.activityVisibility)) * 31) + AnonymousClass006.A0G(this.tag)) * 31) + AnonymousClass006.A0D(this.highlights)) * 31) + AnonymousClass006.A0G(this.turnId)) * 31) + AnonymousClass006.A0G(this.taskLabel)) * 31) + C3cH.A02(this.details);
    }

    public final boolean shouldDisplayInActivityFeed() {
        return !"hidden".equals(this.activityVisibility);
    }

    public ActivityAction(String str, Date date, ActivityType activityType, String str2, String str3, String str4, ActivityStatus activityStatus, String str5, String str6, ActivityCategory activityCategory, boolean z, AHD<String> ahd, String str7, String str8, String str9, AHD<String> ahd2, String str10, String str11, ActivityDetails activityDetails) {
        AnonymousClass005.A0x(str, date, activityType);
        C7384Etj.A0Y(activityStatus, 6);
        AnonymousClass002.A1G(activityCategory, 9, ahd);
        this.id = str;
        this.timestamp = date;
        this.type = activityType;
        this.title = str2;
        this.summary = str3;
        this.subject = str4;
        this.status = activityStatus;
        this.runId = str5;
        this.commitSha = str6;
        this.category = activityCategory;
        this.hasFileChanges = z;
        this.pathsTouched = ahd;
        this.toolName = str7;
        this.activityVisibility = str8;
        this.tag = str9;
        this.highlights = ahd2;
        this.turnId = str10;
        this.taskLabel = str11;
        this.details = activityDetails;
    }

    public final ActivityAction copy(String str, Date date, ActivityType activityType, String str2, String str3, String str4, ActivityStatus activityStatus, String str5, String str6, ActivityCategory activityCategory, boolean z, AHD<String> ahd, String str7, String str8, String str9, AHD<String> ahd2, String str10, String str11, ActivityDetails activityDetails) {
        AnonymousClass005.A0x(str, date, activityType);
        C7384Etj.A0Y(activityStatus, 6);
        AnonymousClass002.A1G(activityCategory, 9, ahd);
        return new ActivityAction(str, date, activityType, str2, str3, str4, activityStatus, str5, str6, activityCategory, z, ahd, str7, str8, str9, ahd2, str10, str11, activityDetails);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ActivityAction copy$default(ActivityAction activityAction, String str, Date date, ActivityType activityType, String str2, String str3, String str4, ActivityStatus activityStatus, String str5, String str6, ActivityCategory activityCategory, boolean z, AHD ahd, String str7, String str8, String str9, AHD ahd2, String str10, String str11, ActivityDetails activityDetails, int i, Object obj) {
        String str12 = str;
        Date date2 = date;
        ActivityType activityType2 = activityType;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        ActivityStatus activityStatus2 = activityStatus;
        String str16 = str5;
        String str17 = str6;
        ActivityCategory activityCategory2 = activityCategory;
        boolean z2 = z;
        AHD ahd3 = ahd;
        String str18 = str7;
        String str19 = str8;
        String str20 = str9;
        AHD ahd4 = ahd2;
        String str21 = str10;
        String str22 = str11;
        ActivityDetails activityDetails2 = activityDetails;
        if ((i & 1) != 0) {
            str12 = activityAction.id;
        }
        if ((i & 2) != 0) {
            date2 = activityAction.timestamp;
        }
        if ((i & 4) != 0) {
            activityType2 = activityAction.type;
        }
        if ((i & 8) != 0) {
            str13 = activityAction.title;
        }
        if ((i & 16) != 0) {
            str14 = activityAction.summary;
        }
        if ((i & 32) != 0) {
            str15 = activityAction.subject;
        }
        if ((i & 64) != 0) {
            activityStatus2 = activityAction.status;
        }
        if ((i & 128) != 0) {
            str16 = activityAction.runId;
        }
        if ((i & 256) != 0) {
            str17 = activityAction.commitSha;
        }
        if ((i & 512) != 0) {
            activityCategory2 = activityAction.category;
        }
        if ((i & 1024) != 0) {
            z2 = activityAction.hasFileChanges;
        }
        if ((i & 2048) != 0) {
            ahd3 = activityAction.pathsTouched;
        }
        if ((i & 4096) != 0) {
            str18 = activityAction.toolName;
        }
        if ((i & 8192) != 0) {
            str19 = activityAction.activityVisibility;
        }
        if ((i & 16384) != 0) {
            str20 = activityAction.tag;
        }
        if ((i & 32768) != 0) {
            ahd4 = activityAction.highlights;
        }
        if ((i & 65536) != 0) {
            str21 = activityAction.turnId;
        }
        if ((i & 131072) != 0) {
            str22 = activityAction.taskLabel;
        }
        if ((i & 262144) != 0) {
            activityDetails2 = activityAction.details;
        }
        ActivityStatus activityStatus3 = activityStatus2;
        return activityAction.copy(str12, date2, activityType2, str13, str14, str15, activityStatus3, str16, str17, activityCategory2, z2, ahd3, str18, str19, str20, ahd4, str21, str22, activityDetails2);
    }

    public /* synthetic */ ActivityAction(String str, Date date, ActivityType activityType, String str2, String str3, String str4, ActivityStatus activityStatus, String str5, String str6, ActivityCategory activityCategory, boolean z, AHD ahd, String str7, String str8, String str9, AHD ahd2, String str10, String str11, ActivityDetails activityDetails, int i, C06H c06h) {
        this(str, date, activityType, str2, str3, str4, activityStatus, str5, str6, activityCategory, z, ahd, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : ahd2, (65536 & i) != 0 ? null : str10, (131072 & i) != 0 ? null : str11, (i & 262144) != 0 ? null : activityDetails);
    }
}
