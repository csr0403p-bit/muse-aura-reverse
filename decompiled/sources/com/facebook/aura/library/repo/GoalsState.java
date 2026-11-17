package com.facebook.aura.library.repo;

import X.AHD;
import X.AHG;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class GoalsState extends C06G {
    public final AHD<Goal> goals;
    public final boolean hasNextPage;
    public final boolean isLoadingMore;
    public final LoadingState loadingState;
    public final AHG<String> sessionCompleted;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalsState) {
                GoalsState goalsState = (GoalsState) obj;
                if (!C7384Etj.areEqual(this.goals, goalsState.goals) || this.loadingState != goalsState.loadingState || this.hasNextPage != goalsState.hasNextPage || this.isLoadingMore != goalsState.isLoadingMore || !C7384Etj.areEqual(this.sessionCompleted, goalsState.sessionCompleted)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalsState copy$default(GoalsState goalsState, AHD ahd, LoadingState loadingState, boolean z, boolean z2, AHG ahg, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = goalsState.goals;
        }
        if ((i & 2) != 0) {
            loadingState = goalsState.loadingState;
        }
        if ((i & 4) != 0) {
            z = goalsState.hasNextPage;
        }
        if ((i & 8) != 0) {
            z2 = goalsState.isLoadingMore;
        }
        if ((i & 16) != 0) {
            ahg = goalsState.sessionCompleted;
        }
        return goalsState.copy(ahd, loadingState, z, z2, ahg);
    }

    public final AHD<Goal> component1() {
        return this.goals;
    }

    public final LoadingState component2() {
        return this.loadingState;
    }

    public final boolean component3() {
        return this.hasNextPage;
    }

    public final boolean component4() {
        return this.isLoadingMore;
    }

    public final AHG<String> component5() {
        return this.sessionCompleted;
    }

    public final AHD<Goal> getGoals() {
        return this.goals;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final LoadingState getLoadingState() {
        return this.loadingState;
    }

    public final AHG<String> getSessionCompleted() {
        return this.sessionCompleted;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.sessionCompleted, C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.loadingState, AnonymousClass005.A0E(this.goals)), this.hasNextPage), this.isLoadingMore));
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public GoalsState(AHD<Goal> ahd, LoadingState loadingState, boolean z, boolean z2, AHG<String> ahg) {
        AnonymousClass003.A0u(ahd, loadingState);
        C7384Etj.A0Y(ahg, 4);
        this.goals = ahd;
        this.loadingState = loadingState;
        this.hasNextPage = z;
        this.isLoadingMore = z2;
        this.sessionCompleted = ahg;
    }

    public final GoalsState copy(AHD<Goal> ahd, LoadingState loadingState, boolean z, boolean z2, AHG<String> ahg) {
        AnonymousClass003.A0u(ahd, loadingState);
        C7384Etj.A0Y(ahg, 4);
        return new GoalsState(ahd, loadingState, z, z2, ahg);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalsState(AHD ahd, LoadingState loadingState, boolean z, boolean z2, AHG ahg, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? LoadingState.INITIAL : loadingState, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? C0943AIw.A03 : ahg);
    }

    public GoalsState() {
        this(AHI.A01, LoadingState.INITIAL, false, false, C0943AIw.A03);
    }
}
