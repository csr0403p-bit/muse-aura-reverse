package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BzK;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;

/* loaded from: classes3.dex */
public final class PairsPendingShareStore {
    public static final int $stable = 8;
    public final Object lock;
    public final AbstractC3358CGz userSession;

    public PairsPendingShareStore(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.lock = C3cG.A0T();
    }

    private final C4oT getPrefs() {
        return AuraVMPrefs.INSTANCE.get(C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession), AuraVMPrefStore.PAIRS_PENDING_SHARES);
    }

    private final String key(String str, String str2, String str3) {
        return FGI.A0h(str, PairsDiscretionDocument.TERMINATOR, str2, PairsDiscretionDocument.TERMINATOR, str3);
    }

    public final void clear(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        synchronized (this.lock) {
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.Aae(FGI.A0h(str, PairsDiscretionDocument.TERMINATOR, str2, PairsDiscretionDocument.TERMINATOR, str3));
            bzKA9q.apply();
        }
    }

    public final String operationId(String str, String str2, String str3) {
        String strA00;
        AnonymousClass005.A0x(str, str2, str3);
        synchronized (this.lock) {
            String strA0h = FGI.A0h(str, PairsDiscretionDocument.TERMINATOR, str2, PairsDiscretionDocument.TERMINATOR, str3);
            strA00 = C4oT.A00(getPrefs(), strA0h);
            if (strA00 == null) {
                strA00 = AnonymousClass002.A0k();
                BzK bzKA9q = getPrefs().A9q();
                bzKA9q.AYr(strA0h, strA00);
                bzKA9q.apply();
            }
        }
        return strA00;
    }
}
