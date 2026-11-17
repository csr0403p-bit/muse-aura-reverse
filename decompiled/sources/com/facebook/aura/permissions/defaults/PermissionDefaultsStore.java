package com.facebook.aura.permissions.defaults;

import X.BzK;
import X.C06H;
import X.C4oT;
import X.C7384Etj;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.permissions.defaults.PermissionDefaultMode;

/* loaded from: classes3.dex */
public final class PermissionDefaultsStore {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String KEY_CONNECTOR_DEFAULT = "connector_default";

    @Deprecated
    public static final String KEY_NETWORK_DEFAULT = "network_default";
    public final String vmId;

    public final void write(PermissionSettings permissionSettings) {
        BzK bzKA9q;
        C7384Etj.A0Y(permissionSettings, 0);
        C4oT c4oTPrefs = prefs();
        if (c4oTPrefs == null || (bzKA9q = c4oTPrefs.A9q()) == null) {
            return;
        }
        bzKA9q.AYr(KEY_CONNECTOR_DEFAULT, permissionSettings.connectorDefault.getWireValue());
        bzKA9q.AYr(KEY_NETWORK_DEFAULT, permissionSettings.networkDefault.getWireValue());
        bzKA9q.apply();
    }

    private final C4oT prefs() {
        String str = this.vmId;
        if (str != null) {
            return AuraVMPrefs.INSTANCE.get(str, AuraVMPrefStore.PERMISSION_DEFAULTS);
        }
        return null;
    }

    public final PermissionSettings read() {
        PermissionDefaultMode.Companion companion = PermissionDefaultMode.Companion;
        C4oT c4oTPrefs = prefs();
        PermissionDefaultMode permissionDefaultModeFromWire = companion.fromWire(c4oTPrefs != null ? c4oTPrefs.getString(KEY_CONNECTOR_DEFAULT, null) : null);
        C4oT c4oTPrefs2 = prefs();
        return new PermissionSettings(permissionDefaultModeFromWire, companion.fromWire(c4oTPrefs2 != null ? c4oTPrefs2.getString(KEY_NETWORK_DEFAULT, null) : null), null, null);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PermissionDefaultsStore(String str) {
        this.vmId = str;
    }

    public final boolean hasCachedSettings() {
        C4oT c4oTPrefs = prefs();
        return c4oTPrefs != null && c4oTPrefs.contains(KEY_CONNECTOR_DEFAULT);
    }
}
