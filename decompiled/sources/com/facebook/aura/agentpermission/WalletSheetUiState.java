package com.facebook.aura.agentpermission;

import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class WalletSheetUiState extends C06G {
    public static final int $stable = 0;
    public final WalletOptionKey currentSelectionKey;
    public final boolean dismissed;
    public final AHD<WalletPaymentMethodGroup> groups;
    public final boolean loadFailed;
    public final boolean loaded;
    public final WalletOptionKey requestedKey;

    public WalletSheetUiState() {
        this(AHI.A01, null, null, false, false, false);
    }

    public final WalletSheetUiState copy(AHD<WalletPaymentMethodGroup> ahd, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(ahd, 0);
        return new WalletSheetUiState(ahd, walletOptionKey, walletOptionKey2, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletSheetUiState) {
                WalletSheetUiState walletSheetUiState = (WalletSheetUiState) obj;
                if (!C7384Etj.areEqual(this.groups, walletSheetUiState.groups) || !C7384Etj.areEqual(this.currentSelectionKey, walletSheetUiState.currentSelectionKey) || !C7384Etj.areEqual(this.requestedKey, walletSheetUiState.requestedKey) || this.loaded != walletSheetUiState.loaded || this.loadFailed != walletSheetUiState.loadFailed || this.dismissed != walletSheetUiState.dismissed) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletSheetUiState copy$default(WalletSheetUiState walletSheetUiState, AHD ahd, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = walletSheetUiState.groups;
        }
        if ((i & 2) != 0) {
            walletOptionKey = walletSheetUiState.currentSelectionKey;
        }
        if ((i & 4) != 0) {
            walletOptionKey2 = walletSheetUiState.requestedKey;
        }
        if ((i & 8) != 0) {
            z = walletSheetUiState.loaded;
        }
        if ((i & 16) != 0) {
            z2 = walletSheetUiState.loadFailed;
        }
        if ((i & 32) != 0) {
            z3 = walletSheetUiState.dismissed;
        }
        return walletSheetUiState.copy(ahd, walletOptionKey, walletOptionKey2, z, z2, z3);
    }

    public final AHD<WalletPaymentMethodGroup> component1() {
        return this.groups;
    }

    public final WalletOptionKey component2() {
        return this.currentSelectionKey;
    }

    public final WalletOptionKey component3() {
        return this.requestedKey;
    }

    public final boolean component4() {
        return this.loaded;
    }

    public final boolean component5() {
        return this.loadFailed;
    }

    public final boolean component6() {
        return this.dismissed;
    }

    public final WalletOptionKey getCurrentSelectionKey() {
        return this.currentSelectionKey;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    public final AHD<WalletPaymentMethodGroup> getGroups() {
        return this.groups;
    }

    public final boolean getLoadFailed() {
        return this.loadFailed;
    }

    public final boolean getLoaded() {
        return this.loaded;
    }

    public final WalletPaymentMethodGroup getProviderGroup() {
        return (WalletPaymentMethodGroup) AbstractC0878AGe.A0K(this.groups);
    }

    public final WalletOptionKey getRequestedKey() {
        return this.requestedKey;
    }

    public final boolean getSubmitting() {
        return AnonymousClass002.A1X(this.requestedKey);
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01((((AnonymousClass005.A0E(this.groups) + AnonymousClass006.A0D(this.currentSelectionKey)) * 31) + C3cH.A02(this.requestedKey)) * 31, this.loaded), this.loadFailed), this.dismissed);
    }

    public final boolean isEmpty() {
        return this.groups.isEmpty();
    }

    public String toString() {
        return super.toString();
    }

    public WalletSheetUiState(AHD<WalletPaymentMethodGroup> ahd, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(ahd, 0);
        this.groups = ahd;
        this.currentSelectionKey = walletOptionKey;
        this.requestedKey = walletOptionKey2;
        this.loaded = z;
        this.loadFailed = z2;
        this.dismissed = z3;
    }

    public /* synthetic */ WalletSheetUiState(AHD ahd, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? null : walletOptionKey, (i & 4) != 0 ? null : walletOptionKey2, AnonymousClass005.A1P(i, z), AnonymousClass005.A1Q(i, z2), AnonymousClass002.A1R(i, z3));
    }
}
