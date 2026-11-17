package com.facebook.aura.confidentialvm.model;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneUiState extends C06G {
    public static final int $stable = 0;
    public final AHD<ConfidentialVmDisconnectedItem> disconnected;
    public final boolean isConfidentialVm;

    public ConfidentialVmMigrationDoneUiState(boolean z, AHD<ConfidentialVmDisconnectedItem> ahd) {
        C7384Etj.A0Y(ahd, 1);
        this.isConfidentialVm = z;
        this.disconnected = ahd;
    }

    public final ConfidentialVmMigrationDoneUiState copy(boolean z, AHD<ConfidentialVmDisconnectedItem> ahd) {
        C7384Etj.A0Y(ahd, 1);
        return new ConfidentialVmMigrationDoneUiState(z, ahd);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConfidentialVmMigrationDoneUiState) {
                ConfidentialVmMigrationDoneUiState confidentialVmMigrationDoneUiState = (ConfidentialVmMigrationDoneUiState) obj;
                if (this.isConfidentialVm != confidentialVmMigrationDoneUiState.isConfidentialVm || !C7384Etj.areEqual(this.disconnected, confidentialVmMigrationDoneUiState.disconnected)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConfidentialVmMigrationDoneUiState copy$default(ConfidentialVmMigrationDoneUiState confidentialVmMigrationDoneUiState, boolean z, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            z = confidentialVmMigrationDoneUiState.isConfidentialVm;
        }
        if ((i & 2) != 0) {
            ahd = confidentialVmMigrationDoneUiState.disconnected;
        }
        C7384Etj.A0Y(ahd, 1);
        return new ConfidentialVmMigrationDoneUiState(z, ahd);
    }

    public final boolean component1() {
        return this.isConfidentialVm;
    }

    public final AHD<ConfidentialVmDisconnectedItem> component2() {
        return this.disconnected;
    }

    public final AHD<ConfidentialVmDisconnectedItem> getDisconnected() {
        return this.disconnected;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.disconnected, C0KA.A02(this.isConfidentialVm));
    }

    public final boolean isConfidentialVm() {
        return this.isConfidentialVm;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConfidentialVmMigrationDoneUiState(boolean z, AHD ahd, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? AHI.A01 : ahd);
    }

    public ConfidentialVmMigrationDoneUiState() {
        this(true, AHI.A01);
    }
}
