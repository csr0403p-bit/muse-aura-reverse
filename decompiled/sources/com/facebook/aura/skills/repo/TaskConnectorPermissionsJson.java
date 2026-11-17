package com.facebook.aura.skills.repo;

import X.AGH;
import X.AGI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class TaskConnectorPermissionsJson extends C06G {
    public final String connector;
    public final TaskConnectorDisplayJson display;
    public final Map<String, TaskPermissionMethodJson> methods;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, TaskConnectorPermissionsJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<TaskConnectorPermissionsJson> serializer() {
            return TaskConnectorPermissionsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskConnectorPermissionsJson) {
                TaskConnectorPermissionsJson taskConnectorPermissionsJson = (TaskConnectorPermissionsJson) obj;
                if (!C7384Etj.areEqual(this.connector, taskConnectorPermissionsJson.connector) || !C7384Etj.areEqual(this.display, taskConnectorPermissionsJson.display) || !C7384Etj.areEqual(this.methods, taskConnectorPermissionsJson.methods)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskConnectorPermissionsJson copy$default(TaskConnectorPermissionsJson taskConnectorPermissionsJson, String str, TaskConnectorDisplayJson taskConnectorDisplayJson, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taskConnectorPermissionsJson.connector;
        }
        if ((i & 2) != 0) {
            taskConnectorDisplayJson = taskConnectorPermissionsJson.display;
        }
        if ((i & 4) != 0) {
            map = taskConnectorPermissionsJson.methods;
        }
        return taskConnectorPermissionsJson.copy(str, taskConnectorDisplayJson, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(TaskConnectorPermissionsJson taskConnectorPermissionsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(taskConnectorPermissionsJson.connector, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || taskConnectorPermissionsJson.display != null) {
            c9j5.AAP(taskConnectorPermissionsJson.display, TaskConnectorDisplayJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1M(taskConnectorPermissionsJson.methods)) {
            c9j5.AAQ(taskConnectorPermissionsJson.methods, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.connector;
    }

    public final TaskConnectorDisplayJson component2() {
        return this.display;
    }

    public final Map<String, TaskPermissionMethodJson> component3() {
        return this.methods;
    }

    public final String getConnector() {
        return this.connector;
    }

    public final TaskConnectorDisplayJson getDisplay() {
        return this.display;
    }

    public final Map<String, TaskPermissionMethodJson> getMethods() {
        return this.methods;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.methods, (AnonymousClass001.A0G(this.connector) + AnonymousClass006.A0D(this.display)) * 31);
    }

    public final TaskConnectorPermissions toDomain() {
        String str;
        if (C7BY.A0j(this.connector)) {
            return null;
        }
        String str2 = this.connector;
        TaskConnectorDisplayJson taskConnectorDisplayJson = this.display;
        if (taskConnectorDisplayJson == null || (str = taskConnectorDisplayJson.display_name) == null || C7BY.A0j(str)) {
            str = this.connector;
        }
        Map<String, TaskPermissionMethodJson> map = this.methods;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            TaskPermissionMethod domain = ((TaskPermissionMethodJson) entryA0l.getValue()).toDomain((String) entryA0l.getKey());
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        return new TaskConnectorPermissions(str2, str, AGI.A07(arrayListA0h));
    }

    public TaskConnectorPermissionsJson(String str, TaskConnectorDisplayJson taskConnectorDisplayJson, Map<String, TaskPermissionMethodJson> map) {
        AnonymousClass003.A0v(str, map);
        this.connector = str;
        this.display = taskConnectorDisplayJson;
        this.methods = map;
    }

    public final TaskConnectorPermissionsJson copy(String str, TaskConnectorDisplayJson taskConnectorDisplayJson, Map<String, TaskPermissionMethodJson> map) {
        AnonymousClass003.A0v(str, map);
        return new TaskConnectorPermissionsJson(str, taskConnectorDisplayJson, map);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ TaskConnectorPermissionsJson(int i, String str, TaskConnectorDisplayJson taskConnectorDisplayJson, Map map, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(TaskConnectorPermissionsJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.connector = str;
        this.display = (i & 2) == 0 ? null : taskConnectorDisplayJson;
        if ((i & 4) == 0) {
            this.methods = AGH.A0E();
        } else {
            this.methods = map;
        }
    }

    public /* synthetic */ TaskConnectorPermissionsJson(String str, TaskConnectorDisplayJson taskConnectorDisplayJson, Map map, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : taskConnectorDisplayJson, C3cH.A0o(map, i & 4));
    }
}
