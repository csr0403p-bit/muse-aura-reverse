package com.facebook.aura.library.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class GoalDetailExtras extends C06G {
    public final AHD<GoalAssociation> associations;
    public final AHD<GoalUpdate> updates;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalDetailExtras) {
                GoalDetailExtras goalDetailExtras = (GoalDetailExtras) obj;
                if (!C7384Etj.areEqual(this.updates, goalDetailExtras.updates) || !C7384Etj.areEqual(this.associations, goalDetailExtras.associations)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalDetailExtras copy$default(GoalDetailExtras goalDetailExtras, AHD ahd, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = goalDetailExtras.updates;
        }
        if ((i & 2) != 0) {
            ahd2 = goalDetailExtras.associations;
        }
        AnonymousClass003.A0u(ahd, ahd2);
        return new GoalDetailExtras(ahd, ahd2);
    }

    public final AHD<GoalUpdate> component1() {
        return this.updates;
    }

    public final AHD<GoalAssociation> component2() {
        return this.associations;
    }

    public final AHD<GoalAssociation> getAssociations() {
        return this.associations;
    }

    public final AHD<GoalUpdate> getUpdates() {
        return this.updates;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.associations, AnonymousClass005.A0E(this.updates));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoalDetailExtras(AHD<GoalUpdate> ahd, AHD<? extends GoalAssociation> ahd2) {
        AnonymousClass003.A0u(ahd, ahd2);
        this.updates = ahd;
        this.associations = ahd2;
    }

    public final GoalDetailExtras copy(AHD<GoalUpdate> ahd, AHD<? extends GoalAssociation> ahd2) {
        AnonymousClass003.A0u(ahd, ahd2);
        return new GoalDetailExtras(ahd, ahd2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalDetailExtras(AHD ahd, AHD ahd2, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? AHI.A01 : ahd2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GoalDetailExtras() {
        AHI ahi = AHI.A01;
        this(ahi, ahi);
    }
}
