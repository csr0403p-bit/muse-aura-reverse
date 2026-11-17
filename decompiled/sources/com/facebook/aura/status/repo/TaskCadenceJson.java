package com.facebook.aura.status.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import com.facebook.aura.model.HatchTaskCadence;
import com.facebook.aura.model.HatchTaskCadenceKind;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TaskCadenceJson extends C06G {
    public final Long interval_seconds;
    public final String kind;
    public final Long run_at_utc;
    public final String time;
    public final List<String> weekdays;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, TaskCadenceJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<TaskCadenceJson> serializer() {
            return TaskCadenceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskCadenceJson) {
                TaskCadenceJson taskCadenceJson = (TaskCadenceJson) obj;
                if (!C7384Etj.areEqual(this.kind, taskCadenceJson.kind) || !C7384Etj.areEqual(this.run_at_utc, taskCadenceJson.run_at_utc) || !C7384Etj.areEqual(this.interval_seconds, taskCadenceJson.interval_seconds) || !C7384Etj.areEqual(this.time, taskCadenceJson.time) || !C7384Etj.areEqual(this.weekdays, taskCadenceJson.weekdays)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskCadenceJson copy$default(TaskCadenceJson taskCadenceJson, String str, Long l, Long l2, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskCadenceJson.kind;
        }
        if ((i & 2) != 0) {
            l = taskCadenceJson.run_at_utc;
        }
        if ((i & 4) != 0) {
            l2 = taskCadenceJson.interval_seconds;
        }
        if ((i & 8) != 0) {
            str2 = taskCadenceJson.time;
        }
        if ((i & 16) != 0) {
            list = taskCadenceJson.weekdays;
        }
        return taskCadenceJson.copy(str, l, l2, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(TaskCadenceJson taskCadenceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || taskCadenceJson.kind != null) {
            c9j5.AAP(taskCadenceJson.kind, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || taskCadenceJson.run_at_utc != null) {
            c9j5.AAP(taskCadenceJson.run_at_utc, C9j1.A00, c9iZ, 1);
        }
        if (zAfR || taskCadenceJson.interval_seconds != null) {
            c9j5.AAP(taskCadenceJson.interval_seconds, C9j1.A00, c9iZ, 2);
        }
        if (zAfR || taskCadenceJson.time != null) {
            c9j5.AAP(taskCadenceJson.time, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || taskCadenceJson.weekdays != null) {
            c9j5.AAP(taskCadenceJson.weekdays, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final String component1() {
        return this.kind;
    }

    public final Long component2() {
        return this.run_at_utc;
    }

    public final Long component3() {
        return this.interval_seconds;
    }

    public final String component4() {
        return this.time;
    }

    public final List<String> component5() {
        return this.weekdays;
    }

    public final TaskCadenceJson copy(String str, Long l, Long l2, String str2, List<String> list) {
        return new TaskCadenceJson(str, l, l2, str2, list);
    }

    public final Long getInterval_seconds() {
        return this.interval_seconds;
    }

    public final String getKind() {
        return this.kind;
    }

    public final Long getRun_at_utc() {
        return this.run_at_utc;
    }

    public final String getTime() {
        return this.time;
    }

    public final List<String> getWeekdays() {
        return this.weekdays;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.kind) * 31) + AnonymousClass006.A0D(this.run_at_utc)) * 31) + AnonymousClass006.A0D(this.interval_seconds)) * 31) + AnonymousClass006.A0G(this.time)) * 31) + C3cH.A02(this.weekdays);
    }

    public final HatchTaskCadence toModel() {
        HatchTaskCadenceKind hatchTaskCadenceKind;
        String str = this.kind;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -791707519:
                if (!str.equals("weekly")) {
                    return null;
                }
                hatchTaskCadenceKind = HatchTaskCadenceKind.WEEKLY;
                break;
            case -734561654:
                if (!str.equals("yearly")) {
                    return null;
                }
                hatchTaskCadenceKind = HatchTaskCadenceKind.YEARLY;
                break;
            case 95346201:
                if (!str.equals("daily")) {
                    return null;
                }
                hatchTaskCadenceKind = HatchTaskCadenceKind.DAILY;
                break;
            case 570418373:
                if (!str.equals("interval")) {
                    return null;
                }
                hatchTaskCadenceKind = HatchTaskCadenceKind.INTERVAL;
                break;
            case 1236635661:
                if (!str.equals("monthly")) {
                    return null;
                }
                hatchTaskCadenceKind = HatchTaskCadenceKind.MONTHLY;
                break;
            case 1550818188:
                if (!str.equals("runonce")) {
                    return null;
                }
                hatchTaskCadenceKind = HatchTaskCadenceKind.RUNONCE;
                break;
            default:
                return null;
        }
        Long l = this.run_at_utc;
        Long l2 = this.interval_seconds;
        String str2 = this.time;
        List list = this.weekdays;
        if (list == null) {
            list = C0881AGi.A00;
        }
        return new HatchTaskCadence(hatchTaskCadenceKind, l, l2, str2, list);
    }

    public TaskCadenceJson(String str, Long l, Long l2, String str2, List<String> list) {
        this.kind = str;
        this.run_at_utc = l;
        this.interval_seconds = l2;
        this.time = str2;
        this.weekdays = list;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskCadenceJson(String str, Long l, Long l2, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list);
    }

    public /* synthetic */ TaskCadenceJson(int i, String str, Long l, Long l2, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = null;
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.run_at_utc = null;
        } else {
            this.run_at_utc = l;
        }
        if ((i & 4) == 0) {
            this.interval_seconds = null;
        } else {
            this.interval_seconds = l2;
        }
        if ((i & 8) == 0) {
            this.time = null;
        } else {
            this.time = str2;
        }
        if ((i & 16) == 0) {
            this.weekdays = null;
        } else {
            this.weekdays = list;
        }
    }

    public TaskCadenceJson() {
        this(null, null, null, null, null);
    }
}
