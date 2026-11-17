package com.facebook.aura.partners.wearables.linking;

import X.AbstractC3358CGz;
import X.BzK;
import X.C06H;
import X.C4oT;
import X.C7384Etj;
import X.CFK;
import X.CH0;
import X.FGI;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.pairs.ConnectionsActivityKt;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class WearablesCommsConsentStore {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String KEY_COMMS_CONSENT = "wearables_comms_consent";

    @Deprecated
    public static final String TAG = "WearablesCommsConsentStore";
    public final C4oT prefs;

    public WearablesCommsConsentStore(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.prefs = AuraUserPrefs.INSTANCE.get(((CH0) abstractC3358CGz).A01, AuraUserPrefStore.USER_PROFILE);
    }

    public final void adoptServerValue(String str) {
        WearablesCommsConsent wearablesCommsConsent;
        C7384Etj.A0Y(str, 0);
        int iHashCode = str.hashCode();
        if (iHashCode != 111442729) {
            if (iHashCode != 280295099) {
                if (iHashCode == 568196142 && str.equals(ConnectionsActivityKt.FILE_STATE_DECLINED)) {
                    wearablesCommsConsent = WearablesCommsConsent.DECLINED;
                    set(wearablesCommsConsent);
                    return;
                }
            } else if (str.equals("granted")) {
                wearablesCommsConsent = WearablesCommsConsent.GRANTED;
                set(wearablesCommsConsent);
                return;
            }
        } else if (str.equals("unset")) {
            BzK bzKA9q = this.prefs.A9q();
            bzKA9q.Aae(KEY_COMMS_CONSENT);
            bzKA9q.apply();
            return;
        }
        CFK.A06(TAG, FGI.A0M("Unrecognised comms consent value from the server: ", str));
    }

    public final void set(WearablesCommsConsent wearablesCommsConsent) {
        C7384Etj.A0Y(wearablesCommsConsent, 0);
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.AYr(KEY_COMMS_CONSENT, wearablesCommsConsent.name());
        bzKA9q.apply();
    }

    public final WearablesCommsConsent get() {
        C4oT c4oT = this.prefs;
        WearablesCommsConsent wearablesCommsConsent = null;
        String string = c4oT.getString(KEY_COMMS_CONSENT, null);
        if (string == null) {
            return null;
        }
        Iterator<WearablesCommsConsent> it = WearablesCommsConsent.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WearablesCommsConsent next = it.next();
            if (next.name().equals(string)) {
                wearablesCommsConsent = next;
                break;
            }
        }
        return wearablesCommsConsent;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
