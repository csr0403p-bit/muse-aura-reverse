package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchTaskRunUiModel extends C06G {
    public final int attempt;
    public final String resultSummary;
    public final String runId;
    public final String scheduledDateText;
    public final String scheduledTimeText;
    public final String statusLabel;
    public final HatchTaskRunTone tone;
    public final String triggerReason;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTaskRunUiModel) {
                HatchTaskRunUiModel hatchTaskRunUiModel = (HatchTaskRunUiModel) obj;
                if (!C7384Etj.areEqual(this.runId, hatchTaskRunUiModel.runId) || !C7384Etj.areEqual(this.statusLabel, hatchTaskRunUiModel.statusLabel) || this.tone != hatchTaskRunUiModel.tone || !C7384Etj.areEqual(this.triggerReason, hatchTaskRunUiModel.triggerReason) || !C7384Etj.areEqual(this.resultSummary, hatchTaskRunUiModel.resultSummary) || this.attempt != hatchTaskRunUiModel.attempt || !C7384Etj.areEqual(this.scheduledDateText, hatchTaskRunUiModel.scheduledDateText) || !C7384Etj.areEqual(this.scheduledTimeText, hatchTaskRunUiModel.scheduledTimeText)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTaskRunUiModel copy$default(HatchTaskRunUiModel hatchTaskRunUiModel, String str, String str2, HatchTaskRunTone hatchTaskRunTone, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hatchTaskRunUiModel.runId;
        }
        if ((i2 & 2) != 0) {
            str2 = hatchTaskRunUiModel.statusLabel;
        }
        if ((i2 & 4) != 0) {
            hatchTaskRunTone = hatchTaskRunUiModel.tone;
        }
        if ((i2 & 8) != 0) {
            str3 = hatchTaskRunUiModel.triggerReason;
        }
        if ((i2 & 16) != 0) {
            str4 = hatchTaskRunUiModel.resultSummary;
        }
        if ((i2 & 32) != 0) {
            i = hatchTaskRunUiModel.attempt;
        }
        if ((i2 & 64) != 0) {
            str5 = hatchTaskRunUiModel.scheduledDateText;
        }
        if ((i2 & 128) != 0) {
            str6 = hatchTaskRunUiModel.scheduledTimeText;
        }
        return hatchTaskRunUiModel.copy(str, str2, hatchTaskRunTone, str3, str4, i, str5, str6);
    }

    public final String component1() {
        return this.runId;
    }

    public final String component2() {
        return this.statusLabel;
    }

    public final HatchTaskRunTone component3() {
        return this.tone;
    }

    public final String component4() {
        return this.triggerReason;
    }

    public final String component5() {
        return this.resultSummary;
    }

    public final int component6() {
        return this.attempt;
    }

    public final String component7() {
        return this.scheduledDateText;
    }

    public final String component8() {
        return this.scheduledTimeText;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final String getResultSummary() {
        return this.resultSummary;
    }

    public final String getRunId() {
        return this.runId;
    }

    public final String getScheduledDateText() {
        return this.scheduledDateText;
    }

    public final String getScheduledTimeText() {
        return this.scheduledTimeText;
    }

    public final String getStatusLabel() {
        return this.statusLabel;
    }

    public final HatchTaskRunTone getTone() {
        return this.tone;
    }

    public final String getTriggerReason() {
        return this.triggerReason;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.scheduledTimeText, AnonymousClass005.A0I(this.scheduledDateText, (((((AnonymousClass005.A0F(this.tone, AnonymousClass005.A0I(this.statusLabel, AnonymousClass001.A0G(this.runId))) + AnonymousClass006.A0G(this.triggerReason)) * 31) + AnonymousClass005.A0H(this.resultSummary)) * 31) + this.attempt) * 31));
    }

    public HatchTaskRunUiModel(String str, String str2, HatchTaskRunTone hatchTaskRunTone, String str3, String str4, int i, String str5, String str6) {
        AnonymousClass005.A0x(str, str2, hatchTaskRunTone);
        AnonymousClass003.A10(str5, str6);
        this.runId = str;
        this.statusLabel = str2;
        this.tone = hatchTaskRunTone;
        this.triggerReason = str3;
        this.resultSummary = str4;
        this.attempt = i;
        this.scheduledDateText = str5;
        this.scheduledTimeText = str6;
    }

    public final HatchTaskRunUiModel copy(String str, String str2, HatchTaskRunTone hatchTaskRunTone, String str3, String str4, int i, String str5, String str6) {
        AnonymousClass005.A0x(str, str2, hatchTaskRunTone);
        AnonymousClass003.A10(str5, str6);
        return new HatchTaskRunUiModel(str, str2, hatchTaskRunTone, str3, str4, i, str5, str6);
    }

    public String toString() {
        return super.toString();
    }
}
