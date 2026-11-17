package com.facebook.aura.settings;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.common.appname.HatchAppName;

/* loaded from: classes.dex */
public final class HatchWalletUiState extends C06G {
    public static final int $stable = 0;
    public final String agentName;
    public final boolean canLoadMore;
    public final AHD<WalletEntryUiState> entries;
    public final boolean hasLoaded;
    public final boolean showEmpty;
    public final boolean showError;
    public final boolean showLoading;

    public static /* synthetic */ HatchWalletUiState copy$default(HatchWalletUiState hatchWalletUiState, String str, AHD ahd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        String str2 = str;
        AHD ahd2 = ahd;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        boolean z10 = z5;
        if ((i & 1) != 0) {
            str2 = hatchWalletUiState.agentName;
        }
        if ((i & 2) != 0) {
            ahd2 = hatchWalletUiState.entries;
        }
        if ((i & 4) != 0) {
            z6 = hatchWalletUiState.hasLoaded;
        }
        if ((i & 8) != 0) {
            z7 = hatchWalletUiState.showLoading;
        }
        if ((i & 16) != 0) {
            z8 = hatchWalletUiState.showError;
        }
        if ((i & 32) != 0) {
            z9 = hatchWalletUiState.showEmpty;
        }
        if ((i & 64) != 0) {
            z10 = hatchWalletUiState.canLoadMore;
        }
        AnonymousClass003.A0u(str2, ahd2);
        return new HatchWalletUiState(str2, ahd2, z6, z7, z8, z9, z10);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchWalletUiState) {
                HatchWalletUiState hatchWalletUiState = (HatchWalletUiState) obj;
                if (!C7384Etj.areEqual(this.agentName, hatchWalletUiState.agentName) || !C7384Etj.areEqual(this.entries, hatchWalletUiState.entries) || this.hasLoaded != hatchWalletUiState.hasLoaded || this.showLoading != hatchWalletUiState.showLoading || this.showError != hatchWalletUiState.showError || this.showEmpty != hatchWalletUiState.showEmpty || this.canLoadMore != hatchWalletUiState.canLoadMore) {
                }
            }
            return false;
        }
        return true;
    }

    public HatchWalletUiState() {
        this(HatchAppName.value, AHI.A01, false, false, false, false, false);
    }

    public final String component1() {
        return this.agentName;
    }

    public final AHD<WalletEntryUiState> component2() {
        return this.entries;
    }

    public final boolean component3() {
        return this.hasLoaded;
    }

    public final boolean component4() {
        return this.showLoading;
    }

    public final boolean component5() {
        return this.showError;
    }

    public final boolean component6() {
        return this.showEmpty;
    }

    public final boolean component7() {
        return this.canLoadMore;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final AHD<WalletEntryUiState> getEntries() {
        return this.entries;
    }

    public final boolean getHasLoaded() {
        return this.hasLoaded;
    }

    public final boolean getShowEmpty() {
        return this.showEmpty;
    }

    public final boolean getShowError() {
        return this.showError;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.entries, AnonymousClass001.A0G(this.agentName)), this.hasLoaded), this.showLoading), this.showError), this.showEmpty), this.canLoadMore);
    }

    public final HatchWalletUiState copy(String str, AHD<? extends WalletEntryUiState> ahd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass003.A0u(str, ahd);
        return new HatchWalletUiState(str, ahd, z, z2, z3, z4, z5);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchWalletUiState(String str, AHD<? extends WalletEntryUiState> ahd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass003.A0u(str, ahd);
        this.agentName = str;
        this.entries = ahd;
        this.hasLoaded = z;
        this.showLoading = z2;
        this.showError = z3;
        this.showEmpty = z4;
        this.canLoadMore = z5;
    }

    public /* synthetic */ HatchWalletUiState(String str, AHD ahd, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchAppName.value : str, (i & 2) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), AnonymousClass005.A1Q(i, z3), (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5);
    }
}
