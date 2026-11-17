package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.model.HatchTaskRunEntry;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TaskRunResponseEntry extends C06G {
    public static final Companion Companion = new Companion();
    public final int attempt;
    public final String error_text;
    public final String job_id;
    public final String result_summary;
    public final String run_id;
    public final long scheduled_for_utc;
    public final String status;
    public final String trigger_reason;

    public final class Companion {
        public final C9hr<TaskRunResponseEntry> serializer() {
            return TaskRunResponseEntry$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ TaskRunResponseEntry copy$default(TaskRunResponseEntry taskRunResponseEntry, String str, String str2, long j, String str3, String str4, int i, String str5, String str6, int i2, Object obj) {
        String str7 = str;
        String str8 = str2;
        long j2 = j;
        String str9 = str3;
        String str10 = str4;
        int i3 = i;
        String str11 = str5;
        String str12 = str6;
        if ((i2 & 1) != 0) {
            str7 = taskRunResponseEntry.run_id;
        }
        if ((i2 & 2) != 0) {
            str8 = taskRunResponseEntry.job_id;
        }
        if ((i2 & 4) != 0) {
            j2 = taskRunResponseEntry.scheduled_for_utc;
        }
        if ((i2 & 8) != 0) {
            str9 = taskRunResponseEntry.status;
        }
        if ((i2 & 16) != 0) {
            str10 = taskRunResponseEntry.trigger_reason;
        }
        if ((i2 & 32) != 0) {
            i3 = taskRunResponseEntry.attempt;
        }
        if ((i2 & 64) != 0) {
            str11 = taskRunResponseEntry.error_text;
        }
        if ((i2 & 128) != 0) {
            str12 = taskRunResponseEntry.result_summary;
        }
        AnonymousClass005.A0y(str7, str8, str9);
        return new TaskRunResponseEntry(str7, str8, j2, str9, str10, i3, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(TaskRunResponseEntry taskRunResponseEntry, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(taskRunResponseEntry.run_id)) {
            c9j5.AAV(taskRunResponseEntry.run_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(taskRunResponseEntry.job_id)) {
            c9j5.AAV(taskRunResponseEntry.job_id, c9iZ, 1);
        }
        if (zAfR || taskRunResponseEntry.scheduled_for_utc != 0) {
            c9j5.AAN(c9iZ, 2, taskRunResponseEntry.scheduled_for_utc);
        }
        if (zAfR || !"".equals(taskRunResponseEntry.status)) {
            c9j5.AAV(taskRunResponseEntry.status, c9iZ, 3);
        }
        if (zAfR || taskRunResponseEntry.trigger_reason != null) {
            c9j5.AAP(taskRunResponseEntry.trigger_reason, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || taskRunResponseEntry.attempt != 1) {
            c9j5.AAK(c9iZ, 5, taskRunResponseEntry.attempt);
        }
        if (zAfR || taskRunResponseEntry.error_text != null) {
            c9j5.AAP(taskRunResponseEntry.error_text, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || taskRunResponseEntry.result_summary != null) {
            c9j5.AAP(taskRunResponseEntry.result_summary, C07779iq.A01, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskRunResponseEntry) {
                TaskRunResponseEntry taskRunResponseEntry = (TaskRunResponseEntry) obj;
                if (!C7384Etj.areEqual(this.run_id, taskRunResponseEntry.run_id) || !C7384Etj.areEqual(this.job_id, taskRunResponseEntry.job_id) || this.scheduled_for_utc != taskRunResponseEntry.scheduled_for_utc || !C7384Etj.areEqual(this.status, taskRunResponseEntry.status) || !C7384Etj.areEqual(this.trigger_reason, taskRunResponseEntry.trigger_reason) || this.attempt != taskRunResponseEntry.attempt || !C7384Etj.areEqual(this.error_text, taskRunResponseEntry.error_text) || !C7384Etj.areEqual(this.result_summary, taskRunResponseEntry.result_summary)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.run_id;
    }

    public final String component2() {
        return this.job_id;
    }

    public final long component3() {
        return this.scheduled_for_utc;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.trigger_reason;
    }

    public final int component6() {
        return this.attempt;
    }

    public final String component7() {
        return this.error_text;
    }

    public final String component8() {
        return this.result_summary;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final String getError_text() {
        return this.error_text;
    }

    public final String getJob_id() {
        return this.job_id;
    }

    public final String getResult_summary() {
        return this.result_summary;
    }

    public final String getRun_id() {
        return this.run_id;
    }

    public final long getScheduled_for_utc() {
        return this.scheduled_for_utc;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTrigger_reason() {
        return this.trigger_reason;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.status, AnonymousClass006.A05(this.scheduled_for_utc, AnonymousClass005.A0I(this.job_id, AnonymousClass001.A0G(this.run_id))) * 31) + AnonymousClass006.A0G(this.trigger_reason)) * 31) + this.attempt) * 31) + AnonymousClass006.A0G(this.error_text)) * 31) + AnonymousClass005.A0H(this.result_summary);
    }

    public final HatchTaskRunEntry toModel() {
        return new HatchTaskRunEntry(this.run_id, this.job_id, this.scheduled_for_utc, this.status, TasksJsonKt.normalizeOptionalText(this.trigger_reason), this.attempt, TasksJsonKt.normalizeOptionalText(this.error_text), TasksJsonKt.normalizeOptionalText(this.result_summary));
    }

    public /* synthetic */ TaskRunResponseEntry(int i, String str, String str2, long j, String str3, String str4, int i2, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.run_id = "";
        } else {
            this.run_id = str;
        }
        if ((i & 2) == 0) {
            this.job_id = "";
        } else {
            this.job_id = str2;
        }
        if ((i & 4) == 0) {
            this.scheduled_for_utc = 0L;
        } else {
            this.scheduled_for_utc = j;
        }
        if ((i & 8) == 0) {
            this.status = "";
        } else {
            this.status = str3;
        }
        if ((i & 16) == 0) {
            this.trigger_reason = null;
        } else {
            this.trigger_reason = str4;
        }
        if ((i & 32) == 0) {
            this.attempt = 1;
        } else {
            this.attempt = i2;
        }
        if ((i & 64) == 0) {
            this.error_text = null;
        } else {
            this.error_text = str5;
        }
        if ((i & 128) == 0) {
            this.result_summary = null;
        } else {
            this.result_summary = str6;
        }
    }

    public final TaskRunResponseEntry copy(String str, String str2, long j, String str3, String str4, int i, String str5, String str6) {
        AnonymousClass005.A0y(str, str2, str3);
        return new TaskRunResponseEntry(str, str2, j, str3, str4, i, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public TaskRunResponseEntry(String str, String str2, long j, String str3, String str4, int i, String str5, String str6) {
        AnonymousClass005.A0y(str, str2, str3);
        this.run_id = str;
        this.job_id = str2;
        this.scheduled_for_utc = j;
        this.status = str3;
        this.trigger_reason = str4;
        this.attempt = i;
        this.error_text = str5;
        this.result_summary = str6;
    }

    public /* synthetic */ TaskRunResponseEntry(String str, String str2, long j, String str3, String str4, int i, String str5, String str6, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6);
    }

    public TaskRunResponseEntry() {
        this("", "", 0L, "", null, 1, null, null);
    }
}
