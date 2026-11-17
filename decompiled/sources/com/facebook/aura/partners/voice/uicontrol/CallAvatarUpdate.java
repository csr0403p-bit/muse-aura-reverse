package com.facebook.aura.partners.voice.uicontrol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* loaded from: classes2.dex */
public final class CallAvatarUpdate extends C06G {
    public final String avatarImagePath;
    public final String avatarStem;
    public final DisplayCrop displayCrop;
    public final FailureReason failureReason;
    public final boolean startedOnPrevious;
    public final Status status;
    public final String targetCallId;

    public final class DisplayCrop extends C06G {
        public final Float size;
        public final Float x;
        public final Float y;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DisplayCrop) {
                    DisplayCrop displayCrop = (DisplayCrop) obj;
                    if (!C7384Etj.areEqual(this.x, displayCrop.x) || !C7384Etj.areEqual(this.y, displayCrop.y) || !C7384Etj.areEqual(this.size, displayCrop.size)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ DisplayCrop copy$default(DisplayCrop displayCrop, Float f, Float f2, Float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = displayCrop.x;
            }
            if ((i & 2) != 0) {
                f2 = displayCrop.y;
            }
            if ((i & 4) != 0) {
                f3 = displayCrop.size;
            }
            return new DisplayCrop(f, f2, f3);
        }

        public final Float component1() {
            return this.x;
        }

        public final Float component2() {
            return this.y;
        }

        public final Float component3() {
            return this.size;
        }

        public final DisplayCrop copy(Float f, Float f2, Float f3) {
            return new DisplayCrop(f, f2, f3);
        }

        public final Float getSize() {
            return this.size;
        }

        public final Float getX() {
            return this.x;
        }

        public final Float getY() {
            return this.y;
        }

        public int hashCode() {
            return (((AnonymousClass006.A0D(this.x) * 31) + AnonymousClass006.A0D(this.y)) * 31) + C3cH.A02(this.size);
        }

        public DisplayCrop(Float f, Float f2, Float f3) {
            this.x = f;
            this.y = f2;
            this.size = f3;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason FAILED;
        public static final FailureReason NOT_ANIMATABLE;
        public final String wireValue;

        static {
            FailureReason failureReason = new FailureReason(CvmMigrationStatusJson.STAGE_FAILED, 0, "failed");
            FAILED = failureReason;
            FailureReason failureReason2 = new FailureReason("NOT_ANIMATABLE", 1, "not_animatable");
            NOT_ANIMATABLE = failureReason2;
            FailureReason[] failureReasonArr = {failureReason, failureReason2};
            $VALUES = failureReasonArr;
            $ENTRIES = C3cG.A0w(failureReasonArr);
        }

        public static Ey9<FailureReason> getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }

        public final String getWireValue() {
            return this.wireValue;
        }

        public FailureReason(String str, int i, String str2) {
            this.wireValue = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Status {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Status[] $VALUES;
        public static final Status COMPLETED;
        public static final Status FAILED;
        public static final Status UPDATING;
        public final String wireValue;

        static {
            Status status = new Status("UPDATING", 0, "updating");
            UPDATING = status;
            Status status2 = new Status("COMPLETED", 1, "completed");
            COMPLETED = status2;
            Status status3 = new Status(CvmMigrationStatusJson.STAGE_FAILED, 2, "failed");
            FAILED = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = C3cG.A0w(statusArr);
        }

        public static Ey9<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final String getWireValue() {
            return this.wireValue;
        }

        public Status(String str, int i, String str2) {
            this.wireValue = str2;
        }
    }

    public static /* synthetic */ CallAvatarUpdate copy$default(CallAvatarUpdate callAvatarUpdate, String str, Status status, DisplayCrop displayCrop, FailureReason failureReason, String str2, String str3, boolean z, int i, Object obj) {
        String str4 = str;
        Status status2 = status;
        DisplayCrop displayCrop2 = displayCrop;
        FailureReason failureReason2 = failureReason;
        String str5 = str2;
        String str6 = str3;
        boolean z2 = z;
        if ((i & 1) != 0) {
            str4 = callAvatarUpdate.targetCallId;
        }
        if ((i & 2) != 0) {
            status2 = callAvatarUpdate.status;
        }
        if ((i & 4) != 0) {
            displayCrop2 = callAvatarUpdate.displayCrop;
        }
        if ((i & 8) != 0) {
            failureReason2 = callAvatarUpdate.failureReason;
        }
        if ((i & 16) != 0) {
            str5 = callAvatarUpdate.avatarStem;
        }
        if ((i & 32) != 0) {
            str6 = callAvatarUpdate.avatarImagePath;
        }
        if ((i & 64) != 0) {
            z2 = callAvatarUpdate.startedOnPrevious;
        }
        AnonymousClass003.A0u(str4, status2);
        return new CallAvatarUpdate(str4, status2, displayCrop2, failureReason2, str5, str6, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallAvatarUpdate) {
                CallAvatarUpdate callAvatarUpdate = (CallAvatarUpdate) obj;
                if (!C7384Etj.areEqual(this.targetCallId, callAvatarUpdate.targetCallId) || this.status != callAvatarUpdate.status || !C7384Etj.areEqual(this.displayCrop, callAvatarUpdate.displayCrop) || this.failureReason != callAvatarUpdate.failureReason || !C7384Etj.areEqual(this.avatarStem, callAvatarUpdate.avatarStem) || !C7384Etj.areEqual(this.avatarImagePath, callAvatarUpdate.avatarImagePath) || this.startedOnPrevious != callAvatarUpdate.startedOnPrevious) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ CallAvatarUpdate(String str, Status status, DisplayCrop displayCrop, FailureReason failureReason, String str2, String str3, boolean z, int i, C06H c06h) {
        this(str, status, (i & 4) != 0 ? null : displayCrop, (i & 8) != 0 ? null : failureReason, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, C3cH.A1M(i, z));
    }

    public final String component1() {
        return this.targetCallId;
    }

    public final Status component2() {
        return this.status;
    }

    public final DisplayCrop component3() {
        return this.displayCrop;
    }

    public final FailureReason component4() {
        return this.failureReason;
    }

    public final String component5() {
        return this.avatarStem;
    }

    public final String component6() {
        return this.avatarImagePath;
    }

    public final boolean component7() {
        return this.startedOnPrevious;
    }

    public final String getAvatarImagePath() {
        return this.avatarImagePath;
    }

    public final String getAvatarStem() {
        return this.avatarStem;
    }

    public final DisplayCrop getDisplayCrop() {
        return this.displayCrop;
    }

    public final FailureReason getFailureReason() {
        return this.failureReason;
    }

    public final boolean getStartedOnPrevious() {
        return this.startedOnPrevious;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTargetCallId() {
        return this.targetCallId;
    }

    public int hashCode() {
        return C0KA.A00((((((((AnonymousClass005.A0F(this.status, AnonymousClass001.A0G(this.targetCallId)) + AnonymousClass006.A0D(this.displayCrop)) * 31) + AnonymousClass006.A0D(this.failureReason)) * 31) + AnonymousClass006.A0G(this.avatarStem)) * 31) + AnonymousClass005.A0H(this.avatarImagePath)) * 31, this.startedOnPrevious);
    }

    public final CallAvatarUpdate copy(String str, Status status, DisplayCrop displayCrop, FailureReason failureReason, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, status);
        return new CallAvatarUpdate(str, status, displayCrop, failureReason, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public CallAvatarUpdate(String str, Status status, DisplayCrop displayCrop, FailureReason failureReason, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, status);
        this.targetCallId = str;
        this.status = status;
        this.displayCrop = displayCrop;
        this.failureReason = failureReason;
        this.avatarStem = str2;
        this.avatarImagePath = str3;
        this.startedOnPrevious = z;
    }
}
