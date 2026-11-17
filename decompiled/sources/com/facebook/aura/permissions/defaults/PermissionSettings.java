package com.facebook.aura.permissions.defaults;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PermissionSettings extends C06G {
    public final PermissionDefaultSurfaceContent connectorContent;
    public final PermissionDefaultMode connectorDefault;
    public final PermissionDefaultSurfaceContent networkContent;
    public final PermissionDefaultMode networkDefault;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PermissionSettings) {
                PermissionSettings permissionSettings = (PermissionSettings) obj;
                if (this.connectorDefault != permissionSettings.connectorDefault || this.networkDefault != permissionSettings.networkDefault || !C7384Etj.areEqual(this.connectorContent, permissionSettings.connectorContent) || !C7384Etj.areEqual(this.networkContent, permissionSettings.networkContent)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ PermissionSettings(PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent2, int i, C06H c06h) {
        this((i & 1) != 0 ? PermissionDefaultMode.AUTO_ALLOW : permissionDefaultMode, (i & 2) != 0 ? PermissionDefaultMode.AUTO_ALLOW : permissionDefaultMode2, (i & 4) != 0 ? null : permissionDefaultSurfaceContent, (i & 8) != 0 ? null : permissionDefaultSurfaceContent2);
    }

    public static /* synthetic */ PermissionSettings copy$default(PermissionSettings permissionSettings, PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent2, int i, Object obj) {
        if ((i & 1) != 0) {
            permissionDefaultMode = permissionSettings.connectorDefault;
        }
        if ((i & 2) != 0) {
            permissionDefaultMode2 = permissionSettings.networkDefault;
        }
        if ((i & 4) != 0) {
            permissionDefaultSurfaceContent = permissionSettings.connectorContent;
        }
        if ((i & 8) != 0) {
            permissionDefaultSurfaceContent2 = permissionSettings.networkContent;
        }
        AnonymousClass003.A0u(permissionDefaultMode, permissionDefaultMode2);
        return new PermissionSettings(permissionDefaultMode, permissionDefaultMode2, permissionDefaultSurfaceContent, permissionDefaultSurfaceContent2);
    }

    public final PermissionDefaultMode component1() {
        return this.connectorDefault;
    }

    public final PermissionDefaultMode component2() {
        return this.networkDefault;
    }

    public final PermissionDefaultSurfaceContent component3() {
        return this.connectorContent;
    }

    public final PermissionDefaultSurfaceContent component4() {
        return this.networkContent;
    }

    public final PermissionDefaultSurfaceContent getConnectorContent() {
        return this.connectorContent;
    }

    public final PermissionDefaultMode getConnectorDefault() {
        return this.connectorDefault;
    }

    public final PermissionDefaultSurfaceContent getNetworkContent() {
        return this.networkContent;
    }

    public final PermissionDefaultMode getNetworkDefault() {
        return this.networkDefault;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.networkDefault, AnonymousClass005.A0E(this.connectorDefault)) + AnonymousClass006.A0D(this.connectorContent)) * 31) + C3cH.A02(this.networkContent);
    }

    public final PermissionSettings copy(PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent2) {
        AnonymousClass003.A0u(permissionDefaultMode, permissionDefaultMode2);
        return new PermissionSettings(permissionDefaultMode, permissionDefaultMode2, permissionDefaultSurfaceContent, permissionDefaultSurfaceContent2);
    }

    public String toString() {
        return super.toString();
    }

    public PermissionSettings(PermissionDefaultMode permissionDefaultMode, PermissionDefaultMode permissionDefaultMode2, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent, PermissionDefaultSurfaceContent permissionDefaultSurfaceContent2) {
        AnonymousClass003.A0u(permissionDefaultMode, permissionDefaultMode2);
        this.connectorDefault = permissionDefaultMode;
        this.networkDefault = permissionDefaultMode2;
        this.connectorContent = permissionDefaultSurfaceContent;
        this.networkContent = permissionDefaultSurfaceContent2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PermissionSettings() {
        PermissionDefaultMode permissionDefaultMode = PermissionDefaultMode.AUTO_ALLOW;
        this(permissionDefaultMode, permissionDefaultMode, null, null);
    }
}
