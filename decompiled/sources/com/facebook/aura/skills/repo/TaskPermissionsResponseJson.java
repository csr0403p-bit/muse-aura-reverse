package com.facebook.aura.skills.repo;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TaskPermissionsResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<TaskConnectorPermissionsJson> connectors;
    public final String revision;
    public final TaskPermissionScopeJson scope;
    public final List<TaskWebsitePermissionJson> websites;

    public final class Companion {
        public final C9hr<TaskPermissionsResponseJson> serializer() {
            return TaskPermissionsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1U(num, null, null, AbstractC5321DgF.A02(num, TaskPermissionsResponseJson$Companion$$childSerializers$1.INSTANCE), TaskPermissionsResponseJson$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TaskPermissionsResponseJson) {
                TaskPermissionsResponseJson taskPermissionsResponseJson = (TaskPermissionsResponseJson) obj;
                if (!C7384Etj.areEqual(this.scope, taskPermissionsResponseJson.scope) || !C7384Etj.areEqual(this.revision, taskPermissionsResponseJson.revision) || !C7384Etj.areEqual(this.connectors, taskPermissionsResponseJson.connectors) || !C7384Etj.areEqual(this.websites, taskPermissionsResponseJson.websites)) {
                }
            }
            return false;
        }
        return true;
    }

    public final TaskPermissions toDomain(String str) {
        C7384Etj.A0Y(str, 0);
        TaskPermissionScopeJson taskPermissionScopeJson = this.scope;
        if (!"schedule".equals(taskPermissionScopeJson.scope_type) || !str.equals(taskPermissionScopeJson.scope_id)) {
            throw C60O.A0i("Failed requirement.");
        }
        if (C7BY.A0j(this.revision)) {
            throw C60O.A0i("Failed requirement.");
        }
        String str2 = this.revision;
        List<TaskConnectorPermissionsJson> list = this.connectors;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<TaskConnectorPermissionsJson> it = list.iterator();
        while (it.hasNext()) {
            TaskConnectorPermissions domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        AHD ahdA07 = AGI.A07(arrayListA0h);
        List<TaskWebsitePermissionJson> list2 = this.websites;
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator<TaskWebsitePermissionJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            TaskWebsitePermission domain2 = it2.next().toDomain(str);
            if (domain2 != null) {
                arrayListA0h2.add(domain2);
            }
        }
        HashSet hashSetA13 = C60O.A13();
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (Object obj : arrayListA0h2) {
            AnonymousClass006.A1P(((TaskWebsitePermission) obj).id, obj, hashSetA13, arrayListA0h3);
        }
        return new TaskPermissions(str2, ahdA07, AGI.A07(arrayListA0h3));
    }

    public /* synthetic */ TaskPermissionsResponseJson(int i, TaskPermissionScopeJson taskPermissionScopeJson, String str, List list, List list2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(TaskPermissionsResponseJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.scope = taskPermissionScopeJson;
        this.revision = str;
        if ((i & 4) == 0) {
            this.connectors = C0881AGi.A00;
        } else {
            this.connectors = list;
        }
        if ((i & 8) == 0) {
            this.websites = C0881AGi.A00;
        } else {
            this.websites = list2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaskPermissionsResponseJson copy$default(TaskPermissionsResponseJson taskPermissionsResponseJson, TaskPermissionScopeJson taskPermissionScopeJson, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            taskPermissionScopeJson = taskPermissionsResponseJson.scope;
        }
        if ((i & 2) != 0) {
            str = taskPermissionsResponseJson.revision;
        }
        if ((i & 4) != 0) {
            list = taskPermissionsResponseJson.connectors;
        }
        if ((i & 8) != 0) {
            list2 = taskPermissionsResponseJson.websites;
        }
        return taskPermissionsResponseJson.copy(taskPermissionScopeJson, str, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(TaskPermissionsResponseJson taskPermissionsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(taskPermissionsResponseJson.scope, TaskPermissionScopeJson$$serializer.INSTANCE, c9iZ, 0);
        c9j5.AAV(taskPermissionsResponseJson.revision, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(taskPermissionsResponseJson.connectors)) {
            c9j5.AAQ(taskPermissionsResponseJson.connectors, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C3cG.A1L(taskPermissionsResponseJson.websites)) {
            c9j5.AAQ(taskPermissionsResponseJson.websites, C3cH.A15(f0cArr, 3), c9iZ, 3);
        }
    }

    public final TaskPermissionScopeJson component1() {
        return this.scope;
    }

    public final String component2() {
        return this.revision;
    }

    public final List<TaskConnectorPermissionsJson> component3() {
        return this.connectors;
    }

    public final List<TaskWebsitePermissionJson> component4() {
        return this.websites;
    }

    public final List<TaskConnectorPermissionsJson> getConnectors() {
        return this.connectors;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final TaskPermissionScopeJson getScope() {
        return this.scope;
    }

    public final List<TaskWebsitePermissionJson> getWebsites() {
        return this.websites;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.websites, AnonymousClass005.A0F(this.connectors, AnonymousClass005.A0I(this.revision, AnonymousClass005.A0E(this.scope))));
    }

    public final TaskPermissionsResponseJson copy(TaskPermissionScopeJson taskPermissionScopeJson, String str, List<TaskConnectorPermissionsJson> list, List<TaskWebsitePermissionJson> list2) {
        AnonymousClass005.A14(taskPermissionScopeJson, str, list, list2);
        return new TaskPermissionsResponseJson(taskPermissionScopeJson, str, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public TaskPermissionsResponseJson(TaskPermissionScopeJson taskPermissionScopeJson, String str, List<TaskConnectorPermissionsJson> list, List<TaskWebsitePermissionJson> list2) {
        AnonymousClass005.A14(taskPermissionScopeJson, str, list, list2);
        this.scope = taskPermissionScopeJson;
        this.revision = str;
        this.connectors = list;
        this.websites = list2;
    }

    public /* synthetic */ TaskPermissionsResponseJson(TaskPermissionScopeJson taskPermissionScopeJson, String str, List list, List list2, int i, C06H c06h) {
        this(taskPermissionScopeJson, str, C3cI.A12(list, i), (i & 8) != 0 ? C0881AGi.A00 : list2);
    }
}
