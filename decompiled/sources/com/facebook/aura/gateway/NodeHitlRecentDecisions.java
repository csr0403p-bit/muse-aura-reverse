package com.facebook.aura.gateway;

import X.C60O;
import X.C7384Etj;
import android.os.SystemClock;
import com.facebook.aura.nodes.core.NodeHitlSpec;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class NodeHitlRecentDecisions {
    public final ConcurrentHashMap<NodeHitlSpec, Entry> entries = C60O.A1C();

    public final class Entry {
        public final boolean allowed;
        public final long atElapsedMs;

        public final boolean getAllowed() {
            return this.allowed;
        }

        public final long getAtElapsedMs() {
            return this.atElapsedMs;
        }

        public Entry(boolean z, long j) {
            this.allowed = z;
            this.atElapsedMs = j;
        }
    }

    public final Boolean recentFor(NodeHitlSpec nodeHitlSpec) {
        C7384Etj.A0Y(nodeHitlSpec, 0);
        Entry entry = this.entries.get(nodeHitlSpec);
        if (entry != null) {
            if (SystemClock.elapsedRealtime() - entry.atElapsedMs <= 300000) {
                return Boolean.valueOf(entry.allowed);
            }
            this.entries.remove(nodeHitlSpec);
        }
        return null;
    }

    public final void record(NodeHitlSpec nodeHitlSpec, boolean z) {
        C7384Etj.A0Y(nodeHitlSpec, 0);
        this.entries.put(nodeHitlSpec, new Entry(z, SystemClock.elapsedRealtime()));
    }

    public final void clear() {
        this.entries.clear();
    }
}
