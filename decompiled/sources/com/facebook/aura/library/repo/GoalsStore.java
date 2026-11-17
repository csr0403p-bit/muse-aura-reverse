package com.facebook.aura.library.repo;

import X.AHG;
import X.AHH;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0953AJg;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.InterfaceC0962AJp;

/* loaded from: classes2.dex */
public final class GoalsStore extends C06G {
    public final boolean completedHasNextPage;
    public final LoadingState completedLoadingState;
    public final String completedNextCursor;
    public final AHH<String> completedOrder;
    public final InterfaceC0962AJp<String, GoalDetailExtras> goalExtras;
    public final InterfaceC0962AJp<String, GoalNode> goalsById;
    public final boolean isLoadingMoreCompleted;
    public final boolean isLoadingMoreList;
    public final boolean isLoadingMoreTracking;
    public final boolean listHasNextPage;
    public final LoadingState listLoadingState;
    public final String listNextCursor;
    public final AHH<String> listOrder;
    public final InterfaceC0962AJp<String, Long> pendingPins;
    public final AHG<String> sessionCompleted;
    public final boolean trackingHasNextPage;
    public final LoadingState trackingLoadingState;
    public final String trackingNextCursor;
    public final AHH<String> trackingOrder;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalsStore) {
                GoalsStore goalsStore = (GoalsStore) obj;
                if (!C7384Etj.areEqual(this.goalsById, goalsStore.goalsById) || !C7384Etj.areEqual(this.listOrder, goalsStore.listOrder) || !C7384Etj.areEqual(this.trackingOrder, goalsStore.trackingOrder) || !C7384Etj.areEqual(this.goalExtras, goalsStore.goalExtras) || this.listLoadingState != goalsStore.listLoadingState || this.trackingLoadingState != goalsStore.trackingLoadingState || !C7384Etj.areEqual(this.listNextCursor, goalsStore.listNextCursor) || this.listHasNextPage != goalsStore.listHasNextPage || this.isLoadingMoreList != goalsStore.isLoadingMoreList || !C7384Etj.areEqual(this.trackingNextCursor, goalsStore.trackingNextCursor) || this.trackingHasNextPage != goalsStore.trackingHasNextPage || this.isLoadingMoreTracking != goalsStore.isLoadingMoreTracking || !C7384Etj.areEqual(this.completedOrder, goalsStore.completedOrder) || this.completedLoadingState != goalsStore.completedLoadingState || !C7384Etj.areEqual(this.completedNextCursor, goalsStore.completedNextCursor) || this.completedHasNextPage != goalsStore.completedHasNextPage || this.isLoadingMoreCompleted != goalsStore.isLoadingMoreCompleted || !C7384Etj.areEqual(this.sessionCompleted, goalsStore.sessionCompleted) || !C7384Etj.areEqual(this.pendingPins, goalsStore.pendingPins)) {
                }
            }
            return false;
        }
        return true;
    }

    public final InterfaceC0962AJp<String, GoalNode> component1() {
        return this.goalsById;
    }

    public final String component10() {
        return this.trackingNextCursor;
    }

    public final boolean component11() {
        return this.trackingHasNextPage;
    }

    public final boolean component12() {
        return this.isLoadingMoreTracking;
    }

    public final AHH<String> component13() {
        return this.completedOrder;
    }

    public final LoadingState component14() {
        return this.completedLoadingState;
    }

    public final String component15() {
        return this.completedNextCursor;
    }

    public final boolean component16() {
        return this.completedHasNextPage;
    }

    public final boolean component17() {
        return this.isLoadingMoreCompleted;
    }

    public final AHG<String> component18() {
        return this.sessionCompleted;
    }

    public final InterfaceC0962AJp<String, Long> component19() {
        return this.pendingPins;
    }

    public final AHH<String> component2() {
        return this.listOrder;
    }

    public final AHH<String> component3() {
        return this.trackingOrder;
    }

    public final InterfaceC0962AJp<String, GoalDetailExtras> component4() {
        return this.goalExtras;
    }

    public final LoadingState component5() {
        return this.listLoadingState;
    }

    public final LoadingState component6() {
        return this.trackingLoadingState;
    }

    public final String component7() {
        return this.listNextCursor;
    }

    public final boolean component8() {
        return this.listHasNextPage;
    }

    public final boolean component9() {
        return this.isLoadingMoreList;
    }

    public final boolean getCompletedHasNextPage() {
        return this.completedHasNextPage;
    }

    public final LoadingState getCompletedLoadingState() {
        return this.completedLoadingState;
    }

    public final String getCompletedNextCursor() {
        return this.completedNextCursor;
    }

    public final AHH<String> getCompletedOrder() {
        return this.completedOrder;
    }

    public final InterfaceC0962AJp<String, GoalDetailExtras> getGoalExtras() {
        return this.goalExtras;
    }

    public final InterfaceC0962AJp<String, GoalNode> getGoalsById() {
        return this.goalsById;
    }

    public final boolean getListHasNextPage() {
        return this.listHasNextPage;
    }

    public final LoadingState getListLoadingState() {
        return this.listLoadingState;
    }

    public final String getListNextCursor() {
        return this.listNextCursor;
    }

    public final AHH<String> getListOrder() {
        return this.listOrder;
    }

    public final InterfaceC0962AJp<String, Long> getPendingPins() {
        return this.pendingPins;
    }

    public final AHG<String> getSessionCompleted() {
        return this.sessionCompleted;
    }

    public final boolean getTrackingHasNextPage() {
        return this.trackingHasNextPage;
    }

    public final LoadingState getTrackingLoadingState() {
        return this.trackingLoadingState;
    }

    public final String getTrackingNextCursor() {
        return this.trackingNextCursor;
    }

    public final AHH<String> getTrackingOrder() {
        return this.trackingOrder;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.pendingPins, AnonymousClass005.A0F(this.sessionCompleted, C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.completedLoadingState, AnonymousClass005.A0F(this.completedOrder, C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.trackingLoadingState, AnonymousClass005.A0F(this.listLoadingState, AnonymousClass005.A0F(this.goalExtras, AnonymousClass005.A0F(this.trackingOrder, AnonymousClass005.A0F(this.listOrder, AnonymousClass005.A0E(this.goalsById)))))) + AnonymousClass006.A0G(this.listNextCursor)) * 31, this.listHasNextPage), this.isLoadingMoreList) + AnonymousClass006.A0G(this.trackingNextCursor)) * 31, this.trackingHasNextPage), this.isLoadingMoreTracking))) + AnonymousClass005.A0H(this.completedNextCursor)) * 31, this.completedHasNextPage), this.isLoadingMoreCompleted)));
    }

    public final boolean isLoadingMoreCompleted() {
        return this.isLoadingMoreCompleted;
    }

    public final boolean isLoadingMoreList() {
        return this.isLoadingMoreList;
    }

    public final boolean isLoadingMoreTracking() {
        return this.isLoadingMoreTracking;
    }

    public final GoalsStore copy(InterfaceC0962AJp<String, GoalNode> interfaceC0962AJp, AHH<String> ahh, AHH<String> ahh2, InterfaceC0962AJp<String, GoalDetailExtras> interfaceC0962AJp2, LoadingState loadingState, LoadingState loadingState2, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, AHH<String> ahh3, LoadingState loadingState3, String str3, boolean z5, boolean z6, AHG<String> ahg, InterfaceC0962AJp<String, Long> interfaceC0962AJp3) {
        AnonymousClass005.A17(interfaceC0962AJp, ahh, ahh2, interfaceC0962AJp2, loadingState);
        C7384Etj.A0Y(loadingState2, 5);
        AnonymousClass003.A11(ahh3, loadingState3);
        C7384Etj.A0Y(ahg, 17);
        C7384Etj.A0Y(interfaceC0962AJp3, 18);
        return new GoalsStore(interfaceC0962AJp, ahh, ahh2, interfaceC0962AJp2, loadingState, loadingState2, str, z, z2, str2, z3, z4, ahh3, loadingState3, str3, z5, z6, ahg, interfaceC0962AJp3);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ GoalsStore copy$default(GoalsStore goalsStore, InterfaceC0962AJp interfaceC0962AJp, AHH ahh, AHH ahh2, InterfaceC0962AJp interfaceC0962AJp2, LoadingState loadingState, LoadingState loadingState2, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, AHH ahh3, LoadingState loadingState3, String str3, boolean z5, boolean z6, AHG ahg, InterfaceC0962AJp interfaceC0962AJp3, int i, Object obj) {
        InterfaceC0962AJp interfaceC0962AJp4 = interfaceC0962AJp;
        AHH ahh4 = ahh;
        AHH ahh5 = ahh2;
        InterfaceC0962AJp interfaceC0962AJp5 = interfaceC0962AJp2;
        LoadingState loadingState4 = loadingState;
        LoadingState loadingState5 = loadingState2;
        String str4 = str;
        boolean z7 = z;
        boolean z8 = z2;
        String str5 = str2;
        boolean z9 = z3;
        boolean z10 = z4;
        AHH ahh6 = ahh3;
        LoadingState loadingState6 = loadingState3;
        String str6 = str3;
        boolean z11 = z5;
        boolean z12 = z6;
        AHG ahg2 = ahg;
        InterfaceC0962AJp interfaceC0962AJp6 = interfaceC0962AJp3;
        if ((i & 1) != 0) {
            interfaceC0962AJp4 = goalsStore.goalsById;
        }
        if ((i & 2) != 0) {
            ahh4 = goalsStore.listOrder;
        }
        if ((i & 4) != 0) {
            ahh5 = goalsStore.trackingOrder;
        }
        if ((i & 8) != 0) {
            interfaceC0962AJp5 = goalsStore.goalExtras;
        }
        if ((i & 16) != 0) {
            loadingState4 = goalsStore.listLoadingState;
        }
        if ((i & 32) != 0) {
            loadingState5 = goalsStore.trackingLoadingState;
        }
        if ((i & 64) != 0) {
            str4 = goalsStore.listNextCursor;
        }
        if ((i & 128) != 0) {
            z7 = goalsStore.listHasNextPage;
        }
        if ((i & 256) != 0) {
            z8 = goalsStore.isLoadingMoreList;
        }
        if ((i & 512) != 0) {
            str5 = goalsStore.trackingNextCursor;
        }
        if ((i & 1024) != 0) {
            z9 = goalsStore.trackingHasNextPage;
        }
        if ((i & 2048) != 0) {
            z10 = goalsStore.isLoadingMoreTracking;
        }
        if ((i & 4096) != 0) {
            ahh6 = goalsStore.completedOrder;
        }
        if ((i & 8192) != 0) {
            loadingState6 = goalsStore.completedLoadingState;
        }
        if ((i & 16384) != 0) {
            str6 = goalsStore.completedNextCursor;
        }
        if ((i & 32768) != 0) {
            z11 = goalsStore.completedHasNextPage;
        }
        if ((i & 65536) != 0) {
            z12 = goalsStore.isLoadingMoreCompleted;
        }
        if ((i & 131072) != 0) {
            ahg2 = goalsStore.sessionCompleted;
        }
        if ((i & 262144) != 0) {
            interfaceC0962AJp6 = goalsStore.pendingPins;
        }
        String str7 = str4;
        return goalsStore.copy(interfaceC0962AJp4, ahh4, ahh5, interfaceC0962AJp5, loadingState4, loadingState5, str7, z7, z8, str5, z9, z10, ahh6, loadingState6, str6, z11, z12, ahg2, interfaceC0962AJp6);
    }

    public /* synthetic */ GoalsStore(InterfaceC0962AJp interfaceC0962AJp, AHH ahh, AHH ahh2, InterfaceC0962AJp interfaceC0962AJp2, LoadingState loadingState, LoadingState loadingState2, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, AHH ahh3, LoadingState loadingState3, String str3, boolean z5, boolean z6, AHG ahg, InterfaceC0962AJp interfaceC0962AJp3, int i, C06H c06h) {
        this((i & 1) != 0 ? C0953AJg.A00() : interfaceC0962AJp, (i & 2) != 0 ? AHI.A01 : ahh, (i & 4) != 0 ? AHI.A01 : ahh2, (i & 8) != 0 ? C0953AJg.A00() : interfaceC0962AJp2, (i & 16) != 0 ? LoadingState.INITIAL : loadingState, (i & 32) != 0 ? LoadingState.INITIAL : loadingState2, C3cG.A0e(str, i & 64), C3cH.A1N(i, z), C3cG.A1K(i & 256, z2), C3cG.A0e(str2, i & 512), C3cG.A1K(i & 1024, z3), C3cG.A1K(i & 2048, z4), (i & 4096) != 0 ? AHI.A01 : ahh3, (i & 8192) != 0 ? LoadingState.INITIAL : loadingState3, C3cG.A0e(str3, i & 16384), C3cH.A1L(i, 32768, z5), C3cH.A1L(i, 65536, z6), (i & 131072) != 0 ? C0943AIw.A03 : ahg, (i & 262144) != 0 ? C0953AJg.A00() : interfaceC0962AJp3);
    }

    public GoalsStore(InterfaceC0962AJp<String, GoalNode> interfaceC0962AJp, AHH<String> ahh, AHH<String> ahh2, InterfaceC0962AJp<String, GoalDetailExtras> interfaceC0962AJp2, LoadingState loadingState, LoadingState loadingState2, String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, AHH<String> ahh3, LoadingState loadingState3, String str3, boolean z5, boolean z6, AHG<String> ahg, InterfaceC0962AJp<String, Long> interfaceC0962AJp3) {
        AnonymousClass005.A17(interfaceC0962AJp, ahh, ahh2, interfaceC0962AJp2, loadingState);
        C7384Etj.A0Y(loadingState2, 5);
        AnonymousClass003.A11(ahh3, loadingState3);
        C7384Etj.A0Y(ahg, 17);
        C7384Etj.A0Y(interfaceC0962AJp3, 18);
        this.goalsById = interfaceC0962AJp;
        this.listOrder = ahh;
        this.trackingOrder = ahh2;
        this.goalExtras = interfaceC0962AJp2;
        this.listLoadingState = loadingState;
        this.trackingLoadingState = loadingState2;
        this.listNextCursor = str;
        this.listHasNextPage = z;
        this.isLoadingMoreList = z2;
        this.trackingNextCursor = str2;
        this.trackingHasNextPage = z3;
        this.isLoadingMoreTracking = z4;
        this.completedOrder = ahh3;
        this.completedLoadingState = loadingState3;
        this.completedNextCursor = str3;
        this.completedHasNextPage = z5;
        this.isLoadingMoreCompleted = z6;
        this.sessionCompleted = ahg;
        this.pendingPins = interfaceC0962AJp3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalsStore() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 524287, 0 == true ? 1 : 0);
    }
}
