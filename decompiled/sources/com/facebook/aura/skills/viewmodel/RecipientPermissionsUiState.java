package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class RecipientPermissionsUiState extends C06G {
    public final String failedRevokePermissionId;
    public final AHD<RecipientPermissionGroup> groups;
    public final boolean isLoading;
    public final boolean loadFailed;
    public final String revokingPermissionId;

    public RecipientPermissionsUiState(AHD<RecipientPermissionGroup> ahd, boolean z, boolean z2, String str, String str2) {
        C7384Etj.A0Y(ahd, 0);
        this.groups = ahd;
        this.isLoading = z;
        this.loadFailed = z2;
        this.failedRevokePermissionId = str;
        this.revokingPermissionId = str2;
    }

    public final RecipientPermissionsUiState copy(AHD<RecipientPermissionGroup> ahd, boolean z, boolean z2, String str, String str2) {
        C7384Etj.A0Y(ahd, 0);
        return new RecipientPermissionsUiState(ahd, z, z2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermissionsUiState) {
                RecipientPermissionsUiState recipientPermissionsUiState = (RecipientPermissionsUiState) obj;
                if (!C7384Etj.areEqual(this.groups, recipientPermissionsUiState.groups) || this.isLoading != recipientPermissionsUiState.isLoading || this.loadFailed != recipientPermissionsUiState.loadFailed || !C7384Etj.areEqual(this.failedRevokePermissionId, recipientPermissionsUiState.failedRevokePermissionId) || !C7384Etj.areEqual(this.revokingPermissionId, recipientPermissionsUiState.revokingPermissionId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecipientPermissionsUiState copy$default(RecipientPermissionsUiState recipientPermissionsUiState, AHD ahd, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = recipientPermissionsUiState.groups;
        }
        if ((i & 2) != 0) {
            z = recipientPermissionsUiState.isLoading;
        }
        if ((i & 4) != 0) {
            z2 = recipientPermissionsUiState.loadFailed;
        }
        if ((i & 8) != 0) {
            str = recipientPermissionsUiState.failedRevokePermissionId;
        }
        if ((i & 16) != 0) {
            str2 = recipientPermissionsUiState.revokingPermissionId;
        }
        return recipientPermissionsUiState.copy(ahd, z, z2, str, str2);
    }

    public final AHD<RecipientPermissionGroup> component1() {
        return this.groups;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final boolean component3() {
        return this.loadFailed;
    }

    public final String component4() {
        return this.failedRevokePermissionId;
    }

    public final String component5() {
        return this.revokingPermissionId;
    }

    public final String getFailedRevokePermissionId() {
        return this.failedRevokePermissionId;
    }

    public final AHD<RecipientPermissionGroup> getGroups() {
        return this.groups;
    }

    public final boolean getLoadFailed() {
        return this.loadFailed;
    }

    public final String getRevokingPermissionId() {
        return this.revokingPermissionId;
    }

    public int hashCode() {
        return ((C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.groups), this.isLoading), this.loadFailed) + AnonymousClass006.A0G(this.failedRevokePermissionId)) * 31) + AnonymousClass005.A0H(this.revokingPermissionId);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecipientPermissionsUiState(AHD ahd, boolean z, boolean z2, String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    public RecipientPermissionsUiState() {
        this(AHI.A01, false, false, null, null);
    }
}
