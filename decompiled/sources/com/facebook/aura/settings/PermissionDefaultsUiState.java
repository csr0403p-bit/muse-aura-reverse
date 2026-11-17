package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.permissions.defaults.PermissionSettings;

/* loaded from: classes3.dex */
public final class PermissionDefaultsUiState extends C06G {
    public static final int $stable = 8;
    public final boolean isServerConfirmed;
    public final boolean isUpdating;
    public final PermissionSettings settings;

    public PermissionDefaultsUiState(PermissionSettings permissionSettings, boolean z, boolean z2) {
        C7384Etj.A0Y(permissionSettings, 0);
        this.settings = permissionSettings;
        this.isUpdating = z;
        this.isServerConfirmed = z2;
    }

    public final PermissionDefaultsUiState copy(PermissionSettings permissionSettings, boolean z, boolean z2) {
        C7384Etj.A0Y(permissionSettings, 0);
        return new PermissionDefaultsUiState(permissionSettings, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionDefaultsUiState) {
                PermissionDefaultsUiState permissionDefaultsUiState = (PermissionDefaultsUiState) obj;
                if (!C7384Etj.areEqual(this.settings, permissionDefaultsUiState.settings) || this.isUpdating != permissionDefaultsUiState.isUpdating || this.isServerConfirmed != permissionDefaultsUiState.isServerConfirmed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionDefaultsUiState copy$default(PermissionDefaultsUiState permissionDefaultsUiState, PermissionSettings permissionSettings, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionSettings = permissionDefaultsUiState.settings;
        }
        if ((i & 2) != 0) {
            z = permissionDefaultsUiState.isUpdating;
        }
        if ((i & 4) != 0) {
            z2 = permissionDefaultsUiState.isServerConfirmed;
        }
        return permissionDefaultsUiState.copy(permissionSettings, z, z2);
    }

    public final PermissionSettings component1() {
        return this.settings;
    }

    public final boolean component2() {
        return this.isUpdating;
    }

    public final boolean component3() {
        return this.isServerConfirmed;
    }

    public final PermissionSettings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0E(this.settings), this.isUpdating), this.isServerConfirmed);
    }

    public final boolean isServerConfirmed() {
        return this.isServerConfirmed;
    }

    public final boolean isUpdating() {
        return this.isUpdating;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PermissionDefaultsUiState(PermissionSettings permissionSettings, boolean z, boolean z2, int i, C06H c06h) {
        this(permissionSettings, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2));
    }
}
