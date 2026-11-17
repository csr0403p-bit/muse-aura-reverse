package com.facebook.aura.status.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import com.facebook.aura.model.HatchTaskEntry;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TaskResponseEntry extends C06G {
    public static final Companion Companion = new Companion();
    public final TaskCadenceJson cadence;
    public final boolean enabled;
    public final String execution_target;
    public final String id;
    public final boolean is_heartbeat;
    public final String mode;
    public final Long next_run_at_utc;
    public final String path;
    public final String schedule_key;
    public final String timezone;
    public final String title;

    public final class Companion {
        public final C9hr<TaskResponseEntry> serializer() {
            return TaskResponseEntry$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public TaskResponseEntry(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, TaskCadenceJson taskCadenceJson) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.title = str2;
        this.path = str3;
        this.schedule_key = str4;
        this.mode = str5;
        this.enabled = z;
        this.execution_target = str6;
        this.is_heartbeat = z2;
        this.next_run_at_utc = l;
        this.timezone = str7;
        this.cadence = taskCadenceJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_status_repo_repo(TaskResponseEntry taskResponseEntry, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(taskResponseEntry.id)) {
            c9j5.AAV(taskResponseEntry.id, c9iZ, 0);
        }
        if (zAfR || taskResponseEntry.title != null) {
            c9j5.AAP(taskResponseEntry.title, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || taskResponseEntry.path != null) {
            c9j5.AAP(taskResponseEntry.path, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || taskResponseEntry.schedule_key != null) {
            c9j5.AAP(taskResponseEntry.schedule_key, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || taskResponseEntry.mode != null) {
            c9j5.AAP(taskResponseEntry.mode, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || !taskResponseEntry.enabled) {
            c9j5.AA7(c9iZ, 5, taskResponseEntry.enabled);
        }
        if (zAfR || taskResponseEntry.execution_target != null) {
            c9j5.AAP(taskResponseEntry.execution_target, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || taskResponseEntry.is_heartbeat) {
            c9j5.AA7(c9iZ, 7, taskResponseEntry.is_heartbeat);
        }
        if (zAfR || taskResponseEntry.next_run_at_utc != null) {
            c9j5.AAP(taskResponseEntry.next_run_at_utc, C9j1.A00, c9iZ, 8);
        }
        if (zAfR || taskResponseEntry.timezone != null) {
            c9j5.AAP(taskResponseEntry.timezone, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || taskResponseEntry.cadence != null) {
            c9j5.AAP(taskResponseEntry.cadence, TaskCadenceJson$$serializer.INSTANCE, c9iZ, 10);
        }
    }

    public final TaskResponseEntry copy(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, TaskCadenceJson taskCadenceJson) {
        C7384Etj.A0Y(str, 0);
        return new TaskResponseEntry(str, str2, str3, str4, str5, z, str6, z2, l, str7, taskCadenceJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskResponseEntry) {
                TaskResponseEntry taskResponseEntry = (TaskResponseEntry) obj;
                if (!C7384Etj.areEqual(this.id, taskResponseEntry.id) || !C7384Etj.areEqual(this.title, taskResponseEntry.title) || !C7384Etj.areEqual(this.path, taskResponseEntry.path) || !C7384Etj.areEqual(this.schedule_key, taskResponseEntry.schedule_key) || !C7384Etj.areEqual(this.mode, taskResponseEntry.mode) || this.enabled != taskResponseEntry.enabled || !C7384Etj.areEqual(this.execution_target, taskResponseEntry.execution_target) || this.is_heartbeat != taskResponseEntry.is_heartbeat || !C7384Etj.areEqual(this.next_run_at_utc, taskResponseEntry.next_run_at_utc) || !C7384Etj.areEqual(this.timezone, taskResponseEntry.timezone) || !C7384Etj.areEqual(this.cadence, taskResponseEntry.cadence)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ TaskResponseEntry copy$default(TaskResponseEntry taskResponseEntry, String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, TaskCadenceJson taskCadenceJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskResponseEntry.id;
        }
        if ((i & 2) != 0) {
            str2 = taskResponseEntry.title;
        }
        if ((i & 4) != 0) {
            str3 = taskResponseEntry.path;
        }
        if ((i & 8) != 0) {
            str4 = taskResponseEntry.schedule_key;
        }
        if ((i & 16) != 0) {
            str5 = taskResponseEntry.mode;
        }
        if ((i & 32) != 0) {
            z = taskResponseEntry.enabled;
        }
        if ((i & 64) != 0) {
            str6 = taskResponseEntry.execution_target;
        }
        if ((i & 128) != 0) {
            z2 = taskResponseEntry.is_heartbeat;
        }
        if ((i & 256) != 0) {
            l = taskResponseEntry.next_run_at_utc;
        }
        if ((i & 512) != 0) {
            str7 = taskResponseEntry.timezone;
        }
        if ((i & 1024) != 0) {
            taskCadenceJson = taskResponseEntry.cadence;
        }
        return taskResponseEntry.copy(str, str2, str3, str4, str5, z, str6, z2, l, str7, taskCadenceJson);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.timezone;
    }

    public final TaskCadenceJson component11() {
        return this.cadence;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.path;
    }

    public final String component4() {
        return this.schedule_key;
    }

    public final String component5() {
        return this.mode;
    }

    public final boolean component6() {
        return this.enabled;
    }

    public final String component7() {
        return this.execution_target;
    }

    public final boolean component8() {
        return this.is_heartbeat;
    }

    public final Long component9() {
        return this.next_run_at_utc;
    }

    public final TaskCadenceJson getCadence() {
        return this.cadence;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getExecution_target() {
        return this.execution_target;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Long getNext_run_at_utc() {
        return this.next_run_at_utc;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSchedule_key() {
        return this.schedule_key;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return ((((C0KA.A01((C0KA.A01((((((((AnonymousClass001.A0G(this.id) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.path)) * 31) + AnonymousClass006.A0G(this.schedule_key)) * 31) + AnonymousClass006.A0G(this.mode)) * 31, this.enabled) + AnonymousClass006.A0G(this.execution_target)) * 31, this.is_heartbeat) + AnonymousClass006.A0D(this.next_run_at_utc)) * 31) + AnonymousClass006.A0G(this.timezone)) * 31) + C3cH.A02(this.cadence);
    }

    public final boolean is_heartbeat() {
        return this.is_heartbeat;
    }

    public final HatchTaskEntry toModel() {
        String strA0l;
        String str = this.id;
        String str2 = this.title;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() == 0) {
            strA0l = null;
        }
        String str3 = this.path;
        String str4 = this.schedule_key;
        String str5 = this.mode;
        boolean z = this.enabled;
        String str6 = this.execution_target;
        boolean z2 = this.is_heartbeat;
        Long l = this.next_run_at_utc;
        String str7 = this.timezone;
        TaskCadenceJson taskCadenceJson = this.cadence;
        return new HatchTaskEntry(str, strA0l, str3, str4, str5, z, str6, z2, l, str7, taskCadenceJson != null ? taskCadenceJson.toModel() : null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskResponseEntry(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, TaskCadenceJson taskCadenceJson, C2hx c2hx) {
        this.id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.path = null;
        } else {
            this.path = str3;
        }
        if ((i & 8) == 0) {
            this.schedule_key = null;
        } else {
            this.schedule_key = str4;
        }
        if ((i & 16) == 0) {
            this.mode = null;
        } else {
            this.mode = str5;
        }
        if ((i & 32) == 0) {
            this.enabled = true;
        } else {
            this.enabled = z;
        }
        if ((i & 64) == 0) {
            this.execution_target = null;
        } else {
            this.execution_target = str6;
        }
        if ((i & 128) == 0) {
            this.is_heartbeat = false;
        } else {
            this.is_heartbeat = z2;
        }
        if ((i & 256) == 0) {
            this.next_run_at_utc = null;
        } else {
            this.next_run_at_utc = l;
        }
        if ((i & 512) == 0) {
            this.timezone = null;
        } else {
            this.timezone = str7;
        }
        if ((i & 1024) == 0) {
            this.cadence = null;
        } else {
            this.cadence = taskCadenceJson;
        }
    }

    public /* synthetic */ TaskResponseEntry(String str, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, Long l, String str7, TaskCadenceJson taskCadenceJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : taskCadenceJson);
    }

    public TaskResponseEntry() {
        this("", null, null, null, null, true, null, false, null, null, null);
    }
}
