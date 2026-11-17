package com.facebook.aura.devices.token;

import X.AbstractC3358CGz;
import X.BzK;
import X.C4oT;
import X.C7384Etj;
import X.CH0;
import X.FGI;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;

/* loaded from: classes4.dex */
public final class LinkDeviceKeyPrefsRevocationStorage implements LinkDeviceKeyRevocationStorage {
    public final String key;

    public LinkDeviceKeyPrefsRevocationStorage(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.key = FGI.A0M("link_device_key_revocation_queue:", ((CH0) abstractC3358CGz).A01);
    }

    private final C4oT prefs() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.LINK_DEVICE_KEY_REVOCATIONS);
    }

    @Override // com.facebook.aura.devices.token.LinkDeviceKeyRevocationStorage
    public String load() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.LINK_DEVICE_KEY_REVOCATIONS).getString(this.key, null);
    }

    @Override // com.facebook.aura.devices.token.LinkDeviceKeyRevocationStorage
    public boolean save(String str) {
        BzK bzKA9q = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.LINK_DEVICE_KEY_REVOCATIONS).A9q();
        String str2 = this.key;
        if (str == null) {
            bzKA9q.Aae(str2);
        } else {
            bzKA9q.AYr(str2, str);
        }
        return bzKA9q.A0B(0);
    }
}
