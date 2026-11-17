package com.facebook.aura.gateway;

import X.A3q;
import X.AbstractC0882AGj;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BGK;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ApprovalDecideReadGate {
    public static final int $stable = 8;
    public final BLG<Set<String>> _blockedIds;
    public final C1BN<Set<String>> blockedIds;
    public long lossEpoch;
    public final Object lock = C3cG.A0T();
    public final Map<String, Long> lostAtEpoch = C3cG.A0j();
    public final Set<String> inFlight = C3cG.A0k();

    public final boolean isBlocked(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass006.A1a(str, this._blockedIds);
    }

    public final boolean onSnapshotApplied(Long l, Set<String> set) {
        C7384Etj.A0Y(set, 1);
        synchronized (this.lock) {
            if (this.lostAtEpoch.isEmpty()) {
                return false;
            }
            Map<String, Long> map = this.lostAtEpoch;
            if (l == null) {
                map.keySet().retainAll(set);
            } else {
                AbstractC0882AGj.A0t(map.values(), new ApprovalDecideReadGate$onSnapshotApplied$1$1(l));
            }
            publishLocked();
            return !this.lostAtEpoch.isEmpty();
        }
    }

    private final void publishLocked() {
        this._blockedIds.Af8(BGK.A01(this.inFlight, this.lostAtEpoch.keySet()));
    }

    public final void clear() {
        synchronized (this.lock) {
            this.lostAtEpoch.clear();
            this.inFlight.clear();
            publishLocked();
        }
    }

    public final long currentEpoch() {
        long j;
        synchronized (this.lock) {
            j = this.lossEpoch;
        }
        return j;
    }

    public final C1BN<Set<String>> getBlockedIds() {
        return this.blockedIds;
    }

    public final boolean hasLostDecides() {
        boolean z;
        synchronized (this.lock) {
            z = !this.lostAtEpoch.isEmpty();
        }
        return z;
    }

    public ApprovalDecideReadGate() {
        C9286GCn c9286GCnA01 = HnJ.A01(A3q.A00);
        this._blockedIds = c9286GCnA01;
        this.blockedIds = C3Pi.A00(c9286GCnA01);
    }

    public final Set<String> begin(Collection<String> collection, Set<String> set) {
        LinkedHashSet linkedHashSetA0k;
        AnonymousClass003.A0u(collection, set);
        synchronized (this.lock) {
            linkedHashSetA0k = C3cG.A0k();
            for (String str : collection) {
                String str2 = str;
                if (this.lostAtEpoch.containsKey(str2) || this.inFlight.contains(str2)) {
                    linkedHashSetA0k.add(str);
                }
            }
            AbstractC0882AGj.A0r(BGK.A03(linkedHashSetA0k, set), this.inFlight);
            publishLocked();
        }
        return linkedHashSetA0k;
    }

    public final void finish(Set<String> set, Set<String> set2) {
        AnonymousClass003.A0u(set, set2);
        synchronized (this.lock) {
            AbstractC0882AGj.A0s(set, this.inFlight);
            if (!set2.isEmpty()) {
                this.lossEpoch++;
                Iterator<String> it = set2.iterator();
                while (it.hasNext()) {
                    this.lostAtEpoch.put(AnonymousClass005.A0j(it), Long.valueOf(this.lossEpoch));
                }
            }
            publishLocked();
        }
    }
}
