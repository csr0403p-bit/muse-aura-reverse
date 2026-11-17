package com.facebook.aura.pairs;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.BzK;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class PairsMintedInviteStore {
    public static final int $stable = 8;
    public final Object lock;
    public final AbstractC3358CGz userSession;

    public PairsMintedInviteStore(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.lock = C3cG.A0T();
    }

    public final void record(String str, long j) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str)) {
            return;
        }
        synchronized (this.lock) {
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.AYp(str, j);
            bzKA9q.apply();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.AbstractMap, java.util.HashMap] */
    public final Set<String> retain(Map<String, Long> map, long j) {
        HashSet hashSetA13;
        C7384Etj.A0Y(map, 0);
        synchronized (this.lock) {
            BzK bzKA9q = getPrefs().A9q();
            hashSetA13 = C60O.A13();
            Iterator it = getPrefs().ACL().keySet().iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                Long l = map.get(strA0j);
                long j2 = getPrefs().getLong(strA0j, 0L);
                if (l != null) {
                    if (l.longValue() > j) {
                        hashSetA13.add(strA0j);
                    } else {
                        bzKA9q.Aae(strA0j);
                    }
                } else if (j - j2 < 60000) {
                    hashSetA13.add(strA0j);
                } else {
                    bzKA9q.Aae(strA0j);
                }
            }
            bzKA9q.apply();
        }
        return hashSetA13;
    }

    private final C4oT getPrefs() {
        return AuraVMPrefs.INSTANCE.get(C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession), AuraVMPrefStore.PAIRS_MINTED_INVITES);
    }
}
