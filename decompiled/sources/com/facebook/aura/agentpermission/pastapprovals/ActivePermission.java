package com.facebook.aura.agentpermission.pastapprovals;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;

/* loaded from: classes3.dex */
public final class ActivePermission extends C06G {
    public static final int $stable = 0;
    public final String connectorKey;
    public final ActivePermissionDisplay display;
    public final ActivePermissionKind kind;
    public final ActivePermissionLifetime lifetime;
    public final ConnectorPermissionMode mode;
    public final AHD<ConnectorPermissionMode> modeOptions;
    public final String permissionId;
    public final boolean revocable;
    public final ActivePermissionScope scope;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivePermission) {
                ActivePermission activePermission = (ActivePermission) obj;
                if (!C7384Etj.areEqual(this.permissionId, activePermission.permissionId) || this.kind != activePermission.kind || this.lifetime != activePermission.lifetime || this.revocable != activePermission.revocable || this.mode != activePermission.mode || !C7384Etj.areEqual(this.modeOptions, activePermission.modeOptions) || !C7384Etj.areEqual(this.display, activePermission.display) || !C7384Etj.areEqual(this.connectorKey, activePermission.connectorKey) || !C7384Etj.areEqual(this.scope, activePermission.scope)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivePermission copy$default(ActivePermission activePermission, String str, ActivePermissionKind activePermissionKind, ActivePermissionLifetime activePermissionLifetime, boolean z, ConnectorPermissionMode connectorPermissionMode, AHD ahd, ActivePermissionDisplay activePermissionDisplay, String str2, ActivePermissionScope activePermissionScope, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activePermission.permissionId;
        }
        if ((i & 2) != 0) {
            activePermissionKind = activePermission.kind;
        }
        if ((i & 4) != 0) {
            activePermissionLifetime = activePermission.lifetime;
        }
        if ((i & 8) != 0) {
            z = activePermission.revocable;
        }
        if ((i & 16) != 0) {
            connectorPermissionMode = activePermission.mode;
        }
        if ((i & 32) != 0) {
            ahd = activePermission.modeOptions;
        }
        if ((i & 64) != 0) {
            activePermissionDisplay = activePermission.display;
        }
        if ((i & 128) != 0) {
            str2 = activePermission.connectorKey;
        }
        if ((i & 256) != 0) {
            activePermissionScope = activePermission.scope;
        }
        return activePermission.copy(str, activePermissionKind, activePermissionLifetime, z, connectorPermissionMode, ahd, activePermissionDisplay, str2, activePermissionScope);
    }

    public final String component1() {
        return this.permissionId;
    }

    public final ActivePermissionKind component2() {
        return this.kind;
    }

    public final ActivePermissionLifetime component3() {
        return this.lifetime;
    }

    public final boolean component4() {
        return this.revocable;
    }

    public final ConnectorPermissionMode component5() {
        return this.mode;
    }

    public final AHD<ConnectorPermissionMode> component6() {
        return this.modeOptions;
    }

    public final ActivePermissionDisplay component7() {
        return this.display;
    }

    public final String component8() {
        return this.connectorKey;
    }

    public final ActivePermissionScope component9() {
        return this.scope;
    }

    public final String getConnectorKey() {
        return this.connectorKey;
    }

    public final ActivePermissionDisplay getDisplay() {
        return this.display;
    }

    public final ActivePermissionKind getKind() {
        return this.kind;
    }

    public final ActivePermissionLifetime getLifetime() {
        return this.lifetime;
    }

    public final ConnectorPermissionMode getMode() {
        return this.mode;
    }

    public final AHD<ConnectorPermissionMode> getModeOptions() {
        return this.modeOptions;
    }

    public final String getPermissionId() {
        return this.permissionId;
    }

    public final boolean getRevocable() {
        return this.revocable;
    }

    public final ActivePermissionScope getScope() {
        return this.scope;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.display, AnonymousClass005.A0F(this.modeOptions, (C0KA.A01((AnonymousClass005.A0F(this.kind, AnonymousClass001.A0G(this.permissionId)) + AnonymousClass006.A0D(this.lifetime)) * 31, this.revocable) + AnonymousClass006.A0D(this.mode)) * 31)) + AnonymousClass006.A0G(this.connectorKey)) * 31) + C3cH.A02(this.scope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivePermission(String str, ActivePermissionKind activePermissionKind, ActivePermissionLifetime activePermissionLifetime, boolean z, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, ActivePermissionDisplay activePermissionDisplay, String str2, ActivePermissionScope activePermissionScope) {
        AnonymousClass003.A0u(str, activePermissionKind);
        AnonymousClass003.A0z(ahd, activePermissionDisplay);
        this.permissionId = str;
        this.kind = activePermissionKind;
        this.lifetime = activePermissionLifetime;
        this.revocable = z;
        this.mode = connectorPermissionMode;
        this.modeOptions = ahd;
        this.display = activePermissionDisplay;
        this.connectorKey = str2;
        this.scope = activePermissionScope;
    }

    public final ActivePermission copy(String str, ActivePermissionKind activePermissionKind, ActivePermissionLifetime activePermissionLifetime, boolean z, ConnectorPermissionMode connectorPermissionMode, AHD<? extends ConnectorPermissionMode> ahd, ActivePermissionDisplay activePermissionDisplay, String str2, ActivePermissionScope activePermissionScope) {
        AnonymousClass003.A0u(str, activePermissionKind);
        AnonymousClass003.A0z(ahd, activePermissionDisplay);
        return new ActivePermission(str, activePermissionKind, activePermissionLifetime, z, connectorPermissionMode, ahd, activePermissionDisplay, str2, activePermissionScope);
    }

    public String toString() {
        return super.toString();
    }
}
