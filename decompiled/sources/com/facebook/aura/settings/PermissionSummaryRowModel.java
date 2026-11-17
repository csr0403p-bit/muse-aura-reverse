package com.facebook.aura.settings;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.navigation.key.PermissionDestination;

/* loaded from: classes.dex */
public final class PermissionSummaryRowModel extends C06G {
    public final PermissionDestination destination;
    public final boolean isVisible;

    public PermissionSummaryRowModel(PermissionDestination permissionDestination, boolean z) {
        C7384Etj.A0Y(permissionDestination, 0);
        this.destination = permissionDestination;
        this.isVisible = z;
    }

    public final PermissionSummaryRowModel copy(PermissionDestination permissionDestination, boolean z) {
        C7384Etj.A0Y(permissionDestination, 0);
        return new PermissionSummaryRowModel(permissionDestination, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionSummaryRowModel) {
                PermissionSummaryRowModel permissionSummaryRowModel = (PermissionSummaryRowModel) obj;
                if (this.destination != permissionSummaryRowModel.destination || this.isVisible != permissionSummaryRowModel.isVisible) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PermissionSummaryRowModel copy$default(PermissionSummaryRowModel permissionSummaryRowModel, PermissionDestination permissionDestination, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionDestination = permissionSummaryRowModel.destination;
        }
        if ((i & 2) != 0) {
            z = permissionSummaryRowModel.isVisible;
        }
        C7384Etj.A0Y(permissionDestination, 0);
        return new PermissionSummaryRowModel(permissionDestination, z);
    }

    public final PermissionDestination component1() {
        return this.destination;
    }

    public final boolean component2() {
        return this.isVisible;
    }

    public final PermissionDestination getDestination() {
        return this.destination;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.destination), this.isVisible);
    }

    public final boolean isVisible() {
        return this.isVisible;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PermissionSummaryRowModel(PermissionDestination permissionDestination, boolean z, int i, C06H c06h) {
        this(permissionDestination, (i & 2) != 0 ? true : z);
    }
}
