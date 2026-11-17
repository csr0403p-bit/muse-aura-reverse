package com.facebook.aura.skills.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SkillPermissionGroupJson extends C06G {
    public final String label;
    public final List<SkillPermissionMethodJson> methods;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, SkillPermissionGroupJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<SkillPermissionGroupJson> serializer() {
            return SkillPermissionGroupJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionGroupJson) {
                SkillPermissionGroupJson skillPermissionGroupJson = (SkillPermissionGroupJson) obj;
                if (!C7384Etj.areEqual(this.label, skillPermissionGroupJson.label) || !C7384Etj.areEqual(this.methods, skillPermissionGroupJson.methods)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillPermissionGroupJson copy$default(SkillPermissionGroupJson skillPermissionGroupJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionGroupJson.label;
        }
        if ((i & 2) != 0) {
            list = skillPermissionGroupJson.methods;
        }
        AnonymousClass003.A0u(str, list);
        return new SkillPermissionGroupJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(SkillPermissionGroupJson skillPermissionGroupJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(skillPermissionGroupJson.label)) {
            c9j5.AAV(skillPermissionGroupJson.label, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(skillPermissionGroupJson.methods, C0881AGi.A00)) {
            c9j5.AAQ(skillPermissionGroupJson.methods, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final List<SkillPermissionMethodJson> component2() {
        return this.methods;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<SkillPermissionMethodJson> getMethods() {
        return this.methods;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.methods, AnonymousClass001.A0G(this.label));
    }

    public final SkillPermissionGroup toDomain() {
        String strA0l = AnonymousClass002.A0l(this.label);
        List<SkillPermissionMethodJson> list = this.methods;
        ArrayList arrayList = new ArrayList();
        Iterator<SkillPermissionMethodJson> it = list.iterator();
        while (it.hasNext()) {
            SkillPermissionMethod domain = it.next().toDomain();
            if (domain != null) {
                arrayList.add(domain);
            }
        }
        return new SkillPermissionGroup(strA0l, arrayList);
    }

    public SkillPermissionGroupJson(String str, List<SkillPermissionMethodJson> list) {
        AnonymousClass003.A0u(str, list);
        this.label = str;
        this.methods = list;
    }

    public final SkillPermissionGroupJson copy(String str, List<SkillPermissionMethodJson> list) {
        AnonymousClass003.A0u(str, list);
        return new SkillPermissionGroupJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillPermissionGroupJson(String str, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ SkillPermissionGroupJson(int i, String str, List list, C2hx c2hx) {
        this.label = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.methods = C0881AGi.A00;
        } else {
            this.methods = list;
        }
    }

    public SkillPermissionGroupJson() {
        this("", C0881AGi.A00);
    }
}
