package com.facebook.aura.network.transport;

import X.AIG;
import X.AbstractC0878AGe;
import X.C3cG;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraNetworkLogRecorder {
    public static final int MAX_ENTRIES = 1000;
    public static final AuraNetworkLogRecorder INSTANCE = new AuraNetworkLogRecorder();
    public static final Object lock = C3cG.A0T();
    public static final AIG<AuraNetworkLogEntry> entries = new AIG<>();

    public final void record(AuraNetworkLogEntry auraNetworkLogEntry) {
        C7384Etj.A0Y(auraNetworkLogEntry, 0);
        synchronized (lock) {
            AIG<AuraNetworkLogEntry> aig = entries;
            aig.addLast(auraNetworkLogEntry);
            while (aig.size() > 1000) {
                aig.removeFirst();
            }
        }
    }

    public final List<AuraNetworkLogEntry> snapshot() {
        List<AuraNetworkLogEntry> listA0X;
        synchronized (lock) {
            listA0X = AbstractC0878AGe.A0X(entries);
        }
        return listA0X;
    }
}
