package com.facebook.aura.navigation.key;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class DevicePermissionsSettingsScreenKey extends C06G implements AuraFullScreenNavKey {
    public final DevicePermissionRowId highlightRowId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, DevicePermissionsSettingsScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<DevicePermissionsSettingsScreenKey> serializer() {
            return DevicePermissionsSettingsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof DevicePermissionsSettingsScreenKey) && this.highlightRowId == ((DevicePermissionsSettingsScreenKey) obj).highlightRowId);
    }

    public /* synthetic */ DevicePermissionsSettingsScreenKey(DevicePermissionRowId devicePermissionRowId, int i, C06H c06h) {
        this((i & 1) != 0 ? null : devicePermissionRowId);
    }

    public static /* synthetic */ DevicePermissionsSettingsScreenKey copy$default(DevicePermissionsSettingsScreenKey devicePermissionsSettingsScreenKey, DevicePermissionRowId devicePermissionRowId, int i, Object obj) {
        if ((i & 1) != 0) {
            devicePermissionRowId = devicePermissionsSettingsScreenKey.highlightRowId;
        }
        return new DevicePermissionsSettingsScreenKey(devicePermissionRowId);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(DevicePermissionsSettingsScreenKey devicePermissionsSettingsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || devicePermissionsSettingsScreenKey.highlightRowId != null) {
            c9j5.AAP(devicePermissionsSettingsScreenKey.highlightRowId, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
    }

    public final DevicePermissionRowId component1() {
        return this.highlightRowId;
    }

    public final DevicePermissionsSettingsScreenKey copy(DevicePermissionRowId devicePermissionRowId) {
        return new DevicePermissionsSettingsScreenKey(devicePermissionRowId);
    }

    public final DevicePermissionRowId getHighlightRowId() {
        return this.highlightRowId;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.highlightRowId);
    }

    public String toString() {
        return super.toString();
    }

    public DevicePermissionsSettingsScreenKey(DevicePermissionRowId devicePermissionRowId) {
        this.highlightRowId = devicePermissionRowId;
    }

    public /* synthetic */ DevicePermissionsSettingsScreenKey(int i, DevicePermissionRowId devicePermissionRowId, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.highlightRowId = null;
        } else {
            this.highlightRowId = devicePermissionRowId;
        }
    }

    public DevicePermissionsSettingsScreenKey() {
        this(null);
    }
}
