package X;

import android.os.SystemClock;
import android.util.LruCache;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/* loaded from: classes5.dex */
public abstract class DXV {
    public abstract String toString();

    public final Dlw A03(Long l) {
        Dlw dlw;
        if (!(this instanceof C2988Br0)) {
            return ((CMu) this).A02.get(l);
        }
        C2988Br0 c2988Br0 = (C2988Br0) this;
        synchronized (c2988Br0) {
            dlw = c2988Br0.A02.get(l);
            if (dlw == null) {
                dlw = null;
            } else {
                Br1 br1A00 = C2988Br0.A00(c2988Br0, l);
                if (br1A00 != null) {
                    PriorityQueue<Br1> priorityQueue = c2988Br0.A03;
                    priorityQueue.remove(br1A00);
                    EnumC2378BWr enumC2378BWr = br1A00.A01;
                    Br1 br1 = new Br1();
                    br1.A02 = l;
                    br1.A01 = enumC2378BWr;
                    br1.A00 = SystemClock.elapsedRealtime();
                    priorityQueue.add(br1);
                }
            }
        }
        return dlw;
    }

    public final Map<Long, Dlw> A04() {
        HashMap mapA0w;
        if (!(this instanceof C2988Br0)) {
            return ((CMu) this).A02.snapshot();
        }
        C2988Br0 c2988Br0 = (C2988Br0) this;
        synchronized (c2988Br0) {
            mapA0w = BV4.A0w(c2988Br0.A02);
        }
        return mapA0w;
    }

    public final void A05(int i) {
        PriorityQueue<Br1> priorityQueue;
        Br1 br1Peek;
        Dlw dlwRemove;
        if (!(this instanceof C2988Br0)) {
            CMu cMu = (CMu) this;
            cMu.A06 = true;
            try {
                cMu.A02.trimToSize(i);
                return;
            } finally {
                cMu.A06 = false;
            }
        }
        C2988Br0 c2988Br0 = (C2988Br0) this;
        if (i < 0) {
            c2988Br0.A01.A04(FGI.A0H("Pool trimToSize with invalid maxSize: ", i), -1L);
            return;
        }
        while (true) {
            synchronized (c2988Br0) {
                Map<Long, Dlw> map = c2988Br0.A02;
                if (map.isEmpty()) {
                    c2988Br0.A01.A04("TrimToSize on empty cache", -1L);
                    break;
                } else {
                    if (map.size() <= i || (br1Peek = (priorityQueue = c2988Br0.A03).peek()) == null) {
                        break;
                    }
                    dlwRemove = map.remove(br1Peek.A02);
                    priorityQueue.remove(br1Peek);
                }
            }
            if (dlwRemove != null) {
                C2988Br0.A01(br1Peek.A01, dlwRemove, c2988Br0.A01, FGI.A0H("trim to size ", i), true);
            }
        }
    }

    public final void A06(Long l, String str) {
        Dlw dlwRemove;
        Br1 br1A00;
        if (!(this instanceof C2988Br0)) {
            CMu cMu = (CMu) this;
            cMu.A03.remove(l);
            LruCache<Long, Dlw> lruCache = cMu.A02;
            if (lruCache != null) {
                lruCache.remove(l);
                return;
            }
            return;
        }
        C2988Br0 c2988Br0 = (C2988Br0) this;
        synchronized (c2988Br0) {
            C2988Br0.A02(c2988Br0);
            dlwRemove = c2988Br0.A02.remove(l);
            br1A00 = C2988Br0.A00(c2988Br0, l);
            if (br1A00 != null) {
                c2988Br0.A03.remove(br1A00);
            }
        }
        if (dlwRemove != null) {
            C2988Br0.A01(br1A00 == null ? null : br1A00.A01, dlwRemove, c2988Br0.A01, str, false);
        }
    }
}
