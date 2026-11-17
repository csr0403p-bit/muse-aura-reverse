package com.facebook.aura.skills.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TaskPermissionMethodJson extends C06G {
    public final String label;
    public final String mode;
    public final List<String> mode_options;
    public final String override_mode;
    public final String source_label;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, TaskPermissionMethodJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<TaskPermissionMethodJson> serializer() {
            return TaskPermissionMethodJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPermissionMethodJson) {
                TaskPermissionMethodJson taskPermissionMethodJson = (TaskPermissionMethodJson) obj;
                if (!C7384Etj.areEqual(this.label, taskPermissionMethodJson.label) || !C7384Etj.areEqual(this.mode, taskPermissionMethodJson.mode) || !C7384Etj.areEqual(this.mode_options, taskPermissionMethodJson.mode_options) || !C7384Etj.areEqual(this.source_label, taskPermissionMethodJson.source_label) || !C7384Etj.areEqual(this.override_mode, taskPermissionMethodJson.override_mode)) {
                }
            }
            return false;
        }
        return true;
    }

    public final TaskPermissionMethod toDomain(String str) {
        C7384Etj.A0Y(str, 0);
        ConnectorPermissionMode taskPermissionMode = TaskPermissionsRepositoryJsonKt.toTaskPermissionMode(this.mode);
        if (taskPermissionMode == null) {
            return null;
        }
        String str2 = this.label;
        List<String> list = this.mode_options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ConnectorPermissionMode taskPermissionMode2 = TaskPermissionsRepositoryJsonKt.toTaskPermissionMode(AnonymousClass005.A0j(it));
            if (taskPermissionMode2 != null) {
                arrayListA0h.add(taskPermissionMode2);
            }
        }
        AHD ahdA07 = AGI.A07(C3cG.A0m(arrayListA0h));
        String str3 = this.source_label;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        String str4 = this.override_mode;
        return new TaskPermissionMethod(str, str2, taskPermissionMode, ahdA07, str3, str4 != null ? TaskPermissionsRepositoryJsonKt.toTaskPermissionMode(str4) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskPermissionMethodJson copy$default(TaskPermissionMethodJson taskPermissionMethodJson, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskPermissionMethodJson.label;
        }
        if ((i & 2) != 0) {
            str2 = taskPermissionMethodJson.mode;
        }
        if ((i & 4) != 0) {
            list = taskPermissionMethodJson.mode_options;
        }
        if ((i & 8) != 0) {
            str3 = taskPermissionMethodJson.source_label;
        }
        if ((i & 16) != 0) {
            str4 = taskPermissionMethodJson.override_mode;
        }
        return taskPermissionMethodJson.copy(str, str2, list, str3, str4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(TaskPermissionMethodJson taskPermissionMethodJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(taskPermissionMethodJson.label, c9iZ, 0);
        c9j5.AAV(taskPermissionMethodJson.mode, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(taskPermissionMethodJson.mode_options)) {
            c9j5.AAQ(taskPermissionMethodJson.mode_options, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || taskPermissionMethodJson.source_label != null) {
            c9j5.AAP(taskPermissionMethodJson.source_label, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || taskPermissionMethodJson.override_mode != null) {
            c9j5.AAP(taskPermissionMethodJson.override_mode, C07779iq.A01, c9iZ, 4);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.mode;
    }

    public final List<String> component3() {
        return this.mode_options;
    }

    public final String component4() {
        return this.source_label;
    }

    public final String component5() {
        return this.override_mode;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<String> getMode_options() {
        return this.mode_options;
    }

    public final String getOverride_mode() {
        return this.override_mode;
    }

    public final String getSource_label() {
        return this.source_label;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.mode_options, AnonymousClass005.A0I(this.mode, AnonymousClass001.A0G(this.label))) + AnonymousClass006.A0G(this.source_label)) * 31) + AnonymousClass005.A0H(this.override_mode);
    }

    public TaskPermissionMethodJson(String str, String str2, List<String> list, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, list);
        this.label = str;
        this.mode = str2;
        this.mode_options = list;
        this.source_label = str3;
        this.override_mode = str4;
    }

    public final TaskPermissionMethodJson copy(String str, String str2, List<String> list, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, list);
        return new TaskPermissionMethodJson(str, str2, list, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskPermissionMethodJson(String str, String str2, List list, String str3, String str4, int i, C06H c06h) {
        this(str, str2, C3cI.A12(list, i), (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public /* synthetic */ TaskPermissionMethodJson(int i, String str, String str2, List list, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(TaskPermissionMethodJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.label = str;
        this.mode = str2;
        if ((i & 4) == 0) {
            this.mode_options = C0881AGi.A00;
        } else {
            this.mode_options = list;
        }
        if ((i & 8) == 0) {
            this.source_label = null;
        } else {
            this.source_label = str3;
        }
        if ((i & 16) == 0) {
            this.override_mode = null;
        } else {
            this.override_mode = str4;
        }
    }
}
