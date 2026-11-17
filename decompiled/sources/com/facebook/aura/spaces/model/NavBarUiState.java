package com.facebook.aura.spaces.model;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BQI;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NavBarUiState extends C06G {
    public final boolean isExpanded;
    public final BQI<String> pinnedItemIds;

    public NavBarUiState(boolean z, BQI<String> bqi) {
        C7384Etj.A0Y(bqi, 1);
        this.isExpanded = z;
        this.pinnedItemIds = bqi;
    }

    public final NavBarUiState copy(boolean z, BQI<String> bqi) {
        C7384Etj.A0Y(bqi, 1);
        return new NavBarUiState(z, bqi);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NavBarUiState) {
                NavBarUiState navBarUiState = (NavBarUiState) obj;
                if (this.isExpanded != navBarUiState.isExpanded || !C7384Etj.areEqual(this.pinnedItemIds, navBarUiState.pinnedItemIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NavBarUiState copy$default(NavBarUiState navBarUiState, boolean z, BQI bqi, int i, Object obj) {
        if ((i & 1) != 0) {
            z = navBarUiState.isExpanded;
        }
        if ((i & 2) != 0) {
            bqi = navBarUiState.pinnedItemIds;
        }
        C7384Etj.A0Y(bqi, 1);
        return new NavBarUiState(z, bqi);
    }

    public final boolean component1() {
        return this.isExpanded;
    }

    public final BQI<String> component2() {
        return this.pinnedItemIds;
    }

    public final BQI<String> getPinnedItemIds() {
        return this.pinnedItemIds;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.pinnedItemIds, C0KA.A02(this.isExpanded));
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NavBarUiState(boolean z, BQI bqi, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? C0943AIw.A03 : bqi);
    }

    public NavBarUiState() {
        this(false, C0943AIw.A03);
    }
}
