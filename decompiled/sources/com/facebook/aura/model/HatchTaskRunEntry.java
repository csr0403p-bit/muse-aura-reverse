package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchTaskRunEntry extends C06G {
    public static final int $stable = 0;
    public final int attempt;
    public final String errorText;
    public final String jobId;
    public final String resultSummary;
    public final String runId;
    public final long scheduledForUtc;
    public final String status;
    public final String triggerReason;

    public static /* synthetic */ HatchTaskRunEntry copy$default(HatchTaskRunEntry hatchTaskRunEntry, String str, String str2, long j, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        String str7 = str;
        String str8 = str2;
        long j2 = j;
        String str9 = str3;
        String str10 = str4;
        int i3 = i;
        String str11 = str5;
        String str12 = str6;
        if ((i2 & 1) != 0) {
            str7 = hatchTaskRunEntry.runId;
        }
        if ((i2 & 2) != 0) {
            str8 = hatchTaskRunEntry.jobId;
        }
        if ((i2 & 4) != 0) {
            j2 = hatchTaskRunEntry.scheduledForUtc;
        }
        if ((i2 & 8) != 0) {
            str9 = hatchTaskRunEntry.status;
        }
        if ((i2 & 16) != 0) {
            str10 = hatchTaskRunEntry.triggerReason;
        }
        if ((i2 & 32) != 0) {
            i3 = hatchTaskRunEntry.attempt;
        }
        if ((i2 & 64) != 0) {
            str11 = hatchTaskRunEntry.errorText;
        }
        if ((i2 & 128) != 0) {
            str12 = hatchTaskRunEntry.resultSummary;
        }
        AnonymousClass005.A0y(str7, str8, str9);
        return new HatchTaskRunEntry(str7, str8, j2, str9, str10, i3, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTaskRunEntry) {
                HatchTaskRunEntry hatchTaskRunEntry = (HatchTaskRunEntry) obj;
                if (!C7384Etj.areEqual(this.runId, hatchTaskRunEntry.runId) || !C7384Etj.areEqual(this.jobId, hatchTaskRunEntry.jobId) || this.scheduledForUtc != hatchTaskRunEntry.scheduledForUtc || !C7384Etj.areEqual(this.status, hatchTaskRunEntry.status) || !C7384Etj.areEqual(this.triggerReason, hatchTaskRunEntry.triggerReason) || this.attempt != hatchTaskRunEntry.attempt || !C7384Etj.areEqual(this.errorText, hatchTaskRunEntry.errorText) || !C7384Etj.areEqual(this.resultSummary, hatchTaskRunEntry.resultSummary)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchTaskRunEntry(String str, String str2, long j, String str3, String str4, int i, String str5, String str6, int i2, C06H c06h) {
        this(str, str2, j, str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6);
    }

    public final String component1() {
        return this.runId;
    }

    public final String component2() {
        return this.jobId;
    }

    public final long component3() {
        return this.scheduledForUtc;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.triggerReason;
    }

    public final int component6() {
        return this.attempt;
    }

    public final String component7() {
        return this.errorText;
    }

    public final String component8() {
        return this.resultSummary;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    public final String getJobId() {
        return this.jobId;
    }

    public final String getResultSummary() {
        return this.resultSummary;
    }

    public final String getRunId() {
        return this.runId;
    }

    public final long getScheduledForUtc() {
        return this.scheduledForUtc;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTriggerReason() {
        return this.triggerReason;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.status, AnonymousClass006.A05(this.scheduledForUtc, AnonymousClass005.A0I(this.jobId, AnonymousClass001.A0G(this.runId))) * 31) + AnonymousClass006.A0G(this.triggerReason)) * 31) + this.attempt) * 31) + AnonymousClass006.A0G(this.errorText)) * 31) + AnonymousClass005.A0H(this.resultSummary);
    }

    public final HatchTaskRunEntry copy(String str, String str2, long j, String str3, String str4, int i, String str5, String str6) {
        AnonymousClass005.A0y(str, str2, str3);
        return new HatchTaskRunEntry(str, str2, j, str3, str4, i, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public HatchTaskRunEntry(String str, String str2, long j, String str3, String str4, int i, String str5, String str6) {
        AnonymousClass005.A0y(str, str2, str3);
        this.runId = str;
        this.jobId = str2;
        this.scheduledForUtc = j;
        this.status = str3;
        this.triggerReason = str4;
        this.attempt = i;
        this.errorText = str5;
        this.resultSummary = str6;
    }
}
