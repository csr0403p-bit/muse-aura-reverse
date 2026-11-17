package com.facebook.aura.partners.wearables.linking;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class WearablesLinkingUiState extends C06G {
    public static final int $stable = 0;
    public final boolean isLoading;
    public final WearablesLinkingState sheetState;

    public WearablesLinkingUiState(WearablesLinkingState wearablesLinkingState, boolean z) {
        C7384Etj.A0Y(wearablesLinkingState, 0);
        this.sheetState = wearablesLinkingState;
        this.isLoading = z;
    }

    public final WearablesLinkingUiState copy(WearablesLinkingState wearablesLinkingState, boolean z) {
        C7384Etj.A0Y(wearablesLinkingState, 0);
        return new WearablesLinkingUiState(wearablesLinkingState, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WearablesLinkingUiState) {
                WearablesLinkingUiState wearablesLinkingUiState = (WearablesLinkingUiState) obj;
                if (this.sheetState != wearablesLinkingUiState.sheetState || this.isLoading != wearablesLinkingUiState.isLoading) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WearablesLinkingUiState copy$default(WearablesLinkingUiState wearablesLinkingUiState, WearablesLinkingState wearablesLinkingState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wearablesLinkingState = wearablesLinkingUiState.sheetState;
        }
        if ((i & 2) != 0) {
            z = wearablesLinkingUiState.isLoading;
        }
        C7384Etj.A0Y(wearablesLinkingState, 0);
        return new WearablesLinkingUiState(wearablesLinkingState, z);
    }

    public final WearablesLinkingState component1() {
        return this.sheetState;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final WearablesLinkingState getSheetState() {
        return this.sheetState;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.sheetState), this.isLoading);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WearablesLinkingUiState(WearablesLinkingState wearablesLinkingState, boolean z, int i, C06H c06h) {
        this((i & 1) != 0 ? WearablesLinkingState.CONSENT : wearablesLinkingState, AnonymousClass001.A1Q(i, z));
    }

    public WearablesLinkingUiState() {
        this(WearablesLinkingState.CONSENT, false);
    }
}
