package X;

import android.util.LruCache;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.common.video.HatchVideoPlayerBackgroundEventProcessor;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Dma, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5646Dma {
    public final HatchVideoPlayerBackgroundEventProcessor A00;
    public final C5699Dng A05;
    public final Map<String, C5700Dnh> A01 = C60O.A1C();
    public final AtomicReference<String> A03 = BV4.A16(ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL);
    public final AtomicBoolean A02 = BV4.A12(false);
    public final LruCache<Long, Long> A04 = new LruCache<>(200);

    public C5646Dma(HatchVideoPlayerBackgroundEventProcessor hatchVideoPlayerBackgroundEventProcessor, C5699Dng c5699Dng) {
        this.A05 = c5699Dng;
        this.A00 = hatchVideoPlayerBackgroundEventProcessor;
    }

    public final C5700Dnh A00(C5700Dnh c5700Dnh, String str) {
        if (!this.A05.mEnableSendingEventsBasedOnSessionId) {
            return c5700Dnh;
        }
        Map<String, C5700Dnh> map = this.A01;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        if (c5700Dnh instanceof C5673DnB) {
            return c5700Dnh;
        }
        return null;
    }

    public final void A01() {
        Iterator itA0n = AnonymousClass002.A0n(this.A01);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (!C60O.A0t(entryA0l).equals(this.A03.get())) {
                C5700Dnh c5700Dnh = (C5700Dnh) entryA0l.getValue();
                if (c5700Dnh != null) {
                    c5700Dnh.A01(1L);
                }
                itA0n.remove();
            }
        }
    }

    public final boolean A02(long j, boolean z) {
        boolean z2;
        LruCache<Long, Long> lruCache = this.A04;
        synchronized (lruCache) {
            Long lValueOf = Long.valueOf(j);
            z2 = false;
            if (lruCache.get(lValueOf) == null) {
                z2 = true;
                if (z) {
                    lruCache.put(lValueOf, lValueOf);
                }
            }
        }
        return z2;
    }
}
