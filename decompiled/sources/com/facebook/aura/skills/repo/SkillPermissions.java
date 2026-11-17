package com.facebook.aura.skills.repo;

import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes.dex */
public final class SkillPermissions extends C06G {
    public final List<SkillPermissionSection> sections;

    public SkillPermissions(List<SkillPermissionSection> list) {
        C7384Etj.A0Y(list, 0);
        this.sections = list;
    }

    public final SkillPermissions copy(List<SkillPermissionSection> list) {
        C7384Etj.A0Y(list, 0);
        return new SkillPermissions(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SkillPermissions) && C7384Etj.areEqual(this.sections, ((SkillPermissions) obj).sections));
    }

    public static /* synthetic */ SkillPermissions copy$default(SkillPermissions skillPermissions, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skillPermissions.sections;
        }
        C7384Etj.A0Y(list, 0);
        return new SkillPermissions(list);
    }

    public final List<SkillPermissionSection> component1() {
        return this.sections;
    }

    public final List<SkillPermissionSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
