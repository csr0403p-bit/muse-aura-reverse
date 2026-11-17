package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.BzK;
import X.C10571Hud;
import X.C3cG;
import X.C4oT;
import X.C7384Etj;
import X.CH0;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class ColdLeaseKeyStore {
    public final C4oT prefs;

    public ColdLeaseKeyStore(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.prefs = AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, AuraUserPrefStore.CVM_COLD_LEASE);
    }

    public final void clear() {
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.Aae(HatchColdCvmLeaseKt.KEY_IDEMPOTENCY_KEY);
        bzKA9q.A0B(0);
    }

    public final UUID getOrCreate() {
        Object objA0s;
        String string = this.prefs.getString(HatchColdCvmLeaseKt.KEY_IDEMPOTENCY_KEY, null);
        if (string != null) {
            try {
                objA0s = UUID.fromString(string);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            UUID uuid = (UUID) objA0s;
            if (uuid != null) {
                return uuid;
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.AYr(HatchColdCvmLeaseKt.KEY_IDEMPOTENCY_KEY, uuidRandomUUID.toString());
        if (bzKA9q.A0B(0)) {
            return uuidRandomUUID;
        }
        return null;
    }
}
