package com.facebook.aura.library.model;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class CompletedGoalsSection extends C06G {
    public static final int $stable = 8;
    public final AHD<Goal> goals;
    public final String monthLabel;

    public CompletedGoalsSection(String str, AHD<Goal> ahd) {
        C7384Etj.A0Y(ahd, 1);
        this.monthLabel = str;
        this.goals = ahd;
    }

    public final CompletedGoalsSection copy(String str, AHD<Goal> ahd) {
        C7384Etj.A0Y(ahd, 1);
        return new CompletedGoalsSection(str, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CompletedGoalsSection) {
                CompletedGoalsSection completedGoalsSection = (CompletedGoalsSection) obj;
                if (!C7384Etj.areEqual(this.monthLabel, completedGoalsSection.monthLabel) || !C7384Etj.areEqual(this.goals, completedGoalsSection.goals)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CompletedGoalsSection copy$default(CompletedGoalsSection completedGoalsSection, String str, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = completedGoalsSection.monthLabel;
        }
        if ((i & 2) != 0) {
            ahd = completedGoalsSection.goals;
        }
        C7384Etj.A0Y(ahd, 1);
        return new CompletedGoalsSection(str, ahd);
    }

    public final String component1() {
        return this.monthLabel;
    }

    public final AHD<Goal> component2() {
        return this.goals;
    }

    public final AHD<Goal> getGoals() {
        return this.goals;
    }

    public final String getMonthLabel() {
        return this.monthLabel;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.goals, AnonymousClass006.A0G(this.monthLabel) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
