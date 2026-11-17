package com.facebook.aura.skills.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
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
public final class SkillPermissionSectionJson extends C06G {
    public final List<SkillPermissionGroupJson> groups;
    public final String label;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, SkillPermissionSectionJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<SkillPermissionSectionJson> serializer() {
            return SkillPermissionSectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SkillPermissionSectionJson(String str, List<SkillPermissionGroupJson> list) {
        C7384Etj.A0Y(list, 1);
        this.label = str;
        this.groups = list;
    }

    public final SkillPermissionSectionJson copy(String str, List<SkillPermissionGroupJson> list) {
        C7384Etj.A0Y(list, 1);
        return new SkillPermissionSectionJson(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionSectionJson) {
                SkillPermissionSectionJson skillPermissionSectionJson = (SkillPermissionSectionJson) obj;
                if (!C7384Etj.areEqual(this.label, skillPermissionSectionJson.label) || !C7384Etj.areEqual(this.groups, skillPermissionSectionJson.groups)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillPermissionSectionJson copy$default(SkillPermissionSectionJson skillPermissionSectionJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionSectionJson.label;
        }
        if ((i & 2) != 0) {
            list = skillPermissionSectionJson.groups;
        }
        C7384Etj.A0Y(list, 1);
        return new SkillPermissionSectionJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(SkillPermissionSectionJson skillPermissionSectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || skillPermissionSectionJson.label != null) {
            c9j5.AAP(skillPermissionSectionJson.label, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(skillPermissionSectionJson.groups, C0881AGi.A00)) {
            c9j5.AAQ(skillPermissionSectionJson.groups, C06G.A0e(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final List<SkillPermissionGroupJson> component2() {
        return this.groups;
    }

    public final List<SkillPermissionGroupJson> getGroups() {
        return this.groups;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.groups, AnonymousClass006.A0G(this.label) * 31);
    }

    public final SkillPermissionSection toDomain() {
        String strA0l;
        String str = this.label;
        String str2 = null;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
            str2 = strA0l;
        }
        List<SkillPermissionGroupJson> list = this.groups;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<SkillPermissionGroupJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new SkillPermissionSection(str2, arrayListA0i);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillPermissionSectionJson(String str, List list, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), (i & 2) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ SkillPermissionSectionJson(int i, String str, List list, C2hx c2hx) {
        this.label = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.groups = C0881AGi.A00;
        } else {
            this.groups = list;
        }
    }

    public SkillPermissionSectionJson() {
        this(null, C0881AGi.A00);
    }
}
