package com.facebook.aura.skills.repo;

import X.AbstractC0882AGj;
import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.skills.api.ConnectorPermissionMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SkillPermissionsResponseJson extends C06G {
    public final List<SkillPermissionSectionJson> sections;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, SkillPermissionsResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SkillPermissionsResponseJson> serializer() {
            return SkillPermissionsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SkillPermissionsResponseJson copy(List<SkillPermissionSectionJson> list) {
        C7384Etj.A0Y(list, 0);
        return new SkillPermissionsResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SkillPermissionsResponseJson) && C7384Etj.areEqual(this.sections, ((SkillPermissionsResponseJson) obj).sections));
    }

    public final SkillPermissions toDomain(String str) {
        C7384Etj.A0Y(str, 0);
        List<SkillPermissionSectionJson> list = this.sections;
        ArrayList arrayList = new ArrayList();
        Iterator<SkillPermissionSectionJson> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(it.next().groups, arrayList);
        }
        ArrayList<SkillPermissionMethodJson> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC0882AGj.A0r(((SkillPermissionGroupJson) it2.next()).methods, arrayList2);
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayList2);
        for (SkillPermissionMethodJson skillPermissionMethodJson : arrayList2) {
            arrayListA0m.add(new ConnectorPermissionMethod(skillPermissionMethodJson.key, skillPermissionMethodJson.mode_options, skillPermissionMethodJson.restricted));
        }
        List<SkillPermissionSectionJson> list2 = this.sections;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator<SkillPermissionSectionJson> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayListA0m2.add(it3.next().toDomain());
        }
        return new SkillPermissions(arrayListA0m2);
    }

    public /* synthetic */ SkillPermissionsResponseJson(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list);
    }

    public static /* synthetic */ SkillPermissionsResponseJson copy$default(SkillPermissionsResponseJson skillPermissionsResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skillPermissionsResponseJson.sections;
        }
        C7384Etj.A0Y(list, 0);
        return new SkillPermissionsResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(SkillPermissionsResponseJson skillPermissionsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C7384Etj.areEqual(skillPermissionsResponseJson.sections, C0881AGi.A00)) {
            c9j5.AAQ(skillPermissionsResponseJson.sections, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<SkillPermissionSectionJson> component1() {
        return this.sections;
    }

    public final List<SkillPermissionSectionJson> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SkillPermissionsResponseJson(List<SkillPermissionSectionJson> list) {
        C7384Etj.A0Y(list, 0);
        this.sections = list;
    }

    public /* synthetic */ SkillPermissionsResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.sections = C0881AGi.A00;
        } else {
            this.sections = list;
        }
    }

    public SkillPermissionsResponseJson() {
        this(C0881AGi.A00);
    }
}
