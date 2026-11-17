package com.facebook.aura.skills.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class SkillPermissionSection extends C06G {
    public final List<SkillPermissionGroup> groups;
    public final String label;

    public SkillPermissionSection(String str, List<SkillPermissionGroup> list) {
        C7384Etj.A0Y(list, 1);
        this.label = str;
        this.groups = list;
    }

    public final SkillPermissionSection copy(String str, List<SkillPermissionGroup> list) {
        C7384Etj.A0Y(list, 1);
        return new SkillPermissionSection(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillPermissionSection) {
                SkillPermissionSection skillPermissionSection = (SkillPermissionSection) obj;
                if (!C7384Etj.areEqual(this.label, skillPermissionSection.label) || !C7384Etj.areEqual(this.groups, skillPermissionSection.groups)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillPermissionSection copy$default(SkillPermissionSection skillPermissionSection, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillPermissionSection.label;
        }
        if ((i & 2) != 0) {
            list = skillPermissionSection.groups;
        }
        C7384Etj.A0Y(list, 1);
        return new SkillPermissionSection(str, list);
    }

    public final String component1() {
        return this.label;
    }

    public final List<SkillPermissionGroup> component2() {
        return this.groups;
    }

    public final List<SkillPermissionGroup> getGroups() {
        return this.groups;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.groups, AnonymousClass006.A0G(this.label) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
