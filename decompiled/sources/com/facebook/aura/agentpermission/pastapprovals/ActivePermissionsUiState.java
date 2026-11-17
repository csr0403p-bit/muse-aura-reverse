package com.facebook.aura.agentpermission.pastapprovals;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ActivePermissionsUiState extends C06G {
    public static final int $stable = ActivePermissionGroup.$stable | ActivePermission.$stable;
    public final boolean canLoadMore;
    public final BO6<String, String> connectorIconUrls;
    public final String groupCursor;
    public final AHD<ActivePermissionGroup> groups;
    public final boolean isGrouped;
    public final boolean isLoadingMore;
    public final boolean isResetting;
    public final ActivePermissionsLoadingState loadingState;
    public final String nextCursor;
    public final AHD<ActivePermission> permissions;
    public final String revokingPermissionId;
    public final String updatingPermissionId;

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivePermissionsUiState() {
        AHI ahi = AHI.A01;
        this(ahi, ahi, false, ActivePermissionsLoadingState.IDLE, null, null, true, false, null, null, false, C0953AJg.A00());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermissionsUiState) {
                ActivePermissionsUiState activePermissionsUiState = (ActivePermissionsUiState) obj;
                if (!C7384Etj.areEqual(this.permissions, activePermissionsUiState.permissions) || !C7384Etj.areEqual(this.groups, activePermissionsUiState.groups) || this.isGrouped != activePermissionsUiState.isGrouped || this.loadingState != activePermissionsUiState.loadingState || !C7384Etj.areEqual(this.nextCursor, activePermissionsUiState.nextCursor) || !C7384Etj.areEqual(this.groupCursor, activePermissionsUiState.groupCursor) || this.canLoadMore != activePermissionsUiState.canLoadMore || this.isLoadingMore != activePermissionsUiState.isLoadingMore || !C7384Etj.areEqual(this.revokingPermissionId, activePermissionsUiState.revokingPermissionId) || !C7384Etj.areEqual(this.updatingPermissionId, activePermissionsUiState.updatingPermissionId) || this.isResetting != activePermissionsUiState.isResetting || !C7384Etj.areEqual(this.connectorIconUrls, activePermissionsUiState.connectorIconUrls)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivePermissionsUiState copy$default(ActivePermissionsUiState activePermissionsUiState, AHD ahd, AHD ahd2, boolean z, ActivePermissionsLoadingState activePermissionsLoadingState, String str, String str2, boolean z2, boolean z3, String str3, String str4, boolean z4, BO6 bo6, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = activePermissionsUiState.permissions;
        }
        if ((i & 2) != 0) {
            ahd2 = activePermissionsUiState.groups;
        }
        if ((i & 4) != 0) {
            z = activePermissionsUiState.isGrouped;
        }
        if ((i & 8) != 0) {
            activePermissionsLoadingState = activePermissionsUiState.loadingState;
        }
        if ((i & 16) != 0) {
            str = activePermissionsUiState.nextCursor;
        }
        if ((i & 32) != 0) {
            str2 = activePermissionsUiState.groupCursor;
        }
        if ((i & 64) != 0) {
            z2 = activePermissionsUiState.canLoadMore;
        }
        if ((i & 128) != 0) {
            z3 = activePermissionsUiState.isLoadingMore;
        }
        if ((i & 256) != 0) {
            str3 = activePermissionsUiState.revokingPermissionId;
        }
        if ((i & 512) != 0) {
            str4 = activePermissionsUiState.updatingPermissionId;
        }
        if ((i & 1024) != 0) {
            z4 = activePermissionsUiState.isResetting;
        }
        if ((i & 2048) != 0) {
            bo6 = activePermissionsUiState.connectorIconUrls;
        }
        return activePermissionsUiState.copy(ahd, ahd2, z, activePermissionsLoadingState, str, str2, z2, z3, str3, str4, z4, bo6);
    }

    public final AHD<ActivePermission> component1() {
        return this.permissions;
    }

    public final String component10() {
        return this.updatingPermissionId;
    }

    public final boolean component11() {
        return this.isResetting;
    }

    public final BO6<String, String> component12() {
        return this.connectorIconUrls;
    }

    public final AHD<ActivePermissionGroup> component2() {
        return this.groups;
    }

    public final boolean component3() {
        return this.isGrouped;
    }

    public final ActivePermissionsLoadingState component4() {
        return this.loadingState;
    }

    public final String component5() {
        return this.nextCursor;
    }

    public final String component6() {
        return this.groupCursor;
    }

    public final boolean component7() {
        return this.canLoadMore;
    }

    public final boolean component8() {
        return this.isLoadingMore;
    }

    public final String component9() {
        return this.revokingPermissionId;
    }

    public final boolean getCanLoadMore() {
        return this.canLoadMore;
    }

    public final BO6<String, String> getConnectorIconUrls() {
        return this.connectorIconUrls;
    }

    public final String getGroupCursor() {
        return this.groupCursor;
    }

    public final AHD<ActivePermissionGroup> getGroups() {
        return this.groups;
    }

    public final ActivePermissionsLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final AHD<ActivePermission> getPermissions() {
        return this.permissions;
    }

    public final String getRevokingPermissionId() {
        return this.revokingPermissionId;
    }

    public final String getUpdatingPermissionId() {
        return this.updatingPermissionId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.connectorIconUrls, C0KA.A01((((C0KA.A01(C0KA.A01((((AnonymousClass005.A0F(this.loadingState, C0KA.A01(AnonymousClass005.A0F(this.groups, AnonymousClass005.A0E(this.permissions)), this.isGrouped)) + AnonymousClass006.A0G(this.nextCursor)) * 31) + AnonymousClass006.A0G(this.groupCursor)) * 31, this.canLoadMore), this.isLoadingMore) + AnonymousClass006.A0G(this.revokingPermissionId)) * 31) + AnonymousClass005.A0H(this.updatingPermissionId)) * 31, this.isResetting));
    }

    public final boolean isGrouped() {
        return this.isGrouped;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean isResetting() {
        return this.isResetting;
    }

    public final ActivePermissionsUiState copy(AHD<ActivePermission> ahd, AHD<ActivePermissionGroup> ahd2, boolean z, ActivePermissionsLoadingState activePermissionsLoadingState, String str, String str2, boolean z2, boolean z3, String str3, String str4, boolean z4, BO6<String, String> bo6) {
        AnonymousClass005.A0y(ahd, ahd2, activePermissionsLoadingState);
        C7384Etj.A0Y(bo6, 11);
        return new ActivePermissionsUiState(ahd, ahd2, z, activePermissionsLoadingState, str, str2, z2, z3, str3, str4, z4, bo6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivePermissionsUiState(AHD ahd, AHD ahd2, boolean z, ActivePermissionsLoadingState activePermissionsLoadingState, String str, String str2, boolean z2, boolean z3, String str3, String str4, boolean z4, BO6 bo6, int i, C06H c06h) {
        this((i & 1) != 0 ? AHI.A01 : ahd, (i & 2) != 0 ? AHI.A01 : ahd2, C3cG.A1K(i & 4, z), (i & 8) != 0 ? ActivePermissionsLoadingState.IDLE : activePermissionsLoadingState, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, C60Q.A1Q(i & 64, z2), C3cH.A1N(i, z3), (i & 256) != 0 ? null : str3, (i & 512) == 0 ? str4 : null, (i & 1024) == 0 ? z4 : false, (i & 2048) != 0 ? C0953AJg.A00() : bo6);
    }

    public ActivePermissionsUiState(AHD<ActivePermission> ahd, AHD<ActivePermissionGroup> ahd2, boolean z, ActivePermissionsLoadingState activePermissionsLoadingState, String str, String str2, boolean z2, boolean z3, String str3, String str4, boolean z4, BO6<String, String> bo6) {
        AnonymousClass005.A0y(ahd, ahd2, activePermissionsLoadingState);
        C7384Etj.A0Y(bo6, 11);
        this.permissions = ahd;
        this.groups = ahd2;
        this.isGrouped = z;
        this.loadingState = activePermissionsLoadingState;
        this.nextCursor = str;
        this.groupCursor = str2;
        this.canLoadMore = z2;
        this.isLoadingMore = z3;
        this.revokingPermissionId = str3;
        this.updatingPermissionId = str4;
        this.isResetting = z4;
        this.connectorIconUrls = bo6;
    }
}
