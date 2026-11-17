package com.facebook.aura.storagerecovery;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BQI;
import X.C06G;
import X.C06H;
import X.C0943AIw;
import X.C0KA;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry;

/* loaded from: classes3.dex */
public final class StorageRecoveryUiState extends C06G {
    public final boolean canDelete;
    public final String currentDirectoryName;
    public final StorageRecoveryDialog dialog;
    public final AHD<HatchStorageRecoveryEntry> entries;
    public final boolean isFileListVisible;
    public final boolean isSelecting;
    public final StorageRecoveryPhase phase;
    public final BQI<String> selectedTokens;
    public final Double usagePercentage;

    public static /* synthetic */ StorageRecoveryUiState copy$default(StorageRecoveryUiState storageRecoveryUiState, StorageRecoveryPhase storageRecoveryPhase, AHD ahd, BQI bqi, boolean z, Double d, boolean z2, String str, StorageRecoveryDialog storageRecoveryDialog, boolean z3, int i, Object obj) {
        StorageRecoveryPhase storageRecoveryPhase2 = storageRecoveryPhase;
        AHD ahd2 = ahd;
        BQI bqi2 = bqi;
        boolean z4 = z;
        Double d2 = d;
        boolean z5 = z2;
        String str2 = str;
        StorageRecoveryDialog storageRecoveryDialog2 = storageRecoveryDialog;
        boolean z6 = z3;
        if ((i & 1) != 0) {
            storageRecoveryPhase2 = storageRecoveryUiState.phase;
        }
        if ((i & 2) != 0) {
            ahd2 = storageRecoveryUiState.entries;
        }
        if ((i & 4) != 0) {
            bqi2 = storageRecoveryUiState.selectedTokens;
        }
        if ((i & 8) != 0) {
            z4 = storageRecoveryUiState.isSelecting;
        }
        if ((i & 16) != 0) {
            d2 = storageRecoveryUiState.usagePercentage;
        }
        if ((i & 32) != 0) {
            z5 = storageRecoveryUiState.canDelete;
        }
        if ((i & 64) != 0) {
            str2 = storageRecoveryUiState.currentDirectoryName;
        }
        if ((i & 128) != 0) {
            storageRecoveryDialog2 = storageRecoveryUiState.dialog;
        }
        if ((i & 256) != 0) {
            z6 = storageRecoveryUiState.isFileListVisible;
        }
        AnonymousClass005.A0x(storageRecoveryPhase2, ahd2, bqi2);
        return new StorageRecoveryUiState(storageRecoveryPhase2, ahd2, bqi2, z4, d2, z5, str2, storageRecoveryDialog2, z6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StorageRecoveryUiState) {
                StorageRecoveryUiState storageRecoveryUiState = (StorageRecoveryUiState) obj;
                if (this.phase != storageRecoveryUiState.phase || !C7384Etj.areEqual(this.entries, storageRecoveryUiState.entries) || !C7384Etj.areEqual(this.selectedTokens, storageRecoveryUiState.selectedTokens) || this.isSelecting != storageRecoveryUiState.isSelecting || !C7384Etj.areEqual(this.usagePercentage, storageRecoveryUiState.usagePercentage) || this.canDelete != storageRecoveryUiState.canDelete || !C7384Etj.areEqual(this.currentDirectoryName, storageRecoveryUiState.currentDirectoryName) || !C7384Etj.areEqual(this.dialog, storageRecoveryUiState.dialog) || this.isFileListVisible != storageRecoveryUiState.isFileListVisible) {
                }
            }
            return false;
        }
        return true;
    }

    public final StorageRecoveryPhase component1() {
        return this.phase;
    }

    public final AHD<HatchStorageRecoveryEntry> component2() {
        return this.entries;
    }

    public final BQI<String> component3() {
        return this.selectedTokens;
    }

    public final boolean component4() {
        return this.isSelecting;
    }

    public final Double component5() {
        return this.usagePercentage;
    }

    public final boolean component6() {
        return this.canDelete;
    }

    public final String component7() {
        return this.currentDirectoryName;
    }

    public final StorageRecoveryDialog component8() {
        return this.dialog;
    }

    public final boolean component9() {
        return this.isFileListVisible;
    }

    public final boolean getCanDelete() {
        return this.canDelete;
    }

    public final boolean getCanNavigateBack() {
        StorageRecoveryPhase storageRecoveryPhase = this.phase;
        return storageRecoveryPhase == StorageRecoveryPhase.LOADING || storageRecoveryPhase == StorageRecoveryPhase.READY;
    }

    public final String getCurrentDirectoryName() {
        return this.currentDirectoryName;
    }

    public final StorageRecoveryDialog getDialog() {
        return this.dialog;
    }

    public final AHD<HatchStorageRecoveryEntry> getEntries() {
        return this.entries;
    }

    public final StorageRecoveryPhase getPhase() {
        return this.phase;
    }

    public final int getSelectedCount() {
        return this.selectedTokens.size();
    }

    public final BQI<String> getSelectedTokens() {
        return this.selectedTokens;
    }

    public final Double getUsagePercentage() {
        return this.usagePercentage;
    }

    public int hashCode() {
        return C0KA.A00((((C0KA.A01((C0KA.A01(AnonymousClass005.A0F(this.selectedTokens, AnonymousClass005.A0F(this.entries, AnonymousClass005.A0E(this.phase))), this.isSelecting) + AnonymousClass006.A0D(this.usagePercentage)) * 31, this.canDelete) + AnonymousClass006.A0G(this.currentDirectoryName)) * 31) + C3cH.A02(this.dialog)) * 31, this.isFileListVisible);
    }

    public final boolean isFileListVisible() {
        return this.isFileListVisible;
    }

    public final boolean isMutationEnabled() {
        return this.phase == StorageRecoveryPhase.READY && this.canDelete;
    }

    public final boolean isPrimaryActionEnabled() {
        StorageRecoveryPhase storageRecoveryPhase = this.phase;
        return storageRecoveryPhase == StorageRecoveryPhase.AVAILABLE || storageRecoveryPhase == StorageRecoveryPhase.RECONNECT_FAILED;
    }

    public final boolean isSelecting() {
        return this.isSelecting;
    }

    public StorageRecoveryUiState(StorageRecoveryPhase storageRecoveryPhase, AHD<HatchStorageRecoveryEntry> ahd, BQI<String> bqi, boolean z, Double d, boolean z2, String str, StorageRecoveryDialog storageRecoveryDialog, boolean z3) {
        AnonymousClass005.A0x(storageRecoveryPhase, ahd, bqi);
        this.phase = storageRecoveryPhase;
        this.entries = ahd;
        this.selectedTokens = bqi;
        this.isSelecting = z;
        this.usagePercentage = d;
        this.canDelete = z2;
        this.currentDirectoryName = str;
        this.dialog = storageRecoveryDialog;
        this.isFileListVisible = z3;
    }

    public final StorageRecoveryUiState copy(StorageRecoveryPhase storageRecoveryPhase, AHD<HatchStorageRecoveryEntry> ahd, BQI<String> bqi, boolean z, Double d, boolean z2, String str, StorageRecoveryDialog storageRecoveryDialog, boolean z3) {
        AnonymousClass005.A0x(storageRecoveryPhase, ahd, bqi);
        return new StorageRecoveryUiState(storageRecoveryPhase, ahd, bqi, z, d, z2, str, storageRecoveryDialog, z3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ StorageRecoveryUiState(StorageRecoveryPhase storageRecoveryPhase, AHD ahd, BQI bqi, boolean z, Double d, boolean z2, String str, StorageRecoveryDialog storageRecoveryDialog, boolean z3, int i, C06H c06h) {
        this((i & 1) != 0 ? StorageRecoveryPhase.LOADING : storageRecoveryPhase, (i & 2) != 0 ? AHI.A01 : ahd, (i & 4) != 0 ? C0943AIw.A03 : bqi, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? null : d, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : storageRecoveryDialog, C60Q.A1Q(i & 256, z3));
    }

    public StorageRecoveryUiState() {
        this(StorageRecoveryPhase.LOADING, AHI.A01, C0943AIw.A03, false, null, false, null, null, true);
    }
}
